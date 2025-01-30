package br.com.alura.screenmatch.modelos;

public class Titulo {
    private String nome;
    private int anoLancamento, duracaoMinuto, totalDeAvaliacao;
    private boolean incluidoPlano;
    private double somaDasAvaliacoes;

    public int getTotalDeAvaliacao() {
        return totalDeAvaliacao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public void setDuracaoMinuto(int duracaoMinuto) {
        this.duracaoMinuto = duracaoMinuto;
    }

    public int getDuracaoMinuto() {
        return duracaoMinuto;
    }

    public void setIncluidoPlano(boolean incluidoPlano) {
        this.incluidoPlano = incluidoPlano;
    }

    public void avaliaFilme(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacao++;
    }

    public void exibeInformacao() {
        System.out.println("Nome do Titulo: " + nome + "\n" + "Ano de Lançamento: " + anoLancamento + "\n" + "Soma das Avaliações: " + somaDasAvaliacoes + "\n" + "Total de Avaliações: " + totalDeAvaliacao);
    }

    public double calculaMediaAvaliacao() {
        return somaDasAvaliacoes / totalDeAvaliacao;
    }
}
