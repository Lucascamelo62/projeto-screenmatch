import br.com.alura.screenmatch.modelos.Filme;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Filme filme = new Filme(); //Instanciando o objeto filme

        //Atribuindo valores ao objeto br.com.alura.screenmatch.modelos.Filme, por meio da instância
        filme.setNomeFilme("As branquelas");
        filme.setAnoLancamento(2012);
        filme.avaliaFilme(7);
        filme.avaliaFilme(3);
        filme.avaliaFilme(4);
        filme.exibeInformacao();
        System.out.println(filme.getTotalDeAvaliacao());
        System.out.println(filme.calculaMediaAvaliacao());
    }
}