//exception about class
class Rohan{
    public void show(){
        System.out.println("In class Rohan");
    } 
}
class Calc{
    public void show(){
        System.out.println("IN a calc class ! ");
    }
}
public class ExceptionClass{
    public static void main(String args[]){
        try{
            Class.forName("Calc");
            if(Class.forName("Rohan") != null){
                throw new ClassNotFoundException("rohan your class is not a class ");
            }
        }
        catch(ClassNotFoundException e){
            System.out.println("Please check Another time your written class is present or not ! "+e);
        }
        catch(Exception e){
            System.out.println("class not found "+e);
        }
    }
}