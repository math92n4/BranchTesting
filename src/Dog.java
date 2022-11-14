public class Dog extends Animal{


    public Dog(String name) {
        super(name);
    }

    public void makeSound() {
        System.out.println("Dog sound");
    }

    public boolean eat(String foodType) {
        return true;
    }

    public void mood(boolean mood) {
        if (mood) {
            System.out.println("Logrer");
        } else
            System.out.println("Knurrer");
    }
}
