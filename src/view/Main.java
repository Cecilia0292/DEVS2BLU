package view;
import model.Perfume;
import controller.PerfumeController;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    static ArrayList<Perfume> perfumes = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        menuPerfume(scan);
    }
    public static void menuPerfume(Scanner scan){
        PerfumeController controller = new PerfumeController();
        while(true){
            System.out.println("********* SISTEMA CADASTRO PERFUMES *********");
            System.out.println("(1) - Novo Perfume");
            System.out.println("(2) - Ver todos os Perfumes");
            System.out.println("(3) - Remover Perfume");
            System.out.println("(4) - Ver por Categoria");
            System.out.println("(0) - Sair");
            System.out.print("Escolha uma opção: ");

            int op = -1;
            try {
                op = Integer.parseInt(scan.nextLine());
            }catch (Exception e){
                System.out.println("Opção inválida! Digite um número entre 0 e 4.\n");
                continue;
            }
            System.out.println();
            switch(op){
                case 0 -> {
                    System.out.println("Saindo do sistema...");
                    return;
                }
                case 1 -> controller.cadastrarPerfume(perfumes);
                case 2 -> controller.mostrarPerfumes(perfumes);
                case 3 -> controller.removerPerfume(perfumes);
                case 4 -> controller.filtrarPorCategoria(perfumes);
                default -> System.out.println("Opção inválida. Digite um número entre 0 e 4.\n");
            }
        }
    }
}