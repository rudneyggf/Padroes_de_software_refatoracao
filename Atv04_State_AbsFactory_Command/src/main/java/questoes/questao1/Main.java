package questoes.questao1;

public class Main {
    public static void main(String[] args) {
        try{
            Pedido pedido = new Pedido();

            pedido.alterar();
            pedido.cancelar();
            pedido.alterar();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
