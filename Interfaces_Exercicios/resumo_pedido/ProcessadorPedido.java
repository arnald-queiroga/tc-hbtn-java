import provedores.Frete;
import provedores.ProvedorFrete;

public class ProcessadorPedido {
    private ProvedorFrete provedorFrete;

    public ProcessadorPedido(ProvedorFrete provedorFrete) {
        this.provedorFrete = provedorFrete;
    }

    public ProvedorFrete getProvedorFrete() {
        return provedorFrete;
    }

    public void processar(Pedido pedido) {
        Frete frete = getProvedorFrete().calcularFrete(pedido.getPeso(), pedido.getTotal());
        pedido.setFrete(frete);


    }
} 

