import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Blog {

    private List<Post> posts = new ArrayList<>();

    public Blog() {

    }

    public Set<Autor> obterTodosAutores() {
        Set<Autor> listaAutores = new TreeSet<>();

        posts.forEach(post -> {
            Autor autorTemp = post.getAutor();
            listaAutores.add(autorTemp);
        });

        return listaAutores;
    }

    public Map<Categorias, Integer> obterContagemPorCategoria() {
        Map<Categorias, Integer> listaMapCategorias = new TreeMap<Categorias, Integer>();

        int total = 0;

        for (int i = 0; i < posts.size(); i++) {
            for (int j = 0; j < posts.size(); j++) {
                if (posts.get(i).getCategoria().equals(posts.get(j).getCategoria())) {
                    total++;
                }
            }
            listaMapCategorias.put(posts.get(i).getCategoria(), total);
            total = 0;
        }
        return listaMapCategorias;
    }

    public void adicionarPostagem(Post postagem) {

        for (Post post : posts) {
            if (post.getAutor().equals(postagem.getAutor()) && post.getTitulo().contains(postagem.getTitulo())) {
                throw new IllegalArgumentException("Postagem jah existente");
            }
        }
        posts.add(postagem);
    }

    public Set<Post> obterPostsPorAutor(Autor autor) {
        Set<Post> postagemSetAutor = new TreeSet<>();
        posts.sort(Comparator.comparing(Post::getTitulo));

        posts.forEach(post -> {
            if (post.getAutor().equals(autor)) {
                postagemSetAutor.add(post);
            }
        });

        return postagemSetAutor;
    }

    public Set<Post> obterPostsPorCategoria(Categorias categoria) {
        Set<Post> listaSetCategoriasPost = new TreeSet<>();
        posts.sort(Comparator.comparing(Post::getTitulo));

        posts.forEach(post -> {
            if (post.getCategoria().equals(categoria)) {
                listaSetCategoriasPost.add(post);
            }
        });

        return listaSetCategoriasPost;
    }

    public Map<Categorias, Set<Post>> obterTodosPostsPorCategorias() {
        Map<Categorias, Set<Post>> listaObterTodosPosts = new TreeMap<>();
        for (Post post : posts) {
            Set<Post> postagem;
            if (listaObterTodosPosts.containsKey(post.getCategoria())) {
                postagem = listaObterTodosPosts.get(post.getCategoria());
            } else {
                postagem = new TreeSet<>();
            }

            postagem.add(post);
            listaObterTodosPosts.put(post.getCategoria(), postagem);
        }

        return listaObterTodosPosts;

    }

    public Map<Autor, Set<Post>> obterTodosPostsPorAutor() {
        Map<Autor, Set<Post>> listaMapTodosPosts = new TreeMap<>();
        for (Post post : posts) {
            Set<Post> postagem;
            if (listaMapTodosPosts.containsKey(post.getAutor())) {
                postagem = listaMapTodosPosts.get(post.getAutor());
            } else {
                postagem = new TreeSet<>();
            }

            postagem.add(post);
            listaMapTodosPosts.put(post.getAutor(), postagem);
        }

        return listaMapTodosPosts;
    }

} 
