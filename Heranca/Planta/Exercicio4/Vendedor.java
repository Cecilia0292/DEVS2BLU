package Exercicio4;

public class Vendedor extends Funcionario {
    private double totalVendas;
    private double comissaoPorVenda;
    public Vendedor(String nome, double salarioPorHora, int cargaHoraria, double totalVendas, double comissaoPorVenda) {
        super(nome, salarioPorHora, cargaHoraria);
        this.totalVendas = totalVendas;
        this.comissaoPorVenda = comissaoPorVenda;
    }

    public double getTotalVendas() {
        return totalVendas;
    }
    public double getComissaoPorVenda() {
        return comissaoPorVenda;
    }
    @Override
    public double calcularSalarioMensal() {
        double comissao = totalVendas * comissaoPorVenda;
        return super.calcularSalarioMensal() + comissao;
    }
}
