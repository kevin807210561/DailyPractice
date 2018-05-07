package M03_2018.D22;

import org.junit.Test;
import static org.junit.Assert.*;
import static tools.Checker.isSorted;

public class ShellSortTest {
    @Test
    public void testSort(){
        int[] case1 = {};
        int[] case2 = {1};
        int[] case3 = {2, 1};
        int[] case4 = {4, 3, 2, 1};
        int[] case5 = new int[100];
        for (int i = 0; i < case5.length; i++) {
            case5[i] = (int)(Math.random() * 10000);
        }
        int[] case6 = new int[10000000];
        for (int i = 0; i < case6.length; i++) {
            case6[i] = (int)(Math.random() * 1000000);
        }

        ShellSort.sort(case1);
        ShellSort.sort(case2);
        ShellSort.sort(case3);
        ShellSort.sort(case4);
        ShellSort.sort(case5);
        ShellSort.sort(case6);

        assertEquals(true, isSorted(case1));
        assertEquals(true, isSorted(case2));
        assertEquals(true, isSorted(case3));
        assertEquals(true, isSorted(case4));
        assertEquals(true, isSorted(case5));
        assertEquals(true, isSorted(case6));
    }
}