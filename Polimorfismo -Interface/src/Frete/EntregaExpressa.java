package Frete;

public class EntregaExpressa extends Entrega{
    public EntregaExpressa(double peso, double distancia) {
        super(peso, distancia);
    }

    @Override
    public double calcularFrete() {
        return (getPeso()*2) * (getDistancia());
    }
}
