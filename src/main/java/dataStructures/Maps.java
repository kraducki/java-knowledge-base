package dataStructures;

import java.util.HashMap;

public class Maps {

    public static void main(String[] args) {
        HashMap<String, Integer> empIds = new HashMap<>();
        empIds.put("Adam", 1);
        empIds.put("Brian", 2);

        // Map does not guarantee the order
        System.out.println(empIds);

        // Get one value
        System.out.println(empIds.get("Adam"));

        // Check if Map contains certain key
        System.out.println(empIds.containsKey("Brian"));

        // Check if Map contains certain value
        System.out.println(empIds.containsValue(3));
    }
}
