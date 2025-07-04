class A{
    public void show(){
        System.out.println("In class A");
    }
}
public class ObjectClass {
    public static void main(String args[]){
        A obj = new A();
        System.out.println(obj);
        //every time you try to print the object it calls toString() even if we don't mension
        //method it is the default method in object class  
        //object class print basicallly class name and hexadecimal  hashcode
    }
}
//every class extends Object class object class is a default class 