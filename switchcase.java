import java.util.Scanner;

public class switchcase  {
    public static void main(String args[]){
        System.out.println("Menu\n1.Monday\n2.Tuesday\n3.Wednesday\n4.Thursday\n5.Friday\n6.Saturday\n7.Sunday");
        Scanner op = new Scanner(System.in);
        System.out.println("\nEnter the number : ");
        int num = op.nextInt();

        switch(num){
            case 1,2,3,4,5,6  -> System.out.println("Today is working day so you wake up early and do all your stuff .\n and today is ! ");
                
            case 7 -> System.out.println("Today is holiday !.do not only sleep all day  you do clean your home and do some exercise .");
            
            default -> System.out.println("You Entered the invalid statement ! ");

        }
        op.close();
    }
}
