import java.util.Collection;
import java.util.ArrayList;
public class ArrayListConcept {
    public static void main(String args[]){
        Collection<Integer> nums = new ArrayList<>();
        Collection<Integer> newNums = new ArrayList<>();

        nums.add(2);//Adding of elements in ArrayList
        nums.add(3);
        nums.add(5);
        nums.add(9);
        nums.add(0);
        nums.add(1);
        nums.add(4);

        newNums.add(12);
        newNums.add(23);
        newNums.add(45);
        newNums.add(06);
        newNums.add(16);
        newNums.add(44);

        //printing the ArrayList elements .
        System.out.println("Nums ArrayList : "+nums);
        System.out.println("newNums ArrayList : "+newNums);


        System.out.println(nums.size());//it gives the size of the ArrayList

        System.out.println(nums.contains(9));//if we want to check a perticular element is present or not then it will be used 

        System.out.println(nums.iterator());//gives an iterator means it will give which type of collection it is .

        // nums.remove(2);//it removes an perticular element 

        // nums.removeAll(nums);//it removes all element present in the arraylist 
        
        System.out.println(nums.equals(newNums));//it checks newNums ArrayLis is present in nums ArrayList or not.

        System.out.println(nums.isEmpty());//it checks arrayList is empty or not     
        
        System.out.println(nums);
    }
}
//ArrayList : it provides dynamic array .
//ArrayList grows automatically when collection grows or shrinks .
//it can not be implemented by primitive data types we need wrapper class to implement it.

