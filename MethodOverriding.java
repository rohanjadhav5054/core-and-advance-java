class GrandFather{
    public void DisplayDetails(){
        System.out.println("Name : Santu Jadhav");
    }
}
class Father extends GrandFather{
    public void DisplayDetails(){
        System.out.println("Name : Dadasaheb Jadhav");
    }
}
class Child extends Father{
    public void DisplayDetails(){
        System.out.println("Name : Rohan Jadhav");
    }
}
public class MethodOverriding {
    public static void main(String args[]){
        GrandFather obj = new GrandFather();
        Father obj1 = new Father();
        Child obj2 = new Child();

        GrandFather g;
        g = obj;
    }    
}
