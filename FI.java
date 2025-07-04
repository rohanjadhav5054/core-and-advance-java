@FunctionalInterface//this annotation is used to represent functional interface 
interface Room{
    void show();
}
public class FI{
    public static void main(String args[]){
        Room obj = new Room(){
            public void show(){
                System.out.println("In  A show !");
            }
            
        };
        obj.show();
    }
}