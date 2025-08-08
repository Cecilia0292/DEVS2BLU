package Exercicio4;

public class Gerente extends Funcionario{
    private double bonus;

    public Gerente(String nome, double salarioPorHora, int cargaHoraria, double bonus) {
        super(nome, salarioPorHora, cargaHoraria);
        this.bonus = bonus;
    }
    public double getBonus() {
        return bonus;
    }

    @Override
    public double calcularSalarioMensal() {
        return super.calcularSalarioMensal() + bonus;
    }
}
