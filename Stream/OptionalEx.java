import java.util.*;

public class OptionalEx{
    public static void main(String args[]){
        //Optional class introduced in java 1.8
        List<String> li = Arrays.asList("Rohan","Sadiya","Kaivalya","Numan","Krushnali");

        // String name = li.stream()
        //                 .filter(str -> str.contains("y"))
        //                 .findFirst()
        //                 .orElse("Not present");

        // System.out.println(name);

        Optional<String> name = li.stream()
                                .filter(str -> str.contains("y"))
                                .findFirst();
        System.out.println(name.orElse("Not find the number"));


    }
}

//optional class :- its a public final class used to deal with null pointer exception in java application.
//it provides methods that are used to check the presence of value for perticular variable.
