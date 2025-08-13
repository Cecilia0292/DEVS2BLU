package Controllers;

import Models.Categoria;
import Models.Instrumento;
import Models.Produto;

import java.util.ArrayList;
import java.util.Scanner;

public class InstrumentoController {
    Scanner scan = new Scanner(System.in);
    CategoriaController categoriaController =  new CategoriaController();

    public void cadastrarProduto(ArrayList<Produto> produtos, ArrayList<Categoria> categorias){


        System.out.println("Nome: ");
        String nome = scan.next();

        System.out.println("Preço: ");
        double preco = scan.nextDouble();

        Categoria categoria = categoriaController.escolherCategoriaPorId(categorias);

        if(categoria == null){
            System.out.println("Categoria inválida!");
        }else{
            produtos.add(new Instrumento(nome, preco, categoria));

            System.out.println("Produto Cadastrado com sucesso!");
        }

    }

    public void mostrarProdutos(ArrayList<Produto> produtos){
        if (produtos.isEmpty()) {
            System.out.println("Não há produtos cadastrados.");
        } else {
            for (Produto p : produtos) {
                System.out.println(p.exibirDetalhes());
            }
        }
    }
    public void removerProduto(ArrayList<Produto> produtos){
        System.out.println("*** REMOVER ***");
        mostrarProdutos(produtos);
        System.out.print("Id: ");
        int id =  scan.nextInt();

        if(produtos.removeIf(produto -> produto.getId() == id ) ){
            System.out.println("Produto excluido com sucesso");
        }else {
            System.out.println("Produto nao encontrado");
        }
    }
}
