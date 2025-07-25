package exercicio1;

public class Pessoa {
    private String nome;
    private Endereco endereco;

    public Pessoa(final String nome, final Endereco endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }
    public void mostrarDados(){
        System.out.println("Nome:"+ nome);
        System.out.println("Endereço:"+ endereco.getDescricao());
    }
    public String getNome(){
        return nome;
    }
}
