import java.util.HashMap;
import java.util.Map;

public class OptimizedFibonacci {
    public static void main(String[] args) {
        int n = 45;
        System.out.print("fib is:   " + optimizedFibonacci(n));
    }

    public static long optimizedFibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        long prev = 0;
        long curr = 1;
        long fib = 0;

        for (int i = 2; i <= n; i++) {
            fib = prev + curr;
            prev = curr;
            curr = fib;
        }

        return fib;
    }
}
