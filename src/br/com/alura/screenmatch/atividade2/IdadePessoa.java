package br.com.alura.screenmatch.atividade2;

public class IdadePessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void verificaIdade() {
        if (this.idade > 18) {
            System.out.println("É maior de idade");
        }
    }
}
