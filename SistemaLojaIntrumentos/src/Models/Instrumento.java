package Models;

public class Instrumento extends Produto{
    private Categoria categoria;

    public Instrumento(String nome, double preco, Categoria categoria) {
        super(nome, preco);
        this.categoria = categoria;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    @Override
    public String exibirDetalhes() {
        return "Instrumento:"  + nome + " | Preço: R$" + preco + " | Categoria: " + categoria.getNome();

    }
}




