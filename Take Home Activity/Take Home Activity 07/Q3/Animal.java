package Q3;

public class Animal {
    String name;
    void makeSound(){
        System.out.println(name + "makes a generic sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound(){
        System.out.println(name + " says Woof! ");
    }
}

class Cat extends Animal {
    @Override
    void makeSound(){
        System.out.println(name + " says Meow! ");
    }
}

class Bird extends Animal {
    @Override
    void makeSound() {
        System.out.println(name + " says Tweet! ");
    }
}