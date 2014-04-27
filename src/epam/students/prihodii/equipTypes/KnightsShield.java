package epam.students.prihodii.equipTypes;

import epam.students.prihodii.equipTypeEnums.Shield;

/**
 * This class provides a implementation of the KnightsShield
 * class.
 *
 * @author Nickolay Prihodii
 */

public class KnightsShield extends Outfit {

    /**
     * Concrete shield type from enum.
     */
    Shield shield;

    /**
     * Creates shield for knight.
     *
     * @param  shield  shield type from enum Shield
     */
    public KnightsShield(Shield shield) {
        super(shield.getWeight(), shield.getCost());
        this.shield = shield;
    }

    /**
     * @return instance of shield
     */
    public Shield getShield() {
        return shield;
    }

    /**
     * Returns a string representation of the knight's shield parameters
     * (shield name, weight, cost);
     *
     * @return a string representation of the knight's shield.
     */
    @Override
    public String toString() {
        return "Shield: " + getShield().name().toLowerCase() + ", " + super.toString();
    }

    /**
     * Compares the specified shield with this shield for equality.
     *
     * @param  o  object to be compared for equality with this shield
     *
     * @return  true if the specified knight's shield is equal
     *          to this knight's shield
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        KnightsShield that = (KnightsShield) o;

        if (shield != that.shield) return false;

        return true;
    }
}
