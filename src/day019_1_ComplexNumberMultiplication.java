public class day019_1_ComplexNumberMultiplication {
    public String complexNumberMultiply(String a, String b) {
        int[] num1 = stringToComplex(a);
        int[] num2 = stringToComplex(b);
        int[] num3 = {num1[0] * num2[0] - num1[1] * num2[1], num1[1] * num2[0] + num1[0] * num2[1]};
        return complexToString(num3);
    }

    private int[] stringToComplex(String s){
        int[] res = new int[2];
        int index = s.indexOf('+');
        res[0] = Integer.valueOf(s.substring(0, index));
        res[1] = Integer.valueOf(s.substring(index + 1, s.length() - 1));
        return res;
    }

    private String complexToString(int[] c){
        StringBuilder res = new StringBuilder();
        res.append(String.valueOf(c[0]));
        res.append('+');
        res.append(String.valueOf(c[1]));
        res.append('i');
        return res.toString();
    }
}
