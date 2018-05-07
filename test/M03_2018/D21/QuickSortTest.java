package M03_2018.D21;

import org.junit.Test;

import static org.junit.Assert.*;
import static tools.Checker.isSorted;

public class QuickSortTest {
    @Test
    public void sort() throws Exception {
        int[] case1 = {};
        int[] case2 = {1};
        int[] case3 = {2, 1};
        int[] case4 = {4, 3, 2, 1};
        int[] case5 = new int[100];
        for (int i = 0; i < case5.length; i++) {
            case5[i] = (int)(Math.random() * 10000);
        }
        int[] case6 = new int[1000000];
        for (int i = 0; i < case6.length; i++) {
            case6[i] = (int)(Math.random() * 1000000);
        }

        QuickSort.sort(case1);
        QuickSort.sort(case2);
        QuickSort.sort(case3);
        QuickSort.sort(case4);
        QuickSort.sort(case5);
        QuickSort.sort(case6);

        assertEquals(true, isSorted(case1));
        assertEquals(true, isSorted(case2));
        assertEquals(true, isSorted(case3));
        assertEquals(true, isSorted(case4));
        assertEquals(true, isSorted(case5));
        assertEquals(true, isSorted(case6));
    }

}