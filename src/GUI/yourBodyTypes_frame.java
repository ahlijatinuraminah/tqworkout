/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import static GUI.DataTransfer.age;
import static GUI.DataTransfer.bodyTypes;
import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class yourBodyTypes_frame extends javax.swing.JFrame {

    /**
     * Creates new form yourGender_frame
     */
    public yourBodyTypes_frame() {
        initComponents();
        
        buttonGroup1.add(thinType);
        buttonGroup1.add(leanType);
        buttonGroup1.add(thickType);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        question = new javax.swing.JLabel();
        hiTrainer = new javax.swing.JLabel();
        nextButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        leanType = new javax.swing.JButton();
        thickType = new javax.swing.JButton();
        thinType = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("DIN Black", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("LET US KNOW MORE ABOUT YOU.");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 620, 70));

        question.setBackground(new java.awt.Color(153, 153, 255));
        question.setFont(new java.awt.Font("Quosm SemiBold", 0, 24)); // NOI18N
        question.setForeground(new java.awt.Color(255, 255, 255));
        question.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        question.setText("which one is your body type?");
        jPanel1.add(question, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 379, 32));

        hiTrainer.setFont(new java.awt.Font("Quosm SemiBold", 1, 18)); // NOI18N
        hiTrainer.setForeground(new java.awt.Color(255, 255, 255));
        hiTrainer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(hiTrainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 430, 368, 34));

        nextButton.setBackground(new java.awt.Color(255, 255, 255));
        nextButton.setFont(new java.awt.Font("Segoe Script", 0, 18)); // NOI18N
        nextButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/arrow kecil bgt kanan.png"))); // NOI18N
        nextButton.setContentAreaFilled(false);
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });
        jPanel1.add(nextButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 441, 50, 50));

        backButton.setBackground(new java.awt.Color(255, 255, 255));
        backButton.setFont(new java.awt.Font("Segoe Script", 0, 18)); // NOI18N
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/arrow kecil bgt kiri.png"))); // NOI18N
        backButton.setBorderPainted(false);
        backButton.setContentAreaFilled(false);
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        jPanel1.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 436, 50, 50));

        leanType.setBackground(new java.awt.Color(255, 255, 255));
        leanType.setFont(new java.awt.Font("Quosm", 1, 14)); // NOI18N
        leanType.setForeground(new java.awt.Color(243, 107, 36));
        leanType.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/meso fix.png"))); // NOI18N
        leanType.setContentAreaFilled(false);
        leanType.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        leanType.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                leanTypeMouseClicked(evt);
            }
        });
        leanType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leanTypeActionPerformed(evt);
            }
        });
        jPanel1.add(leanType, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 190, 250));

        thickType.setBackground(new java.awt.Color(255, 255, 255));
        thickType.setFont(new java.awt.Font("Quosm", 1, 14)); // NOI18N
        thickType.setForeground(new java.awt.Color(243, 107, 36));
        thickType.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/endo fix.png"))); // NOI18N
        thickType.setContentAreaFilled(false);
        thickType.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        thickType.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                thickTypeMouseClicked(evt);
            }
        });
        thickType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thickTypeActionPerformed(evt);
            }
        });
        jPanel1.add(thickType, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 180, 170, 250));

        thinType.setBackground(new java.awt.Color(255, 255, 255));
        thinType.setFont(new java.awt.Font("Quosm", 1, 14)); // NOI18N
        thinType.setForeground(new java.awt.Color(243, 107, 36));
        thinType.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/ecto fix.png"))); // NOI18N
        thinType.setContentAreaFilled(false);
        thinType.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        thinType.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                thinTypeMouseClicked(evt);
            }
        });
        thinType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thinTypeActionPerformed(evt);
            }
        });
        jPanel1.add(thinType, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 170, 250));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/rsz_1rsz_1rsz_logo.png"))); // NOI18N
        jPanel1.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 70));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/tq background2.jpg"))); // NOI18N
        jPanel1.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -2, 890, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 745, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        
        if ( bodyTypes == 0 ) {
            this.setVisible(true);
            JOptionPane.showMessageDialog(null, "Please choose one!", "Inane error", JOptionPane.ERROR_MESSAGE);
        } else {
           this.setVisible(false);
           bmiCalcu next = new bmiCalcu();
           next.setVisible(true); 
        }
    }//GEN-LAST:event_nextButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        this.setVisible(false);
        yourGender_frame back = new yourGender_frame();
        back.setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void leanTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leanTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_leanTypeActionPerformed

    private void thickTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thickTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_thickTypeActionPerformed

    private void thinTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thinTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_thinTypeActionPerformed

    private void thinTypeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_thinTypeMouseClicked
        int bodytypes = 1;
        DataTransfer.setBodyTypes(1);
        hiTrainer.setText("An ectomorph!");
    }//GEN-LAST:event_thinTypeMouseClicked

    private void leanTypeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leanTypeMouseClicked
        int bodytypes = 2; 
        DataTransfer.setBodyTypes(2);
         hiTrainer.setText("A mesomorph!");
    }//GEN-LAST:event_leanTypeMouseClicked

    private void thickTypeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_thickTypeMouseClicked
        int bodytypes = 3; 
        DataTransfer.setBodyTypes(3);
         hiTrainer.setText("An endomorph!");
    }//GEN-LAST:event_thickTypeMouseClicked

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
            java.util.logging.Logger.getLogger(yourBodyTypes_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new yourBodyTypes_frame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel background;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel hiTrainer;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton leanType;
    private javax.swing.JLabel logo;
    private javax.swing.JButton nextButton;
    private javax.swing.JLabel question;
    private javax.swing.JButton thickType;
    private javax.swing.JButton thinType;
    // End of variables declaration//GEN-END:variables

    private static class aboveTwen {

        public aboveTwen() {
        }
    }
}
