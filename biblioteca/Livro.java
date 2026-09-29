package biblioteca;
public class Livro {

    String titulo;
    String autor;
    boolean disponibilidade;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponibilidade = true;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public boolean getDisponibilidade() {
        return this.disponibilidade;
    }

    public void emprestar() {
        if(this.disponibilidade == false)
            System.out.println("O livro está indisponível.");
        else {
            this.disponibilidade = false;
            System.out.println("Empréstimo realizado.");
        }
    }

    public void devolver() {
        this.disponibilidade = true;
        System.out.println("Livro devolvido com sucesso.");
    }
}