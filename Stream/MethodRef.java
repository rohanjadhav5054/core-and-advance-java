
import java.util.*;

public class MethodRef {
    public static void main(String args[]){
        List<String> li = Arrays.asList("Rohan","Umesh","Sadiya","Krushnali","Jishan");

        // List<String> name = li.stream()
        //                     .map(n -> n.toUpperCase())
        //                     .toList();

        // System.out.println(name);

        List<String> name = li.stream()
                                .map(String::toUpperCase)
                                .toList();
        
        name.forEach(System.out::println);
    }
}
//a method reference in java is shorthand syntax for lambda expression that conatains just one method call
//In general, one doesn’t have to pass arguments to method references.
//using method reference increases code readabily.
// allowing you to focus on logic rather than boilerplate code. In summary, method references are a powerful feature in Java for adopting functional programming styles effectively.