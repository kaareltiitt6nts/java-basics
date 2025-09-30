package Classes;

import java.io.Reader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.function.Consumer;

public class TextInterface {
    private boolean isRunning = false;

    private Scanner scanner;
    private Dictionary dictionary;
    private HashMap<String, Consumer<ArrayList<String>>> commands;

    public TextInterface(Scanner scanner, Dictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
        this.commands = new HashMap<>();

        commands.put("quit", this::quit);
        commands.put("help", this::help);
        commands.put("add", this::add);
        commands.put("translate", this::translate);
    }

    private void handleCommand(String command, ArrayList<String> args) {
        Consumer<ArrayList<String>> commandFunction = commands.get(command);

        if (commandFunction != null) {
            commandFunction.accept(args);
        }
        else {
            System.out.println("Command not found");
        }
    }

    public void start() {
        this.isRunning = true;

        while (isRunning) {
            System.out.print("Statement: ");
            String input = scanner.nextLine();

            String[] words = input.split(" ");
            String command = words[0];

            ArrayList<String> args = new ArrayList<>();
            Collections.addAll(args, words);
            args.removeFirst();

            handleCommand(command, args);
        }
    }

    public void add(ArrayList<String> args) {
        if (args.size() < 2) {
            System.out.println("Usage: add [word] [translation]");
            return;
        }

        String word = args.get(0);
        String translation = args.get(1);

        dictionary.add(word, translation);

        System.out.println("Word added: " + word + " = " + translation);
    }

    public void translate(ArrayList<String> args) {
        if (args.size() < 1) {
            System.out.println("Usage: translate [word]");
            return;
        }

        String word = args.get(0);
        String translation = dictionary.translate(word);

        System.out.println("Translation: " + translation);
    }

    public void help(ArrayList<String> args) {
        System.out.println("Available commands:");

        for (String command : commands.keySet()) {
            System.out.println(command);
        }
    }

    public void quit(ArrayList<String> args) {
        System.out.println("Bye!");
        this.isRunning = false;
    }
}
