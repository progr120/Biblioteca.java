package ClassesAbstratas;

abstract class Animal {
    public abstract void sound();
}

class Lion extends Animal {
    @Override
    public void sound() {
        System.out.println("Lion roars!");
    }
}

class Tiger extends Animal {
    @Override
    public void sound() {
        System.out.println("Tiger growls!");
    }
}

class MainC{
    public static void main(String[] args) {
        Animal lion = new Lion();
        lion.sound(); // Output: Lion roars!

        Animal tiger = new Tiger();
        tiger.sound(); // Output: Tiger growls!
    }
}