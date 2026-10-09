package ContasEstudantis;

public class Aluno {
    
    private String nome;
    private final String matricula;
    private String email;

    public Aluno(String nome, String matricula, String email) {
        this.nome = nome;
        this.matricula = matricula;
        this.email = email;
    }

    public void exibirPerfil() {
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Email: " + email);
    }

}
