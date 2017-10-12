package Kevin_20170913_20171012;

import java.util.Arrays;

public class day016_2_canConstruct {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] counts = new int[26];
        Arrays.fill(counts, 0);

        for (char letter : magazine.toCharArray()) {
            counts[letter - 'a']++;
        }

        for (char letter : ransomNote.toCharArray()) {
            if (--counts[letter - 'a'] < 0) return false;
        }

        return true;
    }
}
