package dados;

class Categoria {
    private String nome;
    private Filme[] filmes = new Filme[50];
    private Serie[] series = new Serie[50];
    private int quantFilme = 0;
    private int quantSerie = 0;

    public Categoria() {

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void addFilme(Filme filme) {
        filmes[quantFilme] = filme;
        quantFilme++;
    }

    public void addSerie(Serie serie) {
        series[quantSerie] = serie;
        quantSerie++;
    }

    public Filme[] getFilmes() {
        return filmes;
    }

    public Serie[] getSeries() {
        return series;
    }

    @Override
    public boolean equals(Object obj) {
        Categoria u = new Categoria();

        return u.equals(obj);
    }

    @Override
    public String toString() {
        StringBuffer string = new StringBuffer();
        string.append("Categoria: \n");
        string.append("\tNome: " + nome);
        return string.toString();
    }

}
