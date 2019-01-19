/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tejas
 */
public class LoanApply extends javax.swing.JFrame {

    /**
     * Creates new form LoanApply
     */
    public LoanApply() {
        this.setSize(400,300);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        PrincAmt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        DurationCb = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        SubmitBut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel1.setText("Apply For A Loan");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 12, -1, -1));

        jLabel2.setText("Principle Amount: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 51, -1, -1));

        PrincAmt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrincAmtActionPerformed(evt);
            }
        });
        getContentPane().add(PrincAmt, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 140, -1));

        jLabel3.setText("Duration                 :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        DurationCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select--", "1", "3 ", "5 ", "10", " " }));
        DurationCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DurationCbActionPerformed(evt);
            }
        });
        getContentPane().add(DurationCb, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, -1, -1));

        jLabel4.setText("Loan Type");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select--", "Home", "Car", "Education", "Personal" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, -1, -1));

        SubmitBut.setText("Submit");
        SubmitBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButActionPerformed(evt);
            }
        });
        getContentPane().add(SubmitBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PrincAmtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrincAmtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrincAmtActionPerformed

    private void DurationCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DurationCbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DurationCbActionPerformed

    private void SubmitButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SubmitButActionPerformed

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
            java.util.logging.Logger.getLogger(LoanApply.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoanApply.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoanApply.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoanApply.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoanApply().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> DurationCb;
    private javax.swing.JTextField PrincAmt;
    private javax.swing.JButton SubmitBut;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
