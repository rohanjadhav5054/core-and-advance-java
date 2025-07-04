import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamApi {
    public static void main(String args[]){
        List<Integer> li = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);

        // Stream<Integer> s1 = li.stream();
        // Stream<Integer> s2 = s1.filter(n ->  n % 2 != 0);
        // Stream<Integer> s3 = s2.map(n -> n*2);
        // int result = s3.reduce(0,(c,e) -> (c+e));
        // // s3.forEach(n -> System.out.println(n));//for each method performs action on each element.
        // System.out.println(result);
        
        //you can write everything in one line 

        //filter method 
        //filter is an functional Interface it has boolean test method .
        // Predicate<Integer> p = new Predicate<Integer>() {
        //     public boolean test(Integer n){
        //         return n%2 == 0;
        //     }
        // };
        //After using Lambda expression
        Predicate<Integer> p = n ->  n%2 == 0 ;
        

        //map method
        //map also the functional interface
        // Function<Integer,Integer> fun = new Function<Integer,Integer>() {
        //     public Integer apply(Integer n){
        //         return n*2;
        //     }
        // };
        //After applying lambda expression
        Function<Integer,Integer> fun = n ->  n*2;

        int result = li.stream()
                    .filter(p)
                    .map(fun)
                    .reduce(0,(c,e) -> (c+e));
                    
        System.out.println(result);
    }
}
//so basically stream is an interface.
//use of stream ? -> when you have the data you want to perform some operations on it without changing existing values 
//once we used stream then we cannot reuse that stream .

//benifit of stream is -> stream provide lot of methods filter,reduce,map etc.
//so we can apply some operations collection of data using stream.