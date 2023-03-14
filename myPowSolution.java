public class myPowSolution {
    public double myPow(double x, int n) {
        double result = 1.0;
        if(n > 0) {
	        for(int i = 0; i < n; i++) {
	            result *= x;
	        }
        }
        else {
        	int size = -(n);
        	for(int i = 0; i < size; i++) {
        		result *= 1/x;
        	}
        }
        return result;
    }
}
