import java.util.Scanner;
public class ExceptionHandling{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Numerator : ");
        int num1 = sc.nextInt();
        System.out.println("Enter the Denominator : ");
        int num2 = sc.nextInt();

        int result = 0;

        try{
            result = num1 / num2;
        }
        catch(Exception e){
            System.out.println("Cannot divided by 0 ");
        }
        System.out.println("result of divide : "+result);
    }
}