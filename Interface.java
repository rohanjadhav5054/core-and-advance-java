interface Collage{
    String studentName = "Rohan Dadasaheb Jadhav ";
    String division = "A";//final and static 
    void displayName();
    void displayCity();
} 

class Cse implements Collage{
    public void displayName(){
        System.out.println("Colage Name Is Annasaheb Dange collage of Engineering Ashta !");
    }
    public void displayCity(){
        System.out.println("Collage present In Ashta !");
    }
}
public class Interface{
    public static void main(String args[]){
        Cse obj = new Cse();
        obj.displayName();
        obj.displayCity();

        System.out.println("Name : "+Collage.studentName);
        System.out.println("Division : "+Collage.division);
        
    }
}
