public class SearchInsertPositionSolution {
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int result = 0;
        int high = nums.length - 1;
        while(low < high) {
            int mid = (low + high) / 2;
            if(target > nums[mid]) {
                low = mid + 1;
            }
            else {
                high = mid;
            }
        }
        if(target == nums[high]) {
	    result = high;
	}
	else {
	    result = (target < nums[high]) ? high : high + 1;
	}
        return result;
    }
}
