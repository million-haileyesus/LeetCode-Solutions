public class RemoveDuplicatesFromSortedArraySolution {
    public int removeDuplicates(int[] nums) {
        int result = 0;
        int j = 1;
        int[] temp = new int[nums.length];
        if(nums.length > 0) {
        	temp[0] = nums[0];
        	result = j;
        }
        for(int i = 1; i < nums.length; i++) {
            if(nums[i - 1] == nums[i]) {
                result++;
            }
            if(temp[j - 1] != nums[i]) {
            	temp[j] = nums[i];
                j++;
            }
            result = j;
        }
        for(int i = 0; i < temp.length; i++) {
            nums[i] = temp[i];
        }
        return result;
    }
}
