import java.util.Scanner;

public class Task5 {
    private static Scanner sc = new Scanner(System.in);

    // Recursive print in reverse order (NO arrays, NO loops)
    private static void printReverse(int remaining) {
        if (remaining == 0) return;
        int num = sc.nextInt();
        printReverse(remaining - 1);
        System.out.print(num + " ");
    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        printReverse(n);
        System.out.println(); // newline at end
        // Sample: input 3\n1 2 3 → output 3 2 1
    }
}