public class Email implements CanalNotificacao{
    @Override
    public void notificar(Mensagem mensagem) {
        System.out.println("[EMAIL] {"+mensagem.getTipoMensagem().name()+"} - "+mensagem.getTexto());
    }
} 

