public class ArrayDemo5 {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5}; // Original array
        int d = 2; // Number of left rotations

        for (int i = 0; i < d; i++) {
            int first = a[0]; // Store the first element
            
            // Shift elements to the left
            for (int j = 0; j < a.length - 1; j++) {
                a[j] = a[j + 1];
            }

            a[a.length - 1] = first; // Place first element at the end
        }

        // Print the rotated array
        for (int num : a) {
            System.out.print(num + " ");
        }
    }
}