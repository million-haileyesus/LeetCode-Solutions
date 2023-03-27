public class FindMinimumInRotatedSortedArraySolution {
    public int findMin(int[] nums) {
        int min = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] < nums[min]) {
                min = i;
            }
        }
        return nums[min];
    }
}
