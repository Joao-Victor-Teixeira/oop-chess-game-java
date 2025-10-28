# ♟️ Jogo de Xadrez em Console com Foco em OOP (Java)

Este repositório contém a implementação da lógica de um jogo de xadrez em Java, desenvolvido como um projeto prático para aprofundar e aplicar conceitos fundamentais de **Programação Orientada a Objetos (OOP)**. A aplicação roda em console.

Projeto baseado no módulo "Projeto Sistema de Jogo de Xadrez" do curso "Java COMPLETO - Programação Orientada a Objetos + Projetos" do Dr. Nélio Alves.

## 🎯 Objetivos de Aprendizado

O principal objetivo deste projeto foi aplicar e solidificar os pilares da OOP em um cenário complexo e prático. Os conceitos chave explorados incluem:

* **Encapsulamento:** Proteção dos dados internos das classes (`Position`, `Piece`, `Board`, `ChessMatch`).
* **Herança:** Criação de uma hierarquia de classes para as peças (`Piece` -> `ChessPiece` -> `Rook`, `King`, `Pawn`, etc.).
* **Polimorfismo:** Implementação de comportamentos específicos para cada peça (método `toString`, cálculo de `possibleMoves`).
* **Classes e Métodos Abstratos:** Definição de contratos e comportamentos comuns na superclasse `Piece`.
* **Tratamento de Exceções:** Criação de exceções customizadas (`BoardException`, `ChessException`) para lidar com erros de lógica e validações.
* **Enumerações:** Uso de `enum` para representar cores (`Color`).
* **Composição:** Associação entre classes (ex: `ChessMatch` contém `Board`, `Board` contém `Piece`).
* **Padrão de Camadas:** Separação da lógica do jogo (`chess`) da lógica do tabuleiro (`board`) e da interface do usuário (`application`/`UI`).
* **Estruturas de Dados:** Utilização de Matrizes para representar o tabuleiro.

## ✨ Funcionalidades Implementadas

* Representação do tabuleiro de xadrez.
* Modelagem das peças (Rei, Torre, Peão, Bispo, Cavalo, Rainha) com suas cores e contagem de movimentos.
* Posicionamento inicial das peças.
* Impressão do tabuleiro no console, distinguindo cores das peças.
* Movimentação básica de peças com validação de origem e destino.
* Cálculo e exibição dos movimentos possíveis para uma peça selecionada.
* Alternância de turnos entre jogadores (Branco e Preto).
* Captura de peças e exibição das peças capturadas.
* Lógica de Xeque (Check).
* Lógica de Xeque-mate (Checkmate).
* Movimentos Especiais:
    * Roque (Castling)
    * En Passant
    * Promoção do Peão

## 🛠️ Tecnologias Utilizadas

* **Linguagem:** Java (JDK 17+)
* **Interface:** Console (Terminal)
* **Conceitos:** Programação Orientada a Objetos, Estruturas de Dados (Matrizes, Listas), Tratamento de Exceções.

## ▶️ Como Executar

1.  Clone este repositório:
    ```bash
    git clone [https://github.com/Joao-Victor-Teixeira/oop-chess-game-java](https://github.com/Joao-Victor-Teixeira/oop-chess-game-java) # Atualize se o nome for diferente
    ```
2.  Abra o projeto em sua IDE Java preferida (VS Code, Eclipse, IntelliJ).
3.  Execute a classe principal que contém o método `main` (provavelmente em um pacote `application`).
4.  Siga as instruções no console para jogar (inserindo posições no formato de xadrez, ex: "a1", "h8").

## ✨ Créditos

* Projeto baseado no curso "Java COMPLETO - Programação Orientada a Objetos + Projetos" - **Dr. Nélio Alves**
* [cite_start]Design do Sistema (Referência): [https://github.com/acenelio/chess-system-design](https://github.com/acenelio/chess-system-design) [cite: 1401]

---

Este `README.md` dá uma visão clara do propósito do projeto (aprender OOP), dos conceitos abordados, das funcionalidades e de como executá-lo. Lembre-se de atualizar o link de clone se o nome final do seu repositório for diferente.
