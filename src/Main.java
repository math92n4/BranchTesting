public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog("Dog");
        Cat cat = new Cat("Cat");

        dog.makeSound();
        cat.makeSound();

        dog.eat("dogfood");
        cat.eat("fish");

        dog.mood(true);
        dog.mood(false);
        cat.mood(true);
        cat.mood(false);


    }
}
