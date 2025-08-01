package controller;

import model.Marca;
import model.Perfume;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

//logica do sistema
public class PerfumeController {
    Scanner scan = new Scanner(System.in);
    int contador = 0;

    public void cadastrarPerfume(ArrayList<Perfume> perfumes){
        System.out.print("Nome do perfume: ");
        String nome = scan.nextLine();
        //Validacao nome
        while (nome.trim().isEmpty()){
            System.out.println("o nome não pode estar vazio.Digite um nome válido!!");
            nome = scan.nextLine();
        }
        System.out.print("Categoria (ex: Floral, Cítrico, Amadeirado): ");
        String categoria = scan.nextLine();

        System.out.print("Marca: ");
        String nomeMarca = scan.nextLine();

        System.out.print("Preço: ");
        double preco = scan.nextDouble();
        scan.nextLine(); //limpa o enter que ficou no buffer.

        Marca marca = new Marca(nomeMarca);

        perfumes.add(new Perfume(nome, preco, categoria, marca, contador++));
        System.out.println("Perfume cadastrado com sucesso!\n");
    }

    public void mostrarPerfumes(ArrayList<Perfume> perfumes){
        if (perfumes.isEmpty()) {
            System.out.println("Nenhum perfume cadastrado.\n");
            return;
        }

        for (Perfume p : perfumes){
            System.out.println(p.getId() + " - " + p.getNome() + " | R$" + p.getPreco() + " | Categoria: " + p.getCategoria() + " | Marca: " +p.getMarca().getNome());
        }
        System.out.println();
    }

    public void removerPerfume(ArrayList<Perfume> perfumes){
        mostrarPerfumes(perfumes);
        System.out.print("Digite o ID do perfume para remover: ");
        int id = scan.nextInt();

        if(perfumes.removeIf(p -> p.getId() == id)){
            System.out.println("Perfume removido com sucesso!\n");
        } else {
            System.out.println("Perfume não encontrado.\n");
        }
    }

    public void filtrarPorCategoria(ArrayList<Perfume> perfumes){
        System.out.print("Digite a categoria que deseja ver: ");
        String categoria = scan.nextLine();

        boolean encontrou = false;
        for(Perfume p : perfumes){
            if(p.getCategoria().equalsIgnoreCase(categoria)){
                System.out.println(p.getId() + " - " + p.getNome() + " | R$" + p.getPreco());
                encontrou = true;
            }
        }

        if(!encontrou){
            System.out.println("Nenhum perfume encontrado nessa categoria.\n");
        } else {
            System.out.println();
        }
    }
}
