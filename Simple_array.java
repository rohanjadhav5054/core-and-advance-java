import java.util.Scanner;
public class Simple_array {
    public static void main(String args[]){
        int arr[] = { 39,50,54,68,52,57};
        System.out.print("Array first number is  : "+arr[0]);

        System.out.println("\nPrinting all the values : ");

        for(int i = 0;i < 6;i++){
            System.out.print("\t"+arr[i]);
        }

        System.out.println("\narray takes input from user : ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of array : ");
        int n = sc.nextInt();

        int arr1[] = new int[n];

        System.out.println("\nEnter the input in array : ");
        for(int i = 0;i < n;i++){
            arr1[i] = sc.nextInt();
        }

        System.out.println("\nPrinting the elements : ");
        for(int i = 0;i < n;i++){
            System.out.print("\t"+arr1[i]);
        }

        int count = arr1.length;
        System.out.println("\nArray length is "+count);
    }
}
