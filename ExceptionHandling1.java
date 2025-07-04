//here we using multiple catch blocks 
public class ExceptionHandling1 {
    public static void main(String args[]){
        int num1 = 10;
        int num2 = 20;
        int result = 0;
        // String str = null;
        int arr[] = new int[5];
        try{
            // result = num1 / num2;
            // System.out.println(str.length());
            // System.out.println(arr[1]);
            System.out.println(arr[5]);
        }
        catch(ArithmeticException A){
            System.out.println("This is an arithmatic exception ");
        }
        catch(NullPointerException N){
            System.out.println("You are fool");
        }
        catch(ArrayIndexOutOfBoundsException AE){
            System.out.println("You don't know what is the size of the array !");
        }
        catch(Exception e){
            System.out.println("Something went wrong.");
        }
    }
}
