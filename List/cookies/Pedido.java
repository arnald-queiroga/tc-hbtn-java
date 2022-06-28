import java.util.ArrayList;

public class Pedido {

    private static ArrayList<PedidoCookie> cookies = new ArrayList<>();

    //Construtor inicializando a lista
    public Pedido() {
        cookies = new ArrayList<>();
    }

    // Adiciona pedido a lista
    public void adicionarPedidoCookie(PedidoCookie pedido) {
        cookies.add(pedido);
    }
    public int obterTotalCaixas() {
        int total = 0;
        for (PedidoCookie pedido : cookies) {
            total += pedido.getQuantidadeCaixas();
        }
        return total;
    }
    public int removerSabor(String sabor){
        int total = 0;
        for (int i = 0; i < cookies.size(); i++) {
            if (cookies.get(i).getSabor().equalsIgnoreCase(sabor)){
                total += cookies.get(i).getQuantidadeCaixas();
                cookies.remove(i);
            }
        }
        return total;
    }


} 

