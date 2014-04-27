package epam.students.prihodii;

import epam.students.prihodii.equipTypes.Outfit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * This class provides a implementation of the Knight
 * which can wear Knights outfit.
 *
 * @author Nickolay Prihodii
 */

public class Knight {

    /**
     * Name of a knight.
     */
    private String name;

    /**
     *  list of outfit knight.
     */
    private List<Outfit> outfitList = new ArrayList<Outfit>();

    /**
     * Cost a knight outfit.
     */
    private int outfitCost;

    /**
     * Creates a naked knight.
     *
     * @param  name  knight's name
     */
    public Knight(String name) {
        this.name = name;
    }

    /**
     * Add outfit.
     *
     * @param  outfit  knight's name
     */
    public void addOutfit(Outfit outfit) {
        if (outfit == null) {
            return;
        }
        outfitList.add(outfit);
        this.outfitCost += outfit.getCost();
    }

    /**
     * @return  name of a knight
     */
    public String getName() {
        return name;
    }

    /**
     * @return  list of outfit knight
     */
    public List<Outfit> getOutfitList() {
        return outfitList;
    }

    /**
     * @return  cost a knight outfit
     */
    public int getOutfitCost() {
        return outfitCost;
    }

    /**
     * @return  list of outfit knight sorted by weight
     */
    public List<Outfit> getOutfitListSortedByWeight() {
        List<Outfit> result = new ArrayList<Outfit>(outfitList);
        Collections.sort(result, new Comparator<Outfit>() {
            @Override
            public int compare(Outfit o1, Outfit o2) {
                return o1.getWeight() - o2.getWeight();
            }
        });
        return result;
    }

    /**
     * @param  minCost  minimum cost value
     *                  in searched range
     * @param  maxCost  maximum cost value
     *                  in searched range
     *
     * @return  list of equipment knight which within minCost and maxCost
     */
    public List<Outfit> getOutfitByCostRange(int minCost, int maxCost) {
        if (maxCost < minCost) {
            return new ArrayList<Outfit>();
        }
        List<Outfit> result = new ArrayList<Outfit>();
        for (Outfit outfit : outfitList) {
            if (outfit.getCost() >= minCost &&
                    outfit.getCost() <= maxCost) {
                result.add(outfit);
            }
        }
        return result;
    }

    /**
     * Compares the specified knight with this knight for equality.
     *
     * @param o object to be compared for equality with this knight
     *
     * @return <tt>true</tt> if the specified knight is equal to this knight
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Knight knight = (Knight) o;

        if (outfitCost != knight.outfitCost) return false;
        if (!name.equals(knight.name)) return false;
        if (!getOutfitListSortedByWeight()
                .equals(knight.getOutfitListSortedByWeight())) return false;

        return true;
    }

    /**
     * Returns a string representation of the knight parameters
     * (name, outfit);
     *
     * @return a string representation of the knight
     */
    @Override
    public String toString() {
        return "Name: " + name + ", Outfit: " + outfitList.toString();
    }
}
