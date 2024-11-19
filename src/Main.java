public class Main {

    public static void main(String[] args) {

        Person john = new Person("John", 30, "Інжинер");
        Person mary = new Person("Mary", 25, "Вчитель");
        Person bob = new Person("Bob", 45, "Лікар");


        john.printPerson();
        mary.printPerson();
        bob.printPerson();

        john.changeName("Tomas");
        john.changeAge(44);
        john.changeProfession("Юрист");

    }

}
