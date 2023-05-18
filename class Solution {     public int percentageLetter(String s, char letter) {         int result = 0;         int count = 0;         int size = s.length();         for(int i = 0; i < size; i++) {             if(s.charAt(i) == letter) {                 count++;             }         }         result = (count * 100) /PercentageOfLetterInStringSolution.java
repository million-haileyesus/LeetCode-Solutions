public class PercentageOfLetterInStringSolution {
    public int percentageLetter(String s, char letter) {
        int result = 0;
        int count = 0;
        int size = s.length();
        for(int i = 0; i < size; i++) {
            if(s.charAt(i) == letter) {
                count++;
            }
        }
        result = (count * 100) / size;
        return result;
    }
}
