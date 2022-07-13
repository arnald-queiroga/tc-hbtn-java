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

    public static List<Produto> obterProdutosPorPrecoMinimo(List<Produto> produtos, int precoMinimo) {
        return produtos.stream()
                .filter(produto -> produto.getPreco() >= precoMinimo)
                .collect(Collectors.toList());
    }

    public static List<Pedido> obterPedidosComEletronicos(List<Pedido> pedidos) {
        Predicate<Produto> listaProduto = prod -> prod.getCategoria().equals(CategoriaProduto.ELETRONICO);

        return pedidos.stream()
                .filter(pedido -> pedido.getProdutos()
                        .stream()
                        .anyMatch(listaProduto)).collect(Collectors.toList());
    }
} 
