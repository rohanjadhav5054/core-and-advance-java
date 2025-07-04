import java.util.*;
import java.util.function.Consumer;

public class Garbages{
    public static void main(String args[]){
        Collection<Integer> li = new ArrayList<>();
        li.add(2);
        li.add(4);
        li.add(5);
        li.add(3);

        li.forEach(n -> System.out.println(n));
        //li.forEach(n -> System.out.println(n));
    }
}