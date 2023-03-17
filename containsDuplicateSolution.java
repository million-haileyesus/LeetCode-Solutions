public class containsDuplicateSolution {
    public boolean containsDuplicate(int[] nums) {
        boolean hasDuplicate = false;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 1 && !hasDuplicate; i++) {
            if(nums[i] == nums[i + 1]) {
                hasDuplicate = true;
            }
        }
        return hasDuplicate;
    }
}
