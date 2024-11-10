public class Main {

    public static void main(String[] args) {

        HomeWork8_1 homeWork8_1 = new HomeWork8_1();
        System.out.println(homeWork8_1.catDog("catdog"));
        System.out.println(homeWork8_1.catDog("catcat"));
        System.out.println(homeWork8_1.catDog("1cat1cadodog"));
        System.out.println();

        HomeWork8_1_1 homeWork8_1_1 = new HomeWork8_1_1();
        System.out.println(homeWork8_1_1.countEvenInts((new int[]{2, 1, 2, 3, 4})));
        System.out.println(homeWork8_1_1.countEvenInts((new int[]{2, 2, 0})));
        System.out.println(homeWork8_1_1.countEvenInts((new int[]{1, 3, 5})));
        System.out.println();

        HomeWork8_2 homeWork8_2 = new HomeWork8_2();
        System.out.println(HomeWork8_2.centeredAverage(new int[]{1, 2, 3, 4, 100}));
        System.out.println(HomeWork8_2.centeredAverage(new int[]{1, 1, 5, 5, 10, 8, 7}));
        System.out.println(HomeWork8_2.centeredAverage(new int[]{-10, -4, -2, -4, -2, 0}));
        System.out.println();

        HomeWork8_3 homeWork8_3 = new HomeWork8_3();
        System.out.println(HomeWork8_3.sumIgnoreSections(new int[]{1, 2, 2}));
        System.out.println(HomeWork8_3.sumIgnoreSections(new int[]{1, 2, 2, 6, 99, 99, 7}));
        System.out.println(HomeWork8_3.sumIgnoreSections(new int[]{1, 1, 6, 7, 2}));
        System.out.println();

        HomeWork8_4 homeWork8_4 = new HomeWork8_4();
        System.out.println(HomeWork8_4.sumWithoutUnlucky13(new int[]{1, 2, 2, 1}));
        System.out.println(HomeWork8_4.sumWithoutUnlucky13(new int[]{1, 1}));
        System.out.println(HomeWork8_4.sumWithoutUnlucky13(new int[]{1, 2, 2, 1, 13}));
        System.out.println();

        HomeWork8_5 homeWork8_5 = new HomeWork8_5();
        System.out.println(HomeWork8_5.differenceLargestSmallest(new int[]{10, 3, 5, 6}));
        System.out.println(HomeWork8_5.differenceLargestSmallest(new int[]{7, 2, 10, 9}));
        System.out.println(HomeWork8_5.differenceLargestSmallest(new int[]{2, 10, 7, 2}));
        System.out.println();

        HomeWork8_6 homeWork8_6 = new HomeWork8_6();
        System.out.println(homeWork8_6.doubleChars("The"));
        System.out.println(homeWork8_6.doubleChars("AAbb"));
        System.out.println(homeWork8_6.doubleChars("Hi-There"));
        System.out.println();

        HomeWork8_7 homeWork8_7 = new HomeWork8_7();
        System.out.println(homeWork8_7.countHi("abc hi ho"));
        System.out.println(homeWork8_7.countHi("ABChi hi"));
        System.out.println(homeWork8_7.countHi("hihi"));
        System.out.println();

        HomeWork8_8 homeWork8_8 = new HomeWork8_8();
        System.out.println(homeWork8_8.countCode("aaacodebbb"));
        System.out.println(homeWork8_8.countCode("codexxcode"));
        System.out.println(homeWork8_8.countCode("cozexxcope"));
        System.out.println();

        HomeWork8_9 homeWork8_9 = new HomeWork8_9();
        System.out.println(homeWork8_9.endsWith("AbC", "HiaBc"));
        System.out.println(homeWork8_9.endsWith("abc", "abXabc"));
        System.out.println(homeWork8_9.endsWith("Hiabc", "abc"));

    }

}
