//now we will discuss about stream api 
//it came in java 1.8
//if i

import java.util.*;

public class BeforeStreamApi {
    public static void main(String args[]){
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,10);//4+8+12+16+20
        System.out.println(nums);

        //what if i want to perform some operations 
        //operation
        //if i only want even numbers / means if i want to filter those numbers 
        //then i want to multiply the even numbers by 2
        //then i want to add that numbers
        
        int sum = 0;

        for(int n : nums){
            if(n % 2 == 0){
                n = n * 2;
                sum = sum + n;
            }
        }
        System.out.println("sum of all even numbers : "+sum);
        
        //this is the old way of performing operations 
        //sometimes the original values get affected by this 
        //so later stream api is introduced 
        //in stream we got new way way of doing operations on API


        //here ar printing numbers 

        for(int i = 0;i < nums.size();i++){
            System.out.println(nums.get(i));
        }

        for(int m : nums ){
            System.out.println(m);
        }

        nums.forEach(n -> System.out.println(n));
    }
}
