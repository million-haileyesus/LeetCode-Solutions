public class HeightCheckerSolution {
    public int heightChecker(int[] heights) {
        int result = 0;
        int[] temp = new int[heights.length];
        for(int i = 0; i < temp.length; i++) {
            temp[i] = heights[i];
        }
        Arrays.sort(temp);
        for(int i = 0; i < temp.length; i++) {
            if(temp[i] != heights[i]) {
                result++;
            }
        }
        return result;
    }
}
