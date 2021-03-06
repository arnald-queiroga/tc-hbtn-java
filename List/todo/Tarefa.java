public class Tarefa {
    private String descricao;
    private boolean estahFeita;
    private int identificador;

    public Tarefa(String descricao, int identificador) {
        this.descricao = descricao;
        this.identificador = identificador;
    }

    public void modificarDescricao(String descricao) {
        if (descricao == null || descricao.equals("")){
            throw new IllegalArgumentException("Descricao de tarefa invalida");
        } this.descricao = descricao;
    }

    public boolean isEstahFeita() {
        return estahFeita;
    }

    public void setEstahFeita(boolean estahFeita) {
        this.estahFeita = estahFeita;
    }

    public int getIdentificador() {
        return identificador;
    }

    public String getDescricao() {
        return descricao;
    }


} 

