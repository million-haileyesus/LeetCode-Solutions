public class MoveZeroesSolution {
    public void moveZeroes(int[] nums) {
        for(int i = 1; i < nums.length; i++) {
            for(int j = 0; j < nums.length - i; j++) {
                if(nums[j] == 0) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }
}
