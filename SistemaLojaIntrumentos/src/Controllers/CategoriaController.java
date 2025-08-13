package Controllers;

import Models.Categoria;

import java.util.ArrayList;
import java.util.Scanner;

public class CategoriaController {
    Scanner scan = new Scanner(System.in);
    public void cadastrarCategoria(ArrayList<Categoria> Categorias){

        System.out.println("Nome: ");
        String nome = scan.next();

        Categorias.add(new Categoria(nome));
    }

    public void mostrarCategorias(ArrayList<Categoria> Categorias){
        for (var Categoria : Categorias){
            System.out.println(Categoria.getId()+" - "+Categoria.getNome());
        }
    }
    public void removerCategoria(ArrayList<Categoria> Categorias){
        System.out.println("*** REMOVER ***");
        mostrarCategorias(Categorias);
        System.out.print("Id: ");
        int id =  scan.nextInt();

        if(Categorias.removeIf( Categoria -> Categoria.getId() == id ) ){
            System.out.println("Categoria excluida com sucesso");
        }else {
            System.out.println("Categoria nao encontrada");
        }

    }
    public Categoria escolherCategoriaPorId(ArrayList<Categoria> categorias){
        System.out.println("Escolha a categoria: ");

        mostrarCategorias(categorias);

        System.out.print("Id: ");
        int idCategoria = scan.nextInt();

        for (var categoria: categorias){
            if(categoria.getId() == idCategoria){
                return categoria;
            }
        }

        return null;
    }

}
