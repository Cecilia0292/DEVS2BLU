package exercicio1;

import java.util.ArrayList;

public class Turma {
    private int codigo;
    private String curso;
    private ArrayList<Pessoa> alunos;

    public Turma(final int codigo, final String curso) {
        this.codigo = codigo;
        this.curso = curso;
        this.alunos = new ArrayList<>();
    }
    public void adicionarPessoa(Pessoa pessoa){
        alunos.add(pessoa);
    }
    public void exibirTurma() {
        System.out.println("Turma: " + codigo + " - Curso: " + curso);
        System.out.println("Alunos:");
        for (Pessoa p : alunos) {
            System.out.println("- " + p.getNome());
        }
    }
}
