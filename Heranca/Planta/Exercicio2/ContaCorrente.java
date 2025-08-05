package Exercicio2;

public class ContaCorrente extends ContaBancaria{
    private double limiteChequeEspecial;

    public ContaCorrente(String titular, double saldoInicial, double limiteChequeEspecial) {
        super(titular, saldoInicial);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }
    @Override
    public void sacar(double valor){
        if (valor <= saldo + limiteChequeEspecial){
            saldo -= valor;
        }else{
            System.out.println("Limite do cheque especial excedido");
        }
    }

}
