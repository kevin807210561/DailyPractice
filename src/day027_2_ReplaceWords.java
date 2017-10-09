import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class day027_2_ReplaceWords {
    //看看Trie的解法
    public String replaceWords(List<String> dict, String sentence) {
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < dict.size(); j++) {
                if (words[i].startsWith(dict.get(j))){
                    if (words[i].length() > dict.get(j).length())words[i] = dict.get(j);
                }
            }
        }
        return String.join(" ", words);
    }
}
