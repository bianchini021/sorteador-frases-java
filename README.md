# 🎯 Sorteador de Frases Aleatórias

Um aplicativo desktop em Java que sorteia frases motivacionais e de sabedoria de forma aleatória através de uma interface gráfica. 

O projeto foi estruturado utilizando conceitos de **Arquitetura Limpa** e separação de responsabilidades (Domain e UI), garantindo que a lógica de negócio seja totalmente independente da interface visual.

---

## 🛠️ Tecnologias Utilizadas

*   **Java 25**
*   **Java Swing** (Interface Gráfica nativa)
*   **Expressões Lambda** (Manipulação de eventos de clique)

---

## 📁 Estrutura do Projeto

O projeto adota uma estrutura profissional dividida em camadas:

```text
FrasesAleatorias/
└── src/
    ├── main/
        └── java/
            ├── domain/   # Lógica pura de negócio (GerenciadorFrases)
            ├── ui/       # Interface Gráfica e componentes Swing (JanelaSorteio)
            └── Main.java # Ponto de entrada do aplicativo
