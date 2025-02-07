package br.com.alura.screenmatch.atividades;

public class Audio {
    private String titulo;
    private int totaReproducoes, totalCurtidas, classificacao;

    public void curte() {
        this.totalCurtidas++;
    }

    public void reproduz() {
        this.totaReproducoes++;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotaReproducoes() {
        return totaReproducoes;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }
}
