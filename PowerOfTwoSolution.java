public class PowerOfTwoSolution {
    public boolean isPowerOfTwo(int n) {
        long i = 1;
        while(i < n) {
            i <<= 1;
        }
        return i == n;
    }
}
