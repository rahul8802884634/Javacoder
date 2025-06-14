package Tasks;

public class InheritanceExamples {
    public static void main(String[] args) {
        System.out.println("===== 1. Single Inheritance =====");
        Dog dog = new Dog();
        dog.sound(); // Output: Dog barks

        System.out.println("\n===== 2. Multilevel Inheritance =====");
        Child child = new Child();
        child.showGrandparent();
        child.showParent();
        child.showChild();

        System.out.println("\n===== 3. Hierarchical Inheritance =====");
        Car car = new Car();
        car.start();
        car.carFeature();

        Bike bike = new Bike();
        bike.start();
        bike.bikeFeature();

        System.out.println("\n===== 4. Constructor in Inheritance =====");
        ChildClass c = new ChildClass();

        System.out.println("\n===== 5. Method Overriding =====");
        Sparrow sparrow = new Sparrow();
        sparrow.fly(); // Output: Sparrow flies swiftly

        System.out.println("\n===== 6. Use of super keyword =====");
        GamingLaptop gamingLaptop = new GamingLaptop();
        gamingLaptop.display();
    }
}

// ----------------------------
// 1. Single Inheritance
// ----------------------------
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    // Overriding sound method
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// ----------------------------
// 2. Multilevel Inheritance
// ----------------------------
class Grandparent {
    void showGrandparent() {
        System.out.println("I am Grandparent");
    }
}

class Parent extends Grandparent {
    void showParent() {
        System.out.println("I am Parent");
    }
}

class Child extends Parent {
    void showChild() {
        System.out.println("I am Child");
    }
}

// ----------------------------
// 3. Hierarchical Inheritance
// ----------------------------
class Vehicle {
    void start() {
        System.out.println("Vehicle starts");
    }
}

class Car extends Vehicle {
    void carFeature() {
        System.out.println("Car has AC");
    }
}

class Bike extends Vehicle {
    void bikeFeature() {
        System.out.println("Bike has helmet");
    }
}

// ----------------------------
// 4. Constructor in Inheritance
// ----------------------------
class ParentClass {
    ParentClass() {
        System.out.println("Parent Constructor");
    }
}

class ChildClass extends ParentClass {
    ChildClass() {
        System.out.println("Child Constructor");
    }
}

// ----------------------------
// 5. Method Overriding
// ----------------------------
class Bird {
    void fly() {
        System.out.println("Bird can fly");
    }
}

class Sparrow extends Bird {
    @Override
    void fly() {
        System.out.println("Sparrow flies swiftly");
    }
}

// ----------------------------
// 6. Use of super keyword
// ----------------------------
class Laptop {
    String brand = "HP";

    void show() {
        System.out.println("Laptop brand: " + brand);
    }
}

class GamingLaptop extends Laptop {
    String brand = "Asus";

    void display() {
        System.out.println("Child brand: " + brand);        // Asus
        System.out.println("Parent brand: " + super.brand); // HP
        super.show(); // Calls show() method of parent class
    }
}
