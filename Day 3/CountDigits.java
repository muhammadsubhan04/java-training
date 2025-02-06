import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        int count = 0;
        int temp = Math.abs(number); // Handle negative numbers

        if (temp == 0) {
            count = 1; // If the number is 0, it has one digit
        } else {
            while (temp > 0) {
                temp /= 10; // Remove the last digit
                count++;    // Increment count
            }
        }

        System.out.println("Total number of digits: " + count);
    }
}