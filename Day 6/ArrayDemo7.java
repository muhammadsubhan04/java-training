public class ArrayDemo7 {
    public static void main(String[] args) {
        int a[] = {2, 0, 2, 1, 1, 0};

        int c0 = 0, c1 = 0, c2 = 0;

        // Count occurrences of 0s, 1s, and 2s
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                c0++;
            } else if (a[i] == 1) {
                c1++;
            } else if (a[i] == 2) {
                c2++;
            }
        }

        // Overwrite array with sorted values
        int index = 0;
        
        // Fill array with 0s
        while (c0 > 0) {
            a[index++] = 0;
            c0--;
        }

        // Fill array with 1s
        while (c1 > 0) {
            a[index++] = 1;
            c1--;
        }

        // Fill array with 2s
        while (c2 > 0) {
            a[index++] = 2;
            c2--;
        }

        // Print sorted array
        for (int num : a) {
            System.out.print(num + " ");
        }
    }
}