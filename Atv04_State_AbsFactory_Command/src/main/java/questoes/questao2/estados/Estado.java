package questoes.questao2.estados;

public interface Estado {
    Estado validar();
    Estado designar();
    Estado cancelar();
    Estado realizarDefericao(Avaliado avaliado);
}
