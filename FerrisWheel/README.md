# Roda-Gigante - Simulador de Gôndolas

## Descrição
Este projeto é um simulador de roda-gigante desenvolvido em Java. Ele gerencia o embarque de pessoas (adultos e crianças) em gôndolas, aplicando regras de idade e responsabilidades para garantir um funcionamento seguro e organizado.

## Estrutura do Projeto

### 1. Classes Principais
O projeto é composto por seis classes:

#### **1. Pessoa**
Classe base que representa uma pessoa, com os seguintes atributos:
- `nome` (String): O nome da pessoa.
- `idade` (int): A idade da pessoa.

#### **2. Adulto**
Herdeira de `Pessoa`, esta classe adiciona a capacidade de gerenciar uma lista de crianças associadas ao adulto.

#### **3. Crianca**
Herdeira de `Pessoa`, esta classe adiciona um atributo para vincular a criança a um responsável do tipo `Adulto`.

#### **4. Gondola**
Representa uma gôndola na roda-gigante. Possui:
- `numero`: Número identificador da gôndola.
- `pessoa1` e `pessoa2`: Referências às duas pessoas que ocupam a gôndola (ou `null` se estiver vazia).

#### **5. RodaGigante**
Classe principal que gerencia a roda-gigante. Ela:
- Possui uma lista de 18 gôndolas.
- Implementa regras para embarcar pessoas:
  - Crianças menores de 12 anos precisam estar acompanhadas por um adulto responsável.
  - Gôndolas livres são automaticamente atribuídas quando a escolhida está ocupada.
  - Se uma gôndola tiver apenas uma pessoa, é possível adicionar outra para completar o lugar com duas pessoas.
  - Se tentar adicionar mais de 18 pessoas (ultrapassando o número de gôndolas disponíveis), uma exceção é lançada.
- Oferece métodos para exibir o estado atual das gôndolas.

#### **6. Main**
O ponto de entrada do programa, onde as pessoas são criadas e adicionadas às gôndolas, e o estado final da roda-gigante é exibido.
