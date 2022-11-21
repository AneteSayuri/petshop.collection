package modelo;

import enumeracao.EnumTipoAnimal;

public abstract class Animal {

    private int idAnimal;
    private EnumTipoAnimal tipoAnimal;
    private String nomeAnimal;
    private int idade;
    private boolean estaDoente;
    private Dono dono;

    public Animal(Dono dono) {
        this.dono = dono;
    }


    public int getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(int idAnimal) {
        this.idAnimal = idAnimal;
    }

    public EnumTipoAnimal getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(EnumTipoAnimal tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public String getNomeAnimal() {
        return nomeAnimal;
    }

    public void setNomeAnimal(String nomeAnimal) {
        this.nomeAnimal = nomeAnimal;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if(idade < 0){
            System.err.println("O Animal ainda não nasceu.");
        } else if(idade > 20) {
            System.err.println("Informar idade inferior a 20 anos.");
        } else {
            this.idade = idade;
        }
    }

    public boolean isEstaDoente() {
        return estaDoente;
    }

    public void setEstaDoente(boolean estaDoente) {
        this.estaDoente = estaDoente;
    }

    public Dono getDono() {
        return dono;
    }

    public void setDono(Dono dono) {
        this.dono = dono;
    }


    @Override
    public String toString() {
        return "Animal {" +
                "ID Animal = " + idAnimal +
                ", Tipo = " + tipoAnimal +
                ", Nome Animal = '" + nomeAnimal + '\'' +
                ",Idade = " + idade +
                ", Esta Doente = " + estaDoente +
                ", " + dono +
                '}';
    }
}
