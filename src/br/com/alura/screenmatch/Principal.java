package br.com.alura.screenmatch;

import br.com.alura.screenmatch.atividades.*;

public class Principal {
    public static void main(String[] args) {
        Podcasts pod = new Podcasts();
        Musicas musica = new Musicas();
        Preferidas preferida = new Preferidas();

        pod.calculoTotalReproducao(500);
        musica.calculoTotalCurtidas(500);
        System.out.println(pod.getClassificacao());
        System.out.println(musica.getClassificacao());
        preferida.incluirPreferida(pod);
        preferida.incluirPreferida(musica);
    }
}
