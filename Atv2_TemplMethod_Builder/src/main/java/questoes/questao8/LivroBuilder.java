package questoes.questao8;

import java.util.Arrays;
import java.util.List;

public class LivroBuilder implements ConteudoLeituraBuilder {

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


    public int getAno() {
        return ano;
    }

    public String getNomeNacional() {
        return nomeNacional;
    }

    public List<String> getAutores() {
        return autores;
    }

    public int getEdicao() {
        return edicao;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEditora() {
        return editora;
    }

    public String getNomeOriginal() {
        return nomeOriginal;
    }

    public List<String> getTradutores() {
        return tradutores;
    }

    public int getPaginas() {
        return paginas;
    }

    public long getIsbn() {
        return isbn;
    }

    @Override
    public ConteudoLeituraBuilder constroiNomeNacional(String nomeNacional) {
        this.nomeNacional = nomeNacional;
        return this;
    }

    @Override
    public ConteudoLeituraBuilder constroiAno(int ano) {
        this.ano = ano;
        return  this;
    }

    @Override
    public ConteudoLeituraBuilder constroiAutores(String ...autores) {
        this.autores = Arrays.asList(autores);
        return this;
    }

    @Override
    public ConteudoLeituraBuilder constroiEdicao(int edicao) {
        this.edicao = edicao;
        return this;
    }

    @Override
    public ConteudoLeituraBuilder constroiCidade(String cidade) {
        this.cidade = cidade;
        return  this;
    }

    @Override
    public ConteudoLeituraBuilder constroiEditora(String editora) {
        this.editora = editora;
        return  this;
    }

    @Override
    public ConteudoLeituraBuilder constroiNomeOriginal(String nomeOriginal) {
        this.nomeOriginal = nomeOriginal;
        return  this;
    }

    @Override
    public ConteudoLeituraBuilder constroiTradutores(String... tradutores) {
        this.tradutores = Arrays.asList(tradutores);
        return  this;
    }

    @Override
    public ConteudoLeituraBuilder constroiPaginas(int paginas) {
        this.paginas = paginas;
        return  this;
    }

    @Override
    public ConteudoLeituraBuilder constroiISBN(long isbn) {
        this.isbn = isbn;
        return this;
    }

    @Override
    public Livro build() {
        return new Livro(this);
    }


}
