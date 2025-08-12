package SistemaInstrumentos;

public class Bateria extends Instrumento{
    public Bateria(String nomeInstrumento, String tipo) {
        super(nomeInstrumento, tipo);
    }
    @Override
    public void tocar() {
        System.out.println("A bateria esta tocando suavemente");
    }
}
