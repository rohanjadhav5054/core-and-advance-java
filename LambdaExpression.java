// @FunctionalInterface
interface A{
    void show();//we can also pass arguments 
}
public class LambdaExpression { 
    public static void main(String args[]){
        A obj = /* new A(){
            public void show */() -> {//if you have one statement no need to specify the brackets 
                System.out.println("In show method !");
            }
       /*  } */ ;
    }
}
//comments that should be remove 