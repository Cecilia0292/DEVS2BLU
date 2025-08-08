package Exercicio3;

public class Triangulo extends FiguraGeometrica{
    public Triangulo(double base, double altura) {
        super(base, altura);
    }

    @Override
    public double calcularArea() {
        return getBase() * getAltura() / 2;
    }
}
