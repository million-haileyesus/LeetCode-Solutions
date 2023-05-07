class Solution {
    public void rotate(int[][] matrix) {
        int[][] temp = new int[matrix[0].length][matrix[0].length];

        for(int i = 0; i < matrix[0].length; i++) {
            for(int j = matrix[0].length - 1; j > -1; j--) {
                temp[i][(matrix[0].length - 1) - j] = matrix[j][i];
            }
        }

        for(int i = 0; i < matrix[0].length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = temp[i][j];
            }
        }
    }
}
