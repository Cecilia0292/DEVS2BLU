package exercicio4;

public class Processador {
    private String modelo;
    private double velocidadeGHz;

    public Processador(final String modelo, final double velocidadeGHz) {
        this.modelo = modelo;
        this.velocidadeGHz = velocidadeGHz;
    }

    public String getModelo() {
        return this.modelo;
    }

    public double getVelocidadeGHz() {
        return this.velocidadeGHz;
    }

    public void setModelo(final String modelo) {
        this.modelo = modelo;
    }

    public void setVelocidadeGHz(final double velocidadeGHz) {
        this.velocidadeGHz = velocidadeGHz;
    }

}
