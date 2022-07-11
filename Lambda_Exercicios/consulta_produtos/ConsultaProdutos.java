import java.util.ArrayList;
import java.util.List;

public class ConsultaProdutos {

    public static List<Produto> filtrar(List<Produto> produtos, CriterioFiltro criterioFiltro) {
        ArrayList<Produto> lista = new ArrayList<>();

        produtos.forEach(produto -> {
            if (criterioFiltro.testar(produto)){
                lista.add(produto);
            }
        });

        return lista;
    }
} 

