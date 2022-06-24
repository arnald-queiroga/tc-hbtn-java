import exceptions.AutorInvalidoException;
import exceptions.LivroInvalidoException;

public class LivroEdicaoOuro extends Livro{
    private double preco;

    public LivroEdicaoOuro(String titulo, String autor, double preco) throws AutorInvalidoException, LivroInvalidoException {
        super(titulo, autor, preco + (preco * 0.30));
    }

    @Override
    public double getPreco() {
        return super.getPreco();
    }
} 
