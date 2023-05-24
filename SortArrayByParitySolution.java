public class SortArrayByParitySolution {
    public int[] sortArrayByParity(int[] nums) {
        int[] result = new int[nums.length];
        int ind = 0;
        for(int i = 0; i < result.length; i++) {
            if(nums[i] % 2 == 0) {
                result[ind++] = nums[i];
            }
        }
        for(int i = 0; i < result.length; i++) {
            if(nums[i] % 2 == 1) {
                result[ind++] = nums[i];
            }
        }
        return result;
    }
}
