package exercicio2;

public class Motor {
    private String tipo;
    private int potencia;

    public Motor(final String tipo, final int potencia) {
        this.tipo = tipo;
        this.potencia = potencia;
    }

    public String getTipo() {
        return this.tipo;
    }

    public int getPotencia() {
        return this.potencia;
    }
    public String getDescricao(){
        return tipo + "-" + potencia + "CV";
    }
    public void aumentarPotencia(int extra){
        potencia+= extra;
    }
}
