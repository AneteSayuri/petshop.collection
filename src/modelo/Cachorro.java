package modelo;


import enumeracao.EnumRacaCachorro;

public class Cachorro extends Animal{

    private EnumRacaCachorro raca;

    public Cachorro(Dono dono) {
        super(dono);
    }


    public EnumRacaCachorro getRaca() {
        return raca;
    }

    public void setRaca(EnumRacaCachorro raca) {
        this.raca = raca;
    }

    @Override
    public String toString() {
        return super.toString() +
                " Cachorro {" +
                "Raca = " + raca +
                '}';
    }

}
