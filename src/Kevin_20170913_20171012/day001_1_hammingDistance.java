package Kevin_20170913_20171012;

public class day001_1_hammingDistance {
    public int hammingDistance(int x, int y) {
        if(x < 0 || y < 0)
            return -1;

        int res = 0;
        int mask = 1; //掩码
        for (int i = 0; i < 31; i++) {
            res = ((x & mask) ^ (y & mask)) == 0 ? res : res + 1;
            mask = mask << 1;
        }
        return res;
    }
}
