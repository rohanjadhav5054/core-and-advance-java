import java.util.*;
import java.util.function.Consumer;
public class ForEachMethod {
    public static void main(String args[]){
        List<Integer> nums = Arrays.asList(34,35,12,56,78,55,88);
        Consumer<Integer> con = new Consumer<Integer>() {
            public void accept(Integer n){
                System.out.println(n);
            }
        };
        nums.forEach(con);
        // nums.forEach(n -> System.out.println(n));
    }
}
//forEach is a method (which gives one value at a time) which takes the object of consumer .
//consumer is a basicall functional interface .
//in that consumer interface there will be accept method will be there .
//so consumer it is a functional interface so we basically apply lambda expression .