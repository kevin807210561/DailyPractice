package Kevin_20170913_20171012;

public class day011_2_getSum {
    public int getSum(int a, int b) {
        int mask = 1;
        int processor = -2;
        boolean carrier = false;
        for (int i = 0; i < 32; i++) {
            int bit1 = a & mask;
            int bit2 = b & mask;
            if (bit1 != 0 && bit2 != 0){
                if (!carrier){
                    a = a & processor;
                }
                carrier = true;
            }else if (bit1 == 0 && bit2 == 0){
                if (carrier){
                    a = a | mask;
                }
                carrier = false;
            }else if (bit1 != 0 && bit2 == 0){
                if (carrier){
                    a = a & processor;
                }
            }else {
                if (!carrier){
                    a = a | mask;
                }
            }

            mask = mask << 1;
            processor = (processor << 1) + 1;
        }

        return a;
    }
}
