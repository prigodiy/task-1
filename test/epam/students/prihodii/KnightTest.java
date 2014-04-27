package epam.students.prihodii;

import epam.students.prihodii.equipTypeEnums.Armor;
import epam.students.prihodii.equipTypeEnums.Shield;
import epam.students.prihodii.equipTypeEnums.Weapon;
import epam.students.prihodii.equipTypes.KnightsArmor;
import epam.students.prihodii.equipTypes.KnightsShield;
import epam.students.prihodii.equipTypes.KnightsWeapon;
import epam.students.prihodii.equipTypes.Outfit;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static junit.framework.Assert.assertEquals;

public class KnightTest {

    Knight nakedKnight;
    Knight nakedKnightWithSword;
    Knight nakedKnightWithSwordAndShield;
    Knight dressedKnight;

    @Before
    public void setUp() throws Exception {
        nakedKnight = new Knight("John Doe");

        nakedKnightWithSword = new Knight("John Doe");
        nakedKnightWithSword.addOutfit(new KnightsWeapon(Weapon.SWORD));

        nakedKnightWithSwordAndShield = new Knight("John Doe");
        nakedKnightWithSwordAndShield.addOutfit(new KnightsShield(Shield.STEEL));
        nakedKnightWithSwordAndShield.addOutfit(new KnightsWeapon(Weapon.SWORD));

        dressedKnight = new Knight("John Doe");
        dressedKnight.addOutfit(new KnightsArmor(Armor.PLATE));
        dressedKnight.addOutfit(new KnightsWeapon(Weapon.SWORD));
        dressedKnight.addOutfit(new KnightsShield(Shield.STEEL));
    }

    @Test
    public void testAddOutfit_addNull_expectedEqualsNakedKnight() throws Exception {
        nakedKnight.addOutfit(null);
        assertEquals(new Knight("John Doe"), nakedKnight);
    }

    @Test
    public void testAddOutfit_addSword_expectedEqualsNakedKnightWithSword() throws Exception {
        nakedKnight.addOutfit(new KnightsWeapon(Weapon.SWORD));
        assertEquals(nakedKnightWithSword, nakedKnight);
    }

    @Test
    public void testAddOutfit_addShield_expectedEqualsNakedKnightWithSwordAndShield() throws Exception {
        nakedKnightWithSword.addOutfit(new KnightsShield(Shield.STEEL));
        assertEquals(nakedKnightWithSwordAndShield, nakedKnightWithSword);
    }

    @Test
    public void testAddOutfit_addArmor_expectedEqualsDressedKnight() throws Exception {
        nakedKnightWithSwordAndShield.addOutfit(new KnightsArmor(Armor.PLATE));
        assertEquals(dressedKnight, nakedKnightWithSwordAndShield);
    }

    @Test
    public void testGetOutfitCost_nakedKnight() throws Exception {
        assertEquals(0, nakedKnight.getOutfitCost());
    }

    @Test
    public void testGetOutfitCost_nakedKnightWithSword() throws Exception {
        assertEquals(200, nakedKnightWithSword.getOutfitCost());
    }

    @Test
    public void testGetOutfitCost_nakedKnightWithSwordAndShield() throws Exception {
        assertEquals(600, nakedKnightWithSwordAndShield.getOutfitCost());
    }

    @Test
    public void testGetOutfitCost_dressedKnight() throws Exception {
        assertEquals(10600, dressedKnight.getOutfitCost());
    }

    @Test
    public void testGetOutfitListSortedByWeight_nakedKnight() throws Exception {
        assertEquals(new Knight("King Arthur").getOutfitList(),
                nakedKnight.getOutfitListSortedByWeight());
    }

    @Test
    public void testGetOutfitListSortedByWeight_dressedKnight() throws Exception {
        List<Outfit> outfit = dressedKnight.getOutfitListSortedByWeight();
        assertEquals(new KnightsWeapon(Weapon.SWORD), outfit.get(0));
        assertEquals(new KnightsShield(Shield.STEEL), outfit.get(1));
        assertEquals(new KnightsArmor(Armor.PLATE), outfit.get(2));
    }

    @Test
    public void testGetOutfitByCostRange_badRange() throws Exception {
        assertEquals(new Knight("King Arthur").getOutfitList(),
                nakedKnight.getOutfitByCostRange(100, 50));
    }

    @Test
    public void testGetOutfitByCostRange() throws Exception {
        assertEquals(nakedKnightWithSwordAndShield.getOutfitListSortedByWeight(),
                dressedKnight.getOutfitByCostRange(100, 1000));
    }
}
