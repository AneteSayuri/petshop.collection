package modelo;


import enumeracao.EnumRacaGato;

public class Gato extends Animal{

    private EnumRacaGato raca;

    public Gato(Dono dono){
        super(dono);
    }

    public EnumRacaGato getRaca() {
        return raca;
    }

    public void setRaca(EnumRacaGato raca) {
        this.raca = raca;
    }

    @Override
    public String toString() {
        return super.toString() +
                " Gato { " +
                "Raca = " + raca +
                '}';
    }
}
