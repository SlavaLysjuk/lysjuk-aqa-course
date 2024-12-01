import java.util.*;

public class HomeWork13_1 {

    public Map<String, Integer> getLengthOfStrings(String[] strings) {

        Map<String, Integer> result = new HashMap<>();

        for (String str : strings) {
            result.putIfAbsent(str, str.length());
        }

        return result;
    }

}
