import java.util.Scanner;
class student{
    String name;
    int roll_no;
    int marks;
}
public class object_array{
    public static void main(String args[]){
        student s[] = new student[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Details of Student : ");

        for(int i = 0;i < 3;i++){
            s[i] = new student();
        }

        for(int i = 0;i < 3;i++){
            System.out.print("Enter name of student " + (i+1) + ":");
            s[i].name = sc.nextLine();
            System.out.print("Enter the roll no "+ (i + 1)+" : ");
            s[i].roll_no = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter the marks of student "+(i+1)+" : ");
            s[i].marks = sc.nextInt();
            sc.nextLine();
        }
        //System.out.println();
        
        System.out.println("Printing the all student Details : ");

        //here we used the sinple for loop

        for(int i = 0;i < 3;i++){
            System.out.println("Name : "+s[i].name);
            System.out.println("Roll No : "+s[i].roll_no);
            System.out.println("Marks : "+s[i].marks);
        }
        
        //here we used the enhanced for loop

        for(student stud : s ){
            System.out.println("Name : "+stud.name+"\tRoll No : "+stud.roll_no+"\tMarks : "+stud.marks);
        }
    }
}