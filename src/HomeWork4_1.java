public class HomeWork4_1 {

    void square(int arg) {
        System.out.println("Введіть ціле число: " + arg);
        System.out.printf("Квадрат числа %s дорівнює %s.\n", arg, arg * arg);
    }

    void cylinderVolume(double radius, double height) {
        System.out.println();
        System.out.printf("Обєм циліндра з радіуслм %s і висотою %s дорівнює %s \n", radius, height, Math.PI * radius * radius * height);
    }

    void power(int a, int b) {
        System.out.println();
        System.out.printf("Введіть a: %s\n", a);
        System.out.printf("Введіть b: %s\n", b);
        System.out.printf("Результат %s^%s дорівнює %s.", a, b, Math.pow(a, b));
    }

    public static void main(String[] args) {

        HomeWork4_1 object = new HomeWork4_1();
        object.square(5);
        object.cylinderVolume(3.5, 10);
        object.power(2, 3);
    }

}