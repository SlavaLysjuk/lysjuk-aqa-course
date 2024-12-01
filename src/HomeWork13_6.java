import java.util.*;

public class HomeWork13_6 {

    public int findMostFrequentElement(List<Integer> list) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (Integer num : list) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        int maxFrequency = 0;
        int mostFrequentElement = list.get(0);

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
                mostFrequentElement = entry.getKey();
            }
        }

        return mostFrequentElement;
    }

}
