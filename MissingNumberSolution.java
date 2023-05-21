public class MissingNumberSolution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int result = 0;
        int i;
        for(i = 0; i < nums.length; i++) {
            if(nums[i] > -1 && nums[i] != i) {
                result = i;
                break;
            }
        }
        result = nums.length == i ? nums[i - 1] + 1 : result;
        return result;
    }
}
