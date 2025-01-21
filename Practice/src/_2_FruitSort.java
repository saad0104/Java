import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.*;

class Fruit {

    String name;
    int quantity;

    Fruit(String name, int quantity) {

        this.name = name;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Fruit {" + name + " " + quantity + "}";
    }
}

public class _2_FruitSort {
    public static void main(String[] args) {
        
        ArrayList<Fruit> listfruit = new ArrayList<>();

        listfruit.add(new Fruit("Apple", 15));
        listfruit.add(new Fruit("Orange", 18));
        listfruit.add(new Fruit("Atrawberry", 18));
        listfruit.add(new Fruit("Mango", 12));
        listfruit.add(new Fruit("JackFruit", 14));
        listfruit.add(new Fruit("Her", 1));


        Comparator<Fruit> byQuantity = Comparator.comparingInt(f -> f.quantity);
        Comparator<Fruit> byName = Comparator.comparing(f -> f.name);

        Collections.sort(listfruit, (byName));
        Collections.sort(listfruit, Collections.reverseOrder(byQuantity));

        
        for (Fruit fr : listfruit) {
            System.out.println(fr);
        }

    }

}
