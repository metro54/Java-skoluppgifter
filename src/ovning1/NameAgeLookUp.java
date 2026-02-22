package ovning1;

import java.util.HashMap;

public class NameAgeLookUp {
    private HashMap<String, Integer> ages = new HashMap<>();

    public NameAgeLookUp() {
        ages.put("Anna", 25);
        ages.put("Gustav", 28);
        ages.put("Alice", 55);
        ages.put("Astrid", 26);
    }
    public int getAge(String name) {
        return ages.get(name);
    }
}
