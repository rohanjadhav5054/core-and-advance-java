package sort;
import java.util.*;

class Student{
    int age;
    String name;
    Student(int age,String name){
        this.age = age;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Student [age = " + age + ", name = " + name + "]";
    }
    
}

public class ComapratorString {
    public static void main(String args[]){
        //sorting values wrt to student age
        List<Student> student = new ArrayList<>();

        student.add(new Student(20,"Rohan"));
        student.add(new Student(24,"su zai zai"));
        student.add(new Student(25,"zhang lurang"));
        student.add(new Student(22,"sang zhi"));
        student.add(new Student(27,"Duan Jiaxu"));
        
        System.out.println("Before : ");

        for(Student s : student){
            System.out.println(s);
        }
        
        Comparator<Student> comp = new Comparator<Student>(){
            public int compare(Student i,Student j){
                if(i.age > j.age){
                    return 1;
                }
                else{
                    return -1;
                }
            }
        };
        Collections.sort(student,comp);
        
        System.out.println("After : ");
        
        for(Student s : student){
            System.out.println(s);
        }
    }
}
