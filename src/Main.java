
public class Main {

    public static void main(String[] args) {
        try {
            Man john = new Man("John", 30, PersonRole.ENGINEER, Man.sex);
            Women mary = new Women("Mary", 25, PersonRole.TEACHER, Women.sex);
            Man bob = new Man("Bob", 45, PersonRole.DOCTOR, Man.sex);

            john.print();
            mary.print();
            bob.print();

            mary.setName("Lora");
            mary.setAge(33);

            john.run();
            mary.run();
            bob.run();

            Man invalid = new Man("", -5, PersonRole.DOCTOR, Man.sex);
        } catch (InvalidDataException e) {
            System.out.println("Помилка: " + e.getMessage());
        }
    }
}
