public class PlusOneSolution {
    public int[] plusOne(int[] digits) {
        if(digits[digits.length - 1] < 9) {
            digits[digits.length - 1] = digits[digits.length - 1] + 1;
        }
        else {
            int i = digits.length - 1;
            while(i > 0 && digits[i] == 9) {
                digits[i] = 0;
                i--;
            }
            if(digits[i] == 9) {
            	digits = new int[digits.length + 1];
            	digits[1] = 0;
            	i = 0;
            }
            digits[i] = digits[i] + 1;

        }
        return digits;
    }
}
