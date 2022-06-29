import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListaTodo {
    private List<Tarefa> tarefas;

    public ListaTodo() {
        tarefas = new ArrayList<Tarefa>();
    }

    public  List<Tarefa> getTarefas() {
        return tarefas;
    }

    // Método adicionar tarefa
    public void adicionarTarefa(Tarefa tarefaInserida) throws Exception {
        for (Tarefa tarefa : tarefas) {
            if (tarefaInserida.getDescricao() == null || tarefaInserida.getDescricao().equals(""))
                throw new Exception("Descricao de tarefa invalida");

            if (tarefa.getIdentificador() == tarefaInserida.getIdentificador())
                throw new Exception("Tarefa com identificador " + tarefaInserida.getIdentificador() + " ja existente na lista");
        }
        tarefas.add(tarefaInserida);
    }

    public boolean marcarTarefaFeita(int identificador){
        for (Tarefa tarefa : tarefas){
            if (tarefa.getIdentificador() == identificador){
                tarefa.setEstahFeita(true);
                return true;
            }
        }
        return false;
    }

    public boolean desfazerTarefa(int identificador){
        for (Tarefa tarefa : tarefas){
            if (tarefa.getIdentificador() == identificador){
                tarefa.setEstahFeita(false);
                return true;
            }
        } return false;
    }

    public void fazerTodas() {
        for (Tarefa tarefa: tarefas){
            tarefa.setEstahFeita(true);
        }
    }

    public void desfazerTodas() {
        for (Tarefa tarefa: tarefas){
            tarefa.setEstahFeita(false);
        }

    }

    public void listarTarefas() {
        Iterator<Tarefa> taskIterator = tarefas.iterator();
        while (taskIterator.hasNext()) {
            Tarefa task = taskIterator.next();
            System.out.print("[");
            String marker = task.isEstahFeita() ? "X" : " ";
            System.out.println(marker + "]  Id: " + task.getIdentificador() + " - Descricao: " + task.getDescricao());
        }
    }


} 

