package Exercicio4;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = List.of(
              new Gerente("Jequinha",20.9,60, 500.00),
                new Vendedor("Sofrido", 15.0, 44, 1200.00, 0.05)
        );

        for (Funcionario f :funcionarios){
            System.out.printf("%s - O Salário mensal R$ %.2f%n", f.getNome(), f.calcularSalarioMensal());
        }

    }
}