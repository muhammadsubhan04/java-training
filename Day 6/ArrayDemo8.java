import java.util.Arrays;

public class ArrayDemo8 {
    public static void main(String[] args) {
        int nums[] = {7, 1, 5};
        int target = 8;
        int rest[] = new int[2];
        boolean found = false; // Flag to check if a pair is found

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) { // Corrected variable names
                    rest[0] = i;
                    rest[1] = j;
                    found = true;
                    break; // Exit inner loop
                }
            }
            if (found) break; // Exit outer loop if a pair is found
        }

        // Check if a valid pair was found and print the result
        if (found) {
            System.out.println("Indices: " + Arrays.toString(rest));
        } else {
            System.out.println("No pair found that sums up to " + target);
        }
    }
}