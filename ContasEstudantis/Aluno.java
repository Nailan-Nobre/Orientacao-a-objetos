package ContasEstudantis;

public class Aluno {

    private final String matricula;
    private String nome;
    private String email;

    public Aluno(String nome, String matricula, String email) {
        this.nome = nome;
        this.matricula = matricula;
        this.email = email;
    }

    public String getMatricula() { return matricula; }
    public String getNome()      { return nome; }
    public String getEmail()     { return email; }

    public void setNome(String nome)   { this.nome = nome; }
    public void setEmail(String email) { this.email = email; }

    public void exibirPerfil() {
        System.out.println("Nome: "      + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Email: "     + email);
    }
}