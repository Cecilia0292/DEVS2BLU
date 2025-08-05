package Exercicio1;

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Toyota", "2022", "Corolla");
        Aviao aviao1 = new Aviao("Boeing", "2018", "LATAM");
        carro1.detalhes();
        System.out.println(carro1.detalhes());
        System.out.println(aviao1.detalhes());

    }
}
