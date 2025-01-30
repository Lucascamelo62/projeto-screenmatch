package br.com.alura.screenmatch.atividade1;

public class Aluno {
    private String nome;
    private double nota;
    private double somaNotas;
    private int qtdProvas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        somaNotas += nota;
        qtdProvas++;
    }

    public double calcularMedia() {
        return somaNotas / qtdProvas;
    }
}
