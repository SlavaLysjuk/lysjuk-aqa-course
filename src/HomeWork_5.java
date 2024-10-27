import java.math.BigInteger;

public class HomeWork_5 {

    public void checkAge(int age) {
        if (age < 18) {
            System.out.println("Ви не є дорослою особою");
        } else {
            System.out.println("Ви доросла особа");
        }
    }

    public boolean isPerfectSquare(int num) {
        if (num < 0) {
            return false;
        }
        return (int) Math.sqrt(num) * Math.sqrt(num) == num;
    }

    public void sumUpToN(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += i;
        }
        System.out.println("Sum " + result);
    }

    public void getGrade(int grade) {
        switch (grade) {
            case 5:
                System.out.println("Оцінка Відмінно");
                break;
            case 4:
                System.out.println("Оцінка Добре");
                break;
            case 3:
                System.out.println("Оцінка Задовільно");
                break;
            case 2:
                System.out.println("Оцінка Не задовільно");
                break;
            case 1:
                System.out.println("Оцінка Погано");
                break;
            case -1, -2, -3, -4, -5:
                System.out.println("Неправильна оцінка");
                break;
        }
    }

    //TODO Не знав який з двох методів взяти, тому взяв обидва)
    public void isPrime(int n) {
        BigInteger bigInteger = BigInteger.valueOf(n);
        boolean probablePrime = bigInteger.isProbablePrime((int) Math.log(n));
        System.out.println("isPrime " + probablePrime);
    }

    public static boolean isPrimeSecond(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i * i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
