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
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
        }

        this.gerenciador = new GerenciadorFrases();

        // Configurações da Janela Principal (Fundo Escuro/Moderno)
        this.janela = new JFrame("Sorteador de Frases");
        this.janela.setSize(550, 300);
        this.janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.janela.setLayout(new BorderLayout(20, 20));
        this.janela.getContentPane().setBackground(new Color(245, 247, 250));
        this.janela.setLocationRelativeTo(null);

        // Painel interno para dar uma "margem" elegante nas bordas
        JPanel painelConteudo = new JPanel(new BorderLayout(15, 15));
        painelConteudo.setBackground(new Color(245, 247, 250));
        painelConteudo.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // Componente de Texto (Fonte mais limpa e cor suave)
        this.labelFrase = new JLabel("Clique abaixo para sortear!", SwingConstants.CENTER);
        this.labelFrase.setFont(new Font("Segoe UI", Font.ITALIC, 18));
        this.labelFrase.setForeground(new Color(44, 62, 80));

        // Componente do Botão (Estilizado)
        this.botaoSortear = new JButton("Sortear Frase");
        this.botaoSortear.setFont(new Font("Segoe UI", Font.BOLD, 14));
        this.botaoSortear.setBackground(new Color(52, 152, 219));
        this.botaoSortear.setForeground(Color.BLACK); // Texto branco
        this.botaoSortear.setPreferredSize(new Dimension(0, 45));
        this.botaoSortear.setFocusable(false);

        // Ação do clique
        this.botaoSortear.addActionListener(e -> {
            String fraseSorteada = this.gerenciador.sortearFrase();
            this.labelFrase.setText("<html><div style='text-align: center; font-family: Segoe UI;'>"
                    + fraseSorteada + "</div></html>");
        });

        painelConteudo.add(labelFrase, BorderLayout.CENTER);
        painelConteudo.add(botaoSortear, BorderLayout.SOUTH);

        // Adiciona o painel na janela
        this.janela.add(painelConteudo);
    }

    public void exibir() {
        this.janela.setVisible(true);
    }
}