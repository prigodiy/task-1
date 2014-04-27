package epam.students.prihodii.equipTypes;

import epam.students.prihodii.equipTypeEnums.Weapon;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotSame;

public class KnightsWeaponTest {

    KnightsWeapon expectedWeapon = new KnightsWeapon(Weapon.DAGGER);

    @Test
    public void testGetWeapon_equals() throws Exception {
        assertEquals(expectedWeapon, new KnightsWeapon(Weapon.DAGGER));
    }

    @Test
    public void testGetArmor_notSame() throws Exception {
        assertNotSame(expectedWeapon, new KnightsWeapon(Weapon.LANCE));
    }
}
