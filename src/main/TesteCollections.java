package main;

import modelo.Cachorro;
import modelo.Dono;
import modelo.Endereco;

import java.util.*;

public class TesteCollections {

    public static void main(String[] args) {

        List<Cachorro> listaCachorros = new LinkedList<>();

        listaCachorros.add(criarCachorro());
        listaCachorros.add(criarCachorro());
        listaCachorros.add(criarCachorro());

        for (Cachorro dog: listaCachorros) {
            System.out.println(dog);
        }

        for (int i = 0; i < 10; i++) {
            listaCachorros.add(criarCachorro());
        }

        System.out.println("Quantidade de cachorros inseridos: " + listaCachorros.size());

        System.out.println("Lista de cachorros está vazia: " + listaCachorros.isEmpty());

        System.out.println("O 3rd cachorro da lista é o: " + listaCachorros.get(2));

        System.out.println("Removendo o 3rd cachorro da lista...");
        listaCachorros.remove(2);
        System.out.println("Quantidade de cachorros na lista: " + listaCachorros.size());

        System.out.println("Limpando toda a lista...");
        listaCachorros.clear();
        System.out.println("Quantidade de cachorros na lista: " + listaCachorros.size());

    }

    public static Cachorro criarCachorro(){
        Endereco endereco = new Endereco();
        Dono dono = new Dono("Nome_do_Dono", endereco);
        Cachorro cachorro = new Cachorro(dono);
        return cachorro;
    }
}


