import java.util.Scanner;

public class Task8 {
    private static void generate(int pos, int n, int k, int[] seq) {
        if (pos == n) {
            for (int i = 0; i < n; i++) {
                System.out.print(seq[i]);
                if (i < n - 1) System.out.print(" ");
            }
            System.out.println();
            return;
        }
        for (int i = 1; i <= k; i++) {
            seq[pos] = i;
            generate(pos + 1, n, k, seq);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] seq = new int[n];
        generate(0, n, k, seq);
        // For 2 3 → 9 lines as in sample
        // For 3 3 → 27 lines as in sample
    }
}