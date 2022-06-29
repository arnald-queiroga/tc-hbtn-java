import java.util.ArrayList;
import java.util.HashMap;

public class ListaTelefonica {
    HashMap<String, ArrayList<Telefone>> telefones;

    public ListaTelefonica() {
        telefones = new HashMap<>();
    }

    public void adicionarTelefone(String nome, Telefone telefone){
        // Busca a lista atual de telefones vinculado ao nome
        ArrayList<Telefone> lista = telefones.get(nome); // Busca a lista que está vinculada ao nome

        // Se lista estiver vazia, cria nova lista na memória
        if (lista == null){
            lista = new ArrayList<Telefone>(); // Não tem, cria uma

        }

        // Independente se existir ou não, add o novo tel na lista
        lista.add(telefone); // Depois add esse tel na lista

        // add o tel no Map
        telefones.put(nome, lista);
    }

    public ArrayList<Telefone> buscar(String nome) {{
        return  telefones.get(nome);
    }

    }
} 

