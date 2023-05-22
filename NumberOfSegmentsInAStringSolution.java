public class NumberOfSegmentsInAStringSolution {
    public int countSegments(String s) {
        String[] str = s.split(" ");
        int count = 0;
        for(int i = 0; i < str.length; i++) {
            if(str[i].length() != 0) {
                count++;
            }
        }
        return count;
    }
}
