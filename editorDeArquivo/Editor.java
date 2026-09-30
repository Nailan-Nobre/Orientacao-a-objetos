package editorDeArquivo;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Editor {
    private final Path caminho;

    public Editor(String caminhoArquivo) {
        this.caminho = Paths.get(caminhoArquivo);
    }

    // Sobrescreve todo o conteúdo do arquivo
    public void salvar(String conteudo) {
        try {
            Files.writeString(caminho, conteudo);
            System.out.println("✔ Arquivo salvo com sucesso!");
        } catch (IOException e) {
            System.err.println("Erro ao salvar: " + e.getMessage());
        }
    }

    // Adiciona texto no final do arquivo (sem apagar o resto)
    public void adicionar(String conteudo) {
        try {
            Files.writeString(caminho, conteudo,
                    StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND);
            System.out.println("✔ Conteúdo adicionado!");
        } catch (IOException e) {
            System.err.println("Erro ao adicionar: " + e.getMessage());
        }
    }

}
