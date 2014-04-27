package epam.students.prihodii.equipTypeEnums;

/**
 * This enum provides a types of armors with weight and cost values.
 *
 * @author Nickolay Prihodii
 */

public enum Armor {

    LEATHER(5, 50),
    CHAIN(20, 200),
    PLATE(50, 10000);

    private int weight;
    private int cost;

    private Armor(int weight, int cost) {
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
