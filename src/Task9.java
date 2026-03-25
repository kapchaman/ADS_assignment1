import java.util.Scanner;

public class Task9 {
    private static void permute(char[] arr, int idx) {
        if (idx == arr.length) {
            System.out.println(new String(arr));
            return;
        }
        for (int i = idx; i < arr.length; i++) {
            // Swap
            char temp = arr[idx];
            arr[idx] = arr[i];
            arr[i] = temp;

            permute(arr, idx + 1);

            // Backtrack
            temp = arr[idx];
            arr[idx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        char[] arr = s.toCharArray();
        permute(arr, 0);
        // AB → 
        // AB
        // BA
        // IOX → all 6 permutations (each on new line) as in sample
    }
}