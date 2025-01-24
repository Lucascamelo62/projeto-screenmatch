public class Filme {
    String nomeFilme;
    int anoLancamento, totalDeAvaliacao, duracaoMinuto;
    boolean incluidoPlano;
    double somaDasAvaliacoes = 0.0;

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
