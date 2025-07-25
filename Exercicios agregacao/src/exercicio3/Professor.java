package exercicio3;

public class Professor {
    private String professor;
    private Disciplina disciplina;

    public Professor(final String professor, final Disciplina disciplina) {
        this.professor = professor;
        this.disciplina = disciplina;
    }

    public String getProfessor() {
        return this.professor;
    }

    public Disciplina getDisciplina() {
        return this.disciplina;
    }

    public void setProfessor(final String professor) {
        this.professor = professor;
    }

    public void setDisciplina(final Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public void mostrarInformacoesProfessor(){
        System.out.println("Professor:" + getProfessor());
        System.out.println("Disciplina:" + getDisciplina());
    }
}
