import java.util.*;

public class SetApi {
    public static void main(String args[]){
        
        //HashSet
        //in the hashset objects are inserted based on their hash code 
        //HashSet does not give values in the sorted format .
        Set<Integer> s = new HashSet<Integer>();
        s.add(10);
        s.add(2);
        s.add(45);
        s.add(3);
        
        System.out.println(s);//set always prints in ordered form 

        for(int op : s){
            System.out.println(op);
        }

        //LinkedHashSet
        //it is similar to hashset but it uses doubly linked list to store the data
        System.out.println("Linked hash set Implementation : ");
        Set<Integer> lhs = new LinkedHashSet<Integer>();
        lhs.add(1);
        lhs.add(2);
        lhs.add(34);
        lhs.add(12);
        lhs.add(9);
        
        System.out.println(lhs);

        //TreeSet
        //Tree set gives actually sorted values .
        System.out.println("Here The Implementation of the Tree set : ");
        Set<Integer> ts = new TreeSet<Integer>();
        ts.add(2);
        ts.add(5);
        ts.add(3);
        ts.add(4);

        System.out.println(ts);

    }
}
//set is unordered set of objects in which duplicate values cannot be stored.
//Note : set does not support index values 
//this Interface is implemented by different classes 
//1.HashSet 2.TreeSet 3.LinkedHashSet



