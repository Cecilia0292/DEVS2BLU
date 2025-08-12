package SistemaInstrumentos;

public class Instrumento {
    public String nomeInstrumento;
    public String tipo;// cordas, sopro etc

    public Instrumento(String nomeInstrumento, String tipo) {
        this.nomeInstrumento = nomeInstrumento;
        this.tipo = tipo;
    }

    public void tocar(){
        System.out.println("O instrumento está sendo tocado");
    }
}
