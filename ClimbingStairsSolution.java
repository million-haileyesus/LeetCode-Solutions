public class ClimbingStairsSolution {
    public int climbStairs(int n) {
        int result = n;
        if(n > 3) {
            int f1 = 1;
            int f2 = 2;
            for(int i = 2; i < n; i++) {
                result = f1 + f2;
                f1 = f2;
                f2 = result;
            }
        }
        return result;
    }
}
