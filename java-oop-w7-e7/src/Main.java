import Classes.Dictionary;
import Classes.TextInterface;

void main() {
    Scanner scanner = new Scanner(System.in);
    Dictionary dictionary = new Dictionary();

    TextInterface ui = new TextInterface(scanner, dictionary);
    ui.start();
}