public class Cat extends Animal{


    public Cat(String name) {
        super(name);
    }

    public void makeSound() {
        System.out.println("Cat sound");
    }

    public boolean eat(String foodType) {
        return true;
    }
}
