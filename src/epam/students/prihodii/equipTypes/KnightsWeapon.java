package epam.students.prihodii.equipTypes;

import epam.students.prihodii.equipTypeEnums.Weapon;

/**
 * This class provides a implementation of the KnightsWeapon
 * class.
 *
 * @author Nickolay Prihodii
 */

public class KnightsWeapon extends Outfit {

    /**
     * Concrete weapon type from enum.
     */
    Weapon weapon;

    /**
     * Creates weapon for knight.
     *
     * @param  weapon  weapon type from enum Weapon
     */
    public KnightsWeapon(Weapon weapon) {
        super(weapon.getWeight(), weapon.getCost());
        this.weapon = weapon;
    }

    /**
     * @return instance of weapon
     */
    public Weapon getWeapon() {
        return weapon;
    }

    /**
     * Returns a string representation of the knight's weapon parameters
     * (weapon name, weight, cost);
     *
     * @return a string representation of the knight's weapon.
     */
    @Override
    public String toString() {
        return "Weapon: " + getWeapon().name().toLowerCase() + ", " + super.toString();
    }

    /**
     * Compares the specified weapon with this weapon for equality.
     *
     * @param  o  object to be compared for equality with this weapon
     *
     * @return  true if the specified knight's weapon is equal
     *          to this knight's weapon
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        KnightsWeapon that = (KnightsWeapon) o;

        if (weapon != that.weapon) return false;

        return true;
    }
}
