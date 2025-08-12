package Frete;

public class Main {
    public static  void main(String[]args){
        System.out.println("Bem vindo ao Sistema de Fretes e Entregas");

        EntregaNormal entregaNormal = new EntregaNormal(2.00,1.9);
        System.out.println("O valor da entrega normal é : " + entregaNormal.calcularFrete());
        EntregaExpressa entregaExpressa = new EntregaExpressa(4.00,1.9);
        System.out.println("O valor da entrega Expressa é : " + entregaExpressa.calcularFrete());
        EntregaInternacional entregaInternacional = new EntregaInternacional(8.00,1.9);
        System.out.println("O valor da entrega internacional é : " + entregaInternacional.calcularFrete());

    }
}
