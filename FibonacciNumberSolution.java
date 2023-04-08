public class FibonacciNumberSolution {
    public int fib(int n) {
        int result = n;
        int f1 = 0;
        int f2 = 1;
        for(int i = 2; i < n + 1; i++) {
            result = f1 + f2;
            f1 = f2;
            f2 = result;
        }
        return result;
    }
}
