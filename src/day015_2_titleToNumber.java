public class day015_2_titleToNumber {
    public int titleToNumber(String s) {
        int res = 0;
        char[] digits = s.toCharArray();
        for (int i = digits.length - 1; i >= 0; i--) {    //尝试i从0 到 length - 1
            res += (digits[i] - 'A' + 1) * Math.pow(26, digits.length - 1 - i);
        }
        return res;
    }
}
