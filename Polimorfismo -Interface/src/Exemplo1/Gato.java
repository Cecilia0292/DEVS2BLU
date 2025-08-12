package Exemplo1;

public class Gato extends Animal{
    public String tipoPelagem;

    public Gato(String nome, String cor, String tipoPelagem) {
        super(nome, cor);
        this.tipoPelagem = tipoPelagem;
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " faz miau miau.");
    }
}
