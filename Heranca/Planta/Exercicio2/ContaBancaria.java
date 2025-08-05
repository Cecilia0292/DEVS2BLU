package Exercicio2;

public class ContaBancaria {
    protected String titular;
    protected double saldo;

    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }
    public void depositar(double valor){
        saldo += valor;
    }
    public void sacar(double valor){
        if(valor <= saldo){
            saldo -= valor;
        }else{
            System.out.println("Saldo insuficiente.");
        }
    }
    public void consultarSaldo(){
        System.out.println("O saldo atual de " + titular + ": R$" + saldo);
    }
}
