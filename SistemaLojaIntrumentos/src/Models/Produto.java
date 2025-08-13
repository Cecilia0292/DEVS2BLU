package Models;

public abstract class Produto {
    protected int id;
    protected String nome;
    protected double preco;
    protected static int contadorId = 0;

    public Produto(String nome, double preco) {
        this.id = ++contadorId;
        this.nome = nome;
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public abstract String exibirDetalhes();

}
