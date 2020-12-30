package packageLP2;

import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rafael & Yuri
 */
public class InicioJFrame extends javax.swing.JFrame {

    private Socket cliente;
    private ObjectOutputStream saida;
    private Buffer b;
    private Thread tb, tf;
    private boolean temSala;
    private final JLabel arrayJLabels[] = new JLabel[12];
    private final String[][] mensagemAnc;
    private final String[][] mensagem;

    /**
     * Creates new form InicioJFrame
     *
     * @throws java.io.IOException
     */
    public InicioJFrame() throws IOException {
        initComponents();
        initLabels();
        temSala = false;
        initMusic();
        mensagemAnc = new String[1][2];
        mensagemAnc[0][0] = "/mandarExemplos";
        mensagem = new String[1][2];
    }

    
      private void initMusic(){

        String path = "res/musica.mp3";
        
        File mp3File = new File(path);
  
        MP3Musica musica = new MP3Musica();
        musica.tocar(mp3File);
        
        musica.start();
      }
    
    private void initLabels() {

        lblimgHumano.setVisible(false);
        lblimgOrc.setVisible(false);
        lblimgAnao.setVisible(false);
        lblimgGoblin.setVisible(false);
        lblimgAutomato.setVisible(false);
        lblimgChangeling.setVisible(false);

        arrayJLabels[0] = forcaLabel;
        arrayJLabels[1] = agilidadeLabel;
        arrayJLabels[2] = percepcaoLabel;
        arrayJLabels[3] = defesaLabel;
        arrayJLabels[4] = saudeLabel;
        arrayJLabels[5] = taxaCuraLabel;
        arrayJLabels[6] = intelectoLabel;
        arrayJLabels[7] = vontadeLabel;
        arrayJLabels[8] = insanidadeLabel;
        arrayJLabels[9] = corrupcaoLabel;
        arrayJLabels[10] = tamanhoLabel;
        arrayJLabels[11] = deslocamentoLabel;

        jLayeredPane5.setVisible(false);
        jButtonEntraSala.setEnabled(false);
        btnLoja.setEnabled(false);

        lblRolarD8.setVisible(false);
        lblRolarD100.setVisible(false);
        lblRolarD10.setVisible(false);
        lblRolarD20.setVisible(true);
        lblRolarD3.setVisible(false);
        lblRolarD6.setVisible(false);

        btnRolarDado.setVisible(true);
        
        btnFicha.setContentAreaFilled(false);
        btnFicha.setBorderPainted(false);
        btnLoja.setContentAreaFilled(false);
        btnLoja.setBorderPainted(false);
        /////////////////////////////////////////////
        anaoButton.setContentAreaFilled(false);
        anaoButton.setBorderPainted(false);
        automatoButton.setContentAreaFilled(false);
        automatoButton.setBorderPainted(false);
        changelingButton.setContentAreaFilled(false);
        changelingButton.setBorderPainted(false);
        humanoButton.setContentAreaFilled(false);
        humanoButton.setBorderPainted(false);
        orcButton.setContentAreaFilled(false);
        orcButton.setBorderPainted(false);
        goblinButton.setContentAreaFilled(false);
        goblinButton.setBorderPainted(false);
        mestreButton.setContentAreaFilled(false);
        mestreButton.setBorderPainted(false);

    }

    @SuppressWarnings("unchecked")
      // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
      private void initComponents() {

            jFrameAnc = new javax.swing.JFrame();
            jLayeredPane1 = new javax.swing.JLayeredPane();
            jLabel2 = new javax.swing.JLabel();
            anaoButton = new javax.swing.JButton();
            automatoButton = new javax.swing.JButton();
            changelingButton = new javax.swing.JButton();
            goblinButton = new javax.swing.JButton();
            humanoButton = new javax.swing.JButton();
            orcButton = new javax.swing.JButton();
            lblSpace1 = new javax.swing.JLabel();
            lblSpace2 = new javax.swing.JLabel();
            lblSpace = new javax.swing.JLabel();
            mestreButton = new javax.swing.JButton();
            lblPergaminhoAnc = new javax.swing.JLabel();
            lblPergaminho = new javax.swing.JLabel();
            fundoAnc = new javax.swing.JLabel();
            jLayeredPane2 = new javax.swing.JLayeredPane();
            ancLabel = new javax.swing.JLabel();
            jLabel4 = new javax.swing.JLabel();
            idadeLabel = new javax.swing.JLabel();
            jLabel10 = new javax.swing.JLabel();
            jLabel11 = new javax.swing.JLabel();
            insLabel = new javax.swing.JLabel();
            jLabel13 = new javax.swing.JLabel();
            jLabel14 = new javax.swing.JLabel();
            jLabel15 = new javax.swing.JLabel();
            jLabel16 = new javax.swing.JLabel();
            jLabel17 = new javax.swing.JLabel();
            nomeTextField = new javax.swing.JTextField();
            idadeTextField = new javax.swing.JTextField();
            forcaLabel = new javax.swing.JLabel();
            agilidadeLabel = new javax.swing.JLabel();
            percepcaoLabel = new javax.swing.JLabel();
            defesaLabel = new javax.swing.JLabel();
            saudeLabel = new javax.swing.JLabel();
            taxaCuraLabel = new javax.swing.JLabel();
            deslocamentoLabel = new javax.swing.JLabel();
            tamanhoLabel = new javax.swing.JLabel();
            corrupcaoLabel = new javax.swing.JLabel();
            insanidadeLabel = new javax.swing.JLabel();
            vontadeLabel = new javax.swing.JLabel();
            pontosGastarLabel = new javax.swing.JLabel();
            intelectoLabel = new javax.swing.JLabel();
            forcaRadioButton = new javax.swing.JRadioButton();
            agilidadeRadioButton = new javax.swing.JRadioButton();
            intelectoRadioButton = new javax.swing.JRadioButton();
            vontadeRadioButton = new javax.swing.JRadioButton();
            jButton2 = new javax.swing.JButton();
            jButton3 = new javax.swing.JButton();
            voltarButton = new javax.swing.JButton();
            confirmarButton = new javax.swing.JButton();
            lblimgChangeling = new javax.swing.JLabel();
            lblimgGoblin = new javax.swing.JLabel();
            lblimgAutomato = new javax.swing.JLabel();
            lblSpace4 = new javax.swing.JLabel();
            lblimgAnao = new javax.swing.JLabel();
            lblimgHumano = new javax.swing.JLabel();
            lblimgOrc = new javax.swing.JLabel();
            lblBackgound = new javax.swing.JLabel();
            jLayeredPane3 = new javax.swing.JLayeredPane();
            btnFicha = new javax.swing.JButton();
            btnLoja = new javax.swing.JButton();
            d6 = new javax.swing.JRadioButton();
            d20 = new javax.swing.JRadioButton();
            d3 = new javax.swing.JRadioButton();
            lblRolarD100 = new javax.swing.JLabel();
            lblRolarD8 = new javax.swing.JLabel();
            lblRolarD20 = new javax.swing.JLabel();
            lblRolarD10 = new javax.swing.JLabel();
            lblRolarD6 = new javax.swing.JLabel();
            lblRolarD3 = new javax.swing.JLabel();
            jLabel3 = new javax.swing.JLabel();
            jLabel12 = new javax.swing.JLabel();
            lblRolagem = new javax.swing.JLabel();
            btnEnviarMSG = new javax.swing.JButton();
            btnRolarDado = new javax.swing.JButton();
            d8 = new javax.swing.JRadioButton();
            d10 = new javax.swing.JRadioButton();
            d100 = new javax.swing.JRadioButton();
            jScrollPane2 = new javax.swing.JScrollPane();
            chatArea = new javax.swing.JTextArea();
            jScrollPane3 = new javax.swing.JScrollPane();
            campoEnvioChat = new javax.swing.JTextArea();
            fundoPainel3 = new javax.swing.JLabel();
            buttonGroup1 = new javax.swing.ButtonGroup();
            buttonGroup2 = new javax.swing.ButtonGroup();
            jLayeredPane4 = new javax.swing.JLayeredPane();
            lblLogo = new javax.swing.JLabel();
            jLabel1 = new javax.swing.JLabel();
            jTextIP = new javax.swing.JTextField();
            jButton1 = new javax.swing.JButton();
            lblFundoIP = new javax.swing.JLabel();
            jLayeredPane5 = new javax.swing.JLayeredPane();
            jScrollPane1 = new javax.swing.JScrollPane();
            jTable1 = new javax.swing.JTable();
            jButtonCriarSala = new javax.swing.JButton();
            jButtonEntraSala = new javax.swing.JButton();
            lblTocha1 = new javax.swing.JLabel();
            lblTocha2 = new javax.swing.JLabel();
            lblDemon = new javax.swing.JLabel();
            fundoServer = new javax.swing.JLabel();

            jFrameAnc.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
            jFrameAnc.setResizable(false);
            jFrameAnc.setSize(new java.awt.Dimension(820, 600));
            jFrameAnc.addWindowListener(new java.awt.event.WindowAdapter() {
                  public void windowClosing(java.awt.event.WindowEvent evt) {
                        jFrameAncWindowClosing(evt);
                  }
            });
            jFrameAnc.getContentPane().setLayout(null);

            jLayeredPane1.setMinimumSize(new java.awt.Dimension(500, 400));
            jLayeredPane1.setPreferredSize(new java.awt.Dimension(820, 600));

            jLabel2.setFont(new java.awt.Font("Old English Text MT", 0, 28)); // NOI18N
            jLabel2.setForeground(new java.awt.Color(0, 0, 0));
            jLabel2.setText("Escolha sua ancestralidade ou seja o mestre");
            jLayeredPane1.add(jLabel2);
            jLabel2.setBounds(110, 30, 570, 40);

            anaoButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
            anaoButton.setForeground(new java.awt.Color(0, 0, 0));
            anaoButton.setText("Anão");
            anaoButton.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mousePressed(java.awt.event.MouseEvent evt) {
                        anaoButtonMousePressed(evt);
                  }
                  public void mouseReleased(java.awt.event.MouseEvent evt) {
                        anaoButtonMouseReleased(evt);
                  }
            });
            anaoButton.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        anaoButtonActionPerformed(evt);
                  }
            });
            jLayeredPane1.add(anaoButton);
            anaoButton.setBounds(570, 170, 130, 30);

            automatoButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
            automatoButton.setForeground(new java.awt.Color(0, 0, 0));
            automatoButton.setText("Autômato");
            automatoButton.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mousePressed(java.awt.event.MouseEvent evt) {
                        automatoButtonMousePressed(evt);
                  }
                  public void mouseReleased(java.awt.event.MouseEvent evt) {
                        automatoButtonMouseReleased(evt);
                  }
            });
            automatoButton.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        automatoButtonActionPerformed(evt);
                  }
            });
            jLayeredPane1.add(automatoButton);
            automatoButton.setBounds(570, 210, 130, 30);

            changelingButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
            changelingButton.setForeground(new java.awt.Color(0, 0, 0));
            changelingButton.setText("Changeling");
            changelingButton.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mousePressed(java.awt.event.MouseEvent evt) {
                        changelingButtonMousePressed(evt);
                  }
                  public void mouseReleased(java.awt.event.MouseEvent evt) {
                        changelingButtonMouseReleased(evt);
                  }
            });
            changelingButton.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        changelingButtonActionPerformed(evt);
                  }
            });
            jLayeredPane1.add(changelingButton);
            changelingButton.setBounds(570, 250, 130, 30);

            goblinButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
            goblinButton.setForeground(new java.awt.Color(0, 0, 0));
            goblinButton.setText("Goblin");
            goblinButton.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mousePressed(java.awt.event.MouseEvent evt) {
                        goblinButtonMousePressed(evt);
                  }
                  public void mouseReleased(java.awt.event.MouseEvent evt) {
                        goblinButtonMouseReleased(evt);
                  }
            });
            goblinButton.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        goblinButtonActionPerformed(evt);
                  }
            });
            jLayeredPane1.add(goblinButton);
            goblinButton.setBounds(570, 290, 130, 30);

            humanoButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
            humanoButton.setForeground(new java.awt.Color(0, 0, 0));
            humanoButton.setText("Humano");
            humanoButton.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mousePressed(java.awt.event.MouseEvent evt) {
                        humanoButtonMousePressed(evt);
                  }
                  public void mouseReleased(java.awt.event.MouseEvent evt) {
                        humanoButtonMouseReleased(evt);
                  }
            });
            humanoButton.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        humanoButtonActionPerformed(evt);
                  }
            });
            jLayeredPane1.add(humanoButton);
            humanoButton.setBounds(570, 330, 130, 30);

            orcButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
            orcButton.setForeground(new java.awt.Color(0, 0, 0));
            orcButton.setText("Orc");
            orcButton.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mousePressed(java.awt.event.MouseEvent evt) {
                        orcButtonMousePressed(evt);
                  }
                  public void mouseReleased(java.awt.event.MouseEvent evt) {
                        orcButtonMouseReleased(evt);
                  }
            });
            orcButton.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        orcButtonActionPerformed(evt);
                  }
            });
            jLayeredPane1.add(orcButton);
            orcButton.setBounds(570, 370, 130, 30);

            lblSpace1.setFont(new java.awt.Font("Papyrus", 3, 24)); // NOI18N
            lblSpace1.setForeground(new java.awt.Color(204, 204, 204));
            lblSpace1.setText("Yuri & Rafael Tecnologies");
            jLayeredPane1.add(lblSpace1);
            lblSpace1.setBounds(10, 510, 780, 30);
            jLayeredPane1.add(lblSpace2);
            lblSpace2.setBounds(10, 20, 20, 390);
            jLayeredPane1.add(lblSpace);
            lblSpace.setBounds(770, 30, 20, 470);

            mestreButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
            mestreButton.setForeground(new java.awt.Color(0, 0, 0));
            mestreButton.setText("Mestre");
            mestreButton.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mousePressed(java.awt.event.MouseEvent evt) {
                        mestreButtonMousePressed(evt);
                  }
                  public void mouseReleased(java.awt.event.MouseEvent evt) {
                        mestreButtonMouseReleased(evt);
                  }
            });
            mestreButton.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        mestreButtonActionPerformed(evt);
                  }
            });
            jLayeredPane1.add(mestreButton);
            mestreButton.setBounds(570, 410, 130, 30);

            lblPergaminhoAnc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packageLP2/Imagens/PERGAMINHOANC.gif"))); // NOI18N
            jLayeredPane1.add(lblPergaminhoAnc);
            lblPergaminhoAnc.setBounds(510, 120, 250, 400);

            lblPergaminho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packageLP2/Imagens/pergaminhao.png"))); // NOI18N
            jLayeredPane1.add(lblPergaminho);
            lblPergaminho.setBounds(100, 0, 610, 100);

            fundoAnc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packageLP2/Imagens/FundoAncestralidades.jpg"))); // NOI18N
            fundoAnc.setAlignmentY(0.0F);
            jLayeredPane1.add(fundoAnc);
            fundoAnc.setBounds(-360, -60, 1160, 660);

            jFrameAnc.getContentPane().add(jLayeredPane1);
            jLayeredPane1.setBounds(0, 0, 820, 600);
            jLayeredPane1.getAccessibleContext().setAccessibleDescription("");

            jLayeredPane2.setMaximumSize(new java.awt.Dimension(820, 600));
            jLayeredPane2.setMinimumSize(new java.awt.Dimension(820, 600));
            jLayeredPane2.setName(""); // NOI18N
            jLayeredPane2.setRequestFocusEnabled(false);
            jLayeredPane2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            ancLabel.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
            ancLabel.setForeground(new java.awt.Color(255, 255, 255));
            ancLabel.setText("jLabel3");
            jLayeredPane2.add(ancLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 580, -1));

            jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
            jLabel4.setForeground(new java.awt.Color(255, 255, 255));
            jLabel4.setText("Nome:");
            jLayeredPane2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

            idadeLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
            idadeLabel.setForeground(new java.awt.Color(255, 255, 255));
            idadeLabel.setText("Idade:");
            jLayeredPane2.add(idadeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, -1, -1));

            jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
            jLabel10.setForeground(new java.awt.Color(255, 255, 255));
            jLabel10.setText("Percepção:");
            jLayeredPane2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, -1, -1));

            jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
            jLabel11.setForeground(new java.awt.Color(255, 255, 255));
            jLabel11.setText("Defesa:");
            jLayeredPane2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, -1, -1));

            insLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
            insLabel.setForeground(new java.awt.Color(255, 255, 255));
            insLabel.setText("Insanidade:");
            jLayeredPane2.add(insLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, -1, -1));

            jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
            jLabel13.setForeground(new java.awt.Color(255, 255, 255));
            jLabel13.setText("Corrupção:");
            jLayeredPane2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, -1, -1));

            jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
            jLabel14.setForeground(new java.awt.Color(255, 255, 255));
            jLabel14.setText("Taxa de Cura:");
            jLayeredPane2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, -1, -1));

            jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
            jLabel15.setForeground(new java.awt.Color(255, 255, 255));
            jLabel15.setText("Tamanho:");
            jLayeredPane2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, -1, -1));

            jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
            jLabel16.setForeground(new java.awt.Color(255, 255, 255));
            jLabel16.setText("Saúde:");
            jLayeredPane2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, -1, -1));

            jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
            jLabel17.setForeground(new java.awt.Color(255, 255, 255));
            jLabel17.setText("Deslocamento:");
            jLayeredPane2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 420, -1, -1));
            jLayeredPane2.add(nomeTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 310, 30));
            jLayeredPane2.add(idadeTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, 82, 30));

            forcaLabel.setForeground(new java.awt.Color(255, 255, 255));
            forcaLabel.setText("jLabel3");
            jLayeredPane2.add(forcaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 50, 30));

            agilidadeLabel.setForeground(new java.awt.Color(255, 255, 255));
            agilidadeLabel.setText("jLabel5");
            jLayeredPane2.add(agilidadeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 50, 30));

            percepcaoLabel.setForeground(new java.awt.Color(255, 255, 255));
            percepcaoLabel.setText("jLabel18");
            jLayeredPane2.add(percepcaoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, -1, -1));

            defesaLabel.setForeground(new java.awt.Color(255, 255, 255));
            defesaLabel.setText("jLabel19");
            jLayeredPane2.add(defesaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, -1, -1));

            saudeLabel.setForeground(new java.awt.Color(255, 255, 255));
            saudeLabel.setText("jLabel20");
            jLayeredPane2.add(saudeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, -1, -1));

            taxaCuraLabel.setForeground(new java.awt.Color(255, 255, 255));
            taxaCuraLabel.setText("jLabel21");
            jLayeredPane2.add(taxaCuraLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 420, -1, -1));

            deslocamentoLabel.setForeground(new java.awt.Color(255, 255, 255));
            deslocamentoLabel.setText("jLabel22");
            jLayeredPane2.add(deslocamentoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 420, -1, -1));

            tamanhoLabel.setForeground(new java.awt.Color(255, 255, 255));
            tamanhoLabel.setText("jLabel23");
            jLayeredPane2.add(tamanhoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 390, -1, -1));

            corrupcaoLabel.setForeground(new java.awt.Color(255, 255, 255));
            corrupcaoLabel.setText("jLabel24");
            jLayeredPane2.add(corrupcaoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 360, -1, -1));

            insanidadeLabel.setForeground(new java.awt.Color(255, 255, 255));
            insanidadeLabel.setText("jLabel25");
            jLayeredPane2.add(insanidadeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, -1, -1));

            vontadeLabel.setForeground(new java.awt.Color(255, 255, 255));
            vontadeLabel.setText("jLabel26");
            jLayeredPane2.add(vontadeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, 50, 30));

            pontosGastarLabel.setForeground(new java.awt.Color(255, 255, 255));
            pontosGastarLabel.setText("pontos");
            jLayeredPane2.add(pontosGastarLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 440, 30));

            intelectoLabel.setForeground(new java.awt.Color(255, 255, 255));
            intelectoLabel.setText("jLabel27");
            jLayeredPane2.add(intelectoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, 50, 30));

            buttonGroup1.add(forcaRadioButton);
            forcaRadioButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
            forcaRadioButton.setForeground(new java.awt.Color(255, 255, 255));
            forcaRadioButton.setText("Força:");
            jLayeredPane2.add(forcaRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, -1));

            buttonGroup1.add(agilidadeRadioButton);
            agilidadeRadioButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
            agilidadeRadioButton.setForeground(new java.awt.Color(255, 255, 255));
            agilidadeRadioButton.setText("Agilidade:");
            jLayeredPane2.add(agilidadeRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, -1, -1));

            buttonGroup1.add(intelectoRadioButton);
            intelectoRadioButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
            intelectoRadioButton.setForeground(new java.awt.Color(255, 255, 255));
            intelectoRadioButton.setText("Intelecto:");
            jLayeredPane2.add(intelectoRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, -1, -1));

            buttonGroup1.add(vontadeRadioButton);
            vontadeRadioButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
            vontadeRadioButton.setForeground(new java.awt.Color(255, 255, 255));
            vontadeRadioButton.setText("Vontade:");
            jLayeredPane2.add(vontadeRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, -1, -1));

            jButton2.setText("Tirar Ponto");
            jButton2.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton2ActionPerformed(evt);
                  }
            });
            jLayeredPane2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, -1, -1));

            jButton3.setText("Colocar Ponto");
            jButton3.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton3ActionPerformed(evt);
                  }
            });
            jLayeredPane2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, -1, -1));

            voltarButton.setText("Voltar");
            voltarButton.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        voltarButtonActionPerformed(evt);
                  }
            });
            jLayeredPane2.add(voltarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 460, 85, -1));

            confirmarButton.setText("Confirmar");
            confirmarButton.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        confirmarButtonActionPerformed(evt);
                  }
            });
            jLayeredPane2.add(confirmarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 460, 99, -1));

            lblimgChangeling.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packageLP2/Imagens/changeling-removebg-preview.png"))); // NOI18N
            jLayeredPane2.add(lblimgChangeling, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 160, 330, 450));

            lblimgGoblin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packageLP2/Imagens/goburin-removebg-preview.png"))); // NOI18N
            jLayeredPane2.add(lblimgGoblin, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, 400, 370));

            lblimgAutomato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packageLP2/Imagens/imgAutomato.png"))); // NOI18N
            jLayeredPane2.add(lblimgAutomato, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, -1, -1));
            jLayeredPane2.add(lblSpace4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 780, 20));

            lblimgAnao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packageLP2/Imagens/imgAnao.png"))); // NOI18N
            jLayeredPane2.add(lblimgAnao, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, -1, -1));

            lblimgHumano.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packageLP2/Imagens/humano.png"))); // NOI18N
            lblimgHumano.setAlignmentY(0.0F);
            lblimgHumano.setAutoscrolls(true);
            lblimgHumano.setFocusTraversalPolicyProvider(true);
            jLayeredPane2.add(lblimgHumano, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, 270, 450));

            lblimgOrc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packageLP2/Imagens/imgOrc.png"))); // NOI18N
            jLayeredPane2.add(lblimgOrc, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, -10, -1, -1));

            lblBackgound.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packageLP2/Imagens/tav1.png"))); // NOI18N
            jLayeredPane2.add(lblBackgound, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, -150, -1, -1));

            jFrameAnc.getContentPane().add(jLayeredPane2);
            jLayeredPane2.setBounds(0, 0, 820, 600);

            jLayeredPane3.setMinimumSize(new java.awt.Dimension(820, 600));
            jLayeredPane3.setName(""); // NOI18N
            jLayeredPane3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            btnFicha.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
            btnFicha.setForeground(new java.awt.Color(0, 0, 0));
            btnFicha.setText("Ficha");
            btnFicha.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mousePressed(java.awt.event.MouseEvent evt) {
                        btnFichaMousePressed(evt);
                  }
                  public void mouseReleased(java.awt.event.MouseEvent evt) {
                        btnFichaMouseReleased(evt);
                  }
            });
            btnFicha.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        btnFichaActionPerformed(evt);
                  }
            });
            jLayeredPane3.add(btnFicha, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 110, 50));

            btnLoja.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
            btnLoja.setForeground(new java.awt.Color(0, 0, 0));
            btnLoja.setText("Loja");
            btnLoja.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mousePressed(java.awt.event.MouseEvent evt) {
                        btnLojaMousePressed(evt);
                  }
                  public void mouseReleased(java.awt.event.MouseEvent evt) {
                        btnLojaMouseReleased(evt);
                  }
            });
            btnLoja.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        btnLojaActionPerformed(evt);
                  }
            });
            jLayeredPane3.add(btnLoja, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 110, 50));

            buttonGroup2.add(d6);
            d6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
            d6.setForeground(new java.awt.Color(255, 255, 255));
            d6.setText("d6");
            d6.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        d6ActionPerformed(evt);
                  }
            });
            jLayeredPane3.add(d6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 70, 40));

            buttonGroup2.add(d20);
            d20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
            d20.setForeground(new java.awt.Color(255, 255, 255));
            d20.setText("d20");
            d20.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        d20ActionPerformed(evt);
                  }
            });
            jLayeredPane3.add(d20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 70, 40));

            buttonGroup2.add(d3);
            d3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
            d3.setForeground(new java.awt.Color(255, 255, 255));
            d3.setText("d3");
            d3.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        d3ActionPerformed(evt);
                  }
            });
            jLayeredPane3.add(d3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 70, 40));

            lblRolarD100.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packageLP2/Imagens/d100-removebg-preview.png"))); // NOI18N
            jLayeredPane3.add(lblRolarD100, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, 50, 40));

            lblRolarD8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packageLP2/Imagens/d8-removebg-preview.png"))); // NOI18N
            jLayeredPane3.add(lblRolarD8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, 50, 40));

            lblRolarD20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packageLP2/Imagens/d20-removebg-preview.png"))); // NOI18N
            jLayeredPane3.add(lblRolarD20, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, -1, 40));

            lblRolarD10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packageLP2/Imagens/d10-removebg-preview.png"))); // NOI18N
            jLayeredPane3.add(lblRolarD10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, -1, 40));

            lblRolarD6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packageLP2/Imagens/d6-removebg-preview.png"))); // NOI18N
            jLayeredPane3.add(lblRolarD6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, -1, 40));

            lblRolarD3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packageLP2/Imagens/d3-removebg-preview.png"))); // NOI18N
            jLayeredPane3.add(lblRolarD3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, -1, 40));

            jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packageLP2/Imagens/botao2.png"))); // NOI18N
            jLayeredPane3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 130, 70));

            jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packageLP2/Imagens/botao2.png"))); // NOI18N
            jLayeredPane3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 130, 70));

            lblRolagem.setFont(new java.awt.Font("Mongolian Baiti", 1, 30)); // NOI18N
            lblRolagem.setForeground(new java.awt.Color(255, 255, 255));
            lblRolagem.setText("ROLAGEM");
            lblRolagem.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
            jLayeredPane3.add(lblRolagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 470, 340, 60));

            btnEnviarMSG.setForeground(new java.awt.Color(0, 0, 0));
            btnEnviarMSG.setText("Enviar");
            btnEnviarMSG.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        btnEnviarMSGActionPerformed(evt);
                  }
            });
            jLayeredPane3.add(btnEnviarMSG, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 470, 70, 60));

            btnRolarDado.setToolTipText("");
            btnRolarDado.setMargin(new java.awt.Insets(1, 7, 1, 7));
            btnRolarDado.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        btnRolarDadoActionPerformed(evt);
                  }
            });
            jLayeredPane3.add(btnRolarDado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 140, 60));

            buttonGroup2.add(d8);
            d8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
            d8.setForeground(new java.awt.Color(255, 255, 255));
            d8.setText("d8");
            d8.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        d8ActionPerformed(evt);
                  }
            });
            jLayeredPane3.add(d8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, 70, 40));

            buttonGroup2.add(d10);
            d10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
            d10.setForeground(new java.awt.Color(255, 255, 255));
            d10.setText("d10");
            d10.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        d10ActionPerformed(evt);
                  }
            });
            jLayeredPane3.add(d10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 70, 40));

            buttonGroup2.add(d100);
            d100.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
            d100.setForeground(new java.awt.Color(255, 255, 255));
            d100.setText("d100");
            d100.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        d100ActionPerformed(evt);
                  }
            });
            jLayeredPane3.add(d100, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 70, 40));

            chatArea.setEditable(false);
            chatArea.setColumns(20);
            chatArea.setLineWrap(true);
            chatArea.setRows(5);
            jScrollPane2.setViewportView(chatArea);

            jLayeredPane3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, 290, 450));

            campoEnvioChat.setColumns(20);
            campoEnvioChat.setLineWrap(true);
            campoEnvioChat.setRows(5);
            jScrollPane3.setViewportView(campoEnvioChat);

            jLayeredPane3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 470, 210, 60));

            fundoPainel3.setForeground(new java.awt.Color(255, 255, 255));
            fundoPainel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packageLP2/Imagens/tav1.png"))); // NOI18N
            jLayeredPane3.add(fundoPainel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-450, 0, -1, 590));

            jFrameAnc.getContentPane().add(jLayeredPane3);
            jLayeredPane3.setBounds(0, 0, 820, 600);
            jLayeredPane3.getAccessibleContext().setAccessibleName("");
            jLayeredPane3.getAccessibleContext().setAccessibleDescription("");

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
            setMaximumSize(new java.awt.Dimension(600, 450));
            setMinimumSize(new java.awt.Dimension(600, 450));
            setPreferredSize(new java.awt.Dimension(600, 450));
            setResizable(false);
            setSize(new java.awt.Dimension(600, 450));
            addWindowListener(new java.awt.event.WindowAdapter() {
                  public void windowClosing(java.awt.event.WindowEvent evt) {
                        formWindowClosing(evt);
                  }
            });
            getContentPane().setLayout(null);

            jLayeredPane4.setMaximumSize(new java.awt.Dimension(600, 450));
            jLayeredPane4.setMinimumSize(new java.awt.Dimension(600, 450));

            lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packageLP2/Imagens/SotDL_logo_TOP.png"))); // NOI18N
            jLayeredPane4.add(lblLogo);
            lblLogo.setBounds(-80, -20, 820, 210);

            jLabel1.setFont(new java.awt.Font("Noto Sans", 1, 30)); // NOI18N
            jLabel1.setForeground(new java.awt.Color(255, 255, 255));
            jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel1.setText("Insira o IP do servidor. ");
            jLayeredPane4.add(jLabel1);
            jLabel1.setBounds(110, 230, 390, 42);

            jTextIP.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
            jTextIP.setToolTipText("Ex: 127.0.0.1");
            jTextIP.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jTextIPActionPerformed(evt);
                  }
            });
            jLayeredPane4.add(jTextIP);
            jTextIP.setBounds(200, 270, 181, 34);

            jButton1.setText("CONECTAR");
            jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            jButton1.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton1ActionPerformed(evt);
                  }
            });
            jLayeredPane4.add(jButton1);
            jButton1.setBounds(240, 330, 110, 30);

            lblFundoIP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packageLP2/Imagens/Sdl.png"))); // NOI18N
            lblFundoIP.setText("jLabel7");
            jLayeredPane4.add(lblFundoIP);
            lblFundoIP.setBounds(-10, -20, 670, 650);

            getContentPane().add(jLayeredPane4);
            jLayeredPane4.setBounds(0, 0, 600, 450);

            jLayeredPane5.setMaximumSize(new java.awt.Dimension(600, 450));
            jLayeredPane5.setMinimumSize(new java.awt.Dimension(600, 450));

            jTable1.setModel(new javax.swing.table.DefaultTableModel(
                  new Object [][] {

                  },
                  new String [] {
                        "Salas", "Jogadores"
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
            jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
            jTable1.getTableHeader().setReorderingAllowed(false);
            jTable1.addFocusListener(new java.awt.event.FocusAdapter() {
                  public void focusGained(java.awt.event.FocusEvent evt) {
                        jTable1FocusGained(evt);
                  }
                  public void focusLost(java.awt.event.FocusEvent evt) {
                        jTable1FocusLost(evt);
                  }
            });
            jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        jTable1MouseClicked(evt);
                  }
            });
            jScrollPane1.setViewportView(jTable1);

            jLayeredPane5.add(jScrollPane1);
            jScrollPane1.setBounds(130, 220, 330, 150);

            jButtonCriarSala.setText("Criar Sala");
            jButtonCriarSala.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButtonCriarSalaActionPerformed(evt);
                  }
            });
            jLayeredPane5.add(jButtonCriarSala);
            jButtonCriarSala.setBounds(130, 380, 100, 32);

            jButtonEntraSala.setText("Entrar");
            jButtonEntraSala.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButtonEntraSalaActionPerformed(evt);
                  }
            });
            jLayeredPane5.add(jButtonEntraSala);
            jButtonEntraSala.setBounds(360, 380, 100, 32);

            lblTocha1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packageLP2/Imagens/tocha.gif"))); // NOI18N
            jLayeredPane5.add(lblTocha1);
            lblTocha1.setBounds(10, 160, 100, 200);

            lblTocha2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packageLP2/Imagens/tocha.gif"))); // NOI18N
            jLayeredPane5.add(lblTocha2);
            lblTocha2.setBounds(460, 160, 100, 200);

            lblDemon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packageLP2/Imagens/logo.png"))); // NOI18N
            jLayeredPane5.add(lblDemon);
            lblDemon.setBounds(110, 0, 430, 210);

            fundoServer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packageLP2/Imagens/fundoServer.jpg"))); // NOI18N
            jLayeredPane5.add(fundoServer);
            fundoServer.setBounds(-70, -130, 790, 600);

            getContentPane().add(jLayeredPane5);
            jLayeredPane5.setBounds(0, 0, 600, 450);

            setSize(new java.awt.Dimension(579, 473));
            setLocationRelativeTo(null);
      }// </editor-fold>//GEN-END:initComponents


    private void jTextIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextIPActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_jTextIPActionPerformed

    public JButton getMestreButton() {
        return mestreButton;
    }

    public JFrame getjFrameAnc() {
        return jFrameAnc;
    }
    private String ancestralidade;

    private void enviarMensagemAnc(String ancestralidade) throws IOException {
        mensagemAnc[0][1] = ancestralidade;
        saida.reset();
        saida.writeObject(mensagemAnc);
    }

    public ObjectOutputStream getSaida() {
        return saida;
    }

    public void setSaida(ObjectOutputStream saida) {
        this.saida = saida;
    }

    private void anaoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anaoButtonActionPerformed
        ancestralidade = anaoButton.getText().toUpperCase();
        lblimgAnao.setVisible(true);

        ancLabel.setText(ancestralidade);
        try {
            enviarMensagemAnc("ANAO");
            ancestralidade = "ANAO";
        } catch (IOException ex) {
            Logger.getLogger(InicioJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

        iniPontos(ancestralidade);
    }//GEN-LAST:event_anaoButtonActionPerformed

    private void automatoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_automatoButtonActionPerformed
        ancestralidade = automatoButton.getText().toUpperCase();

        lblimgAutomato.setVisible(true);

        ancLabel.setText(ancestralidade);
        try {
            enviarMensagemAnc("AUTOMATO");
            ancestralidade = "AUTOMATO";
        } catch (IOException ex) {
            Logger.getLogger(InicioJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

        iniPontos(ancestralidade);

    }//GEN-LAST:event_automatoButtonActionPerformed

    private void changelingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changelingButtonActionPerformed
        ancestralidade = changelingButton.getText().toUpperCase();

        lblimgChangeling.setVisible(true);

        ancLabel.setText(ancestralidade);
        try {
            enviarMensagemAnc(ancestralidade);
        } catch (IOException ex) {
            Logger.getLogger(InicioJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        iniPontos(ancestralidade);

    }//GEN-LAST:event_changelingButtonActionPerformed

    private void goblinButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goblinButtonActionPerformed
        ancestralidade = goblinButton.getText().toUpperCase();

        lblimgGoblin.setVisible(true);

        ancLabel.setText(ancestralidade);
        try {
            enviarMensagemAnc(ancestralidade);
        } catch (IOException ex) {
            Logger.getLogger(InicioJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

        iniPontos(ancestralidade);


    }//GEN-LAST:event_goblinButtonActionPerformed

    private void humanoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_humanoButtonActionPerformed
        ancestralidade = humanoButton.getText().toUpperCase();

        lblimgHumano.setVisible(true);

        ancLabel.setText(ancestralidade);
        try {
            enviarMensagemAnc(ancestralidade);
        } catch (IOException ex) {
            Logger.getLogger(InicioJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

        iniPontos(ancestralidade);
    }//GEN-LAST:event_humanoButtonActionPerformed

    private void orcButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orcButtonActionPerformed
        ancestralidade = orcButton.getText().toUpperCase();

        lblimgOrc.setVisible(true);

        ancLabel.setText(ancestralidade);
        try {
            enviarMensagemAnc(ancestralidade);
        } catch (IOException ex) {
            Logger.getLogger(InicioJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

        iniPontos(ancestralidade);


    }//GEN-LAST:event_orcButtonActionPerformed

    private void mestreButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mestreButtonActionPerformed
        mensagem[0][0] = "/mestre";
        try {
            saida.reset();
            saida.writeObject(mensagem);
        } catch (IOException ex) {
            Logger.getLogger(InicioJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        confirmado = true;
        setLayer(3);
    }//GEN-LAST:event_mestreButtonActionPerformed

    private void btnFichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFichaActionPerformed
        if(isEhMestre()){
            mensagem[0][0] = "/fichaMestre";
        }else{
            mensagem[0][0] = "/ficha";
            btnFicha.setEnabled(false);
        }

        try {
            saida.reset();
            saida.writeObject(mensagem);

        } catch (IOException ex) {
            Logger.getLogger(InicioJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnFichaActionPerformed
    public JButton getBtnLoja() {
        return btnLoja;
    }

    public JButton getBtnFicha() {
        return btnFicha;
    }

    private void d20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d20ActionPerformed
        lblRolarD8.setVisible(false);
        lblRolarD100.setVisible(false);
        lblRolarD10.setVisible(false);
        lblRolarD20.setVisible(true);
        lblRolarD3.setVisible(false);
        lblRolarD6.setVisible(false);
    }//GEN-LAST:event_d20ActionPerformed

    private void d6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d6ActionPerformed
        lblRolarD8.setVisible(false);
        lblRolarD100.setVisible(false);
        lblRolarD10.setVisible(false);
        lblRolarD20.setVisible(false);
        lblRolarD3.setVisible(false);
        lblRolarD6.setVisible(true);
    }//GEN-LAST:event_d6ActionPerformed

    private void d3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d3ActionPerformed
        lblRolarD8.setVisible(false);
        lblRolarD100.setVisible(false);
        lblRolarD10.setVisible(false);
        lblRolarD20.setVisible(false);
        lblRolarD3.setVisible(true);
        lblRolarD6.setVisible(false);
    }//GEN-LAST:event_d3ActionPerformed

    private void confirmarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarButtonActionPerformed
        Pattern padrao = Pattern.compile("^[0-9]+");
        Matcher match = padrao.matcher(idadeTextField.getText());
        String valores[][] = new String[8][1];

        System.out.println(ancestralidade);
        if (match.matches() && !(nomeTextField.getText().isBlank()) && pontos == 0) {
            valores[0][0] = "/confirma";

            valores[1][0] = ancestralidade;
            valores[2][0] = forcaLabel.getText();
            valores[3][0] = agilidadeLabel.getText();
            valores[4][0] = intelectoLabel.getText();
            valores[5][0] = vontadeLabel.getText();
            valores[6][0] = nomeTextField.getText();
            valores[7][0] = idadeTextField.getText();

            try {
                saida.reset();
                saida.writeObject(valores);
            } catch (IOException ex) {
                Logger.getLogger(InicioJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            setLayer(3);
            confirmado = true;

        } else {
            JOptionPane.showMessageDialog(null, "Lembre-se de gastar seus pontos, escolher um nome e uma idade.", "ERRO", ERROR_MESSAGE);
        }

    }//GEN-LAST:event_confirmarButtonActionPerformed

    private void voltarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarButtonActionPerformed
        setLayer(1);
        lblimgOrc.setVisible(false);
        lblimgHumano.setVisible(false);
        lblimgAnao.setVisible(false);
        lblimgGoblin.setVisible(false);
        lblimgAutomato.setVisible(false);
        lblimgChangeling.setVisible(false);
    }//GEN-LAST:event_voltarButtonActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        if (pontos > 0) {
            int caracteristica;

            if (forcaRadioButton.isSelected()) {
                caracteristica = Integer.parseInt(forcaLabel.getText().stripLeading());
                caracteristica += 1;
                forcaLabel.setText(Integer.toString(caracteristica));
                setPontos(1, false);
                resetarValores(ancestralidade);
                if (!(forca == caracteristica)) {
                    desativarBotoes("FORCA");
                }

            } else if (agilidadeRadioButton.isSelected()) {
                caracteristica = Integer.parseInt(agilidadeLabel.getText().stripLeading());
                caracteristica += 1;
                agilidadeLabel.setText(Integer.toString(caracteristica));
                setPontos(1, false);
                resetarValores(ancestralidade);
                if (!(agilidade == caracteristica)) {
                    desativarBotoes("AGILIDADE");
                }
            } else if (intelectoRadioButton.isSelected()) {
                caracteristica = Integer.parseInt(intelectoLabel.getText().stripLeading());
                caracteristica += 1;
                intelectoLabel.setText(Integer.toString(caracteristica));
                setPontos(1, false);
                resetarValores(ancestralidade);
                if (!(intelecto == caracteristica)) {
                    desativarBotoes("INTELECTO");
                }
            } else if (vontadeRadioButton.isSelected()) {
                caracteristica = Integer.parseInt(vontadeLabel.getText().stripLeading());
                caracteristica += 1;
                vontadeLabel.setText(Integer.toString(caracteristica));
                setPontos(1, false);
                resetarValores(ancestralidade);
                if (!(vontade == caracteristica)) {
                    desativarBotoes("VONTADE");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Selecione alguma caracterisca", "ERRO", ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Você não tem pontos para gastar. Se desejar retire de alguma caracterisca", "ERRO", ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        if (pontos == 0) {
            int caracteristica;

            if (forcaRadioButton.isSelected()) {
                caracteristica = Integer.parseInt(forcaLabel.getText().stripLeading());
                caracteristica -= 1;
                forcaLabel.setText(Integer.toString(caracteristica));
                setPontos(1, true);
                resetarBotoes();
                retirado = true;
                resetarValores(ancestralidade);
            } else if (agilidadeRadioButton.isSelected()) {
                caracteristica = Integer.parseInt(agilidadeLabel.getText().stripLeading());
                caracteristica -= 1;
                agilidadeLabel.setText(Integer.toString(caracteristica));
                setPontos(1, true);
                resetarBotoes();
                retirado = true;
                resetarValores(ancestralidade);
            } else if (intelectoRadioButton.isSelected()) {
                caracteristica = Integer.parseInt(intelectoLabel.getText().stripLeading());
                caracteristica -= 1;
                intelectoLabel.setText(Integer.toString(caracteristica));
                setPontos(1, true);
                resetarBotoes();
                retirado = true;
                resetarValores(ancestralidade);
            } else if (vontadeRadioButton.isSelected()) {
                caracteristica = Integer.parseInt(vontadeLabel.getText().stripLeading());
                caracteristica -= 1;
                vontadeLabel.setText(Integer.toString(caracteristica));
                setPontos(1, true);
                resetarBotoes();
                retirado = true;
                resetarValores(ancestralidade);
            } else {
                JOptionPane.showMessageDialog(null, "Selecione alguma caracterisca", "ERRO", ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Primeiro gaste seus pontos, para depois retirar", "ERRO", ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jButton2ActionPerformed
/////////////////////ROLAGEM DE DADOS////////////////////////////
    Dados dadinho = new Dados();
//////////////////////////////////////////////////////////////////////////    
    private void btnRolarDadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRolarDadoActionPerformed
        String[][] resultado = new String [1][2];
        resultado[0][0] = "/resultados";
          if (d3.isSelected()) {
              try {
                    lblRolagem.setText("Tirou: " + Integer.toString(dadinho.rolarD3()));
                    lblRolagem.setForeground(Color.WHITE);
                    resultado[0][1] = lblRolagem.getText();
                    saida.reset();
                    saida.writeObject(resultado);
              } catch (IOException ex) {
                    Logger.getLogger(InicioJFrame.class.getName()).log(Level.SEVERE, null, ex);
              }
        }
        if (d6.isSelected()) {
              try {
                    lblRolagem.setText("Tirou: " + Integer.toString(dadinho.rolarD6()));
                    lblRolagem.setForeground(Color.WHITE);
                    resultado[0][1] = lblRolagem.getText();
                    saida.reset();
                    saida.writeObject(resultado);
              } catch (IOException ex) {
                    Logger.getLogger(InicioJFrame.class.getName()).log(Level.SEVERE, null, ex);
              }
        }
        if (d8.isSelected()) {
              try {
                    lblRolagem.setText("Tirou: " + Integer.toString(dadinho.rolarD8()));
                    lblRolagem.setForeground(Color.WHITE);
                    resultado[0][1] = lblRolagem.getText();
                    saida.reset();
                    saida.writeObject(resultado);
              } catch (IOException ex) {
                    Logger.getLogger(InicioJFrame.class.getName()).log(Level.SEVERE, null, ex);
              }
        }
        if (d10.isSelected()) {
              try {
                    lblRolagem.setText("Tirou: " + Integer.toString(dadinho.rolarD10()));
                    lblRolagem.setForeground(Color.WHITE);
                    resultado[0][1] = lblRolagem.getText();
                    saida.reset();
                    saida.writeObject(resultado);
              } catch (IOException ex) {
                    Logger.getLogger(InicioJFrame.class.getName()).log(Level.SEVERE, null, ex);
              }
        }
        if (d20.isSelected()) {
              try {
                    int aux = dadinho.rolarD20();
                    checarResultados(aux);
                    resultado[0][0] = "/resultadosD20";
                    resultado[0][1] = Integer.toString(aux);
                    saida.reset();
                    saida.writeObject(resultado);
              } catch (IOException ex) {
                    Logger.getLogger(InicioJFrame.class.getName()).log(Level.SEVERE, null, ex);
              }
              
         }
         if (d100.isSelected()){
              try {
                    lblRolagem.setText("Tirou: " + Integer.toString(dadinho.rolarD100()));
                    lblRolagem.setForeground(Color.WHITE);
                    resultado[0][1] = lblRolagem.getText();
                    saida.reset();
                    saida.writeObject(resultado);
              } catch (IOException ex) {
                    Logger.getLogger(InicioJFrame.class.getName()).log(Level.SEVERE, null, ex);
              }
         }
    }//GEN-LAST:event_btnRolarDadoActionPerformed

    public void checarResultados(int results){
           if(results >= 10){
                    lblRolagem.setText("Tirou: " + Integer.toString(results) + "  Passou !");
                    lblRolagem.setForeground(Color.GREEN);
            }
            else if (results < 10){
                    lblRolagem.setText("Tirou: " + Integer.toString(results)+ "  Não Passou...");
                    lblRolagem.setForeground(Color.RED);

          }
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String ip = jTextIP.getText();

        try {
            cliente = new Socket(ip, 25565);

            saida = new ObjectOutputStream(cliente.getOutputStream());

            jLayeredPane5.setVisible(true);
            jLayeredPane4.setVisible(false);

            iniBuffer(cliente, this);

            mensagem[0][0] = "/mandarSala";
            saida.writeObject(mensagem);

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "IP invalído", "ERRO", ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void d100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d100ActionPerformed
        lblRolarD8.setVisible(false);
        lblRolarD100.setVisible(true);
        lblRolarD10.setVisible(false);
        lblRolarD20.setVisible(false);
        lblRolarD3.setVisible(false);
        lblRolarD6.setVisible(false);
    }//GEN-LAST:event_d100ActionPerformed

    private void d10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d10ActionPerformed
        lblRolarD8.setVisible(false);
        lblRolarD100.setVisible(false);
        lblRolarD10.setVisible(true);
        lblRolarD20.setVisible(false);
        lblRolarD3.setVisible(false);
        lblRolarD6.setVisible(false);
    }//GEN-LAST:event_d10ActionPerformed

    private void d8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d8ActionPerformed
        lblRolarD8.setVisible(true);
        lblRolarD100.setVisible(false);
        lblRolarD10.setVisible(false);
        lblRolarD20.setVisible(false);
        lblRolarD3.setVisible(false);
        lblRolarD6.setVisible(false);
    }//GEN-LAST:event_d8ActionPerformed

      private void jButtonEntraSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEntraSalaActionPerformed

          mensagem[0][0] = "/entrarSala";
          mensagem[0][1] = jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString();

          try {
              saida.reset();
              saida.writeObject(mensagem);
          } catch (IOException ex) {
              Logger.getLogger(InicioJFrame.class.getName()).log(Level.SEVERE, null, ex);
          }

          setTemSala(true);
          InicioJFrame.super.dispose();

          jLayeredPane2.setVisible(false);
          jLayeredPane3.setVisible(false);

      }//GEN-LAST:event_jButtonEntraSalaActionPerformed

      private void jTable1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTable1FocusGained

      }//GEN-LAST:event_jTable1FocusGained

      private void jTable1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTable1FocusLost

      }//GEN-LAST:event_jTable1FocusLost

      private void jButtonCriarSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCriarSalaActionPerformed
          mensagem[0][0] = "/criarSala";
          try {
              saida.reset();
              saida.writeObject(mensagem);
          } catch (IOException ex) {
              Logger.getLogger(InicioJFrame.class.getName()).log(Level.SEVERE, null, ex);
          }
          setTemSala(true);
          InicioJFrame.super.dispose();

          jLayeredPane2.setVisible(false);
          jLayeredPane3.setVisible(false);
      }//GEN-LAST:event_jButtonCriarSalaActionPerformed

      private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
          jTable1.getSelectedRow();
          if (jTable1.getSelectedRow() != -1) {
              System.out.println(jTable1.getSelectedRow());
              jButtonEntraSala.setEnabled(true);
          } else
              jButtonEntraSala.setEnabled(false);
      }//GEN-LAST:event_jTable1MouseClicked

      private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
          mensagem[0][0] = "/desconectou";
          if (cliente != null) {
              try {
                  saida.reset();
                  saida.writeObject(mensagem);
                  cliente.close();
              } catch (IOException ex) {
                  Logger.getLogger(InicioJFrame.class.getName()).log(Level.SEVERE, null, ex);
              }
          }
      }//GEN-LAST:event_formWindowClosing

      private void btnEnviarMSGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarMSGActionPerformed
          String menAux = campoEnvioChat.getText();
          if (menAux != null && !menAux.equals("")) {
              if (menAux.startsWith("/")) {
                  System.out.println("naop pode");//Fazer um dialog.
              } else {
                  mensagem[0][0] = "/chat";
                  mensagem[0][1] = menAux;

                  chatArea.setText(chatArea.getText().trim() + "\n" + "Você: " + menAux);
                  campoEnvioChat.setText("");

                  try {
                      saida.reset();
                      saida.writeObject(mensagem);
                  } catch (IOException ex) {
                      Logger.getLogger(InicioJFrame.class.getName()).log(Level.SEVERE, null, ex);
                  }
              }
          }

      }//GEN-LAST:event_btnEnviarMSGActionPerformed

    private void anaoButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_anaoButtonMousePressed
        anaoButton.setForeground(Color.WHITE);
    }//GEN-LAST:event_anaoButtonMousePressed

    private void anaoButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_anaoButtonMouseReleased
        anaoButton.setForeground(Color.BLACK);
    }//GEN-LAST:event_anaoButtonMouseReleased

    private void automatoButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_automatoButtonMousePressed
        automatoButton.setForeground(Color.WHITE);
    }//GEN-LAST:event_automatoButtonMousePressed

    private void automatoButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_automatoButtonMouseReleased
        automatoButton.setForeground(Color.BLACK);
    }//GEN-LAST:event_automatoButtonMouseReleased

    private void changelingButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changelingButtonMousePressed
        changelingButton.setForeground(Color.WHITE);

    }//GEN-LAST:event_changelingButtonMousePressed

    private void changelingButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changelingButtonMouseReleased
        changelingButton.setForeground(Color.BLACK);
    }//GEN-LAST:event_changelingButtonMouseReleased

    private void goblinButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goblinButtonMousePressed
        goblinButton.setForeground(Color.WHITE);
    }//GEN-LAST:event_goblinButtonMousePressed

    private void goblinButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goblinButtonMouseReleased
        goblinButton.setForeground(Color.BLACK);
    }//GEN-LAST:event_goblinButtonMouseReleased

    private void humanoButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_humanoButtonMousePressed
        humanoButton.setForeground(Color.WHITE);
    }//GEN-LAST:event_humanoButtonMousePressed

    private void humanoButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_humanoButtonMouseReleased
        humanoButton.setForeground(Color.BLACK);
    }//GEN-LAST:event_humanoButtonMouseReleased

    private void orcButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orcButtonMousePressed
        orcButton.setForeground(Color.WHITE);
    }//GEN-LAST:event_orcButtonMousePressed

    private void orcButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orcButtonMouseReleased
        orcButton.setForeground(Color.BLACK);
    }//GEN-LAST:event_orcButtonMouseReleased

    private void mestreButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mestreButtonMousePressed
        mestreButton.setForeground(Color.WHITE);
    }//GEN-LAST:event_mestreButtonMousePressed

    private void mestreButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mestreButtonMouseReleased
        mestreButton.setForeground(Color.BLACK);
    }//GEN-LAST:event_mestreButtonMouseReleased

    private void jFrameAncWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jFrameAncWindowClosing
        mensagem[0][0] = "/desconectou";
        if (cliente != null) {
            try {
                saida.reset();
                saida.writeObject(mensagem);
                cliente.close();
            } catch (IOException ex) {
                Logger.getLogger(InicioJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jFrameAncWindowClosing

    public JLabel getlblRolagem(){
          return lblRolagem;
    }
    
    private void btnLojaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLojaActionPerformed
       if(ehMestre)
                  mensagem[0][0] = "/menuLoja";
            else
                  mensagem[0][0] = "/loja";

                try {
                      saida.reset();
                      saida.writeObject(mensagem);
                } catch (IOException ex) {
                      Logger.getLogger(InicioJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
    }//GEN-LAST:event_btnLojaActionPerformed

    private void btnFichaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFichaMousePressed
        btnFicha.setForeground(Color.white);
    }//GEN-LAST:event_btnFichaMousePressed

    private void btnFichaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFichaMouseReleased
        btnFicha.setForeground(Color.black);
    }//GEN-LAST:event_btnFichaMouseReleased

    private void btnLojaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLojaMousePressed
        btnLoja.setForeground(Color.white);
    }//GEN-LAST:event_btnLojaMousePressed

    private void btnLojaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLojaMouseReleased
        btnLoja.setForeground(Color.black);
    }//GEN-LAST:event_btnLojaMouseReleased

    public void atualizarChat(String[][] entrada) {
        chatArea.setText(chatArea.getText().trim() + "\n" + entrada[0][1] + ": " + entrada[0][2]);
    }

    public boolean getTemSala() {
        return temSala;
    }

    public void setTemSala(boolean temSala) {
        this.temSala = temSala;
    }

    public void colocarValores(String valores[]) {
        resetarBotoes();
        retirado = false;

        for (int i = 0; i < 12; i++) {

            arrayJLabels[i].setText(valores[i]);

        }

        forca = Integer.parseInt(forcaLabel.getText().stripLeading());
        agilidade = Integer.parseInt(agilidadeLabel.getText().stripLeading());
        intelecto = Integer.parseInt(intelectoLabel.getText().stripLeading());
        vontade = Integer.parseInt(vontadeLabel.getText().stripLeading());

    }

    private void resetarValores(String ancestralidade) {

        forca = Integer.parseInt(forcaLabel.getText().stripLeading());
        intelecto = Integer.parseInt(intelectoLabel.getText().stripLeading());

        switch (ancestralidade) {
            case "HUMANO":
                defesaLabel.setText(agilidadeLabel.getText());
                saudeLabel.setText(forcaLabel.getText());
                taxaCuraLabel.setText(Integer.toString(forca / 4));
                percepcaoLabel.setText(intelectoLabel.getText());
                break;

            case "GOBLIN":
                defesaLabel.setText(agilidadeLabel.getText());
                saudeLabel.setText(forcaLabel.getText());
                taxaCuraLabel.setText(Integer.toString(forca / 4));
                percepcaoLabel.setText(Integer.toString(intelecto + 1));
                break;

            case "CHANGELING":
                defesaLabel.setText(agilidadeLabel.getText());
                saudeLabel.setText(forcaLabel.getText());
                taxaCuraLabel.setText(Integer.toString(forca / 4));
                percepcaoLabel.setText(Integer.toString(intelecto + 1));
                break;

            case "ANAO":
                defesaLabel.setText(agilidadeLabel.getText());
                saudeLabel.setText(Integer.toString(forca + 4));
                taxaCuraLabel.setText(Integer.toString((forca + 4) / 4));
                percepcaoLabel.setText(Integer.toString(intelecto + 1));
                break;

            case "AUTOMATO":
                saudeLabel.setText(forcaLabel.getText());
                taxaCuraLabel.setText(Integer.toString(forca / 4));
                percepcaoLabel.setText(intelectoLabel.getText());
                ;
                break;

            case "ORC":
                defesaLabel.setText(agilidadeLabel.getText());
                saudeLabel.setText(forcaLabel.getText());
                taxaCuraLabel.setText(Integer.toString(forca / 4));
                percepcaoLabel.setText(Integer.toString(intelecto + 1));
                break;

            default:
                System.err.println("Erro no resetar valores");
        }
    }

    private int forca, agilidade, intelecto, vontade;
    private int pontos;
    private boolean retirado;

    public void iniPontos(String ancestralidade) {
        pontos = 0;

        if (ancestralidade.equalsIgnoreCase("HUMANO")) {
            pontos = 1;
        }

        pontosGastarLabel.setText("Pontos para gastar: " + pontos);

    }

    public void setPontos(int pontos, boolean soma) {
        if (soma) {
            this.pontos += pontos;
        } else {
            this.pontos -= pontos;
        }

        pontosGastarLabel.setText("Pontos para gastar: " + this.pontos);
    }

    private void desativarBotoes(String escolhido) {
        if (retirado) {
            switch (escolhido) {
                case "FORCA":
                    agilidadeRadioButton.setEnabled(false);
                    intelectoRadioButton.setEnabled(false);
                    vontadeRadioButton.setEnabled(false);
                    break;
                case "AGILIDADE":
                    forcaRadioButton.setEnabled(false);
                    intelectoRadioButton.setEnabled(false);
                    vontadeRadioButton.setEnabled(false);
                    break;
                case "INTELECTO":
                    forcaRadioButton.setEnabled(false);
                    agilidadeRadioButton.setEnabled(false);
                    vontadeRadioButton.setEnabled(false);
                    break;
                case "VONTADE":
                    forcaRadioButton.setEnabled(false);
                    agilidadeRadioButton.setEnabled(false);
                    intelectoRadioButton.setEnabled(false);
                    break;
                default:
                    System.err.println("Erro no desativar botoes");
            }

        }
    }

    private void resetarBotoes() {
        forcaRadioButton.setEnabled(true);
        agilidadeRadioButton.setEnabled(true);
        intelectoRadioButton.setEnabled(true);
        vontadeRadioButton.setEnabled(true);
    }

    private void iniBuffer(Socket cliente, InicioJFrame frame) throws IOException {
        b = new Buffer(cliente, frame);
        tb = new Thread(b);
        tb.start();
    }

    private boolean confirmado = false;

    public boolean isConfirmado() {
        return confirmado;
    }

    //Essa função esta errada devido ao loop estar funcionando a qualquer hora,talvez seja possivel 
    public void tabelaSalas(String[][] mensagem) {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int retorno;
        retorno = model.getRowCount();
        while (retorno < mensagem.length) {
            model.insertRow(jTable1.getRowCount(), new Object[]{""});
            retorno = model.getRowCount();
        }

        for (int i = 0; i < mensagem.length; i++) {
            jTable1.setValueAt(mensagem[i][0], i, 0);
            jTable1.setValueAt(mensagem[i][1], i, 1);
        }
    }
    private boolean ehMestre;

    public boolean isEhMestre() {
        return ehMestre;
    }

    public void setEhMestre(boolean ehMestre) {
        this.ehMestre = ehMestre;
    }

    public void setLayer(int layer) {
        switch (layer) {
            case 1:
                jLayeredPane1.setVisible(true);
                jLayeredPane2.setVisible(false);
                jLayeredPane3.setVisible(false);
                break;

            case 2:
                jLayeredPane1.setVisible(false);
                jLayeredPane2.setVisible(true);
                jLayeredPane3.setVisible(false);
                break;

            case 3:
                jLayeredPane1.setVisible(false);
                jLayeredPane2.setVisible(false);
                jLayeredPane3.setVisible(true);
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new InicioJFrame().setVisible(true);
            } catch (IOException ex) {
                Logger.getLogger(InicioJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

      // Variables declaration - do not modify//GEN-BEGIN:variables
      private javax.swing.JLabel agilidadeLabel;
      private javax.swing.JRadioButton agilidadeRadioButton;
      private javax.swing.JButton anaoButton;
      private javax.swing.JLabel ancLabel;
      private javax.swing.JButton automatoButton;
      private javax.swing.JButton btnEnviarMSG;
      private javax.swing.JButton btnFicha;
      private javax.swing.JButton btnLoja;
      private javax.swing.JButton btnRolarDado;
      private javax.swing.ButtonGroup buttonGroup1;
      private javax.swing.ButtonGroup buttonGroup2;
      private javax.swing.JTextArea campoEnvioChat;
      private javax.swing.JButton changelingButton;
      private javax.swing.JTextArea chatArea;
      private javax.swing.JButton confirmarButton;
      private javax.swing.JLabel corrupcaoLabel;
      private javax.swing.JRadioButton d10;
      private javax.swing.JRadioButton d100;
      private javax.swing.JRadioButton d20;
      private javax.swing.JRadioButton d3;
      private javax.swing.JRadioButton d6;
      private javax.swing.JRadioButton d8;
      private javax.swing.JLabel defesaLabel;
      private javax.swing.JLabel deslocamentoLabel;
      private javax.swing.JLabel forcaLabel;
      private javax.swing.JRadioButton forcaRadioButton;
      private javax.swing.JLabel fundoAnc;
      private javax.swing.JLabel fundoPainel3;
      private javax.swing.JLabel fundoServer;
      private javax.swing.JButton goblinButton;
      private javax.swing.JButton humanoButton;
      private javax.swing.JLabel idadeLabel;
      private javax.swing.JTextField idadeTextField;
      private javax.swing.JLabel insLabel;
      private javax.swing.JLabel insanidadeLabel;
      private javax.swing.JLabel intelectoLabel;
      private javax.swing.JRadioButton intelectoRadioButton;
      private javax.swing.JButton jButton1;
      private javax.swing.JButton jButton2;
      private javax.swing.JButton jButton3;
      private javax.swing.JButton jButtonCriarSala;
      private javax.swing.JButton jButtonEntraSala;
      private javax.swing.JFrame jFrameAnc;
      private javax.swing.JLabel jLabel1;
      private javax.swing.JLabel jLabel10;
      private javax.swing.JLabel jLabel11;
      private javax.swing.JLabel jLabel12;
      private javax.swing.JLabel jLabel13;
      private javax.swing.JLabel jLabel14;
      private javax.swing.JLabel jLabel15;
      private javax.swing.JLabel jLabel16;
      private javax.swing.JLabel jLabel17;
      private javax.swing.JLabel jLabel2;
      private javax.swing.JLabel jLabel3;
      private javax.swing.JLabel jLabel4;
      private javax.swing.JLayeredPane jLayeredPane1;
      private javax.swing.JLayeredPane jLayeredPane2;
      private javax.swing.JLayeredPane jLayeredPane3;
      private javax.swing.JLayeredPane jLayeredPane4;
      private javax.swing.JLayeredPane jLayeredPane5;
      private javax.swing.JScrollPane jScrollPane1;
      private javax.swing.JScrollPane jScrollPane2;
      private javax.swing.JScrollPane jScrollPane3;
      private javax.swing.JTable jTable1;
      private javax.swing.JTextField jTextIP;
      private javax.swing.JLabel lblBackgound;
      private javax.swing.JLabel lblDemon;
      private javax.swing.JLabel lblFundoIP;
      private javax.swing.JLabel lblLogo;
      private javax.swing.JLabel lblPergaminho;
      private javax.swing.JLabel lblPergaminhoAnc;
      private javax.swing.JLabel lblRolagem;
      private javax.swing.JLabel lblRolarD10;
      private javax.swing.JLabel lblRolarD100;
      private javax.swing.JLabel lblRolarD20;
      private javax.swing.JLabel lblRolarD3;
      private javax.swing.JLabel lblRolarD6;
      private javax.swing.JLabel lblRolarD8;
      private javax.swing.JLabel lblSpace;
      private javax.swing.JLabel lblSpace1;
      private javax.swing.JLabel lblSpace2;
      private javax.swing.JLabel lblSpace4;
      private javax.swing.JLabel lblTocha1;
      private javax.swing.JLabel lblTocha2;
      private javax.swing.JLabel lblimgAnao;
      private javax.swing.JLabel lblimgAutomato;
      private javax.swing.JLabel lblimgChangeling;
      private javax.swing.JLabel lblimgGoblin;
      private javax.swing.JLabel lblimgHumano;
      private javax.swing.JLabel lblimgOrc;
      private javax.swing.JButton mestreButton;
      private javax.swing.JTextField nomeTextField;
      private javax.swing.JButton orcButton;
      private javax.swing.JLabel percepcaoLabel;
      private javax.swing.JLabel pontosGastarLabel;
      private javax.swing.JLabel saudeLabel;
      private javax.swing.JLabel tamanhoLabel;
      private javax.swing.JLabel taxaCuraLabel;
      private javax.swing.JButton voltarButton;
      private javax.swing.JLabel vontadeLabel;
      private javax.swing.JRadioButton vontadeRadioButton;
      // End of variables declaration//GEN-END:variables
}
