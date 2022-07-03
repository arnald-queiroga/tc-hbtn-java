import java.util.ArrayList;
import java.util.List;

public class Celular {
    ArrayList<Contato> contatos;

    public Celular() {
        this.contatos = new ArrayList<>();
    }

    public ArrayList<Contato> getContatos() {
        return contatos;
    }

    // Método obterPosicaoContato
    public int obterPosicaoContato(String nome) {
        for (int i = 0; i < contatos.size(); i++) {
            if (contatos.get(i).getNome().equals(nome)){
                return i;
            }
        }
        return -1;
    }

    // Método adicionar contato
    public void adicionarContato(Contato contato) {
        if (obterPosicaoContato(contato.getNome()) != -1){
            throw new IllegalArgumentException("Nao foi possivel adicionar contato. Contato jah existente com esse nome");
        }  this.contatos.add(contato);
    }

    public void atualizarContato(Contato contatoAntigo, Contato novoContato) {
        if (obterPosicaoContato(contatoAntigo.getNome()) == -1)
            throw new IllegalArgumentException("Nao foi possivel modificar contato. Contato nao existe");

        if (obterPosicaoContato(novoContato.getNome()) != -1 && !contatoAntigo.getNome().equals(novoContato.getNome()))
            throw new IllegalArgumentException("Nao foi possivel modificar contato. Contato jah existente com esse nome");
        this.contatos.set(obterPosicaoContato(contatoAntigo.getNome()), novoContato);

    }

    // Remover contatos
    public void removerContato(Contato contato) {
        if (obterPosicaoContato(contato.getNome()) != -1)
            this.contatos.remove(obterPosicaoContato(contato.getNome()));
        else {
            throw new IllegalArgumentException("Nao foi possivel remover contato. Contato nao existe");

        }
    }

    // Listar contatos
    public void listarContatos() {
        for (Contato contato : contatos){
            System.out.printf("%s -> %s (%s)%n", contato.getNome(), contato.getNumeroTelefone(), contato.getTipo());
        }
    }
} 

