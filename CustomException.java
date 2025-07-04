//here we are creating our custom exceptions
class RohanException extends Exception{
    public RohanException(String m){
        super(m);
    }   
} 
public class CustomException {
    public static void main(String args[]){
        int i = 18;
        int j = 20;
        int result = 0;
        try{
            result = i/j;
            if(result == 0){
                throw new RohanException("here i don't want to divide by 0");
            }
        }
        catch(RohanException r){
            System.out.println("rohan exception ! "+r);
        }
        
        catch(Exception e){
            System.out.println("Here something occurs !"+e);
        }
    }
}
