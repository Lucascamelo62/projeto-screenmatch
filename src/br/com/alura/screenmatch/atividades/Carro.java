package br.com.alura.screenmatch.atividades;

public class Carro {
    private String modelo;
    private double precoMedio1, precoMedio2, precoMedio3;

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPrecoMedio(double precoMedio1, double precoMedio2, double precoMedio3) {
        this.precoMedio1 = precoMedio1;
        this.precoMedio2 = precoMedio2;
        this.precoMedio3 = precoMedio3;
    }

    public double calcularMenorPreco() {
        double menorPreco = precoMedio1;

        if (precoMedio2 < precoMedio1) {
            menorPreco = precoMedio2;
        }

        if (precoMedio3 < precoMedio2) {
            menorPreco = precoMedio3;
        }

        return menorPreco;
    }

    public double calcularMaiorPreco() {
        double maiorPreco = precoMedio1;

        if (precoMedio2 > precoMedio1) {
            maiorPreco = precoMedio2;
        }

        if (precoMedio3 > precoMedio2) {
            maiorPreco = precoMedio3;
        }

        return maiorPreco;
    }
}
