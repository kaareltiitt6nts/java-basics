package Classes;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Suitcase {
    public ArrayList<Thing> things;
    public Integer maxWeight;

    public Suitcase(Integer maxWeight) {
        this.things = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public String toString() {
        int thingCount = getThingCount();

        if (thingCount <= 0) {
            return "empty (0 kg)";
        } else if (thingCount == 1) {
            return String.format("%d thing (%d kg)", thingCount, getCurrentWeight());
        }
        else {
            return String.format("%d things (%d kg)", thingCount, getCurrentWeight());
        }
    }

    public Thing getHeaviestThing() {
        ArrayList<Thing> tempThings = new ArrayList<>(things);
        tempThings.sort((a, b) -> {return -1 * a.getWeight().compareTo(b.getWeight());});
        return tempThings.getFirst();
    }

    public Integer getCurrentWeight() {
        int weight = 0;

        for (Thing thing : things) {
            weight += thing.weight;
        }

        return weight;
    }

    public Integer getThingCount() {
        return things.size();
    }

    public boolean addThing(Thing thing) {
        int currentWeight = getCurrentWeight();

        if (currentWeight + thing.weight > maxWeight) {
            return false;
        }

        things.add(thing);

        return true;
    }

    public boolean findThing(String name) {
        for (Thing thing : things) {
            if (thing.getName().equals(name)) {
                return true;
            }
        }

        return false;
    }

    public void printThings() {
        for (Thing thing : things) {
            String string = String.format("%s (%d kg)", thing.getName(), thing.getWeight());

            System.out.println(string);
        }
    }
}
