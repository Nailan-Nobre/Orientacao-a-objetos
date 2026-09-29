package biblioteca;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Emprestimo {
    Livro livro;
    Leitor leitor;
    Date dataEmprestimo;
  
    public Emprestimo(Livro livro, Leitor leitor) {
        this.livro = livro;
        this.leitor = leitor;
        this.dataEmprestimo = new Date();
        this.livro.emprestar();
    }

    public String ExibirDetalhes() {
        System.out.println("Leitor: " + leitor.getNome());
        System.out.println("Matrícula: " + leitor.getMatricula());
        System.out.println("Livro: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor());
        System.out.println("Data do empréstimo: " + new SimpleDateFormat("dd/MM/yyyy 'às' HH:mm").format(dataEmprestimo));
        return "Detalhes do empréstimo exibidos.";
    }
}
