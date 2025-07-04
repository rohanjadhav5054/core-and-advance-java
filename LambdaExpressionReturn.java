@FunctionalInterface 
interface Return{
    int show(int a, int b);
}

public class LambdaExpressionReturn {
    public static void main(String args[]){
        Return obj = /* new Return(){
            public int show */(a,b) -> /* { */ //if we returning something there is no need of specifying return keyword also
                /* return */ a+b;
            /* } */
        /* }; */
        int result = obj.show(2,3);
        System.out.println("Result of addition is "+result);
    }
}
