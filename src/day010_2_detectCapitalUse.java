public class day010_2_detectCapitalUse {
    //尝试正则表达式解决
    public boolean detectCapitalUse(String word) {
        return isCapital(word.charAt(0)) ? allSame(word.substring(1)) : allSame(word);
    }

    private boolean allSame(String word) {
        if (word.equals(""))
            return true;

        boolean flag = true;
        boolean capital = isCapital(word.charAt(0));
        for (char letter : word.toCharArray()) {
            if (capital ? !isCapital(letter) : isCapital(letter)) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    private boolean isCapital(char letter) {
        return 'A' <= letter && letter <= 'Z';
    }
}
