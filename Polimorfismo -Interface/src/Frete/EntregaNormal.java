package Frete;

public class EntregaNormal extends Entrega{

    public EntregaNormal(double peso, double distancia) {
        super(peso, distancia);
    }
    public double getPeso() {
        return peso;
    }

    public double getDistancia() {
        return distancia;
    }

    @Override
    public double calcularFrete() {
        return getPeso() * getDistancia();
    }
}
