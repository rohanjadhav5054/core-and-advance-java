import java.util.Scanner;
public class forloop {
    public static void main(String args[]){
        System.out.println("Enter the size : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0;i <= n;i++){
            System.out.println(""+(i*n));
        }
    }
}
