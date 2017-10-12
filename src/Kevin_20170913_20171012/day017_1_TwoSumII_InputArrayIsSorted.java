package Kevin_20170913_20171012;

public class day017_1_TwoSumII_InputArrayIsSorted {
    public int[] twoSum(int[] numbers, int target) {
        int index1 = 0;
        int index2 = numbers.length - 1;
        while(numbers[index1] + numbers[index2] != target){
            if (numbers[index1] + numbers[index2] < target) index1++;
            else index2--;
        }

        int[] res = {index1 + 1, index2 + 1};
        return res;
    }
}
