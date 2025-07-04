import java.util.Scanner;

public class dowhileloop {
    public static void main(String args[]){
        System.out.println("\nEnter the size : ");
        Scanner op = new Scanner(System.in);
        int n = op.nextInt();
        int i = 0;
        do{//in do while condition maximum one time should be executed then it checks condition
            System.out.println("Number is " + i);
            i++;
        }while(i < n);

        System.out.println("\nValue of i "+i);
    }    
}
