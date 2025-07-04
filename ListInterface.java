import java.util.*;
public class ListInterface {
    public static void main(String args[]){
        //collection has not any index value
        Collection<Integer> nums = new ArrayList<Integer>();
        nums.add(26);
        nums.add(11);
        nums.add(2004);
        nums.add(04);
        System.out.println("Numbers are in the arraylist : "+nums);//we cannot need using of for loop 
        for(int n : nums){
            System.out.println(n);
        }
        //List has the index value 
        List<Integer> li = new ArrayList<Integer>();//always use type of the variable
        li.add(23);
        li.add(2);
        li.add(3);
        li.add(4);
        for(int op : li){
            System.out.println(op);
        }
    }
}
//Array list provides a dynamic arrays in java .
//The size of the ArrayList can be Increased automatically if the collection grows .
//it can not be used for primitive data types it is used for wrapper class.
