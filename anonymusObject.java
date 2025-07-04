class Student{
    private String name;
    private int rollNo;
    private int marks;

    Student(){
        name = "xiao Gu wei yi";
        rollNo = 2027;
        marks = 84;
        System.out.println("Constructor created ! ");
    }
    Student(String name,int rollNo,int marks){
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }
    public void displayStudentDetails(){
        System.out.println("Name : "+name);
        System.out.println("Roll NO : "+rollNo);
        System.out.println("Marks : "+marks);
    }
}
public class anonymusObject {
    public static void main(String args[]){
        new Student("si tu mo",2028,78).displayStudentDetails();//this anonymus object
        //anonymus object does not have reference 
        //so we cannot use after this line 
    }
}
