import java.util.ArrayList;
import java.util.Iterator;

public class Banco {
    private String nome;
    private ArrayList<Agencia> agencias;

    public Banco(String nome) {
        this.nome = nome;
        this.agencias = new ArrayList<>();
    }

    public Agencia buscarAgencia(String nomeAgencia) {
        Iterator<Agencia> agenciaIterator = agencias.iterator();
        while (agenciaIterator.hasNext()) {
            Agencia agencia = agenciaIterator.next();
            if (agencia.getNome().equals(nomeAgencia))
                return agencia;
        }
        return null;
    }

    public boolean adicionarAgencia(String nomeAgencia) {
        if (buscarAgencia(nomeAgencia) == null)
            return this.agencias.add(new Agencia(nomeAgencia));
        return false;
    }

    public boolean adicionarCliente(String nomeAgencia, String nomeCliente, double transacao) {
        if (buscarAgencia(nomeAgencia) != null) {
            for (Agencia agency : agencias) {
                if (agency.buscarCliente(nomeCliente) == null)
                    return agency.novoCliente(nomeCliente, transacao);
            }
        }
        return false;
    }

    public boolean adicionarTransacaoCliente(String nomeAgencia, String nomeCliente, double transcacao) {
        if (buscarAgencia(nomeAgencia) != null) {
            for (Agencia agency : agencias) {
                if (agency.buscarCliente(nomeCliente) != null)
                    return agency.adicionarTransacaoCliente(agency.buscarCliente(nomeCliente).getNome(), transcacao);
            }
        }
        return false;
    }

    public boolean listarClientes(String nomeAgencia, boolean imprimirTransacao) {
        if (buscarAgencia(nomeAgencia) == null)
            return false;
        else {
            Agencia agency = buscarAgencia(nomeAgencia);

            if (!imprimirTransacao) {
                for (int i = 0; i < agency.getClientes().size(); i++) {
                    System.out.printf("Cliente: %s [%d]\n", agency.getClientes().get(i).getNome(), i + 1);
                }
            } else {
                for (int i = 0; i < agency.getClientes().size(); i++) {
                    System.out.printf("Cliente: %s [%d]\n", agency.getClientes().get(i).getNome(), i + 1);

                    for (int j = 0; j < agency.getClientes().get(i).getTransacoes().size(); j++) {
                        System.out.printf("  [%d] valor %.2f\n", j + 1, agency.getClientes().get(i).getTransacoes().get(j));
                    }
                }
            }
            return true;
        }
    }
} 
