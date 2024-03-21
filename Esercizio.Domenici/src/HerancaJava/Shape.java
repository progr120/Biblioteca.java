package HerancaJava;

public class Shape {
    public double getArea() {
        return 0.0;
    }
}

class Retangulo extends Shape {
    private double altura;
    private double largura;

    public Retangulo(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    @Override
    public double getArea() {
        return altura * largura;
    }

    public double getAltura() {
        return altura;
    }

    public double getLargura() {
        return largura;
    }
}

class Main3{
    public static void main(String[] args) {
        Retangulo ret = new Retangulo(3, 10);

        double area = ret.getArea();

        System.out.println("Algura do retangulo: " + ret.getAltura() + "\nLargura do retangulo: " + ret.getLargura());
        System.out.println("Area do retangulo: " + area);
    }
}
