import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<Integer> firstCollection = Stream.of(3, 14, 15, 92, 6).collect(Collectors.toList());
        System.out.println(firstCollection);
        System.out.println();

        List<String> myBio = Stream.of("Viacheslav", "Lysjuk", "Serhiovich").collect(Collectors.toList());
        System.out.println(myBio);
        System.out.println();

        Set<Integer> setCollection = new HashSet<>();
        setCollection.add(1);
        setCollection.add(2);
        setCollection.add(1);
        setCollection.add(2);
        setCollection.add(3);
        setCollection.add(1);
        setCollection.add(11);
        setCollection.add(22);
        System.out.println(setCollection);
        System.out.println();

        HashMap<String, String> cityCodeUkraine = new HashMap<String, String>();
        cityCodeUkraine.put("Вінниця", "0432");
        cityCodeUkraine.put("Дніпро", "056");
        cityCodeUkraine.put("Донецьк", "062");
        cityCodeUkraine.put("Житомир", "0412");
        cityCodeUkraine.put("Запоріжжя", "061");
        cityCodeUkraine.put("Івано-Франківськ", "0342");
        cityCodeUkraine.put("Київ", "044");
        cityCodeUkraine.put("Кропивницький", "0522");
        cityCodeUkraine.put("Луганськ", "064");
        cityCodeUkraine.put("Луцьк", "0332");
        cityCodeUkraine.put("Львів", "032");
        cityCodeUkraine.put("Миколаїв", "0512");
        cityCodeUkraine.put("Одеса", "048");
        cityCodeUkraine.put("Полтава", "0532");
        cityCodeUkraine.put("Рівне", "0362");
        cityCodeUkraine.put("Суми", "0542");
        cityCodeUkraine.put("Тернопіль", "0352");
        cityCodeUkraine.put("Ужгород", "0312");
        cityCodeUkraine.put("Харків", "057");
        cityCodeUkraine.put("Херсон", "0552");
        cityCodeUkraine.put("Хмельницький", "0382");
        cityCodeUkraine.put("Черкаси", "0472");
        cityCodeUkraine.put("Чернівці", "0372");
        cityCodeUkraine.put("Чернігів", "0462");
        System.out.println(cityCodeUkraine);


    }
}
