import java.util.*;

public class HomeWork13_5 {

    public String buildResultString(String[] strings) {

        Set<String> seen = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for (String str : strings) {
            if (seen.contains(str)) {
                if (result.indexOf(str) == -1) {
                    result.append(str);
                }
            } else {
                seen.add(str);
            }
        }

        return result.toString();
    }
}
