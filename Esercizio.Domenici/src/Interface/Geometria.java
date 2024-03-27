package Interface;

public class Geometria {
    public static void main(String[] args) {
        Quadrado q = new Quadrado(10);
        System.out.println("\nArea do Quadrado: " + q.calcularArea() + "\nPerimetro do Quadrado: " + q.calcularPerimetro());

        Circulo c = new Circulo(3);
        System.out.println("\nArea do Circulo: " + c.calcularArea() + "\nPerimetro do Circulo: " + c.calcularPerimetro());

        Triangulo t = new Triangulo(5, 5, 8, 4.8);
        System.out.println("\nArea do Triangulo: " + t.calcularArea() + "\nPerimetro do Triangulo: " + t.calcularPerimetro());
    }
}

interface Forma{
    double calcularArea();
    double calcularPerimetro();
}

class Quadrado implements Forma{
    private double largura;

    public Quadrado(double largura) {
        this.largura = largura;
    }

    @Override
    public double calcularArea(){
        return Math.pow(largura, 2);
    }

    @Override
    public double calcularPerimetro(){
        return 4 * largura;
    }
}

class Circulo implements Forma{
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea(){
        return Math.PI * Math.pow(raio, 2);
    }

    @Override
    public double calcularPerimetro(){
        return 2 * Math.PI * raio;
    }
}

class Triangulo implements Forma{
    private double l1;
    private double l2;
    private double base; // base == l3
    private double altura;

    public Triangulo(double l1, double l2, double base, double altura) {
        this.l1 = l1;
        this.l2 = l2;
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea(){
        return l1 * altura / 2;
    }

    @Override
    public double calcularPerimetro(){
        return l1 + l2 + base;
    }
}
