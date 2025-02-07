package br.com.alura.screenmatch.atividades;

public class Musicas extends Audio implements CalculoClassificacao {
    private String album, artista, genero;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public void calculoTotalCurtidas(int totalCurtidas) {
        for (int i = 0; i < totalCurtidas; i++) {
            curte();
        }
    }

    @Override
    public void calculoTotalReproducao(int totalReproducao) {
        for (int i = 0; i < totalReproducao; i++) {
            reproduz();
        }
    }

    @Override
    public int getClassificacao() {
        if (getTotalCurtidas() > 100) {
            return 5;
        } else if (getTotalCurtidas() > 50) {
            return 2;
        } else {
            return 1;
        }
    }
}
