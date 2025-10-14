package Classes;

import Interfaces.Storable;

public class CD extends Item implements Storable {
    public CD(String author, String title, int year) {
        this.author = author;
        this.title = title;
        this.year = year;
    }

    public String toString() {
        return String.format("%s: %s (%d)", author, title, year);
    }

    public double weight() {
        return 0.1;
    }
}
