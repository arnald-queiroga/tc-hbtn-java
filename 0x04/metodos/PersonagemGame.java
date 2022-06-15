public class PersonagemGame {
    private int saudeAtual;
    private String nome;

    public boolean tomarDano(int quantidadeDeDano){
        if(this.saudeAtual >= 0){
            this.saudeAtual -= quantidadeDeDano;
            return true;
        }else {
            return false;
        }
    }

    public boolean receberCura(int quantidadeDeCura){
        if (this.saudeAtual <=100){
            this.saudeAtual += quantidadeDeCura;
            return true;
        }else {
            return false;
        }
    }

    public int getSaudeAtual() {
        return saudeAtual;
    }

    public void setSaudeAtual(int saudeAtual) {
        this.saudeAtual = saudeAtual;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
