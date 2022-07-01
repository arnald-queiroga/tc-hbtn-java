public class Post {
    private String autor;
    private String titulo;
    private String corpo;
    private String categoria;

    public Post(String autor, String titulo, String corpo, String categoria) {
        this.autor = autor;
        this.titulo = titulo;
        this.corpo = corpo;
        this.categoria = categoria;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setCorpo(String corpo) {
        this.corpo = corpo;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCorpo() {
        return corpo;
    }

    public String getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
        return "[Autores: " + this.autor + " Categoria=: " + this.categoria + "]";
    }
} 
