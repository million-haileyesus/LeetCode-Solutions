public class MaximumNumberOfWordsFoundInSentencesSolution {
    public int mostWordsFound(String[] sentences) {
        int result = 0;
        for(int i = 0; i < sentences.length; i++) {
            String[] sent = sentences[i].split(" ");
            if(sent.length > result) {
                result = sent.length;
            }
        } 
        return result;
    }
}
