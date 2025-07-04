import java.util.Scanner;
class student{
    private String name;
    private int age;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    
}
public class getter_setter{
    public static void main(String args[]){
        student obj = new student();
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the Name : ");
        String Name = sc.nextLine();
        obj.setName(Name);
        String student_name = obj.getName();  

        System.out.print("Enter the Age : ");
        int Age = sc.nextInt();
        obj.setAge(Age);
        int student_age = obj.getAge();

        
        System.out.println("Name : "+student_name);
        System.out.println("Age : "+student_age);
    }
}