public class SumOfDigitsOfStringAfterConvertSolution {
    public int getLucky(String s, int k) {
        String res = "";
		int result = 0;
		int size = s.length();
		for (int i = 0; i < size; i++) {
			int rank = s.charAt(i) - (s.charAt(i) >= 'a' ? 'a' : 'A') + 1;
			res += rank;
		}
		int i = 0;
		while (i < k) {
			int si = res.length();
			result = 0;
			for (int j = 0; j < si; j++) {
				int rank = res.charAt(j) - '0';
				result += rank;
			}
			res = Integer.toString(result);
			i++;
		}
        return result;
    }
}

