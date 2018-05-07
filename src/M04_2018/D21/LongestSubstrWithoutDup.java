package M04_2018.D21;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstrWithoutDup {
    public int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        int res = 0;
        int curLength = 0;
        Integer pos;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            if (null == (pos = map.put(chars[i], i)) || pos < i - curLength){
                curLength++;
            }else {
                if (curLength > res){
                    res = curLength;
                }
                curLength = i - pos;
            }
        }
        if (curLength > res){
            res = curLength;
        }
        return res;
    }
}
