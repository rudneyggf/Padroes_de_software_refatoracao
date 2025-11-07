package questoes.questao8;

import java.util.List;

public class Livro implements ConteudoLeitura {

    private String nomeNacional;
    private int ano;
    private List<String> autores;
    private int edicao;
    private String cidade;
    private String editora;
    private String nomeOriginal;
    private List<String> tradutores;
    private int paginas;
    private long isbn;

    Livro(LivroBuilder livroBuilder) {
        this.nomeNacional = livroBuilder.getNomeNacional();
        this.ano = livroBuilder.getAno();
        this.autores = livroBuilder.getAutores();
        this.edicao = livroBuilder.getEdicao();
        this.cidade = livroBuilder.getCidade();
        this.editora = livroBuilder.getEditora();
        this.nomeOriginal = livroBuilder.getNomeOriginal();
        this.tradutores = livroBuilder.getTradutores();
        this.paginas = livroBuilder.getPaginas();
        this.isbn = livroBuilder.getIsbn();
    }

    @Override
    public void ler() {
        System.out.println("Estou lendo o livro" + nomeNacional);
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nomeNacional='" + nomeNacional + '\'' +
                ", ano=" + ano +
                ", autores=" + autores +
                ", edicao=" + edicao +
                ", cidade='" + cidade + '\'' +
                ", editora='" + editora + '\'' +
                ", nomeOriginal='" + nomeOriginal + '\'' +
                ", tradutores=" + tradutores +
                ", paginas=" + paginas +
                ", isbn=" + isbn +
                '}';
    }
}
