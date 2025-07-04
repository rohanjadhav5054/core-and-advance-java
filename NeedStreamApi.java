package stream;

import java.util.Arrays;
import java.util.*;
public class NeedStreamApi {
    public static void main(){
        List<Integer> li = Arrays.asList(2,4,5,6,8,9,10,13,15,16);

        
        int sum = 0;
        for(int l : li){
            if(l % 2 != 0){
                l = l * 2;
                sum += l;
            }
        }

        System.out.println(sum);
    }
}
//then why we need stream api 
//stream api used to apply some inbuilt methods 