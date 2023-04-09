class Solution {
    public int[] leftRigthDifference(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        int le = 0;
        int ri = 0;
        for(int i = 1; i < nums.length; i++) {
            le += nums[i - 1];
            left[i] = le;
        }
        for(int i = nums.length - 2; i > -1; i--) {
            ri += nums[i + 1];
            right[i] = ri;
        }
        for(int i = 0; i < nums.length; i++) {
            nums[i] = left[i] - right[i];
            nums[i] = (nums[i] < 0) ? -nums[i] : nums[i];
        }
        return nums;
    }
}
