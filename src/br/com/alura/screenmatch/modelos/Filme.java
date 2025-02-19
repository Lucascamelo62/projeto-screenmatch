package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculadora.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretorFilme;

    public Filme(String nome, int anoLancameto) {
        super(nome, anoLancameto);
    }

    public String getDiretorFilme() {
        return diretorFilme;
    }

    public void setDiretorFilme(String diretorFilme) {
        this.diretorFilme = diretorFilme;
    }

    @Override
    public int getClassificacao() {
        return (int) calculaMediaAvaliacao() / 2;
    }

    @Override
    public String toString() {
        return "Filme: " + this.getNome() + "(" + this.getAnoLancamento() + ")";
    }
}
