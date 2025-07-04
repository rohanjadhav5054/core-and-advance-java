import java.util.Scanner;

public class SimpleInputOutput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter something: ");
        String userInput = scanner.nextLine();

        System.out.println("You entered: " + userInput);
    }
}
