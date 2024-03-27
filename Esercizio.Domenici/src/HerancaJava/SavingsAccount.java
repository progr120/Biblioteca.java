package HerancaJava;

public class SavingsAccount extends BankAccount{
    public SavingsAccount(String numeroConta, double extrato){
        super(numeroConta, extrato);
    }

    @Override
    public void Saque(double saldo){
        if(pegaExtrato() - saldo < 100){
            System.out.println("Saldo minimo deve ser R$100");
        } else {
            super.Saque(saldo);
        }
    }
}

class MainBank{
    public static void main(String[] args) {
        BankAccount Conta = new BankAccount("1M151WRQ4", 1500);

        System.out.println("\n");
        System.out.println("Conta: " + Conta.getNumeroConta());
        Conta.getExtrato();

        System.out.println("\nDeposito de R$500");
        Conta.Deposito(500);
        Conta.getExtrato();

        System.out.println("\nSaque de R$200");
        Conta.Saque(200);    
        Conta.getExtrato();
    }
}
