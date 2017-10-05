public class day001_2_judgeCircle {
    public boolean judgeCircle(String moves) {
        char[] chars = moves.toCharArray();

        int horizontal = 0;
        int vertical = 0;
        for (char move : chars) {
            switch (move){
                case 'L':
                    horizontal -= 1;
                    break;
                case 'W':
                    horizontal += 1;
                    break;
                case 'U':
                    vertical += 1;
                    break;
                case 'D':
                    vertical -= 1;
            }
        }

        return horizontal == 0 && vertical == 0 ? true : false; //这里的表达有点重复
    }
}
