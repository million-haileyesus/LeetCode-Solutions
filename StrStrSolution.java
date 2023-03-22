public class StrStrSolution {
    public int strStr(String haystack, String needle) {
        int size = haystack.length();
        int len = needle.length();
        for(int i = 0; i < size - len + 1; i++) {
            if(haystack.charAt(i) == needle.charAt(0)) {
                if(haystack.substring(i, i + len).equals(needle)) {
                    return i;
                }
            }
        }
        return -1;
    }
}
