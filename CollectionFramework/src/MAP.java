import java.util.HashMap;

import java.util.*;

public class MAP {
    public static void main(String[] args) {

        Map<String, Integer> Info = new HashMap<>();
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter name: ");
            String name = scan.next();
            System.out.print("Enter Id: ");
            int id = scan.nextInt();
            Info.put(name, id);
        }
        scan.close();
        // Info.remove("Saad"); // removes only the 'inside " "' key.
        // Info.clear(); // Clears the whole map. 

        for (String st : Info.keySet()) // keySet() methods iterates through keys.
        {
            System.out.println(st);
        }

        for (int st : Info.values()) // values() method iterates through values.
        {
            System.out.println(st);
        }

        for (String st : Info.keySet()) {
            System.out.println(st + " " + Info.get(st)); // get() methods gets value of the assigned key.
        }
        System.out.println(Info.containsKey("Saad")); // containsKey() is Bool type.Checks if the key is in the map or
                                                          // not. Similar method -> containsValue().

        // System.out.println(Info);

    }
}
