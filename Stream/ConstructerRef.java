import java.util.*;

class Student{
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

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

    @Override
    public String toString() {
        return "Name : "+name;
    }


}
public class ConstructerRef {
    public static void main(String args[]){
        List<String> li = Arrays.asList("Rohan","Sadiya","Kaivalya","Numan","Jishan");

        List<Student> students = new ArrayList<>();

        // for(String name : li){
        //     students.add(new Student(name));
        // }
        // System.out.println(students);
        
        // students = li.stream()
        //             .map(name -> new Student(name))
        //             .toList();
        
        
        //using constructer reference 
        students = li.stream()
                    .map(Student :: new)
                    .toList();
        
        System.out.println(students);
    }
}

//In Java, a constructor reference is a type of method reference used to refer to a constructor of a class, facilitating object creation in a more functional programming style.
// It allows you to create instances of a class without explicitly calling the constructor inside a lambda expression.
//Constructor references help improve code readability and reduce boilerplate code by allowing you to invoke constructors in a more concise way, aligning with functional programming practices in Java.