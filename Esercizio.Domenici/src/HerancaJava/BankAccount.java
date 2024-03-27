package HerancaJava;

public class BankAccount {
    private String numeroConta;
    private double extrato;

    public BankAccount(String numeroConta, double extrato) {
        this.numeroConta = numeroConta;
        this.extrato = extrato;
    }

    public void Deposito(double saldo){
        extrato += saldo;
    }

    public void Saque(double saldo){
        if(extrato >= saldo){
            extrato -= saldo;
        } else {
            System.out.println("Saldo Insuficiente.");
        }
    }

    public void getExtrato(){
        System.out.println("Valor atual R$" + extrato);
    }

    public double pegaExtrato(){
        return extrato;
    }

    public String getNumeroConta() {
        return numeroConta;
    }
}