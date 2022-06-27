public class Pedido {
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


