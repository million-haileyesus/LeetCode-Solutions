public class DIStringMatchSolution {
    public int[] diStringMatch(String s) {
        int size = s.length();
        int[] result = new int[size + 1];
        int upCount = 0;
        int downCount = size; 
        for(int i = 0; i < size; i++) {
            if(s.charAt(i) == 'I') {
                result[i] = upCount++;
            }
            else {
                result[i] = downCount--;
            }
        }
        result[size] = upCount;
        return result;
    }
}
