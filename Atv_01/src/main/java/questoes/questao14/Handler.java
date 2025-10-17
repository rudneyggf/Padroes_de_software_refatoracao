package questoes.questao14;

public interface Handler {
    public void processamento(Pedido pedido);
    public void setProximo(Handler handler);
}
