package Exercicio1;

import java.util.Random;

public class Veiculo {
    protected int id;
    protected String marca;
    protected String ano;


    public Veiculo(String marca, String ano) {
        this.id = new Random().nextInt(1000);
        this.marca = marca;
        this.ano = ano;
    }

    public String detalhes() {
        return "Marca: " + marca + ", Ano: " + ano;
    }

    public String getMarca() {
        return marca;
    }

    public String getAno() {
        return ano;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }
}
