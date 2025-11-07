package questoes.questao8;

public class Main {
    public static void main(String[] args) {
        Livro livro = (Livro) new LivroBuilder()
                .constroiNomeNacional("Java, como programar")
                .constroiAno(2003)
                .constroiAutores("H. M. Deitel", "P. J. Deitel")
                .constroiEdicao(4)
                .constroiCidade("Porto Alegre")
                .constroiEditora("Bookman")
                .constroiNomeOriginal("Java How to Program")
                .constroiTradutores("Carlos Arthur Lang Lisbôa")
                .constroiPaginas(1386)
                .constroiISBN(788536301235L).build();


        System.out.println(livro);
    }
}
