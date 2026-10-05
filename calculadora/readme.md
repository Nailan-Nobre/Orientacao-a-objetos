# Calculadora em Java

Este projeto implementa uma calculadora para operações comuns e para o cálculo de medidas de formas geométricas planas. O desenvolvimento também contribuiu para o aprendizado da criação de menus e para o reforço dos fundamentos de orientação a objetos.

## Snippet para menus

Para agilizar a criação de menus em Java, foi utilizado o seguinte snippet:

```json
"Menu de escolhas": {
    "prefix": "javamenu",
    "body": [
        "public static void main(String[] args) {",
        "\tScanner sc = new Scanner(System.in);",
        "",
        "\tint opcao = -1;",
        "",
        "\twhile (opcao != 0) {",
        "\t\tSystem.out.println(\"\\n===== MENU PADRÃO =====\");",
        "\t\tSystem.out.println(\"1 - Opção 1\");",
        "\t\tSystem.out.println(\"2 - Opção 2\");",
        "\t\t// Adicione quantas opções forem necessárias",
        "\t\tSystem.out.println(\"0 - Sair\");",
        "\t\tSystem.out.print(\"Escolha: \" );",
        "",
        "\t\ttry {",
        "\t\t\topcao = Integer.parseInt(sc.nextLine());",
        "\t\t} catch (NumberFormatException e) {",
        "\t\t\tSystem.out.println(\"Digite um número válido.\");",
        "\t\t\tcontinue;",
        "\t\t}",
        "",
        "\t\tswitch (opcao) {",
        "\t\t\tcase 1 -> {",
        "\t\t\t\tSystem.out.println(\"\\n--- OPÇÃO 1 ---\");",
        "\t\t\t\t// Execute a ação correspondente à opção 1",
        "\t\t\t}",
        "\t\t\tcase 2 -> {",
        "\t\t\t\tSystem.out.println(\"\\n--- OPÇÃO 2 ---\");",
        "\t\t\t\t// Execute a ação correspondente à opção 2",
        "\t\t\t}",
        "\t\t\t// Adicione outros casos conforme necessário",
        "\t\t\tcase 0 -> System.out.println(\"Encerrando...\");",
        "\t\t\tdefault -> System.out.println(\"Opção inválida!\");",
        "\t\t}",
        "\t}",
        "",
        "\tsc.close();",
        "}"
    ],
    "description": "Atalho para a criação de menus em Java"
}
```

## Como configurar o snippet

1. Pressione `Ctrl + Shift + P` no Visual Studio Code.
2. Pesquise por **Configurar snippets**.
3. Selecione o arquivo de snippets do Java.
4. Cole o código acima e salve o arquivo.

Depois da configuração, digite `javamenu` no local desejado para inserir o menu automaticamente.