public class Search2DMatrixSolution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int[] temp = new int[matrix.length * matrix[0].length];
        int count = 0;
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                temp[count++] = matrix[i][j];
            }            
        }        
        Arrays.sort(temp);
        int low = 0;
        int result = 0;
        int high = temp.length - 1;
        while(low < high) {
            int mid = (low + high) / 2;
            if(target > temp[mid]) {
                low = mid + 1;
            }
            else {
                high = mid;
            }
        }
        if(target == temp[high]) {
	        return true;
	    }
	    else {
	        return false;
	    }
    }
}
