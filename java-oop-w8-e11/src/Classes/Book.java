package Classes;

import Interfaces.Storable;

public class Book extends Item {
    public Book(String author, String title, double weight) {
        this.author = author;
        this.title = title;
        this.weight = weight;
    }

    public String toString() {
        return String.format("%s: %s", author, title);
    }

    public double weight() {
        return this.weight;
    }
}
