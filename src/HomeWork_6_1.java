import java.util.ArrayList;

public class HomeWork_6_1 {

    public void calculateAverageValueElementsArray() {
        int[] averageNumbs = {1, 5, -4, 55, -4, 100, -33, 44, 6, 11, 54};

        if (averageNumbs.length > 0) {
            double sum = 0;
            for (int i = 0; i < averageNumbs.length; i++) {
                sum += averageNumbs[i];
            }
            System.out.println("Середне значення елементів в масиві: " + sum / averageNumbs.length);
        }
    }

    public void findMinAndMaxValueInArray() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(18);
        numbers.add(8);
        numbers.add(11);
        numbers.add(33);
        numbers.add(54);
        numbers.add(445);

        int min = numbers.get(0);
        int max = numbers.get(0);

        for (Integer i : numbers) {
            if (i < min)
                min = i;
            if (i > max)
                max = i;
        }
        System.out.println("Мінімальне число масиву: " + min);
        System.out.println("Максимальне число масиву: " + max);
    }

    public void reverseArrays() {
        int[] arrayNumbs = {1, 2, 3, 4, 5};
        int length = 0;

        System.out.println("Елементи в масиві до реверса:");
        for (int element : arrayNumbs) {
            length++;
            System.out.print(element + " ");
        }

        System.out.println("\nЕлементи в масиві після реверса:");
        for (int i = length - 1; i >= 0; i--) {
            System.out.print(arrayNumbs[i] + " ");
        }
    }

    public int existsElementInArray(int findNumber) {
        int[] array = new int[]{1, 4, 5, 44, 66, 77, 43, 21, 8, 10, 100, 99, 6};
        System.out.printf("Пошук в масиві числа %s: ", findNumber);
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            System.out.println("Пошук в індексі: " + i + ", значення: " + array[i]);
            if (array[i] == findNumber) {
                System.out.println("Знайденно в індексі: " + i + ", значення: " + array[i]);
                return i;
            }
        }
        System.out.println("Не знайденно: " + findNumber);
        return -1;
    }
}