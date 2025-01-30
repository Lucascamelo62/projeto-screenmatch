package br.com.alura.screenmatch.atividades;

public class Produto {
    private String nomeProduto;
    private double precoProduto;

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }

    public double aplicarDesconto(double descontoPercentual) {
        return this.precoProduto - (this.precoProduto * (descontoPercentual/100));
    }
}
