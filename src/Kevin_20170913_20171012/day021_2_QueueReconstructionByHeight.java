package Kevin_20170913_20171012;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class day021_2_QueueReconstructionByHeight {
    //比较器可以尝试lambda表达式，更简洁
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, new MyCompartor());
        List<int[]> res = new LinkedList<>();
        for (int[] p : people) {
            res.add(p[1], p);
        }
        return res.toArray(new int[res.size()][]);
    }
}

class MyCompartor implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        int[] people1 = (int[])o1;
        int[] people2 = (int[])o2;
        int firstCompare = (Integer.valueOf(people2[0])).compareTo(Integer.valueOf(people1[0]));
        return firstCompare == 0 ?
                (Integer.valueOf(people1[1])).compareTo(Integer.valueOf(people2[1])) :
                firstCompare;
    }
}