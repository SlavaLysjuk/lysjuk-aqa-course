import java.util.*;

public class Main {
    public static void main(String[] args) {

        HomeWork13_1 homeWork13_1 = new HomeWork13_1();
        System.out.println(homeWork13_1.getLengthOfStrings(new String[]{"a", "bb", "a", "bb"}));
        System.out.println(homeWork13_1.getLengthOfStrings(new String[]{"this", "and", "that", "and"}));
        System.out.println(homeWork13_1.getLengthOfStrings(new String[]{"code", "code", "code", "bug"}));
        System.out.println();

        HomeWork13_2 homeWork13_2 = new HomeWork13_2();
        System.out.println(homeWork13_2.createMapChars(new String[]{"code", "bug"}));
        System.out.println(homeWork13_2.createMapChars(new String[]{"man", "moon", "main"}));
        System.out.println(homeWork13_2.createMapChars(new String[]{"man", "moon", "good", "night"}));
        System.out.println();

        HomeWork13_3 homeWork13_3 = new HomeWork13_3();
        System.out.println(homeWork13_3.countWords(new String[]{"a", "b", "a", "c", "b"}));
        System.out.println(homeWork13_3.countWords(new String[]{"c", "b", "a"}));
        System.out.println(homeWork13_3.countWords(new String[]{"c", "c", "c", "c"}));
        System.out.println();

        HomeWork13_4 homeWork13_4 = new HomeWork13_4();
        System.out.println(homeWork13_4.mergeStringsByFirstChar(new String[]{"salt", "tea", "soda", "toast"}));
        System.out.println(homeWork13_4.mergeStringsByFirstChar(new String[]{"aa", "bb", "cc", "aAA", "cCC", "d"}));
        System.out.println(homeWork13_4.mergeStringsByFirstChar(new String[]{}));
        System.out.println();

        HomeWork13_5 homeWork13_5 = new HomeWork13_5();
        System.out.println(homeWork13_5.buildResultString(new String[]{"a", "b", "a"}));
        System.out.println(homeWork13_5.buildResultString(new String[]{"a", "b", "a", "c", "a", "d", "a"}));
        System.out.println(homeWork13_5.buildResultString(new String[]{"a", "", "a"}));
        System.out.println(homeWork13_5.buildResultString(new String[]{"a", "b", "c"}));
        System.out.println();
    }


}