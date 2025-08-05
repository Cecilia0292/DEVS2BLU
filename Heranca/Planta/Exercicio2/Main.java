package Exercicio2;

public class Main {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente("Joao da Silva", 100.00,200.00);
        ContaPoupanca contaPoupanca = new ContaPoupanca("Maria da Silva",100.00,0.05);

        contaCorrente.sacar(50.00);
        contaPoupanca.aplicarJuros();
        contaCorrente.consultarSaldo();
    }
}
