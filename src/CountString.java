import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class CountString {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Integer> map = new HashMap<>();
        String str;
        String key = "";
        int value = 0;

        while  (true){
            str = reader.readLine();
            if(str.isEmpty()) {
                break;
            }
            if(!map.containsKey(str)) {
                map.put(str, 1);
            }
            else {
                map.put(str, (map.get(str) + 1));
            }
        }

        for (Map.Entry<String, Integer> item: map.entrySet()) {
            if(item.getValue() > value) {
                key = item.getKey();
                value = item.getValue();
            }
        }

        System.out.println(key + " " + value);
    }
}
