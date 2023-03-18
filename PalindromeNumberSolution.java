public class PalindromeNumberSolution {
    public boolean isPalindrome(int x) {
        String s = Integer.toString(x);
        boolean isPalindrome = true;
        int size = s.length();
        if(s.charAt(0) == '-') {
            isPalindrome = false;
        }
        else {
            for(int i = 0; i < size / 2; i++) {
                if(!(s.charAt(i) == (s.charAt(size-i-1)))) {
                    isPalindrome = false;
                }
            }
        }
        return isPalindrome;
    }
}
