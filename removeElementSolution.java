class removeElementSolution {
    public int removeElement(int[] nums, int val) {
        int result = 0;
        int[] temp = new int[nums.length];
        for(int i = 0, j = 0; i < nums.length; i++) {
            if(nums[i] != val) {
                temp[j] = nums[i];
                result++;
                j++;
            }
        }
        for(int i = 0; i < temp.length; i++) {
            nums[i] = temp[i];
        }
        return result;
    }
}
