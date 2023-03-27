public class SearchInRotatedSortedArraySolutionII {
    public boolean search(int[] nums, int target) {
        boolean result = false;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == target) {
                result = true;
                break;
            }
        }
        return result;
    }
}
