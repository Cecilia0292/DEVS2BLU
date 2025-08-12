package SimuladorInvestimentos;

import java.util.List;

public class Main {
    public static  void main(String[]args){
        List<Investimento> investimentos = List.of(
            new Poupanca( 500.00, 12),
            new TesouroDireto( 500.00, 12),
            new Acao(500.00, 12)
        );
        for(Investimento i : investimentos) {
            double resultado = i.simular();
            String tipo = i.getClass().getSimpleName();
            System.out.printf("%s - Valor Inicial: R$ %.2f | Valor Final: R$ %.2f%n",
                    tipo, i.getValorInicial(), resultado);
        }
    }
}
