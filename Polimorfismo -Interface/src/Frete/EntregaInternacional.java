package Frete;

public class EntregaInternacional extends Entrega{
    public EntregaInternacional(double peso, double distancia) {
        super(peso, distancia);
    }

    @Override
    public double calcularFrete() {
        return (getPeso()*3) * (getDistancia());
    }
}
