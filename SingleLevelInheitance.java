import java.util.Scanner;
class GrandFather{
    private String name;
    private int age;
    public void AcceptDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Grandfather's Name : ");
        name = sc.nextLine();
        System.out.print("Enter the Age : ");
        age = sc.nextInt();
        sc.nextLine();
    }
    public void DisplayDetails(){
        System.out.println("Grandfather Details : ");
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
    }
}
class Father extends GrandFather{
    private String fatherName;
    private int fatherAge;

    public void AcceptFathersDetails(){
        
        AcceptDetails();
        Scanner op = new Scanner(System.in);
        System.out.print("\nEnter Fathers Name : ");
        fatherName = op.nextLine();
        System.out.print("Enter Fathers Age : ");
        fatherAge = op.nextInt();
        op.nextLine();
    }
    void DisplayFathersDetails(){
        DisplayDetails();
        System.out.println("Name : "+fatherName);
        System.out.println("age : "+fatherAge);
    }
}
public class SingleLevelInheitance{
    public static void main(String args[]){
        Father obj = new Father();
        obj.AcceptFathersDetails();
        obj.DisplayFathersDetails();
    }
}