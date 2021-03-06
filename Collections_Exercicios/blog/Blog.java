import java.util.*;

public class Blog {
    private List<Post> posts;

    public Blog() {
        posts = new ArrayList<>();
    }
   public void adicionarPostagem(Post post){
        posts.add(post);
   }
    public Set<String> obterTodosAutores() {
        Set<String> autoresEmLista = new TreeSet<>();

        for(Post autor : posts){
            autoresEmLista.add(autor.getAutor());
        }
        return autoresEmLista;
    }
    public Map<String, Integer> obterContagemPorCategoria() {
        Map<String, Integer> listaMapCategoria = new TreeMap<>();
        for (int i = 0; i < posts.size(); i++){
            int total = 0;
            for (int x = 0; x < posts.size(); x++){
                if (posts.get(i).getCategoria().equals(posts.get(x).getCategoria())){
                    total++;
                }
                listaMapCategoria.put(posts.get(i).getCategoria(), total);
            }
        } return listaMapCategoria;
    }

} 
