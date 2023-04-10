public class N-thTribonacciNumberSolution {
    public int tribonacci(int n) {
        int result = n;
        if(n == 2) {
            result = 1;
        }
        else if(n > 2) {
            int f0 = 0;
            int f1 = 1;
            int f2 = 1;
            for(int i = 3; i < n + 1; i++) {
                result = f0 + f1 + f2;
                f0 = f1;
                f1 = f2;
                f2 = result;
            }
        }
        return result;
    }
}
