package SimuladorInvestimentos;

public class TesouroDireto extends Investimento {
    public TesouroDireto(double valorInicial, int meses) {
        super(valorInicial, meses);
    }

    public double simular() {
        double taxaMensal = 0.00837; // 0.5% ao mês
        double saldo = valorInicial;

        System.out.printf("Simulação Tesouro Direto - Valor Inicial: R$ %.2f%n", valorInicial);

        for (int i = 1; i <= meses; i++) {
            double rendimento = saldo * taxaMensal;
            saldo += rendimento;
            System.out.printf("Mês %02d: Rendimento R$ %.2f | Saldo R$ %.2f%n", i, rendimento, saldo);
        }

        return saldo;
    }
}

