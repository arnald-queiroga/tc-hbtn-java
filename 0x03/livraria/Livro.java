import exceptions.*;

public class Livro {
    private String titulo;
    private String autor;
    private double preco;

    public Livro(String titulo, String autor, double preco) throws AutorInvalidoException, LivroInvalidoException {
        setTitulo(titulo);
        setAutor(autor);
        setPreco(preco);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) throws AutorInvalidoException {

        if(titulo.length() >= 3){
            this.titulo = titulo;

        } else {
            throw new AutorInvalidoException("Titulo de livro invalido");
        }

    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) throws AutorInvalidoException{
        String[] nomeAutor = autor.split("\\s+");
        if (nomeAutor.length < 2 ){
            throw new AutorInvalidoException("Nome de autor invalido");

        } this.autor = autor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) throws LivroInvalidoException{

        if (preco > 0) {
            this.preco = preco;
        }
        else {
            throw new LivroInvalidoException("Preco de livro invalido");
        }

    }
} 
