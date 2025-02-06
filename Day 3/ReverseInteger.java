import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input integer from user
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        
        // Call the reverse function
        int reversedNum = reverseNumber(num);
        
        // Display result
        System.out.println("Reversed number: " + reversedNum);
        
        scanner.close();
    }

    // Function to reverse a number
    public static int reverseNumber(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;  // Extract last digit
            reversed = reversed * 10 + digit;  // Append digit to reversed number
            num /= 10;  // Remove last digit
        }
        return reversed;
    }
}
