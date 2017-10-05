public class day012_2_constructRectangle {
    public int[] constructRectangle(int area) {
        int[] res = new int[2];
        int addOn = area % 2 == 0 ? 1 : 2;
        for (int i = 1; i <= Math.sqrt(area); i += addOn) { //遍历改为从大数向小数遍历，提高效率
            if (area % i == 0){
                res[1] = i;
            }
        }
        res[0] = area / res[1];
        return res;
    }
}
