import produtos.Produto;

public class Pedido{
    private double percentualDesconto;
    private ItemPedido[] itens;

    public Pedido(double percentualDesconto, ItemPedido[] itens) {
        this.percentualDesconto = percentualDesconto;
        this.itens = itens;
    }

    public double calcularTotal(){
        double valorSomaPedido = 0.0;
        for (ItemPedido pedido : itens){
            valorSomaPedido += (1.0 - percentualDesconto/100.0) * (pedido.getQuantidade() * pedido.getProduto().obterPrecoLiquido());
        } return valorSomaPedido;
    }

    public void apresentarResumoPedido(){
        System.out.println("------- RESUMO PEDIDO -------");
        double calculaTotalPedido = 0.0;
        double descontoGeral = 0.0;

        for (ItemPedido pedido : itens){
            System.out.printf("Tipo: %s  Titulo: %s  Preco: %,.2f  Quant: %d  Total: %,.2f\n",
                    pedido.getProduto().getClass().getSimpleName(), pedido.getProduto().getTitulo(), pedido.getProduto().obterPrecoLiquido(),
                    pedido.getQuantidade(), pedido.getQuantidade() * pedido.getProduto().obterPrecoLiquido());

            descontoGeral += (percentualDesconto/100) * (pedido.getQuantidade() * pedido.getProduto().obterPrecoLiquido());
            calculaTotalPedido += pedido.getQuantidade() * pedido.getProduto().obterPrecoLiquido();

        }
        System.out.println("----------------------------");
        System.out.printf("DESCONTO: %,.2f\n", descontoGeral);
        System.out.printf("TOTAL PRODUTOS: %,.2f\n", calculaTotalPedido);
        System.out.println("----------------------------");
        System.out.printf("TOTAL PEDIDO: %,.2f\n", calcularTotal());
        System.out.println("----------------------------");
    }



    public double getPercentualDesconto() {
        return percentualDesconto;
    }

    public void setPercentualDesconto(double percentualDesconto) {
        this.percentualDesconto = percentualDesconto;
    }

    public ItemPedido[] getItens() {
        return itens;
    }

    public void setItens(ItemPedido[] itens) {
        this.itens = itens;
    }

} 


