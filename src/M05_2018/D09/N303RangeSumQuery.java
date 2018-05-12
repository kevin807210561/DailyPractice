package M05_2018.D09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class N303RangeSumQuery {
    private int[] nums;
    private List<Integer> linePoints;
    private List<Integer> values;

    public N303RangeSumQuery(int[] nums) {
        this.nums = nums;
        this.linePoints = new ArrayList<>();
        this.values = new ArrayList<>();
    }

    public int sumRange(int i, int j) {
        int start = insertPoint(i);
        int end = insertPoint(j);
        int res = nums[j];
        for (int k = start; k < end; k++) {
            res += values.get(k);
        }
        return res;
    }

    private int sumRangeSlowExclusiveJ(int i, int j){
        int res = 0;
        for (int k = i; k < j; k++) {
            res += nums[k];
        }
        return res;
    }

    private int insertPoint(int x){
        int insertIndex = findInsertIndex(x);
        if (insertIndex >= linePoints.size() || linePoints.get(insertIndex) != x){
            //add point
            linePoints.add(insertIndex, x);

            //calculate value
            int size = linePoints.size();
            if (size != 1){
                int startIndex = insertIndex - 1;
                int endIndex = insertIndex + 1;
                int start;
                int end;
                int value = 0;
                if (startIndex < 0) {
                    startIndex = insertIndex;
                    start = linePoints.get(startIndex);
                    end = linePoints.get(endIndex);
                    value = sumRangeSlowExclusiveJ(start, end);
                    values.add(0, value);
                } else if (endIndex >= size){
                    endIndex = insertIndex;
                    start = linePoints.get(startIndex);
                    end = linePoints.get(endIndex);
                    value = sumRangeSlowExclusiveJ(start, end);
                    values.add(value);
                }else {
                    int interval1 = linePoints.get(insertIndex) - linePoints.get(startIndex);
                    int interval2 = linePoints.get(endIndex) - linePoints.get(insertIndex);
                    if (interval1 < interval2){
                        endIndex = insertIndex;
                        start = linePoints.get(startIndex);
                        end = linePoints.get(endIndex);
                        value = sumRangeSlowExclusiveJ(start, end);
                        values.set(startIndex, values.get(startIndex) - value);
                        values.add(startIndex, value);
                    }else {
                        startIndex = insertIndex;
                        start = linePoints.get(startIndex);
                        end = linePoints.get(endIndex);
                        value = sumRangeSlowExclusiveJ(start, end);
                        values.set(startIndex - 1, values.get(startIndex - 1) - value);
                        values.add(startIndex, value);
                    }
                }
            }
        }
        return insertIndex;
    }

    //practice binary search
    private int findInsertIndex(int x){
        int start = 0;
        int end = linePoints.size() - 1;
        int middle;
        int cur;
        while (start <= end){
            middle = (start + end) / 2;
            if ((cur = linePoints.get(middle)) == x){
                return middle;
            }else if (cur < x){
                start = middle + 1;
            }else {
                end = middle - 1;
            }
        }
        return start;
    }

    public static void main(String[] args){
        int[] nums = {-2,0,3,-5,2,-1};

        N303RangeSumQuery n303RangeSumQuery = new N303RangeSumQuery(nums);
        System.out.println(n303RangeSumQuery.sumRange(0, 2));
        System.out.println(n303RangeSumQuery.sumRange(2, 5));
        System.out.println(n303RangeSumQuery.sumRange(0, 5));
    }
}
