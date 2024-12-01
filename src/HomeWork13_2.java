import java.util.*;

public class HomeWork13_2 {

    public Map<String, String> createMapChars(String[] strings) {

        Map<String, String> result = new HashMap<>();

        for (String str : strings) {
            if (!str.isEmpty()) {
                String firstChar = String.valueOf(str.charAt(0));
                String lastChar = String.valueOf(str.charAt(str.length() - 1));
                result.put(firstChar, lastChar);
            }
        }

        return result;
    }

}
