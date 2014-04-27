package epam.students.prihodii.equipTypes;

import epam.students.prihodii.equipTypeEnums.Shield;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotSame;

public class KnightsShieldTest {

    KnightsShield expectedShield = new KnightsShield(Shield.IRON);

    @Test
    public void testGetWeapon_equals() throws Exception {
        assertEquals(expectedShield, new KnightsShield(Shield.IRON));
    }

    @Test
    public void testGetArmor_notSame() throws Exception {
        assertNotSame(expectedShield, new KnightsShield(Shield.WOODEN));
    }
}
