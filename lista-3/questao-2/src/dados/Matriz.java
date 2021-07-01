package dados;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public class Matriz<T> {
    private int n;
    private int m;

    private T[][] matriz;

    public Matriz(int n, int m) {
        this.n = n;
        this.m = m;
        this.matriz = (T[][]) new Object[n][m];
    }

    public boolean set(T t, int i, int j) {

        if (i > this.n || j > this.m) {
            return false;
        } else {
            matriz[i][j] = t;
            return true;
        }

    }

    public T get(int i, int j) {
        return this.matriz[i][j];
    }

    public List<T> getLinha(int linha) {
        List<T> list = new ArrayList<T>();
        for (int i = 0; i < this.n; i++) {
            list.add(matriz[linha][i]);
        }

        return list;
    }

    public List<T> getColuna(int coluna) {
        List<T> list = new ArrayList<T>();
        for (int i = 0; i < this.m; i++) {
            list.add(matriz[i][coluna]);
        }

        return list;
    }

    public List<T> getElementosQuadrante(Quadrante quadrante) {
        List<T> list = new ArrayList<T>();

        switch (quadrante) {
            case PRIMEIRO:
                int i = (this.n - 1) / 2;
                int j = (this.m - 1) / 2;
                for (int k = 0; k <= i; k++) {
                    for (int k2 = 0; k2 <= j; k2++) {
                        list.add(matriz[k][k2]);
                    }
                }
                break;
            case SEGUNDO:
                if (this.m % 2 == 0) {
                    for (int k = 0; k < n; k++) {
                        for (int k2 = 0; k2 < m; k2++) {
                            if (this.n - k > (this.n + 1) / 2 && this.m - k2 <= (this.m + 1) / 2) {
                                list.add(matriz[k][k2]);
                            }
                        }
                    }
                } else {
                    for (int k = 0; k < n; k++) {
                        for (int k2 = 0; k2 < m; k2++) {
                            if (this.n - k >= (this.n + 1) / 2 && this.m - k2 < (this.m + 1) / 2) {
                                list.add(matriz[k][k2]);
                            }
                        }
                    }
                }

                break;
            case TERCEIRO:
                if (this.m % 2 == 0) {
                    for (int k = 0; k < n; k++) {
                        for (int k2 = 0; k2 < m; k2++) {
                            if (this.n - k <= (this.n + 1) / 2 && this.m - k2 > (this.m + 1) / 2) {
                                list.add(matriz[k][k2]);
                            }
                        }
                    }
                } else {
                    for (int k = 0; k < n; k++) {
                        for (int k2 = 0; k2 < m; k2++) {
                            if (this.n - k < (this.n + 1) / 2 && this.m - k2 >= (this.m + 1) / 2) {
                                list.add(matriz[k][k2]);
                            }
                        }
                    }
                }
                break;
            case QUARTO:
                if (this.m % 2 == 0) {
                    for (int k = 0; k < n; k++) {
                        for (int k2 = 0; k2 < m; k2++) {
                            if (this.n - k <= (this.n + 1) / 2 && this.m - k2 <= (this.m + 1) / 2) {
                                list.add(matriz[k][k2]);
                            }
                        }
                    }
                } else {
                    for (int k = 0; k < n; k++) {
                        for (int k2 = 0; k2 < m; k2++) {
                            if (this.n - k < (this.n + 1) / 2 && this.m - k2 < (this.m + 1) / 2) {
                                list.add(matriz[k][k2]);
                            }
                        }
                    }
                }
                break;
            default:
                break;

        }
        return list;
    }

}
