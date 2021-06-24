package dados;

public class Questao_2 {

    public static void main(String[] args) {
        User user = new User();
        user.setCpf(32131);
        user.setNome("Carlos");
        user.setEmail("Carlos@gmail.com");
        User user2 = new User();
        user2.setCpf(342423);
        user2.setNome("Eduardo");
        user2.setEmail("Eduardo@gmail.com");

        Ator ator1 = new Ator();
        ator1.setNome("Tom Cruise");
        ator1.setIdade(58);
        ator1.setId(23423);
        Ator ator2 = new Ator();
        ator2.setNome("Robert De Niro");
        ator2.setIdade(77);
        ator2.setId(32242);

        Filme filme1 = new Filme();
        filme1.setNome("Velozes e Furiosos");
        filme1.setLancamento("22/05/2006");
        filme1.setDuracao("1:38");
        filme1.setElenco(ator1);
        filme1.setElenco(ator2);
        Filme filme2 = new Filme();
        filme2.setNome("Sexto Sentido");
        filme2.setLancamento("22/05/2004");
        filme2.setDuracao("1:48");
        filme2.setElenco(ator1);

        Serie serie1 = new Serie();
        serie1.setNome("Friends");
        serie1.setLancamento("12/08/2002");
        serie1.setDuracao("49 min");
        serie1.setTemopradas(12);
        serie1.setElenco(ator1);
        serie1.setElenco(ator2);

        Serie serie2 = new Serie();
        serie2.setNome("Walking Dead");
        serie2.setLancamento("12/08/2012");
        serie2.setDuracao("49 min");
        serie2.setTemopradas(22);
        serie2.setElenco(ator1);
        serie2.setElenco(ator2);

        Categoria categoria1 = new Categoria();
        categoria1.setNome("Ação");
        categoria1.addFilme(filme1);
        categoria1.addSerie(serie1);

        Categoria categoria2 = new Categoria();
        categoria2.setNome("Drama");
        categoria2.addFilme(filme2);
        categoria2.addSerie(serie2);

    }

}
