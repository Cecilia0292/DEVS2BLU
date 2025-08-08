package Exercicio3;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Retangulo retangulo = new Retangulo(4.5, 6.7);
        System.out.println("A área do retangulo é: " + retangulo.calcularArea());
        Triangulo triangulo = new Triangulo(5.7, 9.8);
        System.out.println("A área do retangulo é: " +triangulo.calcularArea());
    }
}