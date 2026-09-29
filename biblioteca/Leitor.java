package biblioteca;
public class Leitor {
    String nome;
    String matricula;

    public Leitor(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return this.nome;
    }

    public String getMatricula() {
        return this.matricula;
    }
}
