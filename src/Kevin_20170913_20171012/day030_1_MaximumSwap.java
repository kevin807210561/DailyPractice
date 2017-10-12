package Kevin_20170913_20171012;

import java.util.ArrayList;
import java.util.List;

public class day030_1_MaximumSwap {
    public int maximumSwap(int num) {
        char[] digits = String.valueOf(num).toCharArray();
        List<Integer>[] place = new List[10];
//        Arrays.fill(place, new ArrayList<>()); //这里不能这样，这样place里都是同一个对象
        for (int i = 0; i < place.length; i++) {
            place[i] = new ArrayList<>();
        }
        for (int i = 0; i < digits.length; i++) {
            place[digits[i] - '0'].add(i);
        }

        int expectedPlace = 0;
        for (int i = 9; i >= 0; i--) {
            for (int j = place[i].size() - 1; j >= 0; j--) {
                if (digits[expectedPlace] != i + '0'){
                    digits[place[i].get(place[i].size() - 1)] = digits[expectedPlace];
                    digits[expectedPlace] = (char)(i + '0');
                    return Integer.valueOf(new String(digits));
                }
                expectedPlace++;
            }
        }
        return num;
    }
}
