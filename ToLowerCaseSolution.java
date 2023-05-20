public class ToLowerCaseSolution {
    public String toLowerCase(String s) {
        String[] alp = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p", "q", "r","s","t","u","v","w","x","y","z"};
        String result = "";
        int size = s.length();
        for(int i = 0; i < size; i++) {
            int rank = s.charAt(i) - (s.charAt(i) >= 'a' ? 'a' : 'A');
            result += (rank > -1 && rank < 26) ? alp[rank] : s.charAt(i);
        }
        return result;
    }
}
