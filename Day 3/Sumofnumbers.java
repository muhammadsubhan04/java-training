import java.util.Scanner;

public class Sumofnumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asking the user to enter a number
        System.out.print("Enter a positive integer: ");
        int num = scanner.nextInt();

        int sum = 0;

        // Loop to calculate sum
        for (int i = 1; i <= num; i++) {
            sum += i;
        }

        // Displaying the result
        System.out.println("Sum of numbers from 1 to " + num + " is: " + sum);

        scanner.close();
    }
}
