public class Animal {

    private String name;
    private int weight;
    private int age;

    Animal(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    void setName(String name) {
        this.name = name;
    }

    void setWeight(int weight) {
        if (weight > 0) {
            this.weight = weight;
        }
        this.weight = weight;
    }

    void setAge(int age) {
        this.age = age;
    }

    String getName() {
        return name;
    }

    int getWeight() {
        return weight;
    }

    int getAge() {
        return age;
    }

    public void printAnimal() {
        System.out.println("Таринку звуть: " + name);
        System.out.println("Вага: " + weight);
        System.out.println("Вік: " + age);
        System.out.println();
    }

    public void changeName(String name) {
        if (!name.isEmpty()) {
            this.name = name;
        } else
            this.name = name;
        System.out.println("(Після оновлення даних)");
        System.out.println("Нове імя тваринки: " + this.name);
    }

    public void changeWeight(int weight) {
        if (weight > 0) {
            this.weight = weight;
        } else
            this.weight = 0;
        System.out.println("Нова вага: " + this.weight);
    }

    public void changeAge(int age) {
        if (age > 0) {
            this.age = age;
        } else
            this.age = 0;
        System.out.println("Новий вік: " + this.age);
    }


}
