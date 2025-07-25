package exercicio1;

public class Endereco {
    private String logradouro;
    private String bairro;
    private String cidade;

    public Endereco(final String logradouro, final String bairro, final String cidade) {
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.cidade = cidade;
    }
    public String getDescricao(){
        return logradouro + ", "+ bairro+ "- "+ cidade;
    }
}

