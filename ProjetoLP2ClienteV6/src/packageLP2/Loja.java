package packageLP2;

import java.awt.Color;
import java.awt.Font;
import static java.awt.Font.BOLD;
import java.awt.print.PrinterException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rafae
 */
public class Loja extends javax.swing.JFrame {

    private JTable selecionado = null;
    private final ControladorLoja controlLoja;
    
    public Loja(ControladorLoja controlLoja) {
        initComponents();
        initLabels();
       this.controlLoja = controlLoja;
       verLoja.setEnabled(false);
    }
    
    private void initLabels(){
      //  btnCompra.setOpaque(false);
        btnCompra.setContentAreaFilled(false);
        btnCompra.setBorderPainted(false);
        
        lojaLayeredPane.setVisible(false);
        mestreLayeredPane.setVisible(true);
        montarLojaLayeredPane.setVisible(false);
        exemploLojaLayeredPane.setVisible(false);
        
        criarLoja.setContentAreaFilled(false);
        criarLoja.setBorderPainted(false);
        verLoja.setContentAreaFilled(false);
        verLoja.setBorderPainted(false);
        fecharLoja.setContentAreaFilled(false);
        fecharLoja.setBorderPainted(false);
        zerarLoja.setContentAreaFilled(false);
        zerarLoja.setBorderPainted(false);
        confirmarLoja.setContentAreaFilled(false);
        confirmarLoja.setBorderPainted(false);
        btnVoltar.setContentAreaFilled(false);
        btnVoltar.setBorderPainted(false);
        btnVoltar1.setContentAreaFilled(false);
        btnVoltar1.setBorderPainted(false);
    }
  
    @SuppressWarnings("unchecked")
      // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
      private void initComponents() {

            montarLojaLayeredPane = new javax.swing.JLayeredPane();
            scrollPaneConsumiveis1 = new javax.swing.JScrollPane();
            jTableConsumiveis1 = new javax.swing.JTable();
            scrollPaneArmaduraLoja1 = new javax.swing.JScrollPane();
            jTableLojaArmaduras1 = new javax.swing.JTable();
            scrollPaneArmasLoja1 = new javax.swing.JScrollPane();
            jTableLojaArmas1 = new javax.swing.JTable();
            confirmarLoja = new javax.swing.JButton();
            zerarLoja = new javax.swing.JButton();
            btnVoltar = new javax.swing.JButton();
            jLabel3 = new javax.swing.JLabel();
            jLabel2 = new javax.swing.JLabel();
            fundoLoja1 = new javax.swing.JLabel();
            mestreLayeredPane = new javax.swing.JLayeredPane();
            criarLoja = new javax.swing.JButton();
            verLoja = new javax.swing.JButton();
            fecharLoja = new javax.swing.JButton();
            jLabel7 = new javax.swing.JLabel();
            jLabel6 = new javax.swing.JLabel();
            jLabel1 = new javax.swing.JLabel();
            fundoLojaMestre = new javax.swing.JLabel();
            lojaLayeredPane = new javax.swing.JLayeredPane();
            scrollPaneConsumiveis2 = new javax.swing.JScrollPane();
            jTableConsumiveis = new javax.swing.JTable();
            scrollPaneArmaduraLoja2 = new javax.swing.JScrollPane();
            jTableLojaArmaduras = new javax.swing.JTable();
            scrollPaneArmasLoja2 = new javax.swing.JScrollPane();
            jTableLojaArmas = new javax.swing.JTable();
            btnCompra = new javax.swing.JButton();
            btnVoltar1 = new javax.swing.JButton();
            jLabel4 = new javax.swing.JLabel();
            fundoLoja2 = new javax.swing.JLabel();
            exemploLojaLayeredPane = new javax.swing.JLayeredPane();
            scrollPaneConsumiveis3 = new javax.swing.JScrollPane();
            jTableConsumiveis2 = new javax.swing.JTable();
            scrollPaneArmaduraLoja3 = new javax.swing.JScrollPane();
            jTableLojaArmaduras2 = new javax.swing.JTable();
            scrollPaneArmasLoja3 = new javax.swing.JScrollPane();
            jTableLojaArmas2 = new javax.swing.JTable();
            fundoLoja3 = new javax.swing.JLabel();

            setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
            setTitle("LOJA");
            setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
            setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
            setMaximumSize(new java.awt.Dimension(800, 550));
            setMinimumSize(new java.awt.Dimension(800, 550));
            setPreferredSize(new java.awt.Dimension(800, 550));
            setResizable(false);
            setSize(new java.awt.Dimension(800, 550));
            addWindowListener(new java.awt.event.WindowAdapter() {
                  public void windowClosed(java.awt.event.WindowEvent evt) {
                        formWindowClosed(evt);
                  }
            });
            getContentPane().setLayout(null);

            montarLojaLayeredPane.setMaximumSize(new java.awt.Dimension(800, 550));
            montarLojaLayeredPane.setMinimumSize(new java.awt.Dimension(800, 550));
            montarLojaLayeredPane.setOpaque(true);
            montarLojaLayeredPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            jTableConsumiveis1.setModel(new javax.swing.table.DefaultTableModel(
                  new Object [][] {

                  },
                  new String [] {
                        "Nome", "Quantidade", "Preço"
                  }
            ) {
                  Class[] types = new Class [] {
                        java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
                  };
                  boolean[] canEdit = new boolean [] {
                        false, true, false
                  };

                  public Class getColumnClass(int columnIndex) {
                        return types [columnIndex];
                  }

                  public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return canEdit [columnIndex];
                  }
            });
            jTableConsumiveis1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
            jTableConsumiveis1.getTableHeader().setReorderingAllowed(false);
            scrollPaneConsumiveis1.setViewportView(jTableConsumiveis1);

            montarLojaLayeredPane.add(scrollPaneConsumiveis1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 400, 100));

            jTableLojaArmaduras1.setModel(new javax.swing.table.DefaultTableModel(
                  new Object [][] {

                  },
                  new String [] {
                        "Nome", "Defesa", "Quantidade", "Preço"
                  }
            ) {
                  Class[] types = new Class [] {
                        java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
                  };
                  boolean[] canEdit = new boolean [] {
                        false, false, true, false
                  };

                  public Class getColumnClass(int columnIndex) {
                        return types [columnIndex];
                  }

                  public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return canEdit [columnIndex];
                  }
            });
            jTableLojaArmaduras1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
            jTableLojaArmaduras1.getTableHeader().setReorderingAllowed(false);
            scrollPaneArmaduraLoja1.setViewportView(jTableLojaArmaduras1);

            montarLojaLayeredPane.add(scrollPaneArmaduraLoja1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 530, 110));

            jTableLojaArmas1.setModel(new javax.swing.table.DefaultTableModel(
                  new Object [][] {

                  },
                  new String [] {
                        "Nome", "Modificador", "Dano", "Defesa", "Quantidade", "Preço"
                  }
            ) {
                  Class[] types = new Class [] {
                        java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
                  };
                  boolean[] canEdit = new boolean [] {
                        false, false, false, false, true, false
                  };

                  public Class getColumnClass(int columnIndex) {
                        return types [columnIndex];
                  }

                  public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return canEdit [columnIndex];
                  }
            });
            jTableLojaArmas1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
            jTableLojaArmas1.getTableHeader().setReorderingAllowed(false);
            scrollPaneArmasLoja1.setViewportView(jTableLojaArmas1);

            montarLojaLayeredPane.add(scrollPaneArmasLoja1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 750, 110));

            confirmarLoja.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
            confirmarLoja.setText("Confirmar");
            confirmarLoja.setMaximumSize(new java.awt.Dimension(100, 40));
            confirmarLoja.setMinimumSize(new java.awt.Dimension(100, 40));
            confirmarLoja.setPreferredSize(new java.awt.Dimension(100, 40));
            confirmarLoja.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mousePressed(java.awt.event.MouseEvent evt) {
                        confirmarLojaMousePressed(evt);
                  }
                  public void mouseReleased(java.awt.event.MouseEvent evt) {
                        confirmarLojaMouseReleased(evt);
                  }
            });
            confirmarLoja.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        confirmarLojaActionPerformed(evt);
                  }
            });
            montarLojaLayeredPane.add(confirmarLoja, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 130, 50));

            zerarLoja.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
            zerarLoja.setText("Zerar");
            zerarLoja.setMaximumSize(new java.awt.Dimension(100, 40));
            zerarLoja.setMinimumSize(new java.awt.Dimension(100, 40));
            zerarLoja.setPreferredSize(new java.awt.Dimension(100, 40));
            zerarLoja.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mousePressed(java.awt.event.MouseEvent evt) {
                        zerarLojaMousePressed(evt);
                  }
                  public void mouseReleased(java.awt.event.MouseEvent evt) {
                        zerarLojaMouseReleased(evt);
                  }
            });
            zerarLoja.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        zerarLojaActionPerformed(evt);
                  }
            });
            montarLojaLayeredPane.add(zerarLoja, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 130, 50));

            btnVoltar.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
            btnVoltar.setText("Voltar");
            btnVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mousePressed(java.awt.event.MouseEvent evt) {
                        btnVoltarMousePressed(evt);
                  }
                  public void mouseReleased(java.awt.event.MouseEvent evt) {
                        btnVoltarMouseReleased(evt);
                  }
            });
            btnVoltar.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        btnVoltarActionPerformed(evt);
                  }
            });
            montarLojaLayeredPane.add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 120, 50));

            jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packageLP2/Imagens/placas.png"))); // NOI18N
            montarLojaLayeredPane.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

            jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packageLP2/Imagens/botao2.png"))); // NOI18N
            montarLojaLayeredPane.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 140, 70));

            fundoLoja1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packageLP2/Imagens/loja1.jpg"))); // NOI18N
            montarLojaLayeredPane.add(fundoLoja1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 510));

            getContentPane().add(montarLojaLayeredPane);
            montarLojaLayeredPane.setBounds(0, 0, 820, 510);

            mestreLayeredPane.setMaximumSize(new java.awt.Dimension(800, 550));
            mestreLayeredPane.setMinimumSize(new java.awt.Dimension(800, 550));

            criarLoja.setFont(new java.awt.Font("Sitka Display", 1, 16)); // NOI18N
            criarLoja.setText("Criar Loja");
            criarLoja.setMaximumSize(new java.awt.Dimension(100, 40));
            criarLoja.setMinimumSize(new java.awt.Dimension(100, 40));
            criarLoja.setPreferredSize(new java.awt.Dimension(100, 40));
            criarLoja.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mousePressed(java.awt.event.MouseEvent evt) {
                        criarLojaMousePressed(evt);
                  }
                  public void mouseReleased(java.awt.event.MouseEvent evt) {
                        criarLojaMouseReleased(evt);
                  }
            });
            criarLoja.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        criarLojaActionPerformed(evt);
                  }
            });
            mestreLayeredPane.add(criarLoja);
            criarLoja.setBounds(320, 140, 120, 50);

            verLoja.setFont(new java.awt.Font("Sitka Display", 1, 16)); // NOI18N
            verLoja.setText("Ver Loja");
            verLoja.setMaximumSize(new java.awt.Dimension(100, 40));
            verLoja.setMinimumSize(new java.awt.Dimension(100, 40));
            verLoja.setPreferredSize(new java.awt.Dimension(100, 40));
            verLoja.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mousePressed(java.awt.event.MouseEvent evt) {
                        verLojaMousePressed(evt);
                  }
                  public void mouseReleased(java.awt.event.MouseEvent evt) {
                        verLojaMouseReleased(evt);
                  }
            });
            verLoja.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        verLojaActionPerformed(evt);
                  }
            });
            mestreLayeredPane.add(verLoja);
            verLoja.setBounds(320, 220, 120, 50);

            fecharLoja.setFont(new java.awt.Font("Sitka Display", 1, 16)); // NOI18N
            fecharLoja.setText("Fechar Loja");
            fecharLoja.setMaximumSize(new java.awt.Dimension(100, 40));
            fecharLoja.setMinimumSize(new java.awt.Dimension(100, 40));
            fecharLoja.setPreferredSize(new java.awt.Dimension(100, 40));
            fecharLoja.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mousePressed(java.awt.event.MouseEvent evt) {
                        fecharLojaMousePressed(evt);
                  }
                  public void mouseReleased(java.awt.event.MouseEvent evt) {
                        fecharLojaMouseReleased(evt);
                  }
            });
            fecharLoja.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        fecharLojaActionPerformed(evt);
                  }
            });
            mestreLayeredPane.add(fecharLoja);
            fecharLoja.setBounds(320, 300, 120, 50);

            jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
            jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packageLP2/Imagens/botao2.png"))); // NOI18N
            mestreLayeredPane.add(jLabel7);
            jLabel7.setBounds(320, 290, 120, 70);

            jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
            jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packageLP2/Imagens/botao2.png"))); // NOI18N
            mestreLayeredPane.add(jLabel6);
            jLabel6.setBounds(320, 210, 120, 70);

            jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packageLP2/Imagens/botao2.png"))); // NOI18N
            jLabel1.setToolTipText("");
            mestreLayeredPane.add(jLabel1);
            jLabel1.setBounds(320, 130, 120, 70);

            fundoLojaMestre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packageLP2/Imagens/loja2.gif"))); // NOI18N
            fundoLojaMestre.setToolTipText("");
            mestreLayeredPane.add(fundoLojaMestre);
            fundoLojaMestre.setBounds(-10, -20, 800, 570);

            getContentPane().add(mestreLayeredPane);
            mestreLayeredPane.setBounds(0, 0, 800, 550);

            lojaLayeredPane.setMaximumSize(new java.awt.Dimension(800, 550));
            lojaLayeredPane.setMinimumSize(new java.awt.Dimension(800, 550));
            lojaLayeredPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            jTableConsumiveis.setModel(new javax.swing.table.DefaultTableModel(
                  new Object [][] {

                  },
                  new String [] {
                        "Nome", "Quantidade", "Preço"
                  }
            ) {
                  Class[] types = new Class [] {
                        java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
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
            jTableConsumiveis.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
            jTableConsumiveis.getTableHeader().setReorderingAllowed(false);
            jTableConsumiveis.addFocusListener(new java.awt.event.FocusAdapter() {
                  public void focusGained(java.awt.event.FocusEvent evt) {
                        jTableConsumiveisFocusGained(evt);
                  }
            });
            scrollPaneConsumiveis2.setViewportView(jTableConsumiveis);

            lojaLayeredPane.add(scrollPaneConsumiveis2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 400, 100));

            jTableLojaArmaduras.setModel(new javax.swing.table.DefaultTableModel(
                  new Object [][] {

                  },
                  new String [] {
                        "Nome", "Defesa", "Quantidade", "Preço"
                  }
            ) {
                  Class[] types = new Class [] {
                        java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
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
            jTableLojaArmaduras.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
            jTableLojaArmaduras.getTableHeader().setReorderingAllowed(false);
            jTableLojaArmaduras.addFocusListener(new java.awt.event.FocusAdapter() {
                  public void focusGained(java.awt.event.FocusEvent evt) {
                        jTableLojaArmadurasFocusGained(evt);
                  }
            });
            scrollPaneArmaduraLoja2.setViewportView(jTableLojaArmaduras);

            lojaLayeredPane.add(scrollPaneArmaduraLoja2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 530, 110));

            jTableLojaArmas.setModel(new javax.swing.table.DefaultTableModel(
                  new Object [][] {

                  },
                  new String [] {
                        "Nome", "Modificador", "Dano", "Defesa", "Quantidade", "Preço"
                  }
            ) {
                  Class[] types = new Class [] {
                        java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class
                  };
                  boolean[] canEdit = new boolean [] {
                        false, false, false, false, false, false
                  };

                  public Class getColumnClass(int columnIndex) {
                        return types [columnIndex];
                  }

                  public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return canEdit [columnIndex];
                  }
            });
            jTableLojaArmas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
            jTableLojaArmas.getTableHeader().setReorderingAllowed(false);
            jTableLojaArmas.addFocusListener(new java.awt.event.FocusAdapter() {
                  public void focusGained(java.awt.event.FocusEvent evt) {
                        jTableLojaArmasFocusGained(evt);
                  }
            });
            scrollPaneArmasLoja2.setViewportView(jTableLojaArmas);

            lojaLayeredPane.add(scrollPaneArmasLoja2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, 660, 110));

            btnCompra.setFont(new java.awt.Font("Sitka Display", 0, 24)); // NOI18N
            btnCompra.setText("COMPRA");
            btnCompra.setMaximumSize(new java.awt.Dimension(100, 40));
            btnCompra.setMinimumSize(new java.awt.Dimension(100, 40));
            btnCompra.setPreferredSize(new java.awt.Dimension(100, 40));
            btnCompra.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mousePressed(java.awt.event.MouseEvent evt) {
                        btnCompraMousePressed(evt);
                  }
                  public void mouseReleased(java.awt.event.MouseEvent evt) {
                        btnCompraMouseReleased(evt);
                  }
            });
            btnCompra.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        btnCompraActionPerformed(evt);
                  }
            });
            lojaLayeredPane.add(btnCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 120, 50));

            btnVoltar1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
            btnVoltar1.setText("Voltar");
            btnVoltar1.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mousePressed(java.awt.event.MouseEvent evt) {
                        btnVoltar1MousePressed(evt);
                  }
                  public void mouseReleased(java.awt.event.MouseEvent evt) {
                        btnVoltar1MouseReleased(evt);
                  }
            });
            btnVoltar1.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        btnVoltar1ActionPerformed(evt);
                  }
            });
            lojaLayeredPane.add(btnVoltar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 120, 50));

            jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packageLP2/Imagens/placas.png"))); // NOI18N
            lojaLayeredPane.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

            fundoLoja2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packageLP2/Imagens/loja1.jpg"))); // NOI18N
            lojaLayeredPane.add(fundoLoja2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 510));

            getContentPane().add(lojaLayeredPane);
            lojaLayeredPane.setBounds(0, 0, 820, 510);

            exemploLojaLayeredPane.setMaximumSize(new java.awt.Dimension(800, 550));
            exemploLojaLayeredPane.setMinimumSize(new java.awt.Dimension(800, 550));
            exemploLojaLayeredPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            jTableConsumiveis2.setModel(new javax.swing.table.DefaultTableModel(
                  new Object [][] {

                  },
                  new String [] {
                        "Nome", "Quantidade", "Preço"
                  }
            ) {
                  Class[] types = new Class [] {
                        java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
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
            scrollPaneConsumiveis3.setViewportView(jTableConsumiveis2);

            exemploLojaLayeredPane.add(scrollPaneConsumiveis3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 400, 100));

            jTableLojaArmaduras2.setModel(new javax.swing.table.DefaultTableModel(
                  new Object [][] {

                  },
                  new String [] {
                        "Nome", "Defesa", "Quantidade", "Preço"
                  }
            ) {
                  Class[] types = new Class [] {
                        java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
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
            scrollPaneArmaduraLoja3.setViewportView(jTableLojaArmaduras2);

            exemploLojaLayeredPane.add(scrollPaneArmaduraLoja3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 530, 110));

            jTableLojaArmas2.setModel(new javax.swing.table.DefaultTableModel(
                  new Object [][] {

                  },
                  new String [] {
                        "Nome", "Modificador", "Dano", "Defesa", "Quantidade", "Preço"
                  }
            ) {
                  Class[] types = new Class [] {
                        java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
                  };
                  boolean[] canEdit = new boolean [] {
                        false, false, false, false, false, false
                  };

                  public Class getColumnClass(int columnIndex) {
                        return types [columnIndex];
                  }

                  public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return canEdit [columnIndex];
                  }
            });
            jTableLojaArmas2.getTableHeader().setReorderingAllowed(false);
            scrollPaneArmasLoja3.setViewportView(jTableLojaArmas2);

            exemploLojaLayeredPane.add(scrollPaneArmasLoja3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, 660, 110));

            fundoLoja3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packageLP2/Imagens/loja1.jpg"))); // NOI18N
            exemploLojaLayeredPane.add(fundoLoja3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 510));

            getContentPane().add(exemploLojaLayeredPane);
            exemploLojaLayeredPane.setBounds(0, 0, 820, 510);

            pack();
      }// </editor-fold>//GEN-END:initComponents

      private void btnCompraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCompraMousePressed
            btnCompra.setForeground(Color.white);
      }//GEN-LAST:event_btnCompraMousePressed

      private void btnCompraMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCompraMouseReleased
            btnCompra.setForeground(Color.black);
      }//GEN-LAST:event_btnCompraMouseReleased

      private void criarLojaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criarLojaActionPerformed
          try {
                String[][] saida = new String[1][1];
                saida[0][0] = "/lojaMestre";
                 controlLoja.getSaida().reset();
                controlLoja.getSaida().writeObject(saida);
                montarLojaLayeredPane.setVisible(true);
                mestreLayeredPane.setVisible(false);
          } catch (IOException ex) {
                Logger.getLogger(Loja.class.getName()).log(Level.SEVERE, null, ex);
          }
      }//GEN-LAST:event_criarLojaActionPerformed

      private void verLojaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verLojaActionPerformed
             try {
                String[][] saida = new String[1][1];
                saida[0][0] = "/exemploLoja";
                 controlLoja.getSaida().reset();
                controlLoja.getSaida().writeObject(saida);
                exemploLojaLayeredPane.setVisible(true);
                mestreLayeredPane.setVisible(false);
          } catch (IOException ex) {
                Logger.getLogger(Loja.class.getName()).log(Level.SEVERE, null, ex);
          }
      }//GEN-LAST:event_verLojaActionPerformed

      private void fecharLojaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecharLojaActionPerformed
             try {
                String[][] saida = new String[1][1];
                saida[0][0] = "/fecharLoja";
                controlLoja.getSaida().reset();
                controlLoja.getSaida().writeObject(saida);
          } catch (IOException ex) {
                Logger.getLogger(Loja.class.getName()).log(Level.SEVERE, null, ex);
          }
      }//GEN-LAST:event_fecharLojaActionPerformed

      private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
            initLabels();
      }//GEN-LAST:event_formWindowClosed

      private void btnCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompraActionPerformed
          try {
              String saida[][] = new String[2][2];
                if(selecionado != null){
                saida[0][0] = "/comprar";
                saida[0][1] = Integer.toString(selecionado.getSelectedRow());

                if(selecionado == jTableLojaArmas){
                      saida[1][0] = selecionado.getValueAt(selecionado.getSelectedRow(), 0).toString();
                      saida[1][1] = "ARMA";
                }else if(selecionado == jTableLojaArmaduras){
                     saida[1][0] = selecionado.getValueAt(selecionado.getSelectedRow(), 0).toString();
                      saida[1][1] = "ARMADURA";
                }else if(selecionado == jTableConsumiveis){
                        saida[1][0] = selecionado.getValueAt(selecionado.getSelectedRow(), 0).toString();
                        saida[1][1] = "CONSUMIVEL";
               }


                controlLoja.getSaida().reset();
                controlLoja.getSaida().writeObject(saida);

                atualizarLinhaLocal(selecionado, selecionado.getSelectedRow());
             }

          } 
          catch (IOException ex) {
                Logger.getLogger(Loja.class.getName()).log(Level.SEVERE, null, ex);
          }   
          
      }//GEN-LAST:event_btnCompraActionPerformed

      private void confirmarLojaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarLojaActionPerformed
          verLoja.setEnabled(true);
          try {
                String[][] mensagem;
                
                int limArmas =  jTableLojaArmas1.getModel().getRowCount();
                int limArmad =  jTableLojaArmaduras1.getModel().getRowCount();
                int limCons =  jTableConsumiveis1.getModel().getRowCount();
                
                mensagem = new String[limArmas + limArmad + limCons + 1][7];
                
                mensagem[0][0] = "/atualizarLista";
                
                int m = 1;
                
                for(int i = 0;i < limArmas;i++){
                      mensagem[m][0] = "ARMA";
                      mensagem[m][1] = jTableLojaArmas1.getValueAt(i, 0).toString();
                      mensagem[m][2] = jTableLojaArmas1.getValueAt(i, 2).toString();
                      mensagem[m][3] = jTableLojaArmas1.getValueAt(i, 1).toString();
                      mensagem[m][4] = jTableLojaArmas1.getValueAt(i, 3).toString();
                      mensagem[m][5] = jTableLojaArmas1.getValueAt(i, 5).toString();
                      mensagem[m][6] = jTableLojaArmas1.getValueAt(i, 4).toString();
                      m++;
                }
                
                for(int i = 0;i < limArmad;i++){
                      mensagem[m][0] = "ARMADURA";
                      mensagem[m][1] = jTableLojaArmaduras1.getValueAt(i, 0).toString();
                      mensagem[m][4] = jTableLojaArmaduras1.getValueAt(i, 1).toString();
                      mensagem[m][5] = jTableLojaArmaduras1.getValueAt(i, 3).toString();
                      mensagem[m][6] = jTableLojaArmaduras1.getValueAt(i, 2).toString();
                      m++;
                }
                
                for(int i = 0;i < limCons;i++){
                      mensagem[m][0] = "CONSUMIVEL";
                      mensagem[m][1] = jTableConsumiveis1.getValueAt(i, 0).toString();
                      if(mensagem[m][1].equalsIgnoreCase("POCAO CURA"))
                            mensagem[m][2] = "TAXACURA";
                      else if(mensagem[m][1].equalsIgnoreCase("POCAO CURA"))
                            mensagem[m][2] = "TAXACURA*2";
                      mensagem[m][5] =jTableConsumiveis1.getValueAt(i, 2).toString();
                      mensagem[m][6] =jTableConsumiveis1.getValueAt(i, 1).toString();
                      m++;
                }
                
                controlLoja.getSaida().reset();
                controlLoja.getSaida().writeObject(mensagem);
          } catch (IOException ex) {
                Logger.getLogger(Loja.class.getName()).log(Level.SEVERE, null, ex);
          }
            
      }//GEN-LAST:event_confirmarLojaActionPerformed

      private void zerarLojaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zerarLojaActionPerformed
           int limArmas =  jTableLojaArmas1.getModel().getRowCount();
           int limArmad =  jTableLojaArmaduras1.getModel().getRowCount();
           int limCons =  jTableConsumiveis1.getModel().getRowCount();
                        
            for(int i = 0;i < limArmas;i++){
                  jTableLojaArmas1.setValueAt("0",i, 4);
            }
            for(int i = 0;i < limArmad;i++){
                  jTableLojaArmaduras1.setValueAt("0",i, 2);
            }
            for(int i = 0;i < limCons;i++){
                  jTableConsumiveis1.setValueAt("0",i, 1);
            }
           
             
             
      }//GEN-LAST:event_zerarLojaActionPerformed

      private void jTableConsumiveisFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTableConsumiveisFocusGained
            selecionado = jTableConsumiveis;
            jTableLojaArmaduras.clearSelection();
            jTableLojaArmas.clearSelection();
      }//GEN-LAST:event_jTableConsumiveisFocusGained

      private void jTableLojaArmadurasFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTableLojaArmadurasFocusGained
            selecionado = jTableLojaArmaduras;
            jTableConsumiveis.clearSelection();
            jTableLojaArmas.clearSelection();
      }//GEN-LAST:event_jTableLojaArmadurasFocusGained

      private void jTableLojaArmasFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTableLojaArmasFocusGained
            selecionado = jTableLojaArmas;
            jTableConsumiveis.clearSelection();
            jTableLojaArmaduras.clearSelection();
      }//GEN-LAST:event_jTableLojaArmasFocusGained

    private void btnVoltar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltar1ActionPerformed
        Loja.super.dispose();
    }//GEN-LAST:event_btnVoltar1ActionPerformed

    private void btnVoltar1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVoltar1MousePressed
        btnVoltar1.setForeground(Color.white);
    }//GEN-LAST:event_btnVoltar1MousePressed

    private void btnVoltar1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVoltar1MouseReleased
        btnVoltar1.setForeground(Color.black);
    }//GEN-LAST:event_btnVoltar1MouseReleased

    private void confirmarLojaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmarLojaMousePressed
        confirmarLoja.setForeground(Color.white);
    }//GEN-LAST:event_confirmarLojaMousePressed

    private void confirmarLojaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmarLojaMouseReleased
        confirmarLoja.setForeground(Color.black);
    }//GEN-LAST:event_confirmarLojaMouseReleased

    private void zerarLojaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_zerarLojaMousePressed
        zerarLoja.setForeground(Color.white);
    }//GEN-LAST:event_zerarLojaMousePressed

    private void zerarLojaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_zerarLojaMouseReleased
        zerarLoja.setForeground(Color.black);
    }//GEN-LAST:event_zerarLojaMouseReleased

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        Loja.super.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void criarLojaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_criarLojaMousePressed
        criarLoja.setForeground(Color.white);
    }//GEN-LAST:event_criarLojaMousePressed

    private void criarLojaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_criarLojaMouseReleased
        criarLoja.setForeground(Color.black);
    }//GEN-LAST:event_criarLojaMouseReleased

    private void verLojaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verLojaMousePressed
        verLoja.setForeground(Color.white);
    }//GEN-LAST:event_verLojaMousePressed

    private void verLojaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verLojaMouseReleased
        verLoja.setForeground(Color.black);
    }//GEN-LAST:event_verLojaMouseReleased

    private void fecharLojaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fecharLojaMousePressed
        fecharLoja.setForeground(Color.white);
    }//GEN-LAST:event_fecharLojaMousePressed

    private void fecharLojaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fecharLojaMouseReleased
        fecharLoja.setForeground(Color.black);
    }//GEN-LAST:event_fecharLojaMouseReleased

    private void btnVoltarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVoltarMousePressed
        btnVoltar.setForeground(Color.white);
    }//GEN-LAST:event_btnVoltarMousePressed

    private void btnVoltarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVoltarMouseReleased
        btnVoltar.setForeground(Color.black);
    }//GEN-LAST:event_btnVoltarMouseReleased
      
      public JTable[] getTablesCliente() {
            JTable arrayTables[] = new JTable[3];
            
            arrayTables[0] = jTableLojaArmas;            
            arrayTables[1] = jTableLojaArmaduras;
            arrayTables[2] = jTableConsumiveis;
            
            return arrayTables;
      }
      
      public JTable[] getTablesMestre() {
            JTable arrayTables[] = new JTable[3];
            
            arrayTables[0] = jTableLojaArmas2;            
            arrayTables[1] = jTableLojaArmaduras2;
            arrayTables[2] = jTableConsumiveis2;
            
            return arrayTables;
      }
      
      public JTable[] getTablesMontarLoja() {
            JTable arrayTables[] = new JTable[3];
            
            arrayTables[0] = jTableLojaArmas1;            
            arrayTables[1] = jTableLojaArmaduras1;
            arrayTables[2] = jTableConsumiveis1;
            
            return arrayTables;
      }
      
       public int iteraTable(JTable table, String conteudo) throws PrinterException {
            DefaultTableModel model = (DefaultTableModel) table.getModel();
             int retorno = model.getRowCount();
            model.insertRow(table.getRowCount(), new Object[]{conteudo});
            return retorno;            
      }
      
       public void mostrarLojaCliente(){
             exemploLojaLayeredPane.setVisible(false);
             mestreLayeredPane.setVisible(false);
             montarLojaLayeredPane.setVisible(false);
             lojaLayeredPane.setVisible(true);
       }
       
       public void mostrarLoja(){
              exemploLojaLayeredPane.setVisible(false);
             mestreLayeredPane.setVisible(false);
             montarLojaLayeredPane.setVisible(true);
             lojaLayeredPane.setVisible(false);
       }
       
       public void mostrarLojaEx(){
             exemploLojaLayeredPane.setVisible(true);
             mestreLayeredPane.setVisible(false);
             montarLojaLayeredPane.setVisible(false);
             lojaLayeredPane.setVisible(false);
       }
      
       public void avisoDinheiro(){
             JOptionPane.showMessageDialog(null, "Você não tem dinheiro para isso.", "ERRO", ERROR_MESSAGE);
       }
       
       public void atualizarLinhaLocal(JTable table, int linha){
              DefaultTableModel model;      
             int valor;
             model = (DefaultTableModel) table.getModel();
            
             if (table == jTableLojaArmas){
                         valor = Integer.parseInt(table.getValueAt(linha, 4).toString()) - 1;
                   if(valor > 0)
                        table.setValueAt(valor,linha, 4);
                   else
                        model.removeRow(linha);     
             }
              
             else if(table == jTableLojaArmaduras){ 
                   valor = Integer.parseInt(table.getValueAt(linha, 2).toString()) - 1;
                    if(valor > 0)
                        table.setValueAt(valor,linha, 2);
                    else
                   model.removeRow(linha); 
              }
             
             else if(table == jTableConsumiveis){        
                valor = Integer.parseInt(table.getValueAt(linha, 1).toString()) - 1;
                    if(valor > 0)
                        table.setValueAt(valor,linha, 1);
                    else
                         model.removeRow(linha); 
                   }
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
            java.util.logging.Logger.getLogger(Loja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Loja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Loja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Loja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
    }

      // Variables declaration - do not modify//GEN-BEGIN:variables
      private javax.swing.JButton btnCompra;
      private javax.swing.JButton btnVoltar;
      private javax.swing.JButton btnVoltar1;
      private javax.swing.JButton confirmarLoja;
      private javax.swing.JButton criarLoja;
      private javax.swing.JLayeredPane exemploLojaLayeredPane;
      private javax.swing.JButton fecharLoja;
      private javax.swing.JLabel fundoLoja1;
      private javax.swing.JLabel fundoLoja2;
      private javax.swing.JLabel fundoLoja3;
      private javax.swing.JLabel fundoLojaMestre;
      private javax.swing.JLabel jLabel1;
      private javax.swing.JLabel jLabel2;
      private javax.swing.JLabel jLabel3;
      private javax.swing.JLabel jLabel4;
      private javax.swing.JLabel jLabel6;
      private javax.swing.JLabel jLabel7;
      private javax.swing.JTable jTableConsumiveis;
      private javax.swing.JTable jTableConsumiveis1;
      private javax.swing.JTable jTableConsumiveis2;
      private javax.swing.JTable jTableLojaArmaduras;
      private javax.swing.JTable jTableLojaArmaduras1;
      private javax.swing.JTable jTableLojaArmaduras2;
      private javax.swing.JTable jTableLojaArmas;
      private javax.swing.JTable jTableLojaArmas1;
      private javax.swing.JTable jTableLojaArmas2;
      private javax.swing.JLayeredPane lojaLayeredPane;
      private javax.swing.JLayeredPane mestreLayeredPane;
      private javax.swing.JLayeredPane montarLojaLayeredPane;
      private javax.swing.JScrollPane scrollPaneArmaduraLoja1;
      private javax.swing.JScrollPane scrollPaneArmaduraLoja2;
      private javax.swing.JScrollPane scrollPaneArmaduraLoja3;
      private javax.swing.JScrollPane scrollPaneArmasLoja1;
      private javax.swing.JScrollPane scrollPaneArmasLoja2;
      private javax.swing.JScrollPane scrollPaneArmasLoja3;
      private javax.swing.JScrollPane scrollPaneConsumiveis1;
      private javax.swing.JScrollPane scrollPaneConsumiveis2;
      private javax.swing.JScrollPane scrollPaneConsumiveis3;
      private javax.swing.JButton verLoja;
      private javax.swing.JButton zerarLoja;
      // End of variables declaration//GEN-END:variables

    
}
