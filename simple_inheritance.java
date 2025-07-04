import tools.AdvancedCalculator;
public class simple_inheritance{
    public static void main(String args[]){
        ScientificCalculator ac = new ScientificCalculator();
        int result1 = ac.add(10,20);
        int result2 = ac.substract(20, 10);
        int result3 = ac.multiply(30, 5);
        int result4 = ac.division(10, 2);
        double result5 = ac.power(2,3);

        System.out.println("Addition result : "+result1);
        System.out.println("Substraction result : "+result2);
        System.out.println("Multiplication result : "+result3);
        System.out.println("Division result : "+result4);
        System.out.println("Power result : "+result5);
    }
}