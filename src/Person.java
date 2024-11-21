public abstract class Person implements Displayable {

    private String name;
    private String profession;
    private int age;
    private String sex;
    private String personRole;

    public Person(String name, int age, String profession) {
        this.name = name;
        this.profession = profession;
        this.age = age;
    }

    public Person() {
    }

    void setName(String name) {
        this.name = name;
    }

    void setProfession(String profession) {
        this.profession = profession;
    }

    void setAge(int age) {
        this.age = age;
    }

    String getName() {
        return name;
    }

    String getProfession() {
        return profession;
    }

    int getAge() {
        return age;
    }

//    public void printPerson() {
//        System.out.print("Імʼя: " + name + ", ");
//        System.out.print("Вік: " + age + ", ");
//        System.out.print("Професія: " + profession + "");
//        System.out.println();
//    }

    public void changeName(String name) {
        if (!name.isEmpty()) {
            this.name = name;
        } else
            this.name = name;
        System.out.println();
        System.out.println("(Після оновлення даних)");
        System.out.print("Імʼя: " + this.name + ", ");
    }

    public void changeAge(int age) {
        if (age > 0) {
            this.age = age;
        } else
            this.age = 0;
        System.out.print("Вік: " + this.age + ", ");
    }

//    public void changeProfession(String profession) {
//        if (!profession.isEmpty()) {
//            this.profession = profession;
//        } else
//            this.profession = profession;
//        System.out.println("Profession: " + this.profession);
//    }

    public void changeProfession(String personRole) {
        if (!personRole.isEmpty()) {
            this.personRole = personRole;
        } else
            this.personRole = personRole;
        System.out.print("Професія: " + this.personRole + ", ");
    }

    public void changeSex(String sex) {
        if (!sex.isEmpty()) {
            this.sex = sex;
        } else
            this.sex = sex;
        System.out.print("Стать: " + this.sex);
    }


    public void print() {
        System.out.print("Person name: " + getName() + "");
    }

    public abstract void run();


}
