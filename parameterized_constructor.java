class student{
    private String name ;
    private int age;
    private int marks;

    student(){//default constructor
        name = "si tu mo";
        age = 20;
        marks = 45;
        System.out.println("This is default constructor");
    }
    student (String name ,int age,int marks){//parameterized constructor
        this.name = name;//if we are using different names of parameters and instance variables  in the constructors then no need to use this keyword
        this.age = age;//but you are using same name of instance variables and parameters then you have to use this keyword
        this.marks = marks;
        System.out.println("This is the parameterized constructor ");
    }
    public void PrintDetails(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Marks : "+marks);
    }
}

public class parameterized_constructor {
    public static void main(String args[]){
        student s1 = new student("King Rohan",20,91);
        s1.PrintDetails();    
        student s2 = new student();
        s2.PrintDetails();    
    }
}
