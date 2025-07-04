import java.util.*;

public class ParallelStream{
    public static void main(String args[]){
        List<Integer> li = new ArrayList<>();
        
        Random ran = new Random();
        int size = 10000;

        for(int i = 0;i < size;i++){
            li.add(ran.nextInt(100));
        }

        // int sum1 = li.stream()
        //             .map(i -> i*2)
        //             .reduce(0,(c,e) -> (c+e));
        //instead of reduce we  use in built method  sum
        //but firstly use mapToInt() method

        long startSeq = System.currentTimeMillis();

        int sum2 = li.stream()
                    .map(i -> {
                        try { Thread.sleep(1);} catch (Exception e) {
                            System.out.println("Exception Occured !");
                        }return i * 2;})
                    .mapToInt(i -> i)
                    .sum();

        long endSeq = System.currentTimeMillis();

        long startPara = System.currentTimeMillis();

        int sum3 = li.parallelStream()
                    .map(i -> {
                        try { Thread.sleep(1);} catch (Exception e) {
                            System.out.println("Exception Occured !");
                        }return i * 2;})
                    .mapToInt(i -> i)
                    .sum();
        
        long endPara = System.currentTimeMillis();


        System.out.println("Sum2 : "+sum2+" "+"Sum3 : "+sum3);
        System.out.println("Time for Sequential stream : "+(endSeq - startSeq));
        System.out.println("Time for Parallel Stream : "+(endPara - startPara));

    }
}