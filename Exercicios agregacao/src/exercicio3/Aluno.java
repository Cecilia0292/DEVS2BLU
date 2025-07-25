package exercicio3;

public class Aluno {
    private String nome;
    private Disciplina disciplina;
    private Professor professor;

    public Aluno(final String nome, final Disciplina disciplina, final Professor professor) {
        this.nome = nome;
        this.disciplina = disciplina;
        this.professor = professor;
    }

    public String getNome() {
        return this.nome;
    }

    public Disciplina getDisciplina() {
        return this.disciplina;
    }

    public Professor getProfessor() {
        return this.professor;
    }

    public void setNome(final String nome) {
        this.nome = nome;
    }

    public void setDisciplina(final Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public void setProfessor(final Professor professor) {
        this.professor = professor;
    }

    public void matricularAlunoDisciplina(){
        System.out.println( nome + " matriculado em " + disciplina.getNome() + " com o professor " + professor.getProfessor());
    }
}
