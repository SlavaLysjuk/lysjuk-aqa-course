public class Main {

    public static void main(String[] args) {

        Man john = new Man("John", 30, PersonRole.ENGINEER, Man.sex);
        Women mary = new Women("Mary", 25, PersonRole.TEACHER, Women.sex);
        Man bob = new Man("Bob", 45, PersonRole.DOCTOR, Man.sex);


        john.print();
        mary.print();
        bob.print();

        mary.changeName("Lora");
        mary.changeAge(33);
        mary.changeProfession(PersonRole.TEACHER.name());
        mary.changeSex(Women.sex);

        john.run();
        mary.run();
        bob.run();

    }

}
