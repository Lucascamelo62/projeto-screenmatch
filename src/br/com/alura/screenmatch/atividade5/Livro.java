package br.com.alura.screenmatch.atividade5;

public class Livro {
    private String titulo, autor;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void exibirDetalhesLivro() {
        System.out.println("Titulo: " + getTitulo() + "\nAutor: " + getAutor());
    }
}
