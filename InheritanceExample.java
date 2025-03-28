// // Base class (Grandparent)
// class Animal {
//     void eat() {
//         System.out.println("Animals eat food.");
//     }
// }

// // Intermediate class (Parent)
// class Mammal extends Animal {
//     void breathe() {
//         System.out.println("Mammals breathe air.");
//     }
// }

// // Derived class (Child)
// class Dog extends Mammal {
//     void bark() {
//         System.out.println("Dog barks: Woof! Woof!");
//     }
// }

// // Main class
// public class  InheritanceExample {
//     public static void main(String[] args) {
//         Dog myDog = new Dog();
//         myDog.eat();    // Inherited from Animal
//         myDog.breathe();// Inherited from Mammal
//         myDog.bark();   // Method from Dog class
//     }
// }
// Base class (Grandparent)
class Animal {
    Animal() {
        System.out.println("Animal Constructor: An animal is created.");
    }

    void eat() {
        System.out.println("Animals eat food.");
    }
}

// Intermediate class (Parent)
class Mammal extends Animal {
    Mammal() {
        super(); // Calls Animal class constructor
        System.out.println("Mammal Constructor: A mammal is created.");
    }

    void breathe() {
        System.out.println("Mammals breathe air.");
    }
}

// Derived class (Child)
class Dog extends Mammal {
    Dog() {
        super(); // Calls Mammal class constructor
        System.out.println("Dog Constructor: A dog is created.");
    }

    void bark() {
        System.out.println("Dog barks: Woof! Woof!");
    }

    void showParentBehavior() {
        super.eat(); // Calls the eat() method from Animal class
        super.breathe(); // Calls the breathe() method from Mammal class
    }
}

// Main class
public class InheritanceExample  {
    public static void main(String[] args) {
        Dog myDog = new Dog(); // Calls constructors in order
        myDog.showParentBehavior(); // Calls parent class methods using super
        myDog.bark(); // Calls method from Dog class
        myDog.breathe();
    }
}
