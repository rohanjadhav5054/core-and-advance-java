class A extends Thread{
    public void run(){
        for(int i = 0;i < 100;i++){
            System.out.println("Hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println("Something Happened !");
            }
        }
    }
}
class B extends Thread{
    public void run(){
        for(int i = 0;i < 100;i++){
            System.out.println("Rohan");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println("Something Happened !");
            }
        }
    }
}
public class MultipleThreadSleep{
    public static void main(String args[]) {
        A obj1 = new A();
        B obj2 = new B();
        
        obj1.start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            System.out.println("Something Happened !");
        }
        obj2.start();
    }
}