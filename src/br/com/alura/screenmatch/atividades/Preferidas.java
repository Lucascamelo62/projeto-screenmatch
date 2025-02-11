package br.com.alura.screenmatch.atividades;

public class Preferidas {
    public void incluirPreferida(Audio audio) {
        if (audio.getClassificacao() > 3) {
            System.out.println("Top");
        } else {
            System.out.println("Paia");
        }
    }
}
