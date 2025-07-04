import java.io.*;

public class ExceptionHandlingUsingOnlyTry {
    public static void main(String args[]) throws IOException{
        int num = 0;
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("Enter the number : ");
            num = Integer.parseInt(br.readLine());
        }
        System.out.println(num);
    }
}
