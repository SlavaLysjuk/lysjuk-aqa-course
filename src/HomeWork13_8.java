import java.util.*;

public class HomeWork13_8 {

    public static TreeSet<Integer> mergeTreeSets(TreeSet<Integer> setC, TreeSet<Integer> setD) {
        TreeSet<Integer> resultSet = new TreeSet<>();
        resultSet.addAll(setC);
        resultSet.addAll(setD);
        return resultSet;
    }
}
