import java.util.Collections;
import java.util.List;

public class Algos {
 public static void main(String[] args) {
    List<Integer> L = new java.util.ArrayList<>();

    for(int i=0;i<10;i++)
    {
        int N = (int)(Math.random()*10);
        L.add(N);
    }

    Collections.sort(L);
    Collections.reverse(L);
    int max = Collections.max(L);
    int min = Collections.min(L);
    

    System.out.println(L);
    System.out.println(max);
    System.out.println(min);


 }   
}
