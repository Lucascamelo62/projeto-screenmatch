package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.atividades.*;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        Pessoa p3 = new Pessoa();

        p1.setNome("Lucas");
        p1.setIdade(30);
        p2.setNome("Bali");
        p2.setIdade(7);
        p3.setNome("Laion");
        p3.setIdade(14);

        ArrayList<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(p1);
        pessoas.add(p2);
        pessoas.add(p3);
        System.out.println("Tamanho do Array: " + pessoas.size());
        System.out.println(pessoas.get(2));
        for (int i = 0; i < pessoas.size(); i++) {
            System.out.println(pessoas.get(i).toString());
        }
    }
}
