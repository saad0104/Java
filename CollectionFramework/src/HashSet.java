import java.util.Set;

public class HashSet {
    public static void main(String[] args) {
        Set<String> set = new java.util.HashSet();
        set.add("Ridhi");
        set.add("Pretty");
        set.add("Sabiha");
        set.add("Farzu");

        System.out.println(set);

        System.out.println(set.contains("Maimuna"));

        System.out.println(set.isEmpty());
        
        set.remove("Sabiha");

        for(String st : set)
        {
            System.out.println(st);
        }


    }
}
