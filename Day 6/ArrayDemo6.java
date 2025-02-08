public class ArrayDemo6 {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5}; // Original array
        int d = 3; // Number of rotations
        
        for (int i = 0; i < d; i++) {
            int last = a[a.length - 1]; // Store the last element
            for (int j = a.length - 1; j > 0; j--) {
                a[j] = a[j - 1]; // Shift elements to the right
            }
            a[0] = last; // Place last element at the front
        }

        // Print the rotated array
        for (int num : a) {
            System.out.print(num + " ");
        }
    }
}