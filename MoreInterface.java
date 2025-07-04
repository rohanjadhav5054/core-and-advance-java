interface A{
    void showA();
    void displayA();
}

interface B{
    void showB();
    void displayB();
}

class Concrete implements A,B{//here we can actually implement two interfaces in one class !
    public void showA(){
        System.out.println("In Show A method !");
    }
    public void displayA(){
        System.out.println("In display B method !");
    }
    public void showB(){
        System.out.println("In show B method !");
    }
    public void displayB(){
        System.out.println("In display B method !");
    }
}
//interface  - interface -> extends 
//class - interface -> implements
//class - class -> extends 
interface C extends A{
     
}
public class MoreInterface{
    public static void main(String args[]){
        Concrete obj = new Concrete();
        obj.displayA();
        obj.displayB();
        obj.showA();
        obj.showB();
    }
}