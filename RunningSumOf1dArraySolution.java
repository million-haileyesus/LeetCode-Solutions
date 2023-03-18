public class RunningSumOf1dArraySolution {
    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        int temp = 0;
        for(int i = 0; i < nums.length; i++) {
            for(int j = i; j > -1; j--) {
                result[i] += nums[j];
            }
        }
        return result;
    }
}
