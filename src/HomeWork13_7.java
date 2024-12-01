import java.util.*;

public class HomeWork13_7 {

    public boolean hasCommonElements(LinkedHashSet<Integer> setA, LinkedHashSet<Integer> setB) {

        for (Integer element : setA) {
            if (setB.contains(element)) {
                return true;
            }
        }
        return false;
    }
}
