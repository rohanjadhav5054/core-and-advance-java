class student{
    private String name;
    private int roll_no;
    private int marks;

    public student(){
        name = "Rohan Jadhav";
        roll_no = 2027;
        marks = 44;
    }
    public void displayDetails(){
        System.out.println("Name : "+name);
        System.out.println("Roll No : "+roll_no);
        System.out.println("Marks : "+marks);
    }
}
public class simple_constructors{
    public static void main(String args[]){
        student str = new student();
        str.displayDetails();
    }
}