package br.com.alura.screenmatch.atividades;

public class ConversorMoedas implements ConversaoFinanceira {

    @Override
    public float converterDolarParaReal(float dolar) {
        return (float) (dolar * 5.89);
    }
}
