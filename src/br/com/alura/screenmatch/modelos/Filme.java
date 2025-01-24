package br.com.alura.screenmatch.modelos;

public class Filme {
    public String nomeFilme;
    public int anoLancamento, duracaoMinuto;
    private int totalDeAvaliacao;
    boolean incluidoPlano;
    private double somaDasAvaliacoes;

    public int getTotalDeAvaliacao() {
        return totalDeAvaliacao;
    }

    public void avaliaFilme(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacao++;
    }

    public void exibeInformacao() {
        System.out.println("Nome do filme: " + nomeFilme + "\n" + "Ano de Lançamento: " + anoLancamento + "\n" + "Soma das Avaliações: " + somaDasAvaliacoes + "\n" + "Total de Avaliações: " + totalDeAvaliacao);
    }

    public double calculaMediaAvaliacao() {
        return somaDasAvaliacoes / totalDeAvaliacao;
    }
}
