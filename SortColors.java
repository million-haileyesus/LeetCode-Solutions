class Solution {
    public void sortColors(int[] nums) {
        int size = nums.length;
        for(int i = (size / 2) -1; i > -1; i--) {
            heap(i, size, nums);
        }
        for(int i = size - 1; i > 0; i--) {
            int temp = nums[i];
            nums[i] = nums[0];
            nums[0] = temp;
            
            heap(0, i, nums);
        }
    }

    public static void heap(int start, int end, int[] nums) {
			int child1;
			int child2;
			int i = start;
			
			for(; ((i << 1) + 2) < end; i++) {
				child1 = (i << 1) + 1;
				child2 = (i << 1) + 2;

				if(nums[child1] > nums[child2]) {
					
					if(nums[child1] > nums[i]) {
						int temp = nums[i];
						nums[i] = nums[child1];
						nums[child1] = temp;
					}
				}	
				else {
					if(nums[child2] > nums[i]) {
						int temp = nums[i];
						nums[i] = nums[child2];
						nums[child2] = temp;
					}
				}
			}

			if((i << 1) + 1 < end) {
				child1 = (i << 1) + 1;
				
				if (nums[child1] > nums[i]) {
					int temp = nums[i];
					nums[i] = nums[child1];
					nums[child1] = temp;
				}
				i++;
			}
		}
}
