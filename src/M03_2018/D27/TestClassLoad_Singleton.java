package M03_2018.D27;

import java.util.HashMap;
import java.util.Map;

public class TestClassLoad_Singleton {
    private static final TestClassLoad_Singleton INSTANCE = new TestClassLoad_Singleton();
    private static Map map = new HashMap();

    public static void main(String[] args) {
        System.out.println(TestClassLoad_Singleton.getInstance());
    }

    private TestClassLoad_Singleton() {
        map.put("1", "北京");
        map.put("2", "上海");
    }

    public static TestClassLoad_Singleton getInstance() {
        return INSTANCE;
    }
}