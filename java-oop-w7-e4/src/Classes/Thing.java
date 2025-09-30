package Classes;

public class Thing {
    public String name;
    public Integer weight;

    public Thing(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public Integer getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }
}
