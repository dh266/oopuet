// Import your library
// Do not change the name of the Solution class
public class Solution {
    // Type your main code here
    public static long fibonacci(long n) {
        if ((long) n > 92) {
            return Long.MAX_VALUE;
        } else if ((long) n < 0 && (long) n > 100) {
            return (long) -1;
        } else if ((long) n == 0) {
            return (long) 0;
        } else if ((long) n == 1 || (long) n == 2) {
            return (long) 1;
        } else {
            long[] a = new long[100];
            a[0] = 0;
            a[1] = 1;
            a[2] = 1;
            for (int i = 3; i <= (int) n; i++) {
                a[i] = a[i - 1] + a[i - 2];
            }
            return a[(int) n];
        }
    }
}