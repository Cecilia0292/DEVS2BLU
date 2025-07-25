package exercicio3;

public class Disciplina {
    private int codigo;
    private String nome;
    private int cargaHoraria;

    public Disciplina(final int codigo, final String nome, final int cargaHoraria) {
        this.codigo = codigo;
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public String getNome() {
        return this.nome;
    }

    public int getCargaHoraria() {
        return this.cargaHoraria;
    }

    public void setCodigo(final int codigo) {
        this.codigo = codigo;
    }

    public void setNome(final String nome) {
        this.nome = nome;
    }

    public void setCargaHoraria(final int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString(){
        return nome + "("+ cargaHoraria+"h)";
    }
}
