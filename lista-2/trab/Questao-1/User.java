package dados;

class User {
    private String nome;
    private int cpf;
    private String email;

    public User() {

    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getCpf() {
        return cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public boolean equals(Object obj) {
        User u = new User();

        return u.equals(obj);
    }

    @Override
    public String toString() {
        StringBuffer string = new StringBuffer();
        string.append("Usuário: \n");
        string.append("\tNome: " + nome + "Cpf: " + String.valueOf(cpf) + " Email" + email);
        return string.toString();
    }

}