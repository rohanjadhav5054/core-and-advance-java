import java.util.Scanner;

class simple_method{
    public String stationary(int cost){
        if(cost == 5){
            return "scale";
        }
        else if(cost == 10){
            return "Pen";
        }
        else if(cost == 50){
            return "notebook";
        }
        return "nothing";
    }
    public int addition(int a,int b){
        return a + b;
    }
}
public class java_methods{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the cost : ");
        int price = sc.nextInt();

        simple_method sm = new simple_method();
        String bookseller = sm.stationary(price);
        System.out.println(bookseller);

        System.out.println("Enter the number 1 : ");
        int num1 = sc.nextInt();

        System.out.println("Enter the number 2 : ");
        int num2 = sc.nextInt();

        int result = sm.addition(num1,num2);
        System.out.println("Addition of two numbers is : "+result);

    }
}