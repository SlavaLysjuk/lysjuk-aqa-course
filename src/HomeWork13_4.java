import java.util.*;

public class HomeWork13_4 {

    public Map<String, String> mergeStringsByFirstChar(String[] strings) {
        Map<String, String> result = new HashMap<>();

        for (String str : strings) {
            if (!str.isEmpty()) {
                String firstChar = String.valueOf(str.charAt(0));
                result.put(firstChar, result.getOrDefault(firstChar, "") + str);
            }
        }

        return result;
    }
}
