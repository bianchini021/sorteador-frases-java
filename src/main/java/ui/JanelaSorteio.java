package main.java.ui;

import javax.swing.*;
import java.awt.*;
import main.java.domain.GerenciadorFrases;

public class JanelaSorteio {
    private JFrame janela;
    private JLabel labelFrase;
    private JButton botaoSortear;
    private GerenciadorFrases gerenciador;

    public JanelaSorteio() {
        // Instancia o motor da lógica
        this.gerenciador = new GerenciadorFrases();

        // Configurações da Janela Principal
        this.janela = new JFrame("Sorteador de Frases");
        this.janela.setSize(500, 250);
        this.janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.janela.setLayout(new BorderLayout(10, 10));
        this.janela.setLocationRelativeTo(null); // Centraliza na tela

        // Componente de Texto
        this.labelFrase = new JLabel("Clique abaixo para sortear!", SwingConstants.CENTER);
        this.labelFrase.setFont(new Font("Arial", Font.PLAIN, 16));

        // Componente do Botão
        this.botaoSortear = new JButton("Sortear Frase");
        this.botaoSortear.setFont(new Font("Arial", Font.BOLD, 14));
        this.botaoSortear.setFocusable(false);

        // AÇÃO DO CLIQUE: Conecta a tela com o domínio usando Lambda
        this.botaoSortear.addActionListener(e -> {
            String fraseSorteada = this.gerenciador.sortearFrase();
            this.labelFrase.setText("<html><div style='text-align: center; padding: 0 20px;'>"
                    + fraseSorteada + "</div></html>");
        });

        // Adiciona os componentes nos seus respectivos lugares do layout
        this.janela.add(labelFrase, BorderLayout.CENTER);
        this.janela.add(botaoSortear, BorderLayout.SOUTH);
    }

    public void exibir() {
        this.janela.setVisible(true);
    }
}