// Parent class
class Animal {
    void sound() {
        System.out.println("Animals make different sounds.");
    }
}

// Child class inheriting from Animal
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks: Woof! Woof!");
    }
}

// Main class
public class InheritanceExample {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.sound(); // Inherited method from Animal
        myDog.bark();  // Method from Dog class
    }
}
