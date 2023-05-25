public class MedianOfTwoSortedArraysSolution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double result = 0;
        int[] sortedArray = merge(nums1, nums2);
        if(sortedArray.length % 2 == 0) {
            result = sortedArray[sortedArray.length >> 1] + 
                                sortedArray[(sortedArray.length - 1) >> 1];
            result /= 2;
        }
        else {
            result = sortedArray[sortedArray.length >> 1];
        }
        return result;
    }

    public static int[] merge(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length + nums2.length];
        int count = 0;
        int i = 0;
        int j = 0;
        for(; i < nums1.length && j < nums2.length; ) {
        	
            if(nums1[i] > nums2[j]) {
                result[count++] = nums2[j++];
            }
            else {
                result[count++] = nums1[i++];
            }
            
        }
        
        while(i < nums1.length) {
            result[count++] = nums1[i++];
        }
        
        while(j < nums2.length) {
            result[count++] = nums2[j++];
        }
        return result;
    }
}
