package EserciziChat;

import java.util.Scanner;

public class ConversorDeMoedas{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double conversorParaDolar = 4.98;
        double conversorParaEuro = 5.40;
        double conversorParaPesoArgentino = 0.0058;
        double conversorParaLibra = 6.30;
        double conversorParaIene = 0.033;

        System.out.println("------------------------CONVERSOR PARA REAL------------------------\n");
        System.out.println("1. Dolar");
        System.out.println("2. Euro");
        System.out.println("3. Peso Argentino");
        System.out.println("4. Libra");
        System.out.println("5. Iene");
        System.out.println("0. Fechar Menu");

        System.out.println("Qual moeda deseja converter: \n" + "(Obs: escolha um numero do menu)");
        int escolhaMoeda = sc.nextInt();

        if(escolhaMoeda == 1){
            System.out.println("Escolha o valor em Dolar: ");
            double valorDolar = sc.nextDouble();
            double risDolar = conversorParaDolar * valorDolar;
            System.out.println("Valor em real R$: " + (int)risDolar);
        } else if(escolhaMoeda == 2){
            System.out.println("Escolha o valor em Euro: ");
            double valorEuro = sc.nextDouble();
            double risEuro = conversorParaEuro * valorEuro;
            System.out.println("Valor em real R$: " + (int)risEuro);
        } else if(escolhaMoeda == 3){
            System.out.println("Escolha o valor em Peso Argentino: ");
            double valorPesoArgentino = sc.nextDouble();
            double risPesoArgentino = conversorParaPesoArgentino * valorPesoArgentino;
            System.out.println("Valor em real R$: " + (int)risPesoArgentino);
        } else if(escolhaMoeda == 4){
            System.out.println("Escolha o valor em Libra: ");
            double valorLibra = sc.nextDouble();
            double risLibra = conversorParaLibra * valorLibra;
            System.out.println("Valor em real R$: " + (int)risLibra);
        } else if(escolhaMoeda == 5){
            System.out.println("Escolha o valor em Iene: ");
            double valorIene = sc.nextDouble();
            double risIene = conversorParaIene * valorIene;
            System.out.println("Valor em real R$: " + (int)risIene);
        } else if(escolhaMoeda == 0){
            sc.close();
        } else {
            System.out.println("Opçao invalida.");
        }
        sc.close();
    }
}