package Kevin_20170913_20171012;

public class day015_1_moveZeroes {
    //学习Java Solution Using Insert Index
    public void moveZeroes(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                //0的个数加1
                count++;

                //将后面的数字往前移直到遇到0或者是到了数组末尾
                int index = i + 1;
                while (index < nums.length && nums[index] != 0){
                    nums[index - count] = nums[index];
                    index++;
                }
            }
        }

        //在数组末尾添加0
        for (int i = 0; i < count; i++) {
            nums[nums.length - 1 - i] = 0;
        }
    }

    public static void main(String[] args){
        day015_1_moveZeroes day015_1_moveZeroes = new day015_1_moveZeroes();
        int[] data = {0,1,0,3,12,0,16};
        day015_1_moveZeroes.moveZeroes(data);
        for (int num : data) {
            System.out.print(num + "" + ',');
        }
    }
}
