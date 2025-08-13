package Models;

import java.util.UUID;

public class Categoria {
    private int id;
    private String nome;
    private static int contadorId;

    public Categoria(String nome) {

        contadorId++;
        this.id = contadorId;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Categoria{" + "id=" + id + ", nome='" + nome + '\'' + '}';
    }
}
