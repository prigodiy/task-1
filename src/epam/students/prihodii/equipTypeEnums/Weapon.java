package epam.students.prihodii.equipTypeEnums;

/**
 * This enum provides a types of weapons with weight and cost values.
 *
 * @author Nickolay Prihodii
 */

public enum Weapon {

    DAGGER(1, 100),
    SWORD(3, 200),
    LANCE(4, 50);

    private int weight;
    private int cost;

    private Weapon(int weight, int cost) {
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
