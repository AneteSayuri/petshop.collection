package businessobject;


import modelo.Animal;

import java.util.HashSet;
import java.util.Set;

public class Internacoes {

    private final int NUMERO_MAXIMO_VAGAS = 2;
    private Set<Animal> animaisInternados = new HashSet<>();

    public void internar(Animal animal){
        if (animaisInternados.size() < NUMERO_MAXIMO_VAGAS) {
            animaisInternados.add(animal);
        } else{
            System.err.println("Todas as vagas estão ocupadas." +
                    "\nNúmero máximo de vagas: " + NUMERO_MAXIMO_VAGAS);
        }
    }

    public void mostrarCachorrosInternados(){
        System.out.println("_____________ CACHORROS INTERNADOS _____________");
        for (Animal animal: animaisInternados) {
            System.out.println(animal);
        }
    }

}
