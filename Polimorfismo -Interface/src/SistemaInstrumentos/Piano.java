package SistemaInstrumentos;

public class Piano extends Instrumento{
    public Piano(String nomeInstrumento, String tipo) {
        super(nomeInstrumento, tipo);
    }
    @Override
    public void tocar() {
        System.out.println("O piano está tocando uma melodia clássica.");
    }

}
