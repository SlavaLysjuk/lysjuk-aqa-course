import org.w3c.dom.ls.LSOutput;

public class Man extends Person implements Displayable{

    private String name;
    private int age;
    private String profession;
    public static final String sex = "Man";
    PersonRole personRole;


    Man(String name, int age, String profession) {
        this.name = name;
        this.age = age;
        this.profession = profession;
    }

    Man(String name, int age, PersonRole personRole, String sex) {
        this(name, age, sex);
        this.personRole = personRole;
    }


    @Override
    public void print() {
//        super.print();
        System.out.print("Імʼя: " + name + ", ");
        System.out.print("Вік: " + age + ", ");
        System.out.print("Професія: " + personRole + ", ");
        System.out.print("Стать: " + sex);
        System.out.println();
    }

    @Override
    public void run() {
        System.out.println();
        System.out.print("Run, " + name +  " run!");
        System.out.println();
    }
}
