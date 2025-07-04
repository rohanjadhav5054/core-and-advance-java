import java.util.Scanner;
public class jagged_array{
    public static void main(String args[]){
        int arr[][] = new int[3][];//jagged array 
        arr[0] = new int[3];
        arr[1] = new int[4];    
        arr[2] = new int[2];  
        
        System.out.println("\nHere is the Jagged array : ");
            Scanner sc = new Scanner(System.in);
        for(int i = 0;i < arr.length;i++){
            for(int j = 0;j < arr[i].length;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Printing the valued in the jagged array : ");

        for(int n[] : arr ){
            for(int m : n){
                System.out.print(m+" ");
            }
            System.out.println();
        }
    }
}
