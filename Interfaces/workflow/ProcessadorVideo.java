import java.util.ArrayList;

public class ProcessadorVideo {
    private ArrayList<CanalNotificacao> canais = new ArrayList<CanalNotificacao>();

    public void registrarCanal(CanalNotificacao valor) {
        this.canais.add(valor);
    }

    public void processar(Video video) {
        for (CanalNotificacao canal : canais){
            canal.notificar(new Mensagem(video.getArquivo() + " - " + video.getFormato(), TipoMensagem.LOG));
        }
    }

} 



