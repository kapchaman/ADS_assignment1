import java.util.Scanner;

// Alikhan Shikhiyev
public class Task1 {
    // Recursive function: sum of squares 1² + 2² + ... + n²
    public static long sumOfSquares(int n) {
        if (n == 0) return 0;
        return (long) n * n + sumOfSquares(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("Must be positive. ");
        } else {
            System.out.println(sumOfSquares(n));
        }
        // For sample n=4 → 30
    }
}