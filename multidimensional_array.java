import java.util.Scanner;
public class multidimensional_array {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size n x n : ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int arr[][] = new int[n1][n2];
        
        System.out.println("\nEnter the values of the array : ");
        for(int i = 0;i < n1;i++){
            for(int j = 0;j < n2;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Elements in multidimensional array : ");

        for(int i = 0;i < n1;i++){
            for(int j = 0;j < n2;j++){
                System.out.print(" "+arr[i][j]);
            }
            System.out.println();
        }

        System.out.println("By using enhanced for loop : ");

        for(int n[] : arr){
            for(int m : n){
                System.out.print(" "+m);
            }
            System.out.println();
        }
    }
} 
