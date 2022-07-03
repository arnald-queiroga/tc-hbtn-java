import java.util.ArrayList;

public class Cliente {
    private String nome;
    private ArrayList<Double> transacoes;

    public Cliente(String nome, double transacoes) {
        this.nome = nome;
        this.transacoes = new ArrayList<>();
        adicionarTransacao(transacoes);
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Double> getTransacoes() {
        return transacoes;
    }

    public void adicionarTransacao(double transacao) {
        this.transacoes.add(transacao);
    }
} 
