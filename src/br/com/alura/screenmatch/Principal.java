package br.com.alura.screenmatch;

import br.com.alura.screenmatch.atividades.CalculadoraSalaRetangular;
import br.com.alura.screenmatch.atividades.ConversorMoedas;
import br.com.alura.screenmatch.atividades.TabuadaMultiplicacao;

public class Principal {
    public static void main(String[] args) {
        TabuadaMultiplicacao tabuada = new TabuadaMultiplicacao();
        tabuada.mostrarTabuada(2);
    }
}
