package Exercicio3;

public  abstract class FiguraGeometrica {
    private double base;
    private double altura;

    public FiguraGeometrica(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcularArea(){
        return 0.0;
    };

}
