package epam.students.prihodii.equipTypes;

import epam.students.prihodii.equipTypeEnums.Armor;

/**
 * This class provides a implementation of the KnightsArmor
 * class.
 *
 * @author Nickolay Prihodii
 */

public class KnightsArmor extends Outfit {

    /**
     * Concrete armor type from enum.
     */
    private Armor armor;

    /**
     * Creates armor for knight.
     *
     * @param  armor  armor type from enum Armor
     */
    public KnightsArmor(Armor armor) {
        super(armor.getWeight(), armor.getCost());
        this.armor = armor;
    }

    /**
     * @return instance of armor
     */
    public Armor getArmor() {
        return armor;
    }

    /**
     * Returns a string representation of the knight's armor parameters
     * (armor name, weight, cost);
     *
     * @return a string representation of the knight's armor.
     */
    @Override
    public String toString() {
        return "Armor: " + getArmor().name().toLowerCase() + ", " + super.toString();
    }

    /**
     * Compares the specified armor with this armor for equality.
     *
     * @param  o  object to be compared for equality with this armor
     *
     * @return  true if the specified knight's armor is equal
     *          to this knight's armor
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        KnightsArmor that = (KnightsArmor) o;

        if (armor != that.armor) return false;

        return true;
    }
}
