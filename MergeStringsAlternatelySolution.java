public class MergeStringsAlternatelySolution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder("");
        int size1 = word1.length();
        int size2 = word2.length();
        int end = (size1 > size2) ? size2 : size1; 

        int i, j;
        int count = 0;
        for(i = j = 0; j < end; count++) {
            if(count % 2 == 0) {
                sb.append(word1.charAt(i++));
            }
            else {
                sb.append(word2.charAt(j++));
            }
        }

        while(i < size1) {
            sb.append(word1.charAt(i++));
        }

        while(j < size2) {
            sb.append(word2.charAt(j++));
        }

        return sb.toString();
    }
}
