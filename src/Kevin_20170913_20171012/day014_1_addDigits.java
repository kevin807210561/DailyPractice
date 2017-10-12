package Kevin_20170913_20171012;

public class day014_1_addDigits {
    //又是一道数学问题。。。。。。
    public int addDigits(int num) {
        int[][] reference = {
                {1,2,3,4,5,6,7,8,9,1},
                {2,3,4,5,6,7,8,9,1,2},
                {3,4,5,6,7,8,9,1,2,3},
                {4,5,6,7,8,9,1,2,3,4},
                {5,6,7,8,9,1,2,3,4,5},
                {6,7,8,9,1,2,3,4,5,6},
                {7,8,9,1,2,3,4,5,6,7},
                {8,9,1,2,3,4,5,6,7,8},
                {9,1,2,3,4,5,6,7,8,9},
        };

        int sum = 0;
        for (char ch : String.valueOf(num).toCharArray()) {
            sum += ch - '0';
        }
        return sum < 10 ? sum : reference[sum / 10 - 1][sum % 10];
    }
}
