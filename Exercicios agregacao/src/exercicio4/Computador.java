package exercicio4;

public class Computador {
    private String marca;
    private Processador processador;
    private MemoriaRam memoria;

    public Computador(final String marca, final Processador processador, final MemoriaRam memoria) {
        this.marca = marca;
        this.processador = processador;
        this.memoria = memoria;
    }
    public void mostrarConfiguracao(){
        System.out.println("Computador " + marca);
        System.out.println("Processador: " + processador.getModelo() + " - " + processador.getVelocidadeGHz() + "GHz");
        System.out.println("Memória RAM: " + memoria.getCapacidadeGB() + "GB");
    }
    public void atualizarMemoria(int novaCapacidade){
        memoria.setCapacidadeGB(novaCapacidade);
        System.out.println("Memória RAM atualizada para " + novaCapacidade + "GB");
}
}
