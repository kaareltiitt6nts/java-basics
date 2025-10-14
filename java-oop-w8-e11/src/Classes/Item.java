package Classes;

import Interfaces.Storable;

public abstract class Item implements Storable {
    public String author;
    public String title;
    public double weight;
    public int year;
    public abstract double weight();
}
