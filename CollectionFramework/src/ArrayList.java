import java.util.Iterator;
import java.util.List;

public class ArrayList {
    public static void main(String[] args) {
        List<Integer> list = new java.util.ArrayList<>();
        List<Integer> list2 = new java.util.ArrayList<>();

        list.add(45);
        list.add(28);
        list.add(19);
        list.add(33);
        list.add(02);
        list.add(72);

        System.out.println(list);
        System.out.println(list.get(0));

        list.set(2, 17); // replace the 2nd index with the value 17
        list.remove(2); // delets element of 2nd index

        list2.addAll(list); // copys elements of an arraylist to another
        list2.remove(Integer.valueOf(72));    // removes the value from the arraylist



        for(int i=0;i<list.size();i++)
        {
        System.out.println(list.get(i));
        }

        Iterator<Integer> it = list2.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
