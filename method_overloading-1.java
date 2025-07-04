import java.util.Scanner;

class calculator{
    public int add(int a,int b){
        return a + b;
    }
    public int add(int a,int b,int c){
        return a + b + c;
    }
    public int add(int a,int b,int c,int d){
        return a + b + c + d;
    }
}
public class method_overloading {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int ch;
        do{
            System.out.println("Menu\n1.Additing two numbers\n2.Adding three numbers\n3.Adding four numbers\n4.exit\n");
            System.out.print("Enter your choice : ");
            ch = sc.nextInt();

            switch(ch){
                case 1:
                    System.out.println("\nEnter two numbers num1 and num2 : ");
                    int num1 = sc.nextInt();
                    int num2 = sc.nextInt();

                    calculator obj1 = new calculator();
                    int result = obj1.add(num1,num2);
                    System.out.println("Result of addition of two  numbers num1  and num2 is "+result);
                    break;
                case 2 :
                    System.out.println("\nEnter three numbers num1,num2,num3 one by one ");
                    int x = sc.nextInt();
                    int y = sc.nextInt();
                    int z = sc.nextInt();
                    calculator obj2 = new calculator();
                    int result_1 = obj2.add(x, y, z);
                    System.out.println("result of three numbers  a,b,c is "+ result_1);
                    break;
                case 3 :
                    System.out.println("\nEnter the four numbers num1,num2,num3,num4 one by one : ");
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    int c = sc.nextInt();
                    int d = sc.nextInt();
                    calculator obj3 = new calculator();
                    int result_3 = obj3.add(a, b, c, d);
                    System.out.println("Result of operation of four numbers a , b, c, d is "+result_3);
                    break;
                case 4:
                    System.out.println("\nYour program is exitted ! ");
                    break;
                default :
                    System.out.println("you Entered the invalid choice ");

            }
        }while(ch != 4);
    }
}
