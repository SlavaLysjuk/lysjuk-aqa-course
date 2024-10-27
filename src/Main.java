public class Main {
    public static void main(String[] args) {
        HomeWork_5 homeWork5 = new HomeWork_5();
        homeWork5.checkAge(18);
        homeWork5.checkAge(0);
        homeWork5.checkAge(99);
        System.out.println();
        System.out.println("isPerfectSquare " + homeWork5.isPerfectSquare(25));
        System.out.println("isPerfectSquare " + homeWork5.isPerfectSquare(20));
        System.out.println("isPerfectSquare " + homeWork5.isPerfectSquare(9));
        System.out.println();
        homeWork5.sumUpToN(99);
        System.out.println();
        homeWork5.getGrade(5);
        System.out.println();
        homeWork5.isPrime(7);
        System.out.println("isPrimeSecond " + homeWork5.isPrimeSecond(8));
        System.out.println();
    }
}
