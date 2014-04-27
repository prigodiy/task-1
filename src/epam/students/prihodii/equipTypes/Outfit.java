package epam.students.prihodii.equipTypes;

/**
 * This class provides a skeletal implementation of the Outfit item
 * classes, to minimize the effort required to extends this class.
 *
 * @author Nickolay Prihodii
 */

public abstract class Outfit {

    /**
     * Weight of the outfit.
     */
    private int weight;

    /**
     * Cost of the outfit.
     */
    private int cost;

    /**
     * Sole constructor (For invocation by subclass constructors).
     *
     * @param  weight  weight of the outfit
     * @param  cost  cost of the outfit
     */
    protected Outfit(int weight, int cost) {
        this.weight = weight;
        this.cost = cost;
    }

    /**
     * @return weight in int value
     */
    public int getWeight() {
        return weight;
    }

    /**
     * @return cost in int value
     */
    public int getCost() {
        return cost;
    }

    /**
     * Returns a string representation of the outfit parameters
     * (weight, cost) used in subclasses;
     *
     * @return a string representation of the outfit
     */
    @Override
    public String toString() {
        return "weight: " + weight + ", cost " + cost;
    }
}
