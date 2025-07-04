import java.util.Scanner;
class student{
    private String name ;
    private int age;
    private int percentage;

    public void input_details(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name : ");
        name = sc.nextLine();
        System.out.print("Enter Your Age : ");
        age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Your Board Percentage : ");
        percentage = sc.nextInt();
        sc.nextInt();
        sc.nextLine();
    }
    public void output_details(){
        System.out.println("Name   : "+name);
        System.out.println("Age    : "+age);
        System.out.println("Percentage of Board : "+percentage);
    }
}

public class encapsulation{
    public static void main(String args[]){
       //encapsulation:encapsulation that binds the code together and the data it manipulates 
       //and keeps data safe from outside interference and misuse .
       student s1 = new student();
       System.out.println("Input Details : ");
       s1.input_details();
       System.out.println("Output Details : ");
       s1.output_details();
    }
}