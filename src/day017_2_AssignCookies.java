import java.util.Arrays;

public class day017_2_AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int i = 0;
        int j = 0;
        //这一步有点多余了，而且j < s.length跟s[j] < g[0]不能倒过来，倒过来如果s为空数组则会出现越界错误
        while(j < s.length && s[j] < g[0]){
            j++;
        }

        int res = 0;
        while (i < g.length && j < s.length){
            if (g[i] <= s[j]){
                i++;
                j++;
                res++;
            }else {
                j++;
            }
        }
        return res;
    }
}
