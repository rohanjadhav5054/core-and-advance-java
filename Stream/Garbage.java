import java.util.*;

public class Garbage{
    public static void main(String args[]){
        Collection<Integer> c = new ArrayList<>();

        c.add(2);
        c.add(5);
        c.add(8);
        c.add(90);
        c.add(6);
        c.add(2);
        c.add(8);
        c.add(10);
        c.add(15);
        c.add(78);
        c.add(88);

        
        Collection<Integer> d = new ArrayList<>();

        c.add(11);
        c.add(23);
        c.add(67);
        c.add(9);
        c.add(34);
        c.add(45);
        c.add(67);
        c.add(70);
        c.add(13);
        c.add(22);
        c.add(55);
        
        System.out.println(c.equals(d));

        try {
            System.out.println(c.getClass());
        } catch(Exception e){
            System.out.println("Unexpected error !");
        }
        // System.out.println(c);
        for(Integer i:c){//here Integer works on both wrappper class or primitive data types
            System.out.println(i);
        }

        

        // System.out.println("Hello");

        // for(Integer j:d){
        //     System.out.println(j);
        // }


    }
}