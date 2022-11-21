package repository;


import modelo.Animal;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class AnimalRepository {

    private static List<Animal> animaisCadastrados = new ArrayList<>();
    private static int sequence = 1;

    private void setId(Animal animal) {
        animal.setIdAnimal(sequence);
        animal.getDono().setIdDono(sequence);
        animal.getDono().getEndereco().setIdEnd(sequence);
        sequence ++;
    }

    public void cadastrar(Animal animal){
        setId(animal);

        if (Objects.nonNull(animal) && Objects.nonNull(animal.getDono())) {
            animaisCadastrados.add(animal);
        } else {
            System.err.println("Animal nulo ou sem Dono!");
        }
    }

    public void imprimirAnimaisCadastrados(){
        System.out.println("_____________ ANIMAIS CADASTRADOS _____________");
        for (Animal animal: animaisCadastrados) {
                System.out.println(animal);
        }

        if (animaisCadastrados.isEmpty()){
            System.out.println("_____________ NÃO HÁ ANIMAIS CADASTRADOS _____________");
        }
    }

    public void limparCadastro(){
        System.out.println("_____________ LIMPAR ANIMAIS CADASTRADOS _____________");
        this.animaisCadastrados.clear();
    }

}
