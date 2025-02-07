package br.com.alura.screenmatch.atividades;

public class Podcasts extends Audio implements CalculoClassificacao {
    private String host, descricao;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
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
        if (getTotaReproducoes() > 500) {
            return 5;
        } else if (getTotaReproducoes() > 100) {
            return 2;
        } else {
            return 1;
        }
    }
}
