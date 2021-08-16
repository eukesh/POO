package model;

public enum Qualidade {
    p240(240),p360(360),p720(720),p1024(1024);

    private final int a;

    Qualidade(int a) {
        this.a = a;
    }
    public int get() {
        return this.a;
    }

}
