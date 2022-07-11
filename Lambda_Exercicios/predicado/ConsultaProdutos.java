import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ConsultaProdutos {

    public static List<Produto> filtrar(List<Produto> produtos, Predicate<Produto> predicado) {
        ArrayList<Produto> lista = new ArrayList<>();

        produtos.forEach(produto -> {
            if (predicado.test(produto)){
                lista.add(produto);
            }
        });

        return lista;
    }
} 
