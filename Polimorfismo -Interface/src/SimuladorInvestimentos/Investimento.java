package SimuladorInvestimentos;

public abstract class Investimento {
    public double valorInicial;
    public int meses;

    public Investimento(double valorInicial, int meses) {
        this.valorInicial = valorInicial;
        this.meses = meses;
    }

    public double getValorInicial() {
        return valorInicial;
    }

    public int getMeses() {
        return meses;
    }

    public abstract double simular();

}
