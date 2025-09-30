package Classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    public HashMap<String, String> hashmap;

    public Dictionary() {
        this.hashmap = new HashMap<>();
    }

    public Integer wordCount() {
        return hashmap.size();
    }

    public ArrayList<String> transationList() {
        ArrayList<String> list = new ArrayList<>();

        for (Map.Entry<String, String> entry : hashmap.entrySet()) {
            list.add(String.format("%s = %s", entry.getKey(), entry.getValue()));
        }

        return list;
    }

    public String translate(String word) {
        return hashmap.get(word);
    }

    public void add(String word, String translation) {
        hashmap.put(word, translation);
    }
}
