public class MaximumSumWithExactlyKElementsSolution {
    public int maximizeSum(int[] nums, int k) {
        int result = 0;
        int max = 0;
        for(int i = 1; i < nums.length; i++) {
            if(nums[max] < nums[i]) {
                max = i;
            }
        }
        for(int i = 0; i < k; i++) {
            result += nums[max]++;
        }

        return result;
    }
}
