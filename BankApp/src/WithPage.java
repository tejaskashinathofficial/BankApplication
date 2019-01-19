
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tejas
 */
public class WithPage extends javax.swing.JFrame {

    /**
     * Creates new form WithPage
     */
    public WithPage() {
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
        WithBut = new javax.swing.JButton();
        ExitBut = new javax.swing.JButton();
        WithAmt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel1.setText("Withdraw Money");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        WithBut.setText("Withdraw");
        WithBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WithButActionPerformed(evt);
            }
        });
        getContentPane().add(WithBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, -1, -1));

        ExitBut.setText("Exit");
        ExitBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButActionPerformed(evt);
            }
        });
        getContentPane().add(ExitBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, -1, -1));
        getContentPane().add(WithAmt, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 230, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void WithButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WithButActionPerformed
                String amt = WithAmt.getText();
                try{
                    Long amount = Long.parseLong(amt);
                    JOptionPane.showMessageDialog(this,"Amount Withdrawn");
                    LoginPage.bal = LoginPage.bal-amount;
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(this, "Please Enter Valid Amount");
                }
                
                        // TODO add your handling code here:
    }//GEN-LAST:event_WithButActionPerformed

    private void ExitButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButActionPerformed
                                this.dispose();
                                TransactPage tp = new TransactPage();
                                tp.setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_ExitButActionPerformed

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
            java.util.logging.Logger.getLogger(WithPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WithPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WithPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WithPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WithPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExitBut;
    private javax.swing.JTextField WithAmt;
    private javax.swing.JButton WithBut;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
