package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculadora.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculadora.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Filme filme1 = new Filme("As branquelas", 2012); //Instanciando o objeto filme
        Filme filme2 = new Filme("Avatar", 2014);
        Filme filme3 = new Filme("Duro de Matar", 2018);
        Serie serie = new Serie("Lost", 2010); //Instanciando o objeto Serie
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo(); //Instanciando o objeto calculadora
        FiltroRecomendacao filtro = new FiltroRecomendacao();
        Episodio episodio = new Episodio();

        //Atribuindo valores ao objeto br.com.alura.screenmatch.modelos.Filme, por meio da instância
        filme1.avaliaFilme(7);
        filme1.avaliaFilme(3);
        filme1.avaliaFilme(4);
        filme1.setDuracaoMinuto(100);
        filme1.exibeInformacao();
        System.out.println(filme1.getTotalDeAvaliacao());
        System.out.println(filme1.calculaMediaAvaliacao());

        episodio.setTotalAvaliacao(200);

        serie.setTemporadas(10);
        serie.setMinutosPorTemporada(50);
        serie.setEpisodiosPorTemporada(10);
        System.out.println(serie.getDuracaoMinuto());
        serie.exibeInformacao();
        calculadora.inclui(filme1);
        calculadora.inclui(serie);
        System.out.println(calculadora.getTempoTotal());
        filtro.filtrarRecomendacao(filme1);
        filtro.filtrarRecomendacao(episodio);

        ArrayList<Titulo> lista = new ArrayList<>(); //Criando um Array de filmes
        lista.add(filme1);
        lista.add(filme2);
        lista.add(filme3);
        lista.add(serie);
        System.out.println("Quantidade de filmes: " + lista.size());
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        ArrayList<String> lista1 = new ArrayList<>();
        lista1.add("Carlos");
        lista1.add("Apolo");
        lista1.add("Bebeu");
        System.out.println(lista1);
        Collections.sort(lista1);
    }
}