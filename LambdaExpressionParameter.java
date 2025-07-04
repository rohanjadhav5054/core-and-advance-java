@FunctionalInterface
interface A{
    void showValue(int a,int b);
}
public class LambdaExpressionParameter {
    public static void main(String args[]){
        
        A obj = (a,b) -> System.out.println("Addition is "+(a+b));
        obj.showValue(5,6);
    }    
}
