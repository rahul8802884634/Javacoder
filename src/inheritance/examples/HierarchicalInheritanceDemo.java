package inheritance.examples;

class Animal3 {
    void eat() {
        System.out.println("Animal eats food.");
    }
}

class Dog3 extends Animal3 {
    void bark() {
        System.out.println("Dog barks.");
    }
}

class Cat extends Animal3 {
    void meow() {
        System.out.println("Cat meows.");
    }
}

public class HierarchicalInheritanceDemo {
    public static void main(String[] args) {
        Dog3 dog = new Dog3();
        dog.eat();
        dog.bark();

        Cat cat = new Cat();
        cat.eat();
        cat.meow();
    }
}
