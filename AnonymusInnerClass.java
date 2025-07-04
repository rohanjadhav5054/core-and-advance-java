class A{
    public void show(){
        System.out.println("we are in A show !");
    }
}
public class AnonymusInnerClass{
    public static void main(String args[]){
        A obj = new A(){
            public void show(){
                System.out.println("In A new show !");
            }
        };
        obj.show();

        
    }
}