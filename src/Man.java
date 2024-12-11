
public class Man extends Person implements Displayable {

    public static final String sex = "Man";
    private PersonRole personRole;

    public Man(String name, int age, PersonRole personRole, String sex) throws InvalidDataException {
        super(name, age, sex);
        this.personRole = personRole;
    }

    @Override
    public void print() {
        System.out.print("Ім'я: " + getName() + ", ");
        System.out.print("Вік: " + getAge() + ", ");
        System.out.print("Професія: " + personRole + ", ");
        System.out.print("Стать: " + sex);
        System.out.println();
    }

    @Override
    public void run() {
        System.out.println("Run, " + getName() + " run!");
    }
}
