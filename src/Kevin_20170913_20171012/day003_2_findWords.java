package Kevin_20170913_20171012;

import java.util.ArrayList;

public class day003_2_findWords {
    //这道题可以考虑用流和正则表达式来解
    public String[] findWords(String[] words) {
        ArrayList<String> res = new ArrayList<>();
        //filter
        for (String word : words) {
            //check
            boolean flag = true;
            char[] letters = word.toCharArray();
            int firstLetterLocation = getLetterLocation(letters[0]);
            for (int i = 1; i < letters.length; i++) {
                if (getLetterLocation(letters[i]) != firstLetterLocation) {
                    flag = false;
                    break;
                }
            }

            //add
            if (flag) res.add(word);
        }
        return res.toArray(new String[res.size()]);
    }

    private int getLetterLocation(char letter) {
        int[] lettersLocations = {2, 1, 1, 2, 3, 2, 2, 2, 3, 2, 2, 2, 1, 1, 3, 3, 3, 3, 2, 3, 3, 1, 3, 1, 3, 1};
        return 'a' <= letter && letter <= 'z' ? lettersLocations[letter - 'a'] : lettersLocations[letter - 'A'];
    }
}
