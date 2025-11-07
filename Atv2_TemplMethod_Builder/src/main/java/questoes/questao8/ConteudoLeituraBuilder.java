package questoes.questao8;

import java.util.List;

public interface ConteudoLeituraBuilder<T> {

    ConteudoLeituraBuilder constroiNomeNacional(String nomeNacional);
    ConteudoLeituraBuilder constroiAno (int ano);
    ConteudoLeituraBuilder constroiAutores (String... autores);
    ConteudoLeituraBuilder constroiEdicao (int edicao);
    ConteudoLeituraBuilder constroiCidade (String cidade);
    ConteudoLeituraBuilder constroiEditora (String editora);
    ConteudoLeituraBuilder constroiNomeOriginal (String nomeOriginal);
    ConteudoLeituraBuilder constroiTradutores (String...tradutores);
    ConteudoLeituraBuilder constroiPaginas (int paginas);
    ConteudoLeituraBuilder constroiISBN(long isbn);
     T build();
}

