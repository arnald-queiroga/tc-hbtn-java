import java.util.function.Consumer;
import java.util.function.Supplier;

public class Produto {

    private String nome;
    private double preco;

    private double percentualMarkup;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        this.percentualMarkup = 0.1;
    }

    Supplier<Double> precoComMarkup = () -> preco * (1 + percentualMarkup);
    Consumer<Double> atualizarMarkup = valor -> this.percentualMarkup = valor / 100;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPercentualMarkup() {
        return percentualMarkup;
    }

    public void setPercentualMarkup(double percentualMarkup) {
        this.percentualMarkup = percentualMarkup;
    }

    public Supplier<Double> getPrecoComMarkup() {
        return precoComMarkup;
    }

    public void setPrecoComMarkup(Supplier<Double> precoComMarkup) {
        this.precoComMarkup = precoComMarkup;
    }
} 

