public class day024_1_FirstUniqueCharacterInAString {
    //可以有时间复杂度为O(n)的方法
    public int firstUniqChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))) return i;
        }
        return -1;
    }
}
