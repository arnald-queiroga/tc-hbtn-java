import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Consulta {
    public static List<Produto> obterLivrosDoPedido(Pedido pedido) {
        Predicate<Produto> catLivro = produto -> produto.getCategoria().equals(CategoriaProduto.LIVRO);

        return pedido.getProdutos().stream().filter(catLivro).collect(Collectors.toList());
    }

    public static Produto obterProdutoMaiorPreco(List<Produto> produtos) {
        return produtos.stream().max(Comparator.comparing(Produto::getPreco)).get();
    }

} 
