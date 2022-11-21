package main;

import businessobject.Internacoes;
import modelo.Cachorro;
import modelo.Dono;
import modelo.Endereco;
import repository.AnimalRepository;

public class TestePetShop {

    public static void main(String[] args){

        Endereco endereco1 = new Endereco();
        endereco1.setRua("Rua A");
        endereco1.setNumero("A1");

        Dono dono1 = new Dono("Caterine", endereco1);
        Cachorro cachorro1 = new Cachorro(dono1);

        Endereco endereco2 = new Endereco();
        endereco2.setRua("Rua B");
        endereco2.setNumero("B2");

        Dono dono2 = new Dono("Maria", endereco2);
        Cachorro cachorro2 = new Cachorro(dono2);
        cachorro2.setEstaDoente(true);

        Endereco endereco3 = new Endereco();
        endereco3.setRua("Rua C");
        endereco3.setNumero("C3");

        Dono dono3 = new Dono("Paula", endereco3);
        Cachorro cachorro3 = new Cachorro(dono3);
        cachorro3.setEstaDoente(true);

        Cachorro cachorro4 = new Cachorro(dono3);

        AnimalRepository repository1 = new AnimalRepository();
        repository1.cadastrar(cachorro1);
        repository1.cadastrar(cachorro2);
        repository1.cadastrar(cachorro3);
        repository1.cadastrar(cachorro4);

        repository1.imprimirAnimaisCadastrados();

        Internacoes internacoes  = new Internacoes();
        internacoes.internar(cachorro1);
        internacoes.internar(cachorro2);
        internacoes.internar(cachorro3);
//        internacoes.internar(cachorro4);

        internacoes.mostrarCachorrosInternados();
    }
}
