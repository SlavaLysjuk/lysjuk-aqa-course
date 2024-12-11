
class InvalidDataException extends Exception {
    public InvalidDataException(String message) {
        super(message);
    }
}

public abstract class Person implements Displayable {

    private String name;
    private int age;
    private String sex;
    private PersonRole personRole;

    public Person(String name, int age, String sex) throws InvalidDataException {
        setName(name);
        setAge(age);
        this.sex = sex;
    }

    public void setName(String name) throws InvalidDataException {
        if (name == null || name.isEmpty()) {
            throw new InvalidDataException("Ім'я не може бути порожнім або null.");
        }
        this.name = name;
    }

    public void setAge(int age) throws InvalidDataException {
        if (age < 0) {
            throw new InvalidDataException("Вік не може бути негативним.");
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public abstract void run();
}
