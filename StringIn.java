import java.util.Scanner;
public class StringIn{
    public static void main(String args[]){
        System.out.print("Enter the name : ");
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        System.out.println(name);
    }
}