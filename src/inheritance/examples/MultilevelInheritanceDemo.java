package inheritance.examples;

class Animal2 {
    void eat() {
        System.out.println("Animal eats food.");
    }
}

class Mammal extends Animal2 {
    void walk() {
        System.out.println("Mammal walks.");
    }
}

class Dog2 extends Mammal {
    void bark() {
        System.out.println("Dog barks.");
    }
}

public class MultilevelInheritanceDemo {
    public static void main(String[] args) {
        Dog2 dog = new Dog2();
        dog.eat();   // from Animal2
        dog.walk();  // from Mammal
        dog.bark();  // from Dog2
    }
}
