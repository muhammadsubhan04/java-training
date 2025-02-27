public class ArrayDemo4 {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 2, 5, 4};
        int freq[] = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            if (freq[i] == -1) // Skip already counted elements
                continue;
            
            int no = a[i];
            int count = 1;

            for (int j = i + 1; j < a.length; j++) {
                if (no == a[j]) {
                    count++;
                    freq[j] = -1; // Mark duplicate elements
                }
            }
            freq[i] = count;
        }

        // Print unique elements with their frequencies
        System.out.println("Element | Frequency");
        for (int i = 0; i < a.length; i++) {
            if (freq[i] != -1) { // Print only counted elements
                System.out.println("   " + a[i] + "    |    " + freq[i]);
            }
        }
    }
}