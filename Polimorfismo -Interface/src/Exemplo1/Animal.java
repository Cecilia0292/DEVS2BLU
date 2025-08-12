package Exemplo1;

public class Animal {
    public String nome;
    public String cor;

    public Animal(String nome, String cor) {
        this.nome = nome;
        this.cor = cor;
    }

    public void emitirSom(){
        System.out.println(nome + " está emitindo um som genérico.");
    }
}
