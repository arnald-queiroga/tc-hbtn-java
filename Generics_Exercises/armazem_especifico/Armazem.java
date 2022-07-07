import java.util.Map;
import java.util.TreeMap;

public abstract class Armazem<Z> implements Armazenavel<Z> {
    private Map<String, Z> itens;

    public Armazem(){
        itens = new TreeMap<>();
    }

    @Override
    public void adicionarAoInventario(String nome, Z valor) {
        itens.put(nome, valor);
    }

    @Override
    public Z obterDoInventario(String nome) {
        return itens.get(nome);
    }
} 


