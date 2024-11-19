public class Person {

    private String name;
    private String profession;
    private int age;

    public Person(String name, int age, String profession) {
        this.name = name;
        this.profession = profession;
        this.age = age;
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

    public void printPerson() {
        System.out.print("Імʼя: " + name + ", ");
        System.out.print("Вік: " + age + ", ");
        System.out.print("Професія: " + profession + "");
        System.out.println();
    }

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

    public void changeProfession(String profession) {
        if (!profession.isEmpty()) {
            this.profession = profession;
        } else
            this.profession = profession;
        System.out.println("Професія: " + this.profession);
    }


    public void print() {
        System.out.print("Person name: " + getName() + "");
    }

//    public abstract void makeNoise();

}
