package sort;
import java.util.*;

public class Sorting {
    public static void main(String args[]){
        List<Integer> li = new ArrayList<>();
        li.add(5);
        li.add(15);
        li.add(7);
        li.add(6);
        li.add(52);
        li.add(31);

        System.out.println(li);

        Collections.reverse(li);//reverses the list

        System.out.println(li);

        Collections.sort(li);//sorts the array

        System.out.println(li);

        //values sorted by ascending or descending order if i want custom type of sorting then i use comparator  
    }
}
