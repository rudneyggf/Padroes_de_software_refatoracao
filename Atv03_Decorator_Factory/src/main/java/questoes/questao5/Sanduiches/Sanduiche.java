package questoes.questao5.Sanduiches;

public abstract class Sanduiche {
    protected String pao;
    protected String queijo;
    protected String presunto;
    protected String salada;

    public void descreverSanduiche(){
        System.out.println("Este é um sanduiche com 2 fatias de pão "+ pao + ", 1 fatia de queijo "+ queijo
        +" 1 fatia de presunto "+ presunto + " e salada " + salada);
    };

    public Sanduiche(String pao, String queijo, String presunto, String salada) {
        this.pao = pao;
        this.queijo = queijo;
        this.presunto = presunto;
        this.salada = salada;
    }
}
