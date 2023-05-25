public class ValidPalindromeSolution {
    public boolean isPalindrome(String s) {
        String temp = "";
        s = s.toLowerCase();
        int size = s.length();
        for(int i = 0; i < size; i++) {
            if((s.charAt(i) > 96 && s.charAt(i) < 123) || (s.charAt(i) > 47 && s.charAt(i) < 58)) {
                temp += s.charAt(i);
            }
        }
        boolean result = true;
        int si = temp.length();
        for(int i = 0; i < si / 2; i++) {
            if(temp.charAt(i) != temp.charAt(si - 1 - i)) {
                result = false;
            }
        }
        return result;
    }
}
