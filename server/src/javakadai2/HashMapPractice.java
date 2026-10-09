//コレクション（HashMap）の操作
import java.util.HashMap;
import java.util.Map;
public class HashMapPractice {
  public static void main(String[] args) {
    HashMap<String, String> map = new HashMap<>();
    map.put("Java", "プログラミング言語");
    map.put("Spring",  "フレームワーク");
    map.put("JUnit", "テストツール");
    for(Map.Entry<String, String> entry : map.entrySet()) {
      System.out.println(entry.getKey() + ":" + entry.getValue());
    }
  }
}