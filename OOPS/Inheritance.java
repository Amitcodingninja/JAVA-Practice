package OOPS;

public class Inheritance {

}

class Animal {
    void eat() {
        System.out.println("I am Eating");
    }

}

class Cat extends Dog {
    void voice() {
        System.out.println(" Mew Mew ");
    }
}

class Dog extends Animal {
    public static void main(String[] args) {
        Cat c = new Cat();
        Dog d = new Dog();
    }

}
