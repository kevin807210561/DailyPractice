package M04_2018.D18;

import org.junit.Test;
import tools.UniqueIntegerArrayGenerator;

public class TwoSumTest {
    private int[] data = UniqueIntegerArrayGenerator.generate(200_000, 100);

    @Test
    public void solveSlow() {
        long start = System.currentTimeMillis();
        int[] result = TwoSum.solveSlow(data, 100);
        long end = System.currentTimeMillis();
        System.out.println("SolveSlow result: {" + result[0] + ":" + data[result[0]] + ", " + result[1] + ":" + data[result[1]] + "}.");
        System.out.println("SolveSlow time: " + (end - start) + "ms.");
    }

    @Test
    public void solveFast() {
        long start = System.currentTimeMillis();
        int[] result = TwoSum.solveFast(data, 100);
        long end = System.currentTimeMillis();
        System.out.println("SolveFast result: {" + result[0] + ":" + data[result[0]] + ", " + result[1] + ":" + data[result[1]] + "}.");
        System.out.println("SolveFast time: " + (end - start) + "ms.");
    }
}