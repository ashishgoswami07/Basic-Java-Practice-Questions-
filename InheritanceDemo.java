// Demonstrates inheritance and polymorphism
class Animal {
public void sound() {
System.out.println("Animals make sounds.");
}
}


class Dog extends Animal {
@Override
public void sound() {
System.out.println("Dog barks.");
}
}


class Cat extends Animal {
@Override
public void sound() {
System.out.println("Cat meows.");
}
}


public class InheritanceDemo {
public static void run() {
Animal a1 = new Dog();
Animal a2 = new Cat();


a1.sound();
a2.sound();
}
}