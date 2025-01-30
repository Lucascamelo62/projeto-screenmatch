import br.com.alura.screenmatch.calculadora.CalculadoraDeTempo;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Filme filme = new Filme(); //Instanciando o objeto filme
        Serie serie = new Serie(); //Instanciando o objeto Serie
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo(); //Instanciando o objeto calculadora

        //Atribuindo valores ao objeto br.com.alura.screenmatch.modelos.Filme, por meio da instância
        filme.setNome("As branquelas");
        filme.setAnoLancamento(2012);
        filme.avaliaFilme(7);
        filme.avaliaFilme(3);
        filme.avaliaFilme(4);
        filme.setDuracaoMinuto(100);
        filme.exibeInformacao();
        System.out.println(filme.getTotalDeAvaliacao());
        System.out.println(filme.calculaMediaAvaliacao());

        serie.setNome("Lost");
        serie.setTemporadas(10);
        serie.setMinutosPorTemporada(50);
        serie.setEpisodiosPorTemporada(10);
        System.out.println(serie.getDuracaoMinuto());
        serie.exibeInformacao();
        calculadora.inclui(filme);
        calculadora.inclui(serie);
        System.out.println(calculadora.getTempoTotal());
    }
}