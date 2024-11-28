# Family Tree Java Project

## Descrição
Este projeto em Java foi criado para representar e visualizar árvores genealógicas de maneira simples. Ele permite adicionar pessoas, seus cônjuges e filhos, formando uma estrutura hierárquica familiar que pode ser impressa em forma de árvore.

## Estrutura do Projeto
O projeto é composto por duas classes principais:

### 1. Classe `Person`
Localizada no pacote `entities`, esta classe é o coração do projeto e representa uma pessoa na árvore genealógica. Ela possui:
- **Atributos:**
  - `name`: Nome da pessoa.
  - `spouse`: Referência ao cônjuge da pessoa.
  - `children`: Lista de filhos da pessoa.
- **Métodos principais:**
  - `addSpouse(Person spouse)`: Adiciona um cônjuge.
  - `addChild(Person child)`: Adiciona um filho.
  - `printFamilyTree(int level)`: Imprime a árvore genealógica a partir da pessoa.
  - Métodos para obter e definir os atributos.

### 2. Classe `Main`
Localizada no pacote `org.example`, esta classe contém o método `main` que inicializa o programa. Nela:
- Um exemplo de uma árvore genealógica completa é criado.
- A estrutura da árvore é impressa utilizando o método `printFamilyTree`.
