package sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorLambdaExpression {
    public static void main(String args[]){
        List<Integer> li = new ArrayList<Integer>();
        li.add(65);
        li.add(19);
        li.add(67);
        li.add(73);
        li.add(12);
        li.add(81);

        System.out.println("Before sorting List : "+li);

        Comparator<Integer> comp = (i , j) -> i % 10 > j % 10 ? 1: -1;
        
        Collections.sort(li,comp);

        System.out.println("After sorting List : "+li);
    }
}
