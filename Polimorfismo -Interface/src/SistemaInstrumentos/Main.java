package SistemaInstrumentos;

public class Main {
    public static  void main(String[]args){
        System.out.println("Bem vindo ao Sistema de instrumentos");
        Instrumento i;

        i= new Violao("Yamaha C40", "Acustico");
        i.tocar();

        i= new Bateria("Pearl Export", "Acustica");
        i.tocar();

        i= new Piano("Roland FP-30X", "Digital");
        i.tocar();

    }
}
