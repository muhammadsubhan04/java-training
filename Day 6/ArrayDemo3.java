public class ArrayDemo3 {
    public static void main(String[] args) {
        int a[] = {4, 8, 3, 6, 1};
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        int third = Integer.MAX_VALUE;

        for (int i = 0; i < a.length; i++) {
            if (a[i] < first) {
                third = second;
                second = first;
                first = a[i];
            } 
            else if (a[i] > first && a[i] < second) { 
                third = second;
                second = a[i];
            } 
            else if (a[i] > second && a[i] < third) { 
                third = a[i];
            }
        }

        // Check if we found three distinct elements
        if (third == Integer.MAX_VALUE) {
            System.out.println("Array does not have three distinct elements.");
        } else {
            System.out.println("Three smallest elements: " + first + ", " + second + ", " + third);
        }
    }
}
