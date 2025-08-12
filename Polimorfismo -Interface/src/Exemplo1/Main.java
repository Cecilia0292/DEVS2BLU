package Exemplo1;

import java.util.ArrayList;

public class Main {
    public static  void main(String[]args){
        System.out.println("Hello and Welcome");
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Gato("Mini", "branco","Curta"));
        animals.add(new Peixe("Nemo","Laranja"));

        for (Animal animal: animals){
            animal.emitirSom();
        }
    }
}
