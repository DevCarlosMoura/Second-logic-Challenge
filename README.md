# 🏆 Desafio: Calculadora de Partidas Rankeadas - DIO

Este projeto é a resolução do desafio de código "Calculadora de Partidas Rankeadas", proposto no curso de **Lógica de Programação** da plataforma **[Digital Innovation One (DIO)](https://www.dio.me/)**.

O código foi **refatorado** para utilizar **métodos (funções)**, aplicando o princípio da **separação de responsabilidades** para um código mais limpo e organizado.

## 🎯 Objetivo

O objetivo do desafio é criar um programa que:
1.  Receba a quantidade de **vitórias** e **derrotas** de um jogador.
2.  Calcule o **saldo** de vitórias (Vitórias - Derrotas).
3.  Determine o **nível (rank)** do jogador com base no saldo.
4.  Exiba uma mensagem final com o saldo e o nível do jogador.

## 🏗️ Estrutura do Código

Para seguir as boas práticas de programação, a lógica foi dividida em métodos:

* **`main(String[] args)`**:
    * É o ponto de entrada do programa (o "gerente").
    * Responsável por interagir com o usuário (usando `Scanner`).
    * Chama os outros métodos para delegar as tarefas de cálculo.
    * Imprime o resultado final.

* **`calculatorRank(int wins, int losses)`**:
    * Um método "especialista" que recebe as vitórias e derrotas.
    * Sua única responsabilidade é calcular e **retornar** o saldo de vitórias (um `int`).

* **`getRank(int results)`**:
    * Outro método "especialista" que recebe o saldo de vitórias.
    * Sua única responsabilidade é usar lógica condicional (`if/else if`) para determinar e **retornar** o nome do rank (uma `String`).

## 🛠️ Tecnologias e Conceitos

-   **Java**
-   **`java.util.Scanner`**: Para leitura de dados do console.
-   **Métodos (Funções)**: Para modularização e separação de responsabilidades.
-   **Estruturas Condicionais**: `if/else if/else` para a lógica de ranqueamento.

## 🚀 Como Executar

1.  Clone o repositório ou baixe o arquivo `Index.java`.
2.  Abra o projeto em sua IDE Java preferida (Eclipse, IntelliJ, VS Code, etc.).
3.  Compile e execute o arquivo `Index.java`.
4.  Siga as instruções no console, inserindo o número de vitórias e derrotas.

---
*Feito para o bootcamp da DIO.*
