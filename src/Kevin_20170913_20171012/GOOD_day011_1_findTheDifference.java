package Kevin_20170913_20171012;

public class GOOD_day011_1_findTheDifference {
    public char findTheDifference(String s, String t) {
        char[] sToChars = s.toCharArray();
        int[] flags = new int[sToChars.length];

        for (int i = 0; i < flags.length; i++) {
            flags[i] = 0;
        }

        for (char c : t.toCharArray()) {
            boolean flag = false;
            for (int i = 0; i < sToChars.length; i++) {
                if (c == sToChars[i] && flags[i] == 0){
                    flags[i] = 1;
                    flag = true;
                    break;
                }
            }
            if (!flag) return c;
        }

        return 0;
    }
}
