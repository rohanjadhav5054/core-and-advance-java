class A{
    private int rollNo;
    A(){
        rollNo = 2027;
    }
    public void show(){
        System.out.println("Roll No is "+rollNo);
    }

    class B{//inner class can access al methods in outer class including private instance varaibles .
        public void show1(){
            System.out.println("In B class !");
        }
        public void show(){
            System.out.println("Roll No is "+rollNo);
        }
    }
}
public class InnerClass {
    public static void main(String args[]){
        A obj = new A();
        obj.show();
        A.B obj1 = obj.new B();
        obj1.show1();
        obj1.show();
    }
}
