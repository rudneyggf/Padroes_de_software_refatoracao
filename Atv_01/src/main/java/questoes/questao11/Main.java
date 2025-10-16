package questoes.questao11;

public class Main {
    public static void main(String[] args) {
        Chefe chefe = new Chefe("Arnaldo");
        Funcionario funcionario = new Funcionario("Bruno");
        Estagiario estagiario = new Estagiario("Carlos");

        PagadordeFuncionario p = new PagadordeFuncionario();

        p.pagar(chefe);
        p.pagar(funcionario);
        p.pagar(estagiario);
    }
}
