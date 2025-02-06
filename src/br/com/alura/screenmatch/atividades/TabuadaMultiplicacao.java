package br.com.alura.screenmatch.atividades;

public class TabuadaMultiplicacao implements Tabuada {
    @Override
    public void mostrarTabuada(int numero) {
        for (int i = 1; i <= 9; i++) {
            System.out.println("Tabuada do " + numero + ": " + numero * i);
        }
    }
}
