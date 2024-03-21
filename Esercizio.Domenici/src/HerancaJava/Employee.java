package HerancaJava;

public class Employee {
    public void Trabalho(String funcao){
        System.out.println("Trabalho é: " + funcao);
    }

    public double getSalario(double num){
        System.out.println("salario: " + num);
        return num;
    }
}

class GerenteRH extends Employee{
    @Override
    public void Trabalho(String trabalho){
        System.out.println("A profissao do trabalhador é: " + trabalho);
    }

    public void addTrabalhador(String nome){
        System.out.println("Nome: " + nome);
    }
}

class Main4{
    public static void main(String[] args) {
        Employee Emp = new Employee();
        GerenteRH Grh = new GerenteRH();

        Grh.addTrabalhador("Manuel");
        Grh.Trabalho("Faxineiro.");
        Emp.Trabalho("Varrer");
        Emp.getSalario(1367.49);


    }
}