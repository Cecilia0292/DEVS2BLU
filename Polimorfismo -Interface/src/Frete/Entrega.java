package Frete;

public abstract class Entrega {
    public double peso;
    public double distancia;

    public Entrega(double peso, double distancia) {
        this.peso = peso;
        this.distancia = distancia;
    }

    public double getPeso() {
        return peso;
    }

    public double getDistancia() {
        return distancia;
    }

    public abstract double calcularFrete();
}
