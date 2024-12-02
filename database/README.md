# Projeto: Sistema de Gerenciamento de Pessoas e Gondolas

Este projeto consiste em um banco de dados para gerenciar pessoas e suas associações com gondolas. Ele foi projetado para armazenar informações de pessoas (adultos e crianças) e as gondolas que possuem dois assentos, onde cada assento pode ser ocupado por uma pessoa, com a possibilidade de associar um adulto responsável por uma criança.

## Estrutura do Banco de Dados

O banco de dados é composto por duas tabelas principais:

### Tabela `Person`

A tabela `Person` armazena informações sobre cada pessoa no sistema.

#### Campos:
- `person_id`: Identificador único da pessoa (chave primária).
- `name`: Nome da pessoa (não nulo).
- `age`: Idade da pessoa (não nula, com restrição para valores maiores ou iguais a zero).
- `type`: Tipo de pessoa (`Adult` ou `Child`, restrito a esses valores).
- `responsible_adult_id`: Identificador do adulto responsável (se for uma criança), que é uma chave estrangeira referenciando a tabela `Person` (pode ser nulo se a pessoa não for uma criança).

#### Restrições:
- O campo `age` deve ser maior ou igual a zero.
- O campo `type` só pode ter os valores 'Adult' ou 'Child'.
- O campo `responsible_adult_id` é uma chave estrangeira que, se uma criança for excluída, o valor é configurado para `NULL`.

### Tabela `Gondola`

A tabela `Gondola` gerencia as gondolas e as pessoas associadas aos assentos.

#### Campos:
- `gondola_id`: Identificador único da gondola (chave primária).
- `number`: Número da gondola (único).
- `seat1_person_id`: Identificador da pessoa ocupando o primeiro assento, referenciando `person_id` da tabela `Person` (pode ser nulo).
- `seat2_person_id`: Identificador da pessoa ocupando o segundo assento, referenciando `person_id` da tabela `Person` (pode ser nulo).

#### Restrições:
- O campo `number` deve ser único para garantir que cada gondola tenha um número distinto.
- Os campos `seat1_person_id` e `seat2_person_id` são chaves estrangeiras que referenciam a tabela `Person`. Caso a pessoa referenciada seja excluída, o valor é configurado para `NULL`.
