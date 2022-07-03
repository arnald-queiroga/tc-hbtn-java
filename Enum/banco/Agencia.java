import java.util.ArrayList;
import java.util.Iterator;

public class Agencia {
    private String nome;
    private ArrayList<Cliente> clientes;

    public Agencia(String nome) {
        this.nome = nome;
        this.clientes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public Cliente buscarCliente(String nomeCliente) {
        Iterator<Cliente> iterador = clientes.iterator();
        while (iterador.hasNext()) {
            Cliente cliente = iterador.next();
            if (cliente.getNome().equals(nomeCliente))
                return cliente;
        }
        return null;
    }

    public boolean novoCliente(String nomeCliente, double valorTransacaoInicial) {
        if (buscarCliente(nomeCliente) == null)
            return this.clientes.add(new Cliente(nomeCliente, valorTransacaoInicial));
        return false;
    }

    public boolean adicionarTransacaoCliente(String nomeCliente, double novaTransacao) {
        if (buscarCliente(nomeCliente) == null)
            return false;

        Cliente cliente = buscarCliente(nomeCliente);
        cliente.adicionarTransacao(novaTransacao);
        return true;
    }
} 
