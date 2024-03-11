package week8p3;

class Animal {
    protected String name;

    protected void display() {
        System.out.println("I am an animal.");
    }
}

class Dog extends Animal {
    public void getInfo() {
        System.out.println("My name is " +
                name);
    }
}

// class Main {
// public static void main(String[] args) {
// // create an object of the subclass
// Dog labrador = new Dog();
// // access protected field and method
// // using the object of subclass
// labrador.name = "Rocky";
// labrador.display();
// labrador.getInfo();
// }
// }

// // Single inheritance
// class Animal {
// void eat() {
// System.out.println("eating...");
// }
// }

// class Dog extends Animal {
// void bark() {
// System.out.println("barking...");
// }
// }

// class TestInheritance {
// public static void main(String args[]) {
// Dog d = new Dog();
// d.bark();
// d.eat();
// }
// }

// //Multi level Inheritance
// class Animal {
// void eat() {
// System.out.println("eating...");
// }
// }

// class Dog extends Animal {
// void bark() {
// System.out.println("barking...");
// }
// }

// class BabyDog extends Dog {
// void weep() {
// System.out.println("weeping...");
// }
// }

// class TestInheritance2 {
// public static void main(String args[]) {
// BabyDog d = new BabyDog();
// d.weep();
// d.bark();
// d.eat();
// }
// }

// //Hierarchical Inheritance
// class Animal {
// void eat() {
// System.out.println("eating...");
// }
// }

// class Dog extends Animal {
// void bark() {
// System.out.println("barking...");
// }
// }

// class Cat extends Animal {
// void meow() {
// System.out.println("meowing...");
// }
// }

// class TestInheritance3 {
// public static void main(String args[]) {
// Cat c = new Cat();
// c.meow();
// c.eat();
// // c.bark();//C.T.Error
// }
// }

// abstract class Shape {
// abstract void draw();
// }

// // In real scenario, implementation is provided by others i.e. unknown by end
// // user
// class Rectangle extends Shape {
// void draw() {
// System.out.println("drawing rectangle");
// }
// }

// class Circle1 extends Shape {
// void draw() {
// System.out.println("drawing circle");
// }
// }

// // In real scenario, method is called by programmer or user
// class TestAbstraction1 {
// public static void main(String args[]) {
// Shape s = new Circle1();// In a real scenario, object is provided through
// method
// s.draw();

// Shape r = new Rectangle();
// r.draw();
// }
// }

// public class Main {

// }

// abstract class Bank {
// abstract int getRateOfInterest();
// }

// class RBC extends Bank {
// int getRateOfInterest() {
// return 7;
// }
// }

// class TD extends Bank {
// int getRateOfInterest() {
// return 8;
// }
// }

// class TestBank {
// public static void main(String args[]) {
// Bank b;
// b = new RBC();
// System.out.println("Rate of Interest is: " + b.getRateOfInterest() + " %");
// b = new TD();
// System.out.println("Rate of Interest is: " + b.getRateOfInterest() + " %");
// }
// }

// Example of an abstract class that has abstract and non-abstract methods

// abstract class Bike {
// Bike() {
// System.out.println("bike is created");
// }

// abstract void run();

// void changeGear() {
// System.out.println("gear changed");
// }
// }

// // Creating a Child class which inherits Abstract class
// class Honda extends Bike {
// void run() {
// System.out.println("running safely..");
// }
// }

// // Creating a Test class which calls abstract and non-abstract methods
// class TestAbstraction2 {
// public static void main(String args[]) {
// Bike obj = new Honda();
// obj.run();
// obj.changeGear();
// }
// }

// interface A {
// void a();

// void b();

// void c();

// void d();
// }

// abstract class B implements A {
// public void c() {
// System.out.println("I am c");
// }
// }

// class M extends B {
// public void a() {
// System.out.println("I am a");
// }

// public void b() {
// System.out.println("I am b");
// }

// public void d() {
// System.out.println("I am d");
// }
// }

// class Test5 {
// public static void main(String args[]) {
// A a = new M();
// a.a();
// a.b();
// a.c();
// a.d();
// }
// }