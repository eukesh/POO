package dados;

class Serie {
    private String nome;
    private String lancamento;
    private String duracao;
    private int temporadas;
    private Ator[] elenco = new Ator[50];
    private int quantElenco = 0;
    private Categoria categoria = new Categoria();

    public Serie() {

    }

    public void setTemopradas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getTemopradas() {
        return temporadas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setLancamento(String lancamento) {
        this.lancamento = lancamento;
    }

    public String getLancamento() {
        return lancamento;
    }

    public void setElenco(Ator ator) {
        elenco[quantElenco] = ator;
        quantElenco++;
    }

    public Ator[] getElenco() {
        return elenco;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    @Override
    public boolean equals(Object obj) {
        Serie u = new Serie();

        return u.equals(obj);
    }

    @Override
    public String toString() {
        StringBuffer string = new StringBuffer();
        string.append("Serie: \n");
        string.append("\tNome: " + nome + "Lançamento: " + lancamento + "Duração: " + duracao + "Categoria: "
                + categoria + "Temporadas: " + temporadas);
        return string.toString();
    }
}