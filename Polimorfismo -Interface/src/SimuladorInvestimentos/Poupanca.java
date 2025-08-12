package SimuladorInvestimentos;

public class Poupanca extends Investimento {
    public Poupanca(double valorInicial, int meses) {
        super(valorInicial, meses);
    }

    @Override
    public double simular() {
        double taxaMensal = 0.005; // 0.5% ao mês
        double saldo = valorInicial;

        System.out.printf("Simulação Poupança - Valor Inicial: R$ %.2f%n", valorInicial);

        for (int i = 1; i <= meses; i++) {
            double rendimento = saldo * taxaMensal;
            saldo += rendimento;
            System.out.printf("Mês %02d: Rendimento R$ %.2f | Saldo R$ %.2f%n", i, rendimento, saldo);
        }

        return saldo;
    }
}
