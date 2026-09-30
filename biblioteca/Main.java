package biblioteca;

public class Main {
    public static void main (String[] args) {

        Leitor leitor = new Leitor("João", "12345");

        Livro livro = new Livro("1984", "Orwell");

        Emprestimo emprestimo = new Emprestimo(livro, leitor);

        emprestimo.ExibirDetalhes();

    }
}