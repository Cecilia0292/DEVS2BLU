package SistemaInstrumentos;

public class Violao extends Instrumento{
    public Violao(String nomeInstrumento, String tipo) {
        super(nomeInstrumento, tipo);
    }
    @Override
    public void tocar() {
        System.out.println("O violao esta tocando um acorde suave");
    }
}
