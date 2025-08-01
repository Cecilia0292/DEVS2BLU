package model;

import java.util.Random;

public class Perfume {
    private int id;
    private String nome;
    private double preco;
    private String categoria;
    private Marca marca;

    //construtor
    public Perfume(String nome, double preco, String categoria, Marca marca, int id) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
        this.marca = marca;
    }
    //Metodos getters
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getCategoria() {
        return categoria;
    }
    public Marca getMarca() {
        return marca;
    }
    // setters opcionais
}
