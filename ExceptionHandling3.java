//exception handling using throw keyword !
public class ExceptionHandling3{
    public static void main(String args[]){
        int i = 18;
        int j = 20;
        int result = 0;
        
        try{
            result = i/j;
            if(result == 0){
                throw new ArithmeticException("i don't want the result 0.");
            }//throw keyword is used to throw explicitely exception any block of code .
            //we can throw either checked or unchecked exceptions
            //throw keyword mainly used to custom exceptions 
        }
        catch(ArithmeticException ae){
            result = i/1;
            System.out.println("here arithmatic exception occurs"+ae);
        }
        catch(Exception e){
            System.out.println("Here something happen !");
        }
        System.out.println("result : "+result);
    }
}