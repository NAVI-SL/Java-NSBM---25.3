package Q3;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "Rex";
        dog.makeSound();

        Cat cat = new Cat();
        cat.name = "Luna";
        cat.makeSound();

        Bird bird = new Bird();
        bird.name = "Tweety";
        bird.makeSound();

        Animal a1 = new Dog();
        a1.name = "Bruno";
        a1.makeSound();

        Animal a2 = new Cat();
        a2.name = "Kitty";
        a2.makeSound();

        Animal a3 = new Bird();
        a3.name = "Sky";
        a3.makeSound();
    }
}
