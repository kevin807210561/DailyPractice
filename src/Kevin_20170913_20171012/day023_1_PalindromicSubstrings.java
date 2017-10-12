package Kevin_20170913_20171012;

public class day023_1_PalindromicSubstrings {
    public int countSubstrings(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 1; i + j <= s.length(); j++) {
                if (judge(s.substring(i, i + j))) res++;
            }
        }
        return res;
    }

    private boolean judge(String s){
        for (int i = 0; i < s.length() && i < s.length() - 1 - i; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) return false;
        }
        return true;
    }
}
