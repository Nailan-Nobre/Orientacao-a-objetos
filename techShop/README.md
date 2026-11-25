# TechShop

## Integrantes

- [Nailan Lucas dos Santos Nobre]
- [Victor Rennan Alves Sátiro]

## Descrição

Programa de controle de produtos da loja TechShop. O menu permite consultar os
dados de um produto pelo código, adicionar unidades ao estoque e remover
unidades, desde que haja quantidade suficiente. O sistema inicia com:

- Teclado — código 123, preço R$ 40,00 e 50 unidades;
- Mouse — código 456, preço R$ 30,00 e 50 unidades.

## Organização das classes

- `Main.java` contém o método principal, cria os produtos, apresenta o menu e
  direciona cada operação para a classe `Produto`.
- `Produto.java` representa um produto e reúne seus dados e operações de
  consulta e atualização do estoque. A seleção é feita pelo código informado.

## Encapsulamento

O encapsulamento foi aplicado na classe `Produto`: os atributos `nome`,
`codigo`, `preco` e `quantidade` são `private`, impedindo o acesso direto a
partir de outras classes. O construtor inicializa os dados, e métodos da própria
classe consultam ou atualizam os valores durante as operações.

É necessário usar Java 14 ou superior, devido à sintaxe `case ->` utilizada no
menu.
