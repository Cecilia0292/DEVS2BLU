package Exercicio1;

public class Carro extends Veiculo{
    private String modelo;

    public Carro(String marca, String ano, String modelo) {
        super(marca, ano);
        this.modelo = modelo;
    }

    @Override
    public String detalhes(){
        return super.detalhes()+ ", Modelo: " + modelo;
    }
}
