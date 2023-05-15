public class SumInAMatrixSolution {
    public int matrixSum(int[][] nums) {
        int result = 0;
        for(int i = 0; i < nums.length; i++) {
            Arrays.sort(nums[i]);
        }
        int max = 0;
        for(int i = 0; i < nums[0].length; i++) {
            max = 0;
            for(int j = 1; j < nums.length; j++) {
                if(nums[max][i] < nums[j][i]) {
                    max = j;
                }
            }
            result += nums[max][i];
        }
        return result;
    }
}
