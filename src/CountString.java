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
        String keyOne = "";
        String keyTwo = "";
        int valueOne = 0;
        int valueTwo = 0;

        while  (true){
            str = reader.readLine();
            if(str.isEmpty()) {
                break;
            }
            if(map.containsKey(str)){
                map.put(str, map.get(str) + 1);
                continue;
            }
            map.put(str, 1);
        }

        for (Map.Entry<String, Integer> item: map.entrySet()){

            if(item.getValue() <= valueOne && item.getValue() > valueTwo) {
                keyTwo = item.getKey();
                valueTwo = item.getValue();
            }
            else if(item.getValue() > valueOne) {
                keyOne = item.getKey();
                valueOne = item.getValue();
            }
        }

        for (Map.Entry<String, Integer> item: map.entrySet()){
            System.out.println(item.getKey() + " " + item.getValue());
        }

        System.out.println();
        System.out.println(keyOne + " " + valueOne);
        System.out.println(keyTwo + " " + valueTwo);
    }
}
