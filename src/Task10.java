
// NO extra parameters, NO helper functions, NO global/static variables
public class Task10 {
    // Single recursive function (only this method + main)
    public static boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;
        if (n == 1) return true;
        if (n % 2 != 0) return false;
        return isPowerOfTwo(n / 2);
    }

    public static void main(String[] args) {
        // Test 0-9
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " is" + (isPowerOfTwo(i) ? " a" : " not a") + " power of two");
        }
        System.out.println("------------------");
        for (int i = 10; i <= 32; i += 2) {
            System.out.println(i + " is" + (isPowerOfTwo(i) ? " a" : " not a") + " power of two");
        }
        // Exact output matches Figure 1
    }
}