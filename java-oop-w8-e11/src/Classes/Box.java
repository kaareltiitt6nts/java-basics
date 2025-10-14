package Classes;

import Interfaces.Storable;

import java.util.ArrayList;

public class Box extends Storage implements Storable {
    public ArrayList<Storable> items;

    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<Storable>();
    }

    public boolean add(Storable item) {
        if (weight() + item.weight() > maxWeight) {
            return false;
        }

        items.add(item);
        return true;
    }

    public double weight() {
        double weight = 0;

        for (Storable item : items) {
            weight += item.weight();
        }

        return weight;
    }

    public String toString() {
        return String.format("Box: %d things, %.2f kg", items.size(), weight());
    }
}
