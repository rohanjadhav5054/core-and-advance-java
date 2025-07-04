//Dynamic dispatch method 
//in this method java implements run time polymorphism 
class GrandFather{
    public void display(){
        System.out.println("In Grand father class !");
    }
}
class Father extends GrandFather{
    public void display(){
        System.out.println("In father class !");
    }
}
class child extends Father{
    public void display(){
        System.out.println("In child class !");
    }
}
//this is possible when we inheritance 
public class Polymorphism{
    public static void main(String args[]){
        
        GrandFather obj = new GrandFather();
        obj.display(); // Output: In Grand father class !
        
        obj = new Father();
        obj.display();
        
        obj = new Child();
        obj.display(); 
    }
}