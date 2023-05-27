public class MajorityElementSolution {
    public int majorityElement(int[] nums) {
        int result = 0;
        int count = 0;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i] == nums[i + 1]) {
                count++;
            }
            else {
                count = 0;
            }
            if(count >= nums.length >> 1) {
                result = i;
            }
        }
        return nums[result];
    }
}
