import java.util.ArrayList;

public class Biblioteca<T extends Midia> {

    private ArrayList<T> list;

    public Biblioteca() {
        this.list = new ArrayList<>();
    }

    public void adicionarMidia(T livro) {
        obterListaMidias().add(livro);
    }


    public ArrayList<T> obterListaMidias() {
        return list;
    }
} 

