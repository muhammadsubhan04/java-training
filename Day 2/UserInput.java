import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // integer
        int a = sc.nextInt();
        // String
        sc.nextLine();
        String s = sc.nextLine();
        System.out.println(a);
        System.out.println(s);
    }
    
}
