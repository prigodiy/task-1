package epam.students.prihodii.equipTypeEnums;

/**
 * This enum provides a types of shields with weight and cost values.
 *
 * @author Nickolay Prihodii
 */

public enum Shield {

    WOODEN(3, 1),
    IRON(5, 100),
    STEEL(5, 400);

    private int weight;
    private int cost;

    private Shield(int weight, int cost) {
        this.weight = weight;
        this.cost = cost;
    }

    public int getWeight() {
        return weight;
    }

    public int getCost() {
        return cost;
    }
}
