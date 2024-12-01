import java.util.*;

public class HomeWork13_3 {

    public Map<String, Integer> countWords(String[] strings) {

        Map<String, Integer> wordCount = new HashMap<>();

        for (String str : strings) {
            wordCount.put(str, wordCount.getOrDefault(str, 0) + 1);
        }
        return wordCount;
    }

}
