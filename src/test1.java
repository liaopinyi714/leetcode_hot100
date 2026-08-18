import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class test1 {
    public List<List<String>> groupAnagrams(String[] strs) {
        ArrayList<List<String>> list = new ArrayList<>();
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
                map.get(key).add(str);
            }else{
                map.get(key).add(str);
            }
        }
        for (ArrayList al : map.values()) {
            list.add(al);

        }
        return list;

    }
}
