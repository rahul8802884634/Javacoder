package Task1;

// 1. Animal Sound - Abstract Method Implementation
abstract class Animal {
    abstract void makeSound();
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("Cat meows");
    }
}

class AnimalSoundDemo {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.makeSound();

        Animal cat = new Cat();
        cat.makeSound();
    }
}

// 2. Bank Interest Calculation
abstract class Bank {
    abstract double getInterestRate();
}

class SBI extends Bank {
    double getInterestRate() {
        return 6.5;
    }
}

class HDFC extends Bank {
    double getInterestRate() {
        return 7.0;
    }
}

class BankInterestDemo {
    public static void main(String[] args) {
        Bank sbi = new SBI();
        System.out.println("SBI Interest Rate: " + sbi.getInterestRate() + "%");

        Bank hdfc = new HDFC();
        System.out.println("HDFC Interest Rate: " + hdfc.getInterestRate() + "%");
    }
}

// 4. Abstract Class with Constructor
abstract class MyAbstract {
    MyAbstract() {
        System.out.println("Abstract class constructor called");
    }

    void showMessage() {
        System.out.println("Method from abstract class");
    }
}

class ConcreteClass extends MyAbstract {}

class AbstractConstructorDemo {
    public static void main(String[] args) {
        ConcreteClass obj = new ConcreteClass();
        obj.showMessage();
    }
}

// 5. Abstract vs Concrete Method
abstract class Parent {
    abstract void show();

    void display() {
        System.out.println("Concrete method in abstract class");
    }
}

class Child extends Parent {
    void show() {
        System.out.println("Abstract method implemented");
    }
}

class AbstractVsConcreteDemo {
    public static void main(String[] args) {
        Child c = new Child();
        c.display();
        c.show();
    }
}

// 6. Multiple Inheritance Using Interfaces
interface Printable {
    void print();
}

interface Showable {
    void show();
}

class Document implements Printable, Showable {
    public void print() {
        System.out.println("Printing Document");
    }

    public void show() {
        System.out.println("Showing Document");
    }
}

class MultipleInheritanceDemo {
    public static void main(String[] args) {
        Document doc = new Document();
        doc.print();
        doc.show();
    }
}

// 7. Interface with Default and Static Method
interface Vehicle {
    default void start() {
        System.out.println("Vehicle started");
    }

    static void fuelType() {
        System.out.println("Fuel type is Petrol");
    }
}

class DefaultCar implements Vehicle {}

class InterfaceDefaultStaticDemo {
    public static void main(String[] args) {
        DefaultCar c = new DefaultCar();
        c.start();

        Vehicle.fuelType();
    }
}

// 8. Interface Constants
interface SpeedLimit {
    int MAX_SPEED = 120; // implicitly public static final
}

class SpeedCar implements SpeedLimit {
    void showSpeedLimit() {
        System.out.println("Max Speed is: " + MAX_SPEED);
    }
}

class InterfaceConstantsDemo {
    public static void main(String[] args) {
        SpeedCar car = new SpeedCar();
        car.showSpeedLimit();
    }
}

// 9. Interface Polymorphism
interface Playable {
    void play();
}

class Guitar implements Playable {
    public void play() {
        System.out.println("Playing Guitar");
    }
}

class Piano implements Playable {
    public void play() {
        System.out.println("Playing Piano");
    }
}

class InterfacePolymorphismDemo {
    public static void main(String[] args) {
        Playable instrument;

        instrument = new Guitar();
        instrument.play();

        instrument = new Piano();
        instrument.play();
    }
}