class A extends Thread{
    public void run(){
        for(int i = 0;i < 10;i++){
            System.out.println("Hi");
            try{
                Thread.sleep(10);
            }catch(InterruptedException e){
                System.out.println("Something Happened !");
            }
        }
    }
}
class B extends Thread{
    public void run(){
        for(int i = 0;i < 10;i++){
            System.out.println("Hello");
            try{
                Thread.sleep(10);//we basically tells tells shedular sleep 10 ms 
            }catch(InterruptedException e){
                System.out.println("Something Happened !");
            }
        }
    }
}
public class MultipleThreads{
    public static void main(String args[]) {
        A obj1 = new A();
        B obj2 = new B();
        System.out.println(obj1.getPriority());//it returns the priority of the object which 1 to 10
                                               //by default priority will be 5
        
        obj2.setPriority(Thread.MAX_PRIORITY);//MIN_PRIORITY - for minimum priority.  1
                                              // MAX_PRIORITY - for maximum priority. 10
                                              // NORM_PRIORITY - for normal priority. 5  
        System.out.println(obj2.getPriority()); 
        obj1.setPriority(7);
        System.out.println(obj1.getPriority());        
        obj1.start();
        try{
            Thread.sleep(5);
        }catch(InterruptedException e){
            System.out.println("Something Happened !");
        }
        obj2.start();
    }
}  