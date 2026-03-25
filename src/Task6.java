import java.util.Scanner;

public class Task6 {
    private static Scanner sc = new Scanner(System.in);

    // Recursive print strings in reverse (only local String, no arrays of strings, no loops)
    private static void printReverseStrings(int remaining) {
        if (remaining == 0) return;
        String s = sc.nextLine();
        printReverseStrings(remaining - 1);
        System.out.println(s);
    }

    public static void main(String[] args) {
        String line = sc.nextLine();
        int n = Integer.parseInt(line);
        printReverseStrings(n);
        // Sample input:
        // 3
        // Abc
        // bcdh
        // abcdef
        // Output:
        // abcdef
        // bcdh
        // Abc
    }
}