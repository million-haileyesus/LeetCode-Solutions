public class ThirdMaximumNumberSolution {
    public int thirdMax(int[] nums) {
        int result = 0;
        int count = 1;
        if(nums.length < 3) {
            result = nums.length - 1;
        }
        else {
            Arrays.sort(nums);
            for(int i = nums.length - 1; i > 0; i--) {
                if(nums[i] != nums[i - 1]) {
                    count++;
                }
                if(count == 3) {
                    result = i - 1;
                }
            }
        }
        result = count < 3 ? nums.length - 1 : result;
        return nums[result];
    }
}
