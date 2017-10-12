package Kevin_20170913_20171012;

import java.util.HashMap;
import java.util.Map;

public class day023_2_MapSumPairs {
    private Map<String, Integer> map;

    /** Initialize your data structure here. */
    public day023_2_MapSumPairs() {
        map = new HashMap<>();
    }

    public void insert(String key, int val) {
        map.put(key, val);
    }

    public int sum(String prefix) {
        int res = 0;
        for (String key: map.keySet()) {
            if (key.startsWith(prefix)) res += map.get(key);
        }
        return res;
    }
}
