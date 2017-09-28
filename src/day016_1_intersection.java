import java.util.*;

public class day016_1_intersection {
    //try sort both arrays, use two pointers
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for (int num1 : nums1) {
            for (int num2 : nums2) { //先对nums2进行排序，利用二分法查找
                if (num1 == num2){
                    set.add(num1);
                    break;
                }
            }
        }

        int[] res = new int[set.size()];
        Iterator<Integer> integers = set.iterator();
        for (int i = 0; i < res.length; i++) {
            res[i] = integers.next();
        }
        return res;
    }
}
