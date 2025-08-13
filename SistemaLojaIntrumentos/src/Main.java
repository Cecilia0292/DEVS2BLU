import Controllers.CategoriaController;
import Controllers.InstrumentoController;
import Models.Categoria;
import Models.Produto;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Produto> produtos = new ArrayList<>();
    static ArrayList<Categoria> categorias = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Bem-vindo ao Sistema de Instrumentos 🎶");
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("\n(1) - Instrumentos");
            System.out.println("(2) - Categorias de Instrumentos");
            System.out.println("(0) - Sair");
            System.out.print("Opção: ");
            int op = scan.nextInt();

            if (op == 0) break;

            switch (op) {
                case 1:
                    menuProduto(scan);
                    break;
                case 2:
                    menuCategoria(scan);
                    break;
                default:
                    System.out.println("Entrada inválida");
            }
        }
    }

    public static void menuProduto(Scanner scan) {
        InstrumentoController instrumentoController = new InstrumentoController();

        while (true) {
            System.out.println("\n**** INSTRUMENTOS ****");
            System.out.println("(1) - Novo Instrumento");
            System.out.println("(2) - Ver Instrumentos");
            System.out.println("(3) - Remover Instrumento");
            System.out.println("(0) - Voltar");
            System.out.print("Opção: ");
            int op = scan.nextInt();

            if (op == 0) break;

            switch (op) {
                case 1:
                    if (categorias.isEmpty()) {
                        System.out.println("⚠️ Cadastre uma categoria primeiro.");
                    } else {
                        instrumentoController.cadastrarProduto(produtos, categorias);
                    }
                    break;
                case 2:
                    instrumentoController.mostrarProdutos(produtos);
                    break;
                case 3:
                    instrumentoController.removerProduto(produtos);
                    break;
                default:
                    System.out.println("Entrada inválida");
            }
        }
    }

    public static void menuCategoria(Scanner scan) {
        CategoriaController categoriaController = new CategoriaController();

        while (true) {
            System.out.println("\n**** CATEGORIAS ****");
            System.out.println("(1) - Nova Categoria");
            System.out.println("(2) - Ver Categorias");
            System.out.println("(3) - Remover Categoria");
            System.out.println("(0) - Voltar");
            System.out.print("Opção: ");
            int op = scan.nextInt();

            if (op == 0) break;

            switch (op) {
                case 1:
                    categoriaController.cadastrarCategoria(categorias);
                    break;
                case 2:
                    categoriaController.mostrarCategorias(categorias);
                    break;
                case 3:
                    categoriaController.removerCategoria(categorias);
                    break;
                default:
                    System.out.println("Entrada inválida");
            }
        }
    }
}