package HerancaJava;

public class Animal {
    public void makeSound(){
        System.out.println("O animal faz um som.");
    }
}

class Cat extends Animal{
    @Override
    public void makeSound(){
        System.out.println("O gato mia");
    }
}

class Dog extends Animal{
    @Override
    public void makeSound(){
        System.out.println("O cachorro late.");
    }
}

class Main{
    public static void main(String[] args) {
        Animal a = new Animal();
        Cat c = new Cat();
        Dog d = new Dog();

        a.makeSound();
        c.makeSound();
        d.makeSound();
    }
}
