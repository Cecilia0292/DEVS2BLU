package Exemplo1;

public class Peixe extends Animal {
    public Peixe(String nome, String cor) {
        super(nome, cor);
    }
    @Override
    public void emitirSom() {
        super.emitirSom();
        System.out.println(nome + " faz blub blub.");
    }
}
