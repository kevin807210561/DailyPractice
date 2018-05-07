package tools;

import java.util.*;

public class UniqueIntegerArrayGenerator {
    public static int[] generate(int size, int target){
        List<Integer> elec = new ArrayList<>(target);
        for (int i = 1; i < target / 2.0; i++) {
            elec.add(i);
            elec.add(target - i);
        }

        Set<Integer> set = new HashSet<>((int)(size / 0.75));
        while (set.size() != size){
            set.add((int)(Math.random() * size * 100));
            set.removeAll(elec);
        }
        int[] res = new int[size];
        Iterator<Integer> iterator = set.iterator();
        for (int i = 0; i < size; i++) {
            res[i] = iterator.next();
        }
        res[size / 2] = 0;
        res[size /2 + 1] = target;
        return res;
    }
}
