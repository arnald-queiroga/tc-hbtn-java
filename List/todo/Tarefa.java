public class Tarefa {
    private String descricao;
    private boolean estahFeita;
    private int identificador;

    public Tarefa(String descricao, int identificador) {
        this.descricao = descricao;
        this.identificador = identificador;
    }

    public String modificarDescricao(String descricao) throws Exception {
        return setDescricao(descricao);
    }

    public String setDescricao(String descricao) throws Exception {
        if (descricao.isEmpty()){
            throw new Exception("Descricao de tarefa invalida");
        } this.descricao = descricao;
        return descricao;
    }

    public String getDescricao() {
        return descricao;
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

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }


} 

