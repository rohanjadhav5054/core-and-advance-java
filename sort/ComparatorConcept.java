package sort;

import java.util.*;

public class ComparatorConcept {
    public static void main(String args[]){
        //Comaparator is the interface is used to order user defined classes .
        //means it used to specify our own logic for sorting .
        List<Integer> li = new ArrayList<Integer>();
        li.add(65);
        li.add(19);
        li.add(67);
        li.add(73);
        li.add(12);
        li.add(81);

        
        System.out.println("Before sorting List : "+li);
        System.out.println("Using Simple Sorting Technique : ");
        Collections.sort(li);

        System.out.println(li);

        //what if you want sort into your order 
        //using comparator we can do this 
        //comparator is an interface 

        Comparator<Integer> comp = new Comparator<Integer>() {
            public int compare(Integer i,Integer j){
                if(i % 10 > j % 10)//this condition gives remainder this will be last number
                    return 1;
                else
                    return -1;
            }
        };

        Collections.sort(li,comp);

        System.out.println("After sorting list : "+li);
    }
}

//So Basically What is Comparator 
//it is when you want to specify the which logic you want to sort the variable  then we use comparator .  
