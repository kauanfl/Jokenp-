package jokenpo;

/**
 *
 * @author Kauan Ferreira Lemos
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
///////////////////////////////////////////////////////////////////////////////
public class GUI_Jokenpo extends javax.swing.JFrame {

    /*1 - pedra
      2 - papel
      3 - tesoura
    */
    private int jogadorEscolha;
    private JokenpoLogica logica;
    
    //objeto para escolha aleatoria da maquina
    private Random random = new Random();
    
    //Variaveis para o placar
    private int vitoriasUsuario = 0;
    private int vitoriasMaquina = 0;
    private int empates         = 0;
///////////////////////////////////////////////////////////////////////////////            
    public GUI_Jokenpo() {
        initComponents();
        //Inicia a logica do jogo
        logica = new JokenpoLogica();
    }
///////////////////////////////////////////////////////////////////////////////
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JP_titulo = new javax.swing.JPanel();
        JL_titulo = new javax.swing.JLabel();
        JL_escolha = new javax.swing.JLabel();
        JP_buttons = new javax.swing.JPanel();
        btnpedra = new javax.swing.JButton();
        btnpapel = new javax.swing.JButton();
        btntesoura = new javax.swing.JButton();
        JL_escolhaMaquina = new javax.swing.JLabel();
        JL_resultado = new javax.swing.JLabel();
        JL_vitoriasUsuario = new javax.swing.JLabel();
        JL_vitoriasMaquina = new javax.swing.JLabel();
        JL_empates = new javax.swing.JLabel();
        btnnovoJogo = new javax.swing.JButton();
        btnsair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pedra, Papel ou Tesoura");
        setResizable(false);

        JP_titulo.setBackground(new java.awt.Color(0, 0, 255));
        JP_titulo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        JL_titulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        JL_titulo.setForeground(new java.awt.Color(255, 255, 255));
        JL_titulo.setText("JOKENPÔ");

        javax.swing.GroupLayout JP_tituloLayout = new javax.swing.GroupLayout(JP_titulo);
        JP_titulo.setLayout(JP_tituloLayout);
        JP_tituloLayout.setHorizontalGroup(
            JP_tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_tituloLayout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addComponent(JL_titulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JP_tituloLayout.setVerticalGroup(
            JP_tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_tituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JL_titulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JL_escolha.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JL_escolha.setText("Escolha sua jogada:");

        btnpedra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pedra.png"))); // NOI18N
        btnpedra.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnpedra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpedraActionPerformed(evt);
            }
        });

        btnpapel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/papel-de-mao (1).png"))); // NOI18N
        btnpapel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnpapel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpapelActionPerformed(evt);
            }
        });

        btntesoura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tesouras (1).png"))); // NOI18N
        btntesoura.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btntesoura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntesouraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JP_buttonsLayout = new javax.swing.GroupLayout(JP_buttons);
        JP_buttons.setLayout(JP_buttonsLayout);
        JP_buttonsLayout.setHorizontalGroup(
            JP_buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_buttonsLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(btnpedra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(btnpapel)
                .addGap(52, 52, 52)
                .addComponent(btntesoura)
                .addGap(78, 78, 78))
        );
        JP_buttonsLayout.setVerticalGroup(
            JP_buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_buttonsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JP_buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btntesoura)
                    .addComponent(btnpapel)
                    .addComponent(btnpedra))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JL_escolhaMaquina.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JL_escolhaMaquina.setText("Escolha da maquina:");

        JL_resultado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JL_resultado.setText("Resultado:");

        JL_vitoriasUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JL_vitoriasUsuario.setText("Vitorias do Usuario: 0");

        JL_vitoriasMaquina.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JL_vitoriasMaquina.setText("Vitorias da Maquina: 0");

        JL_empates.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JL_empates.setText("Empates: 0");

        btnnovoJogo.setBackground(new java.awt.Color(0, 0, 255));
        btnnovoJogo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnnovoJogo.setForeground(new java.awt.Color(255, 255, 255));
        btnnovoJogo.setText("Novo jogo");
        btnnovoJogo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnnovoJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnovoJogoActionPerformed(evt);
            }
        });

        btnsair.setBackground(new java.awt.Color(0, 0, 255));
        btnsair.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnsair.setForeground(new java.awt.Color(255, 255, 255));
        btnsair.setText("Sair");
        btnsair.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JP_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(JP_buttons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(JL_escolha))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(JL_resultado)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JL_vitoriasMaquina)
                    .addComponent(JL_empates)
                    .addComponent(JL_vitoriasUsuario)
                    .addComponent(JL_escolhaMaquina))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnsair, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnnovoJogo))
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JP_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JL_escolha)
                .addGap(18, 18, 18)
                .addComponent(JP_buttons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JL_escolhaMaquina)
                .addGap(54, 54, 54)
                .addComponent(JL_resultado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JL_vitoriasUsuario)
                        .addGap(36, 36, 36)
                        .addComponent(JL_vitoriasMaquina)
                        .addGap(18, 18, 18)
                        .addComponent(JL_empates))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnnovoJogo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnsair, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
/////////////////////////////////////////////////////////////////////////////////////////////////////
    private void btnnovoJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnovoJogoActionPerformed
        // TODO add your handling code here:
        vitoriasUsuario = 0;
        vitoriasMaquina = 0;
        empates         = 0;
        
           //Atualiza o placa
    JL_vitoriasUsuario.setText("Vitorias do Usuario: " + vitoriasUsuario);
    JL_vitoriasMaquina.setText("Vitorias da Maquina: " + vitoriasMaquina);
    JL_empates.setText("Empates: " + empates);
    // Limpa resultados anteriores
    JL_escolhaMaquina.setText("Escolha da maquina:");
    JL_resultado.setText("Resultado:");
    
    //Exibir mensagem de novo jogo
    JOptionPane.showMessageDialog(this, "O jogo foi reiniciado, Boa sorte!");
        
    }//GEN-LAST:event_btnnovoJogoActionPerformed
//////////////////////////////////////////////////////////////////////////////////////////////////////
    private void btnsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsairActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnsairActionPerformed

    private void btnpedraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpedraActionPerformed
        // TODO add your handling code here:
        jogadorEscolha = 1;
        jogar();
    }//GEN-LAST:event_btnpedraActionPerformed

    private void btnpapelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpapelActionPerformed
        // TODO add your handling code here:
        jogadorEscolha = 2;
        jogar();
    }//GEN-LAST:event_btnpapelActionPerformed

    private void btntesouraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntesouraActionPerformed
        // TODO add your handling code here:
        jogadorEscolha = 3;
        jogar();
    }//GEN-LAST:event_btntesouraActionPerformed
///////////////////////////////////////////////////////////////////////////////////////////////////////
  private void jogar(){
  
  //Gerar escolha aleatoria da maquina
  int maquinaEscolha = random.nextInt(3) + 1;
  
  //Exibir a escolha da maquina
  JL_escolhaMaquina.setText("Escolha da maquina: " + logica.getEscolhaNome(maquinaEscolha));
  
  //Determinando o vencedor
  String resultado = logica.determinarVencedor(jogadorEscolha, maquinaEscolha);
  JL_resultado.setText(resultado);
  
  
  //Atualiza o placar
  if (resultado.equals("Você Ganhou!")) {
    vitoriasUsuario++;
  } else if (resultado.equals("Você Perdeu!")) {
    vitoriasMaquina++;
  }  else if (resultado.equals("Empate!")) {
     empates++;
   } 
   
  JL_vitoriasUsuario.setText("Vitorias do Usuario: " + vitoriasUsuario);
  JL_vitoriasMaquina.setText("Vitorias da Maquina: " + vitoriasMaquina);
  JL_empates.setText("Empates: " + empates);
   } 
//////////////////////////////////////////////////////////////////////////////////////////////////////////// 
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
            java.util.logging.Logger.getLogger(GUI_Jokenpo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Jokenpo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Jokenpo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Jokenpo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Jokenpo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JL_empates;
    private javax.swing.JLabel JL_escolha;
    private javax.swing.JLabel JL_escolhaMaquina;
    private javax.swing.JLabel JL_resultado;
    private javax.swing.JLabel JL_titulo;
    private javax.swing.JLabel JL_vitoriasMaquina;
    private javax.swing.JLabel JL_vitoriasUsuario;
    private javax.swing.JPanel JP_buttons;
    private javax.swing.JPanel JP_titulo;
    private javax.swing.JButton btnnovoJogo;
    private javax.swing.JButton btnpapel;
    private javax.swing.JButton btnpedra;
    private javax.swing.JButton btnsair;
    private javax.swing.JButton btntesoura;
    // End of variables declaration//GEN-END:variables

   
}
