import java.util.Scanner;

public class Task4 {

    public static int sumOfPowers(int b, int n) {
        if (n == 0) {
            return 1;
        }
        return (int)Math.pow(b, n) + sumOfPowers(b, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int b = sc.nextInt();
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("n should be non-negative");
        } else {
            System.out.println(sumOfPowers(b, n));
        }

        sc.close();
    }
}