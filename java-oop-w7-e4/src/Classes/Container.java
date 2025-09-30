package Classes;

import java.util.ArrayList;

public class Container {
    public ArrayList<Suitcase> suitcases;
    public Integer maxWeight;

    public Container(int maxWeight) {
        this.suitcases = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public String toString() {
        int thingCount = getSuitcaseCount();

        if (thingCount <= 0) {
            return "empty (0 kg)";
        } else if (thingCount == 1) {
            return String.format("%d suitcase (%d kg)", thingCount, getCurrentWeight());
        }
        else {
            return String.format("%d suitcases (%d kg)", thingCount, getCurrentWeight());
        }
    }

    public void printThings() {
        for (Suitcase suitcase : this.suitcases) {
            suitcase.printThings();
        }
    }

    public Integer getMaxWeight() {
        return maxWeight;
    }

    public Integer getCurrentWeight() {
        return suitcases
                .stream()
                .reduce(0, (subTotal, element) -> subTotal + element.getCurrentWeight(), Integer::sum);
    }

    public Integer getSuitcaseCount() {
        return suitcases.size();
    }

    public boolean addSuitcase(Suitcase suitcase) {
        if (getCurrentWeight() + suitcase.getCurrentWeight() > getMaxWeight()) {
            return false;
        }

        this.suitcases.add(suitcase);

        return true;
    }
}
