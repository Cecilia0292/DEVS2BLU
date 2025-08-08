package Exercicio4;

public abstract class Funcionario {
    private String nome;
    private double salarioPorHora;
    private int cargaHoraria;

    public Funcionario(String nome, double salarioPorHora, int cargaHoraria) {
        this.nome = nome;
        this.salarioPorHora = salarioPorHora;
        this.cargaHoraria = cargaHoraria;
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioPorHora() {
        return salarioPorHora;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public double calcularSalarioMensal(){
        return getSalarioPorHora() * getCargaHoraria();
    }
}
