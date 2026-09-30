package editorDeArquivo;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Leitor {

    private final Path caminho;

    public Leitor(String caminhoArquivo) {
        this.caminho = Paths.get(caminhoArquivo);
    }

    // Lê e retorna todo o conteúdo do arquivo como String
    public String ler() {
        try {
            if (!Files.exists(caminho)) {
                return "(Arquivo ainda não existe)";
            }
            return Files.readString(caminho);
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
            return "";
        }
    }

}
