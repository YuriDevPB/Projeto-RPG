/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packageLP2;

import java.awt.Color;
import java.awt.print.PrinterException;
import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pichelli
 */
public class FichaMestre extends javax.swing.JFrame {

      /**
       * Creates new form FichaMestre
       */
      private final ControleFichaMestre control;
       private JTable selecionado = null;
      
      public FichaMestre(ControleFichaMestre control) {
            initComponents();
            InitLabels();
            this.control = control;
            jPaneFicha.setVisible(false);
            
      }
      public void InitLabels(){
        btnSelecionar.setContentAreaFilled(false);
        btnSelecionar.setBorderPainted(false);
        btnAddFichaMestre.setContentAreaFilled(false);
        btnAddFichaMestre.setBorderPainted(false);
        invRemoverButton.setContentAreaFilled(false);
        invRemoverButton.setBorderPainted(false);  
        btnListaAdd.setBorderPainted(false);
        btnListaAdd.setContentAreaFilled(false);
        btnListaArmas.setBorderPainted(false);
        btnListaArmas.setContentAreaFilled(false);
        btnListaArmaduras.setBorderPainted(false);
        btnListaArmaduras.setContentAreaFilled(false);
        btnListaConsumiveis.setBorderPainted(false);
        btnListaConsumiveis.setContentAreaFilled(false);
      
      }
   
    
      @SuppressWarnings("unchecked")
      // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
      private void initComponents() {

            jFrameEquips = new javax.swing.JFrame();
            jPaneEquips = new javax.swing.JLayeredPane();
            btnListaArmas = new javax.swing.JButton();
            btnListaConsumiveis = new javax.swing.JButton();
            btnListaArmaduras = new javax.swing.JButton();
            jLabel9 = new javax.swing.JLabel();
            jLabel10 = new javax.swing.JLabel();
            jLabel8 = new javax.swing.JLabel();
            jLabel5 = new javax.swing.JLabel();
            jPaneListaEquips = new javax.swing.JLayeredPane();
            jScrollPane4 = new javax.swing.JScrollPane();
            listaEquips = new javax.swing.JList<>();
            btnListaAdd = new javax.swing.JButton();
            jLabel7 = new javax.swing.JLabel();
            jLabel6 = new javax.swing.JLabel();
            jPaneListaMestre = new javax.swing.JLayeredPane();
            jScrollPane1 = new javax.swing.JScrollPane();
            jListPersonagens = new javax.swing.JList<>();
            btnSelecionar = new javax.swing.JButton();
            jLabel4 = new javax.swing.JLabel();
            jLabel3 = new javax.swing.JLabel();
            jPaneFicha = new javax.swing.JLayeredPane();
            jTabbedPane2 = new javax.swing.JTabbedPane();
            jLayeredPane4 = new javax.swing.JLayeredPane();
            FichaNomelLb = new javax.swing.JLabel();
            FichaAncelLb = new javax.swing.JLabel();
            FichaArmorELabel = new javax.swing.JLabel();
            lblIdade = new javax.swing.JLabel();
            btnIntelecto = new javax.swing.JButton();
            btnForca = new javax.swing.JButton();
            btnVontade = new javax.swing.JButton();
            btnAgilidade = new javax.swing.JButton();
            btnPercepcao = new javax.swing.JButton();
            txfNivel = new javax.swing.JTextField();
            txfPoder = new javax.swing.JTextField();
            txfCorrupcao = new javax.swing.JTextField();
            txfInsanidade = new javax.swing.JTextField();
            txfForca = new javax.swing.JTextField();
            txfInteligencia = new javax.swing.JTextField();
            txfAgilidade = new javax.swing.JTextField();
            txfVontade = new javax.swing.JTextField();
            txfPercepcao = new javax.swing.JTextField();
            txfSaude = new javax.swing.JTextField();
            txfDano = new javax.swing.JTextField();
            btnConfirmarFichaMestre = new javax.swing.JButton();
            FichaTamLb = new javax.swing.JLabel();
            FichaTaxaLb = new javax.swing.JLabel();
            FichaDefLb = new javax.swing.JLabel();
            FichaDesLb = new javax.swing.JLabel();
            FichaBacground = new javax.swing.JLabel();
            jLayeredPane5 = new javax.swing.JLayeredPane();
            jScrollPane2 = new javax.swing.JScrollPane();
            jTableArma = new javax.swing.JTable();
            jScrollPane3 = new javax.swing.JScrollPane();
            jTableConsumiveis = new javax.swing.JTable();
            jScrollPane5 = new javax.swing.JScrollPane();
            jTableArmadura = new javax.swing.JTable();
            invRemoverButton = new javax.swing.JButton();
            txfDinheiro = new javax.swing.JTextField();
            fundoMochila = new javax.swing.JLabel();
            lblMoedas = new javax.swing.JLabel();
            lblDinheiro = new javax.swing.JLabel();
            jLabel1 = new javax.swing.JLabel();
            btnAddFichaMestre = new javax.swing.JButton();
            jLabel2 = new javax.swing.JLabel();
            lblFundoInventario = new javax.swing.JLabel();

            jFrameEquips.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
            jFrameEquips.setMinimumSize(new java.awt.Dimension(650, 500));
            jFrameEquips.setSize(new java.awt.Dimension(650, 500));
            jFrameEquips.addWindowListener(new java.awt.event.WindowAdapter() {
                  public void windowClosing(java.awt.event.WindowEvent evt) {
                        jFrameEquipsWindowClosing(evt);
                  }
            });
            jFrameEquips.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            jPaneEquips.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            btnListaArmas.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
            btnListaArmas.setText("Armas");
            btnListaArmas.setMaximumSize(new java.awt.Dimension(50, 50));
            btnListaArmas.setMinimumSize(new java.awt.Dimension(50, 50));
            btnListaArmas.setPreferredSize(new java.awt.Dimension(50, 50));
            btnListaArmas.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mousePressed(java.awt.event.MouseEvent evt) {
                        btnListaArmasMousePressed(evt);
                  }
                  public void mouseReleased(java.awt.event.MouseEvent evt) {
                        btnListaArmasMouseReleased(evt);
                  }
            });
            btnListaArmas.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        btnListaArmasActionPerformed(evt);
                  }
            });
            jPaneEquips.add(btnListaArmas, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 110, 50));

            btnListaConsumiveis.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
            btnListaConsumiveis.setText("Consumiveis");
            btnListaConsumiveis.setMaximumSize(new java.awt.Dimension(50, 50));
            btnListaConsumiveis.setMinimumSize(new java.awt.Dimension(50, 50));
            btnListaConsumiveis.setPreferredSize(new java.awt.Dimension(50, 50));
            btnListaConsumiveis.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mousePressed(java.awt.event.MouseEvent evt) {
                        btnListaConsumiveisMousePressed(evt);
                  }
                  public void mouseReleased(java.awt.event.MouseEvent evt) {
                        btnListaConsumiveisMouseReleased(evt);
                  }
            });
            btnListaConsumiveis.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        btnListaConsumiveisActionPerformed(evt);
                  }
            });
            jPaneEquips.add(btnListaConsumiveis, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 110, 50));

            btnListaArmaduras.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
            btnListaArmaduras.setText("Armaduras");
            btnListaArmaduras.setMaximumSize(new java.awt.Dimension(50, 50));
            btnListaArmaduras.setMinimumSize(new java.awt.Dimension(50, 50));
            btnListaArmaduras.setPreferredSize(new java.awt.Dimension(50, 50));
            btnListaArmaduras.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mousePressed(java.awt.event.MouseEvent evt) {
                        btnListaArmadurasMousePressed(evt);
                  }
                  public void mouseReleased(java.awt.event.MouseEvent evt) {
                        btnListaArmadurasMouseReleased(evt);
                  }
            });
            btnListaArmaduras.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        btnListaArmadurasActionPerformed(evt);
                  }
            });
            jPaneEquips.add(btnListaArmaduras, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 110, 50));

            jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packageLP2/Imagens/botao2.png"))); // NOI18N
            jPaneEquips.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 140, 70));

            jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packageLP2/Imagens/botao2.png"))); // NOI18N
            jPaneEquips.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 140, 70));

            jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packageLP2/Imagens/botao2.png"))); // NOI18N
            jPaneEquips.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 130, 70));

            jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packageLP2/Imagens/f3.jpg"))); // NOI18N
            jPaneEquips.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-140, 0, 870, 530));

            jFrameEquips.getContentPane().add(jPaneEquips, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

            jPaneListaEquips.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            listaEquips.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
            jScrollPane4.setViewportView(listaEquips);

            jPaneListaEquips.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 450, 320));

            btnListaAdd.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
            btnListaAdd.setText("ADICIONAR");
            btnListaAdd.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mousePressed(java.awt.event.MouseEvent evt) {
                        btnListaAddMousePressed(evt);
                  }
                  public void mouseReleased(java.awt.event.MouseEvent evt) {
                        btnListaAddMouseReleased(evt);
                  }
            });
            btnListaAdd.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        btnListaAddActionPerformed(evt);
                  }
            });
            jPaneListaEquips.add(btnListaAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, 120, 50));

            jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packageLP2/Imagens/botao2.png"))); // NOI18N
            jPaneListaEquips.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 370, 120, 70));

            jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packageLP2/Imagens/f3.jpg"))); // NOI18N
            jPaneListaEquips.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1130, -10, -1, -1));

            jFrameEquips.getContentPane().add(jPaneListaEquips, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

            setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
            setMaximumSize(new java.awt.Dimension(820, 699));
            setMinimumSize(new java.awt.Dimension(820, 699));
            setPreferredSize(new java.awt.Dimension(820, 699));
            setResizable(false);
            setSize(new java.awt.Dimension(820, 699));
            addWindowListener(new java.awt.event.WindowAdapter() {
                  public void windowClosing(java.awt.event.WindowEvent evt) {
                        formWindowClosing(evt);
                  }
            });

            jPaneListaMestre.setMaximumSize(new java.awt.Dimension(820, 699));
            jPaneListaMestre.setMinimumSize(new java.awt.Dimension(820, 699));
            jPaneListaMestre.setName(""); // NOI18N
            jPaneListaMestre.setRequestFocusEnabled(false);
            jPaneListaMestre.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            jListPersonagens.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
            jListPersonagens.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
            jScrollPane1.setViewportView(jListPersonagens);

            jPaneListaMestre.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(278, 94, 225, 380));

            btnSelecionar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
            btnSelecionar.setText("Selecionar");
            btnSelecionar.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        btnSelecionarActionPerformed(evt);
                  }
            });
            jPaneListaMestre.add(btnSelecionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 500, 110, 60));

            jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packageLP2/Imagens/botao2.png"))); // NOI18N
            jPaneListaMestre.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 490, 130, 80));

            jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packageLP2/Imagens/f2.jpg"))); // NOI18N
            jPaneListaMestre.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-160, -30, 1030, 830));

            jPaneFicha.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            jTabbedPane2.setMaximumSize(new java.awt.Dimension(820, 700));
            jTabbedPane2.setMinimumSize(new java.awt.Dimension(820, 700));
            jTabbedPane2.setPreferredSize(new java.awt.Dimension(820, 670));
            jTabbedPane2.setRequestFocusEnabled(false);

            jLayeredPane4.setMaximumSize(new java.awt.Dimension(820, 700));
            jLayeredPane4.setName(""); // NOI18N
            jLayeredPane4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            FichaNomelLb.setFont(new java.awt.Font("Old English Text MT", 3, 34)); // NOI18N
            FichaNomelLb.setForeground(new java.awt.Color(0, 0, 0));
            FichaNomelLb.setText("Nome do personagem");
            jLayeredPane4.add(FichaNomelLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 500, 60));

            FichaAncelLb.setFont(new java.awt.Font("Bookman Old Style", 2, 24)); // NOI18N
            FichaAncelLb.setForeground(new java.awt.Color(0, 0, 0));
            FichaAncelLb.setText("Ancestralidade");
            jLayeredPane4.add(FichaAncelLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 250, -1));

            FichaArmorELabel.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
            jLayeredPane4.add(FichaArmorELabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, 330, 50));

            lblIdade.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
            lblIdade.setForeground(new java.awt.Color(0, 0, 0));
            lblIdade.setText("jLabel3");
            jLayeredPane4.add(lblIdade, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, 130, 50));

            btnIntelecto.setBackground(new java.awt.Color(102, 51, 0));
            btnIntelecto.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
            btnIntelecto.setForeground(new java.awt.Color(0, 0, 204));
            btnIntelecto.setText("+2");
            btnIntelecto.setBorder(null);
            btnIntelecto.setBorderPainted(false);
            btnIntelecto.setContentAreaFilled(false);
            btnIntelecto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            jLayeredPane4.add(btnIntelecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 320, 60, 50));

            btnForca.setBackground(new java.awt.Color(102, 51, 0));
            btnForca.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
            btnForca.setForeground(new java.awt.Color(0, 0, 204));
            btnForca.setText("+2");
            btnForca.setBorder(null);
            btnForca.setBorderPainted(false);
            btnForca.setContentAreaFilled(false);
            btnForca.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            jLayeredPane4.add(btnForca, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 270, 50, 40));

            btnVontade.setBackground(new java.awt.Color(102, 51, 0));
            btnVontade.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
            btnVontade.setForeground(new java.awt.Color(0, 0, 204));
            btnVontade.setText("+2");
            btnVontade.setBorder(null);
            btnVontade.setBorderPainted(false);
            btnVontade.setContentAreaFilled(false);
            btnVontade.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            jLayeredPane4.add(btnVontade, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 430, 60, 40));

            btnAgilidade.setBackground(new java.awt.Color(102, 51, 0));
            btnAgilidade.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
            btnAgilidade.setForeground(new java.awt.Color(0, 0, 204));
            btnAgilidade.setText("+2");
            btnAgilidade.setBorder(null);
            btnAgilidade.setBorderPainted(false);
            btnAgilidade.setContentAreaFilled(false);
            btnAgilidade.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            jLayeredPane4.add(btnAgilidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 380, 60, 40));

            btnPercepcao.setBackground(new java.awt.Color(102, 51, 0));
            btnPercepcao.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
            btnPercepcao.setForeground(new java.awt.Color(0, 0, 204));
            btnPercepcao.setText("+2");
            btnPercepcao.setBorder(null);
            btnPercepcao.setBorderPainted(false);
            btnPercepcao.setContentAreaFilled(false);
            btnPercepcao.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            jLayeredPane4.add(btnPercepcao, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 270, 50, 40));

            txfNivel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
            txfNivel.setText("jTextField1");
            jLayeredPane4.add(txfNivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 50, 90, 60));

            txfPoder.setText("jTextField1");
            jLayeredPane4.add(txfPoder, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 110, 50, 50));

            txfCorrupcao.setText("jTextField1");
            jLayeredPane4.add(txfCorrupcao, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, 50, 50));

            txfInsanidade.setText("jTextField1");
            jLayeredPane4.add(txfInsanidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 60, 50));

            txfForca.setText("jTextField1");
            jLayeredPane4.add(txfForca, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 280, 60, 40));

            txfInteligencia.setText("jTextField1");
            jLayeredPane4.add(txfInteligencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 330, 60, 40));

            txfAgilidade.setText("jTextField1");
            jLayeredPane4.add(txfAgilidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 380, 60, 40));

            txfVontade.setText("jTextField1");
            jLayeredPane4.add(txfVontade, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 440, 60, 40));

            txfPercepcao.setText("jTextField1");
            jLayeredPane4.add(txfPercepcao, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 280, 60, 40));

            txfSaude.setText("jTextField1");
            jLayeredPane4.add(txfSaude, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 440, 80, 40));

            txfDano.setFont(new java.awt.Font("Dialog", 1, 32)); // NOI18N
            txfDano.setText("jTextField1");
            jLayeredPane4.add(txfDano, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 570, 80, 50));

            btnConfirmarFichaMestre.setText("Confirmar");
            btnConfirmarFichaMestre.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        btnConfirmarFichaMestreActionPerformed(evt);
                  }
            });
            jLayeredPane4.add(btnConfirmarFichaMestre, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 190, 110, 40));

            FichaTamLb.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
            FichaTamLb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            FichaTamLb.setText("12");
            FichaTamLb.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            jLayeredPane4.add(FichaTamLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 380, 80, 40));

            FichaTaxaLb.setFont(new java.awt.Font("Rubik", 1, 32)); // NOI18N
            FichaTaxaLb.setForeground(new java.awt.Color(0, 204, 0));
            FichaTaxaLb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            FichaTaxaLb.setText("12");
            FichaTaxaLb.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            jLayeredPane4.add(FichaTaxaLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 550, 90, 60));

            FichaDefLb.setFont(new java.awt.Font("Rubik", 1, 32)); // NOI18N
            FichaDefLb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            FichaDefLb.setText("12");
            FichaDefLb.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            jLayeredPane4.add(FichaDefLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 550, 70, -1));

            FichaDesLb.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
            FichaDesLb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            FichaDesLb.setText("12");
            FichaDesLb.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            jLayeredPane4.add(FichaDesLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 330, 80, 30));

            FichaBacground.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            FichaBacground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packageLP2/Imagens/fichaParaLP2.png"))); // NOI18N
            jLayeredPane4.add(FichaBacground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -60, 820, 770));

            jTabbedPane2.addTab("FICHA", jLayeredPane4);

            jLayeredPane5.setMaximumSize(new java.awt.Dimension(820, 700));
            jLayeredPane5.setName(""); // NOI18N
            jLayeredPane5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            jTableArma.setModel(new javax.swing.table.DefaultTableModel(
                  new Object [][] {

                  },
                  new String [] {
                        "Nome", "Modificador", "Dano", "Quantidade"
                  }
            ) {
                  Class[] types = new Class [] {
                        java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
                  };
                  boolean[] canEdit = new boolean [] {
                        false, false, false, false
                  };

                  public Class getColumnClass(int columnIndex) {
                        return types [columnIndex];
                  }

                  public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return canEdit [columnIndex];
                  }
            });
            jTableArma.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
            jTableArma.getTableHeader().setReorderingAllowed(false);
            jTableArma.addFocusListener(new java.awt.event.FocusAdapter() {
                  public void focusGained(java.awt.event.FocusEvent evt) {
                        jTableArmaFocusGained(evt);
                  }
                  public void focusLost(java.awt.event.FocusEvent evt) {
                        jTableArmaFocusLost(evt);
                  }
            });
            jScrollPane2.setViewportView(jTableArma);

            jLayeredPane5.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 570, 100));

            jTableConsumiveis.setModel(new javax.swing.table.DefaultTableModel(
                  new Object [][] {

                  },
                  new String [] {
                        "Itens", "Quantidade"
                  }
            ) {
                  Class[] types = new Class [] {
                        java.lang.String.class, java.lang.Integer.class
                  };
                  boolean[] canEdit = new boolean [] {
                        false, false
                  };

                  public Class getColumnClass(int columnIndex) {
                        return types [columnIndex];
                  }

                  public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return canEdit [columnIndex];
                  }
            });
            jTableConsumiveis.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
            jTableConsumiveis.getTableHeader().setReorderingAllowed(false);
            jTableConsumiveis.addFocusListener(new java.awt.event.FocusAdapter() {
                  public void focusGained(java.awt.event.FocusEvent evt) {
                        jTableConsumiveisFocusGained(evt);
                  }
            });
            jScrollPane3.setViewportView(jTableConsumiveis);

            jLayeredPane5.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 360, 290, 88));

            jTableArmadura.setModel(new javax.swing.table.DefaultTableModel(
                  new Object [][] {

                  },
                  new String [] {
                        "Itens", "Defesa", "Quantidade"
                  }
            ) {
                  Class[] types = new Class [] {
                        java.lang.String.class, java.lang.String.class, java.lang.Integer.class
                  };
                  boolean[] canEdit = new boolean [] {
                        false, false, false
                  };

                  public Class getColumnClass(int columnIndex) {
                        return types [columnIndex];
                  }

                  public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return canEdit [columnIndex];
                  }
            });
            jTableArmadura.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
            jTableArmadura.getTableHeader().setReorderingAllowed(false);
            jTableArmadura.addFocusListener(new java.awt.event.FocusAdapter() {
                  public void focusGained(java.awt.event.FocusEvent evt) {
                        jTableArmaduraFocusGained(evt);
                  }
            });
            jScrollPane5.setViewportView(jTableArmadura);

            jLayeredPane5.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, 410, 100));

            invRemoverButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
            invRemoverButton.setText("Remover");
            invRemoverButton.setMaximumSize(new java.awt.Dimension(100, 40));
            invRemoverButton.setMinimumSize(new java.awt.Dimension(100, 40));
            invRemoverButton.setPreferredSize(new java.awt.Dimension(100, 40));
            invRemoverButton.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mousePressed(java.awt.event.MouseEvent evt) {
                        invRemoverButtonMousePressed(evt);
                  }
                  public void mouseReleased(java.awt.event.MouseEvent evt) {
                        invRemoverButtonMouseReleased(evt);
                  }
            });
            invRemoverButton.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        invRemoverButtonActionPerformed(evt);
                  }
            });
            jLayeredPane5.add(invRemoverButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 490, 130, 60));

            txfDinheiro.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
            txfDinheiro.setText("jTextField1");
            jLayeredPane5.add(txfDinheiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 20, 50, 30));

            fundoMochila.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packageLP2/Imagens/mochila.png"))); // NOI18N
            jLayeredPane5.add(fundoMochila, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, 210, 480, 430));

            lblMoedas.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
            lblMoedas.setText("Moedas: ");
            jLayeredPane5.add(lblMoedas, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, 80, 30));

            lblDinheiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packageLP2/Imagens/botao2.png"))); // NOI18N
            lblDinheiro.setText("Moedas: ");
            jLayeredPane5.add(lblDinheiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, 130, 60));

            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packageLP2/Imagens/botao2.png"))); // NOI18N
            jLayeredPane5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 490, 130, 60));

            btnAddFichaMestre.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
            btnAddFichaMestre.setText("Add");
            btnAddFichaMestre.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mousePressed(java.awt.event.MouseEvent evt) {
                        btnAddFichaMestreMousePressed(evt);
                  }
                  public void mouseReleased(java.awt.event.MouseEvent evt) {
                        btnAddFichaMestreMouseReleased(evt);
                  }
            });
            btnAddFichaMestre.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        btnAddFichaMestreActionPerformed(evt);
                  }
            });
            jLayeredPane5.add(btnAddFichaMestre, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 490, 130, 60));

            jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packageLP2/Imagens/botao2.png"))); // NOI18N
            jLayeredPane5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 490, 130, 60));

            lblFundoInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packageLP2/Imagens/ruas.png"))); // NOI18N
            jLayeredPane5.add(lblFundoInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

            jTabbedPane2.addTab("INVENTARIO", jLayeredPane5);

            jPaneFicha.add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 690));

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jPaneListaMestre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPaneFicha, javax.swing.GroupLayout.Alignment.TRAILING))
            );
            layout.setVerticalGroup(
                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jPaneListaMestre, javax.swing.GroupLayout.PREFERRED_SIZE, 699, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPaneFicha, javax.swing.GroupLayout.Alignment.TRAILING))
            );

            pack();
      }// </editor-fold>//GEN-END:initComponents

      private void jTableArmaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTableArmaFocusGained
            jTableConsumiveis.clearSelection();
            jTableArmadura.clearSelection();
            selecionado = jTableArma;
      }//GEN-LAST:event_jTableArmaFocusGained

      private void jTableArmaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTableArmaFocusLost

      }//GEN-LAST:event_jTableArmaFocusLost

      private void jTableConsumiveisFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTableConsumiveisFocusGained
            jTableArmadura.clearSelection();
            jTableArma.clearSelection();
            selecionado = jTableConsumiveis;
      }//GEN-LAST:event_jTableConsumiveisFocusGained

      private void jTableArmaduraFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTableArmaduraFocusGained
            jTableConsumiveis.clearSelection();
            jTableArma.clearSelection();
            selecionado = jTableArmadura;
      }//GEN-LAST:event_jTableArmaduraFocusGained

      private void invRemoverButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_invRemoverButtonMousePressed
            invRemoverButton.setForeground(Color.WHITE);
      }//GEN-LAST:event_invRemoverButtonMousePressed

      private void invRemoverButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_invRemoverButtonMouseReleased
            invRemoverButton.setForeground(Color.BLACK);
      }//GEN-LAST:event_invRemoverButtonMouseReleased

      private void invRemoverButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invRemoverButtonActionPerformed
                 int linha;
          int valor;

          if (selecionado != null) {
                linha = selecionado.getSelectedRow();
                if (!(linha == -1) && selecionado.getValueAt(linha, 0) != null) {

                      if (selecionado == jTableArmadura) {
                            try {
                                  if(!selecionado.getValueAt(linha, 0).toString().equalsIgnoreCase("ROUPAS") || (selecionado.getValueAt(linha, 0).toString().equalsIgnoreCase("ROUPAS") && (Integer.parseInt(selecionado.getValueAt(linha, 2).toString())) > 1)){
                                          valor = Integer.parseInt(selecionado.getValueAt(linha, 2).toString());
                                          valor -= 1;
                                          enviarRem(selecionado.getValueAt(linha, 0).toString(), "ARMADURA");
                                          if (valor == 0) {
                                                try {
                                                      if (selecionado.getValueAt(linha, 0).toString().equalsIgnoreCase(FichaArmorELabel.getText())) {
                                                            FichaArmorELabel.setText("");
                                                      }

                                                      FichaDefLb.setText(txfAgilidade.getText());
                                                      removeLinha(jTableArmadura, linha);
                                                } catch (PrinterException ex) {
                                                      java.util.logging.Logger.getLogger(Ficha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                                                }
                                          } else {
                                                selecionado.setValueAt(valor, linha, 2);
                                          }
                                    }else{
                                          JOptionPane.showMessageDialog(null, "Você deve manter pelo menos 1 Roupa", "ERRO", ERROR_MESSAGE);
                                        
                                  }  
                                  }catch (IOException ex) {
                                          java.util.logging.Logger.getLogger(Ficha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                                    }
                                    

                      } else if (selecionado == jTableConsumiveis) {
                            try {
                                  valor = Integer.parseInt(selecionado.getValueAt(linha, 1).toString());
                                  valor -= 1;
                                  enviarRem(selecionado.getValueAt(linha, 0).toString(), "CONSUMIVEL");

                                  if (valor == 0) {
                                        try {
                                              removeLinha(jTableConsumiveis, linha);
                                        } catch (PrinterException ex) {
                                              java.util.logging.Logger.getLogger(Ficha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                                        }
                                  } else {
                                        selecionado.setValueAt(valor, linha, 1);
                                  }
                            } catch (IOException ex) {
                                  java.util.logging.Logger.getLogger(Ficha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                            }
                      } else if (selecionado == jTableArma) {
                            try {
                                  valor = Integer.parseInt(selecionado.getValueAt(linha, 3).toString());
                                  valor -= 1;
                                  enviarRem(selecionado.getValueAt(linha, 0).toString(), "ARMA");

                                  if (valor == 0) {
                                        try {
                                              removeLinha(jTableArma, linha);
                                        } catch (PrinterException ex) {
                                              java.util.logging.Logger.getLogger(Ficha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                                        }
                                  } else {
                                        selecionado.setValueAt(valor, linha, 3);
                                  }
                            } catch (IOException ex) {
                                  java.util.logging.Logger.getLogger(Ficha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                            }
                      }
                }
          } else {
                System.out.println("Linha Invalida");
          }
      }//GEN-LAST:event_invRemoverButtonActionPerformed

      private void btnConfirmarFichaMestreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarFichaMestreActionPerformed
            String[][] saida;
            boolean travou = false;
            
             Pattern padrao = Pattern.compile("^[0-9]+");
            Matcher match;
            
            JTextField texts[] = getPaineis();
            String[] array = new String[texts.length];
            
            int i = 0;
            for(JTextField t : texts){
                  match = padrao.matcher(t.getText());
                  if(match.matches()){
                        array[i] = t.getText();
                        i++;
                  }else{
                        JOptionPane.showMessageDialog(null, "Insira valores validos", "ERRO", ERROR_MESSAGE);
                        travou = true;
                        break;
                  }
            }
            
            if(!travou){
                  try {
                        saida = new String[array.length+2][1];
                        saida[0][0] = "/atualizarVFicha";
                        saida[1][0] = FichaNomelLb.getText();
                        i = 2;
                        for(String s: array){
                              System.out.println(s);
                              saida[i][0] = s;
                              i++;
                        }   
                        control.getSaida().reset();
                        control.getSaida().writeObject(saida);
                        
                        FichaTaxaLb.setText(Integer.toString(Integer.parseInt(txfSaude.getText())/4));
                        FichaDefLb.setText(txfAgilidade.getText());
                        
                        btnForca.setText(Integer.toString(Integer.parseInt(txfForca.getText()) - 10));
                        btnIntelecto.setText(Integer.toString(Integer.parseInt(txfInteligencia.getText()) - 10));
                        btnPercepcao.setText(Integer.toString(Integer.parseInt(txfPercepcao.getText()) - 10));
                        btnAgilidade.setText(Integer.toString(Integer.parseInt(txfAgilidade.getText()) - 10));
                        btnVontade.setText(Integer.toString(Integer.parseInt(txfVontade.getText()) - 10));  
                        
                        
                  } catch (IOException ex) {
                        java.util.logging.Logger.getLogger(FichaMestre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                  }
            }
      }//GEN-LAST:event_btnConfirmarFichaMestreActionPerformed

      private void btnAddFichaMestreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddFichaMestreActionPerformed
         jFrameEquips.setVisible(true);
         jPaneEquips.setVisible(true);
         jPaneListaEquips.setVisible(false);
      }//GEN-LAST:event_btnAddFichaMestreActionPerformed

      private void btnSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionarActionPerformed
           String saida[][] = new String[1][2];
           if(jListPersonagens.getSelectedValue() != null && !jListPersonagens.getSelectedValue().equals("")){
                 try {
                       saida[0][0] = "/fichaMestreEnviar";
                       saida[0][1] = jListPersonagens.getSelectedValue();
                       
                       control.getSaida().reset();
                       control.getSaida().writeObject(saida);
                       jPaneListaMestre.setVisible(false);
                       jPaneFicha.setVisible(true);
                 } catch (IOException ex) {
                       java.util.logging.Logger.getLogger(FichaMestre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                 }
           }
            
            
            
      }//GEN-LAST:event_btnSelecionarActionPerformed

      private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
                  jPaneFicha.setVisible(false);
                  jPaneListaMestre.setVisible(true);
      }//GEN-LAST:event_formWindowClosing
      
      private String tipoItem;
      
      private void btnListaArmasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaArmasActionPerformed
            try {
                  String[][] mensagem = new String[1][1];
                  mensagem[0][0] = "/listaArmas";
                  jPaneEquips.setVisible(false);
                  jPaneListaEquips.setVisible(true);
                  tipoItem = "ARMA";
                  
                  control.getSaida().reset();
                  control.getSaida().writeObject(mensagem);
            } catch (IOException ex) {
                  java.util.logging.Logger.getLogger(FichaMestre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
      }//GEN-LAST:event_btnListaArmasActionPerformed

      private void jFrameEquipsWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jFrameEquipsWindowClosing
           jPaneEquips.setVisible(true);
          jPaneListaEquips.setVisible(false);
      }//GEN-LAST:event_jFrameEquipsWindowClosing

      private void btnListaArmadurasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaArmadurasActionPerformed
            try {
                  String[][] mensagem = new String[1][1];
                  mensagem[0][0] = "/listaArmaduras";
                  jPaneEquips.setVisible(false);
                  jPaneListaEquips.setVisible(true);
                  tipoItem = "ARMADURA";
                  
                  control.getSaida().reset();
                  control.getSaida().writeObject(mensagem);
            } catch (IOException ex) {
                  java.util.logging.Logger.getLogger(FichaMestre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
      }//GEN-LAST:event_btnListaArmadurasActionPerformed

      private void btnListaConsumiveisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaConsumiveisActionPerformed
            try {
                  String[][] mensagem = new String[1][1];
                  mensagem[0][0] = "/listaConsumiveis";
                  jPaneEquips.setVisible(false);
                  jPaneListaEquips.setVisible(true);
                  tipoItem = "CONSUMIVEL";
                          
                  
                  control.getSaida().reset();
                  control.getSaida().writeObject(mensagem);
            } catch (IOException ex) {
                  java.util.logging.Logger.getLogger(FichaMestre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
      }//GEN-LAST:event_btnListaConsumiveisActionPerformed

      private void btnListaAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaAddActionPerformed
          String[][] mensagem = new String[4][1];
                  
          if(listaEquips.getSelectedValue() != null){
                try {
                      mensagem[0][0] = "/addInv";
                      mensagem[1][0] =  tipoItem;
                      mensagem[2][0] = listaEquips.getSelectedValue();
                      mensagem[3][0] = FichaNomelLb.getText();
                      System.out.println(mensagem[2][0]);
                      
                      control.getSaida().reset();
                      control.getSaida().writeObject(mensagem);
                } catch (IOException ex) {
                      java.util.logging.Logger.getLogger(FichaMestre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
          }
            
      }//GEN-LAST:event_btnListaAddActionPerformed

    private void btnAddFichaMestreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddFichaMestreMousePressed
         btnAddFichaMestre.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnAddFichaMestreMousePressed

    private void btnAddFichaMestreMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddFichaMestreMouseReleased
        btnAddFichaMestre.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnAddFichaMestreMouseReleased

    private void btnListaAddMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnListaAddMousePressed
       btnListaAdd.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnListaAddMousePressed

    private void btnListaAddMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnListaAddMouseReleased
        btnListaAdd.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnListaAddMouseReleased

    private void btnListaArmasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnListaArmasMousePressed
        btnListaArmas.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnListaArmasMousePressed

    private void btnListaArmasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnListaArmasMouseReleased
        btnListaArmas.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnListaArmasMouseReleased

    private void btnListaConsumiveisMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnListaConsumiveisMousePressed
        btnListaConsumiveis.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnListaConsumiveisMousePressed

    private void btnListaConsumiveisMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnListaConsumiveisMouseReleased
        btnListaConsumiveis.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnListaConsumiveisMouseReleased

    private void btnListaArmadurasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnListaArmadurasMousePressed
        btnListaArmaduras.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnListaArmadurasMousePressed

    private void btnListaArmadurasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnListaArmadurasMouseReleased
        btnListaArmaduras.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnListaArmadurasMouseReleased
       
      public void montarListaPers(String[][] mensagem){
             DefaultListModel model = new DefaultListModel();
             
             for(int i = 1; i < mensagem.length;i++){
                   model.addElement(mensagem[i][0]);
             }
             jListPersonagens.setModel(model);
      }
      
      public JTable[] getTables() {
        JTable arrayTables[] = new JTable[3];

        arrayTables[0] = jTableArma;
        arrayTables[1] = jTableArmadura;
        arrayTables[2] = jTableConsumiveis;

        return arrayTables;
    }

    public int iteraTable(JTable table, String conteudo) throws PrinterException {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        int retorno = model.getRowCount();
        model.insertRow(table.getRowCount(), new Object[]{conteudo});
        return retorno;
    }

    public void removeLinha(JTable table, int linha) throws PrinterException {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.removeRow(linha);
    }
    
    public JLabel[] getLabels() {
            JLabel arrayLabels[] = new JLabel[7];

            arrayLabels[0] = FichaNomelLb;
            arrayLabels[1] = lblIdade;
            arrayLabels[2] = FichaAncelLb;
            arrayLabels[3] = FichaTamLb;
            arrayLabels[4] = FichaDesLb;
            arrayLabels[5] = FichaTaxaLb;
            arrayLabels[6] = FichaDefLb;

            return arrayLabels;

      }

    public JTextField[] getPaineis() {
            JTextField array[] = new JTextField[12];

            
            array[0] = txfForca;
            array[1] = txfAgilidade;
            array[2] = txfInteligencia;
            array[3] = txfVontade;
            array[4] = txfSaude;
            array[5] = txfNivel;
            array[6] = txfInsanidade;
            array[7] = txfCorrupcao;
            array[8] = txfPoder;
            array[9] = txfDano;
            array[10] = txfPercepcao;
            array[11] = txfDinheiro;

            return array;

      }

    public JButton[] getButtons() {

        JButton arrayButton[] = new JButton[5];

        arrayButton[0] = btnForca;
        arrayButton[1] = btnAgilidade;
        arrayButton[2] = btnIntelecto;
        arrayButton[3] = btnVontade;
        arrayButton[4] = btnPercepcao;

        return arrayButton;
    }
    
        
    public void montarListaArmas(String[][] mensagem){
            DefaultListModel model = new DefaultListModel();
             
             for(int i = 1; i < mensagem.length;i++){
                 if(mensagem[i][0].equalsIgnoreCase("ARMA"))
                        model.addElement(mensagem[i][1]);
             }
             listaEquips.setModel(model);
    }
    
    public void montarListaArmaduras(String[][] mensagem){
          DefaultListModel model = new DefaultListModel();
             
             for(int i = 1; i < mensagem.length;i++){
                    if(mensagem[i][0].equalsIgnoreCase("ARMADURA"))
                   model.addElement(mensagem[i][1]);
             }
             listaEquips.setModel(model);
    }

    public void montarListaConsumiveis(String[][] mensagem){
          DefaultListModel model = new DefaultListModel();
             
             for(int i = 1; i < mensagem.length;i++){
                  if(mensagem[i][0].equalsIgnoreCase("CONSUMIVEL"))
                        model.addElement(mensagem[i][1]);
             }
             listaEquips.setModel(model);
    }
    
      
      public void enviarRem(String nomeItem,String tipoItem) throws IOException{
          String[][] mensagem = new String[1][4];
          mensagem[0][0] = "/removerInvMestre";
          mensagem[0][1] = nomeItem;
          mensagem[0][2] = tipoItem;
          mensagem[0][3] = FichaNomelLb.getText();
          
          control.getSaida().writeObject(mensagem);
    }
      
      /**
       * @param args the command line arguments
       */
      public static void main(String args[]) {
            /* Set the Nimbus look and feel */
            //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
            /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
             */
            try {
                  for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                        if ("Nimbus".equals(info.getName())) {
                              javax.swing.UIManager.setLookAndFeel(info.getClassName());
                              break;
                        }
                  }
            } catch (ClassNotFoundException ex) {
                  java.util.logging.Logger.getLogger(FichaMestre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                  java.util.logging.Logger.getLogger(FichaMestre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                  java.util.logging.Logger.getLogger(FichaMestre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                  java.util.logging.Logger.getLogger(FichaMestre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            //</editor-fold>

            /* Create and display the form */
      }

      // Variables declaration - do not modify//GEN-BEGIN:variables
      private javax.swing.JLabel FichaAncelLb;
      private javax.swing.JLabel FichaArmorELabel;
      private javax.swing.JLabel FichaBacground;
      private javax.swing.JLabel FichaDefLb;
      private javax.swing.JLabel FichaDesLb;
      private javax.swing.JLabel FichaNomelLb;
      private javax.swing.JLabel FichaTamLb;
      private javax.swing.JLabel FichaTaxaLb;
      private javax.swing.JButton btnAddFichaMestre;
      private javax.swing.JButton btnAgilidade;
      private javax.swing.JButton btnConfirmarFichaMestre;
      private javax.swing.JButton btnForca;
      private javax.swing.JButton btnIntelecto;
      private javax.swing.JButton btnListaAdd;
      private javax.swing.JButton btnListaArmaduras;
      private javax.swing.JButton btnListaArmas;
      private javax.swing.JButton btnListaConsumiveis;
      private javax.swing.JButton btnPercepcao;
      private javax.swing.JButton btnSelecionar;
      private javax.swing.JButton btnVontade;
      private javax.swing.JLabel fundoMochila;
      private javax.swing.JButton invRemoverButton;
      private javax.swing.JFrame jFrameEquips;
      private javax.swing.JLabel jLabel1;
      private javax.swing.JLabel jLabel10;
      private javax.swing.JLabel jLabel2;
      private javax.swing.JLabel jLabel3;
      private javax.swing.JLabel jLabel4;
      private javax.swing.JLabel jLabel5;
      private javax.swing.JLabel jLabel6;
      private javax.swing.JLabel jLabel7;
      private javax.swing.JLabel jLabel8;
      private javax.swing.JLabel jLabel9;
      private javax.swing.JLayeredPane jLayeredPane4;
      private javax.swing.JLayeredPane jLayeredPane5;
      private javax.swing.JList<String> jListPersonagens;
      private javax.swing.JLayeredPane jPaneEquips;
      private javax.swing.JLayeredPane jPaneFicha;
      private javax.swing.JLayeredPane jPaneListaEquips;
      private javax.swing.JLayeredPane jPaneListaMestre;
      private javax.swing.JScrollPane jScrollPane1;
      private javax.swing.JScrollPane jScrollPane2;
      private javax.swing.JScrollPane jScrollPane3;
      private javax.swing.JScrollPane jScrollPane4;
      private javax.swing.JScrollPane jScrollPane5;
      private javax.swing.JTabbedPane jTabbedPane2;
      private javax.swing.JTable jTableArma;
      private javax.swing.JTable jTableArmadura;
      private javax.swing.JTable jTableConsumiveis;
      private javax.swing.JLabel lblDinheiro;
      private javax.swing.JLabel lblFundoInventario;
      private javax.swing.JLabel lblIdade;
      private javax.swing.JLabel lblMoedas;
      private javax.swing.JList<String> listaEquips;
      private javax.swing.JTextField txfAgilidade;
      private javax.swing.JTextField txfCorrupcao;
      private javax.swing.JTextField txfDano;
      private javax.swing.JTextField txfDinheiro;
      private javax.swing.JTextField txfForca;
      private javax.swing.JTextField txfInsanidade;
      private javax.swing.JTextField txfInteligencia;
      private javax.swing.JTextField txfNivel;
      private javax.swing.JTextField txfPercepcao;
      private javax.swing.JTextField txfPoder;
      private javax.swing.JTextField txfSaude;
      private javax.swing.JTextField txfVontade;
      // End of variables declaration//GEN-END:variables
}
