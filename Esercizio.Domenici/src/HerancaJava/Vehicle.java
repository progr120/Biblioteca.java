package HerancaJava;

public class Vehicle {
    public void drive(){
        System.out.println("Reparando um veiculo.");
    }
}

class Car extends Vehicle{
    @Override
    public void drive(){
        System.out.println("Reparando um carro.");
    }
}

class Main2{   
    public static void main(String[] args) {
        Car c = new Car();
        Vehicle v = new Vehicle();

        v.drive();
        c.drive();
    }
}
