public class Women extends Person implements Displayable{

    public static final String sex = "Women";
    PersonRole personRole;

    Women(String name, int age, PersonRole personRole, String sex) {
        super(name, age, sex);
        this.personRole = personRole;
    }

    @Override
    public void print() {
//        super.print();
        System.out.print("Ім'я: " +  getName() + ", ");
        System.out.print("Вік: " + getAge() + ", ");
        System.out.print("Професія: " + PersonRole.TEACHER + ", ");
        System.out.print("Стать: " + sex);
        System.out.println();
    }

    @Override
    public void run() {
        System.out.print("Run, " + getName() +  " run!");
    }

}
