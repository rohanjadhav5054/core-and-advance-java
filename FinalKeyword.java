//here we use final class 
final class A{
    void show(){
        System.out.println("In final class ")
    } 
}
class B extends A{
    
} 
//here we used power keyword for method 
class Calc{
    public final void add(int a,int b){
        System.out.println("Addition of result is : "+(a + b));
    }
}
class AdvCalc extends Calc{
    public void add(int a,int b){
        System.out.println("Power of result is : "+Math.pow(a, b));
    }
}

public class FinalKeyword{
    public static void main(String args[]){
        //here we used final variable because we don't want to change the value of variable 
        final int num = 10;
        num = 12;//here we are not able to change the value because we set variable to final 
        System.out.println("Value of num is : "+num);        

        //here we using final method
        AdvCalc obj = new AdvCalc();
        obj.add(5,10);//here we are not able to use add method to override because of final keyword
    }
}
//final keyword 
//in the following three diffreent contexts keyword final is used 
//i}variable ->  for variable final keyword is used for declaring the variable as constant so no one can change the value of variable .
//ii}Method  ->  for method final keyword is used for to stop the overriding .
//iii}class  -> for class final keyword is used for to stop inheitance so no one can inherit your class