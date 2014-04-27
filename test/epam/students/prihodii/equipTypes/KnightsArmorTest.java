package epam.students.prihodii.equipTypes;

import epam.students.prihodii.equipTypeEnums.Armor;
import org.junit.Test;
import static junit.framework.Assert.*;

public class KnightsArmorTest {

    KnightsArmor expectedArmor = new KnightsArmor(Armor.CHAIN);

    @Test
    public void testGetArmor_equals() throws Exception {
        assertEquals(expectedArmor, new KnightsArmor(Armor.CHAIN));
    }

    @Test
    public void testGetArmor_notSame() throws Exception {
        assertNotSame(expectedArmor, new KnightsArmor(Armor.LEATHER));
    }
}
