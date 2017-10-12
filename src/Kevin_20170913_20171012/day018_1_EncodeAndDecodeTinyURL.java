package Kevin_20170913_20171012;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class day018_1_EncodeAndDecodeTinyURL {
    //尝试使用自增1的方法
    private static char[] characters = {
            '0','1','2','3','4','5','6','7','8','9',
            'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',
            'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'
    };

    private static int identifierLength = 6;

    private Map<String, String> map = new HashMap();

    // Encodes a URL to a shortened URL.
    //这里处理不好的地方是If I'm asked to encode the same long URL several times, it will get several entries. That wastes codes and memory.
    public String encode(String longUrl) {
        String tinyURL = "";
        Random random = new Random();
        do {
            tinyURL = "";
            for (int i = 0; i < identifierLength; i++) {
                tinyURL += characters[random.nextInt(characters.length)];
            }
        }while (map.containsKey(tinyURL));
        map.put(tinyURL, longUrl);
        return tinyURL;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return map.get(shortUrl);
    }
}
