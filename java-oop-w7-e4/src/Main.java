import Classes.Container;
import Classes.Suitcase;
import Classes.Thing;

void main() {
    Container container = new Container(50);

    Thing book = new Thing("Book", 2);
    Thing phone  = new Thing("Phone", 1);
    Thing whatever = new Thing("Whatever", 6);

    Suitcase suitcase1 = new Suitcase(5);
    suitcase1.addThing(book);
    suitcase1.addThing(phone);

    Suitcase suitcase2 = new Suitcase(12);
    suitcase2.addThing(whatever);
    suitcase2.addThing(whatever);

    container.addSuitcase(suitcase1);
    container.addSuitcase(suitcase2);

    System.out.println(container);

    container.printThings();
}
