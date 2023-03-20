public class MergeSortedArraySolution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] result = new int[m+n];
        int count = 0;
        int i = 0;
        int j = 0;
        for(; i < m && j < n; ) {
        	
            if(nums1[i] > nums2[j]) {
                result[count++] = nums2[j++];
            }
            else {
                result[count++] = nums1[i++];
            }
            
        }
        
        while(i < m) {
            result[count++] = nums1[i++];
        }
        
        while(j < n) {
            result[count++] = nums2[j++];
        }
       for(int k = 0; k < result.length; k++) {
           nums1[k] = result[k];
       }
    }
}
