package br.com.alura.screenmatch.calculadora;

public class FiltroRecomendacao {

    public void filtrarRecomendacao(Classificavel classificacao) {
        if (classificacao.getClassificacao() >= 4) {
            System.out.println("Titulo excelente");
        } else if (classificacao.getClassificacao() >= 2) {
            System.out.println("Titulo bom");
        } else {
            System.out.println("Não assistir");
        }
    }
}
