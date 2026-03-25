import java.util.Scanner;

public class Task7 {
    private static int[][] grid;
    private static int num;

    // Recursive spiral fill (fills current layer, then recurses to inner layer)
    private static void fillSpiral(int top, int bottom, int left, int right) {
        if (top > bottom || left > right) return;

        // Top row
        for (int i = left; i <= right; i++) grid[top][i] = num++;
        // Right column
        for (int i = top + 1; i <= bottom; i++) grid[i][right] = num++;
        // Bottom row (if not single row)
        if (top != bottom) {
            for (int i = right - 1; i >= left; i--) grid[bottom][i] = num++;
        }
        // Left column (if not single column)
        if (left != right) {
            for (int i = bottom - 1; i > top; i--) grid[i][left] = num++;
        }

        // Recurse to inner layer
        fillSpiral(top + 1, bottom - 1, left + 1, right - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        grid = new int[n][n];
        num = 1;
        fillSpiral(0, n - 1, 0, n - 1);

        // Print the grid
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(grid[i][j]);
                if (j < n - 1) System.out.print(" ");
            }
            System.out.println();
        }
        // Matches samples for n=3 and n=4 exactly
    }
}