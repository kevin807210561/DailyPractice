public class day003_1_findComplement {
    public int findComplement(int num) {
        int complementWithOne = num ^ -1;

        //中间这一块是为了处理掉前面的1，有更好的做法如下：
        // int mask = (Integer.highestOneBit(num) << 1) - 1;
        // complementWithOne = complementWithOne & mask;
        int mask = Integer.MIN_VALUE;
        int remover = Integer.MAX_VALUE;
        while ((complementWithOne & mask) != 0){
            complementWithOne = complementWithOne & remover;
            mask = mask >>> 1;
            remover = remover >> 1;
        }

        return complementWithOne;
    }
}
