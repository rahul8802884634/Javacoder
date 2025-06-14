package Task1;

public class MainApp {
    public static void main(String[] args) {
        // 1. Student class test
        Student s = new Student("Rahul", 20);
        s.display();
        System.out.println("----------");

        // 2. Car class test
        Car c = new Car("Toyota", "Fortuner", 4000000);
        c.display();
        System.out.println("----------");

        // 3. Rectangle area test
        Rectangle r = new Rectangle(10, 5);
        r.area();
        System.out.println("----------");

        // 4. Book class test
        Book b = new Book("Atomic Habits", "James Clear", 499.00);
        b.display();
        System.out.println("----------");

        // 5. Mobile class test with constructor overloading
        Mobile m1 = new Mobile("Samsung");
        Mobile m2 = new Mobile("Samsung", "Galaxy S22");
        Mobile m3 = new Mobile("Apple", "iPhone 15", 79999);

        m1.display();
        System.out.println("-----");
        m2.display();
        System.out.println("-----");
        m3.display();
    }
}

// 1. Student class
class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
    }
}

// 2. Car class
class Car {
    String brand;
    String model;
    double price;

    public Car(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    void display() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Car Model: " + model);
        System.out.println("Car Price: ₹" + price);
    }
}

// 3. Rectangle class
class Rectangle {
    int length;
    int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void area() {
        int area = length * breadth;
        System.out.println("Rectangle Area: " + area);
    }
}

// 4. Book class
class Book {
    String title;
    String author;
    double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void display() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Book Price: ₹" + price);
    }
}

// 5. Mobile class with constructor overloading
class Mobile {
    String brand;
    String model;
    double price;

    // Constructor 1: Only brand
    public Mobile(String brand) {
        this.brand = brand;
    }

    // Constructor 2: Brand and model
    public Mobile(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    // Constructor 3: Brand, model, price
    public Mobile(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    void display() {
        System.out.println("Mobile Brand: " + brand);
        if (model != null)
            System.out.println("Model: " + model);
        if (price != 0.0)
            System.out.println("Price: ₹" + price);
    }
}
