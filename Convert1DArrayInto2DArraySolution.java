publi class Convert1DArrayInto2DArraySolution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int[][] result = new int[m][n];
        int count = 0;
        if(original.length != m * n) {
            result = new int[0][0];
        }
        else {
            for(int i = 0; i < m; i++) {
                for(int j = 0; j < n; j++) {
                    result[i][j] = original[count++];
                }
            }
        }
  
        return result;
    }
}
