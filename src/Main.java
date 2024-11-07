public class Main {

    public static void main(String[] args) {

        Animal tiger = new Animal("Tiger", 300, 22);
        Animal dog = new Animal("Dog", 30, 11);
        Animal cat = new Animal("Cat", 22, 5);

        tiger.printAnimal();
        dog.printAnimal();
        cat.printAnimal();

        tiger.changeName("Puma");
        tiger.changeWeight(130);
        tiger.changeAge(5);

    }



}
