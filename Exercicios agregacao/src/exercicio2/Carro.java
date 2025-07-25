package exercicio2;

public class Carro {
    private String modelo;
    private Motor motor; //Agregação
    private Fabricante fabricante;

    public Carro(String modelo, Motor motor, Fabricante fabricante){
        this.modelo = modelo;
        this.motor = motor;
        this.fabricante = fabricante;
    }
    public void exibirCarro(){
        System.out.println("Modelo:"+modelo);
        System.out.println("Motor:"+motor.getDescricao());
        System.out.println("Fabricante:"+ fabricante.getMarca());
    }
    public void trocarMotor(Motor novoMotor){
        this.motor = novoMotor;
        System.out.println("Motor substituido com sucesso!");
    }
}
