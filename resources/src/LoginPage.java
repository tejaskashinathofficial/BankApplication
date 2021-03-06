
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */
public class LoginPage extends javax.swing.JFrame {

    /**
     * Creates new form LoginPage
     */
    public LoginPage() {
        initComponents();
        this.setSize(700,500);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPane1 = new javax.swing.JOptionPane();
        LoginLabel = new javax.swing.JLabel();
        UserField = new javax.swing.JTextField();
        UserLabel = new javax.swing.JLabel();
        SignBut = new javax.swing.JButton();
        PassLabel = new javax.swing.JLabel();
        CustRadio = new javax.swing.JRadioButton();
        EmpRadio = new javax.swing.JRadioButton();
        AdminRadio = new javax.swing.JRadioButton();
        PassField = new javax.swing.JPasswordField();
        SignUpBut = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        ExitBut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        LoginLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        LoginLabel.setText("Login");
        getContentPane().add(LoginLabel);
        LoginLabel.setBounds(270, 60, 50, 17);

        UserField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserFieldActionPerformed(evt);
            }
        });
        getContentPane().add(UserField);
        UserField.setBounds(190, 130, 200, 30);

        UserLabel.setText("Username");
        getContentPane().add(UserLabel);
        UserLabel.setBounds(190, 110, 110, 17);

        SignBut.setText("Sign In");
        SignBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignButActionPerformed(evt);
            }
        });
        getContentPane().add(SignBut);
        SignBut.setBounds(240, 270, 120, 30);

        PassLabel.setText("Password");
        getContentPane().add(PassLabel);
        PassLabel.setBounds(190, 160, 100, 17);

        CustRadio.setText("Customer");
        getContentPane().add(CustRadio);
        CustRadio.setBounds(120, 220, 100, 24);

        EmpRadio.setText("Employee");
        getContentPane().add(EmpRadio);
        EmpRadio.setBounds(240, 220, 100, 24);

        AdminRadio.setText("Admin");
        getContentPane().add(AdminRadio);
        AdminRadio.setBounds(360, 220, 90, 24);

        PassField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PassFieldActionPerformed(evt);
            }
        });
        getContentPane().add(PassField);
        PassField.setBounds(190, 180, 200, 30);

        SignUpBut.setText("Sign Up");
        SignUpBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUpButActionPerformed(evt);
            }
        });
        getContentPane().add(SignUpBut);
        SignUpBut.setBounds(260, 310, 80, 30);

        jLabel1.setText("New User? ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(180, 320, 77, 17);

        ExitBut.setText("Exit");
        ExitBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButActionPerformed(evt);
            }
        });
        getContentPane().add(ExitBut);
        ExitBut.setBounds(500, 30, 70, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UserFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserFieldActionPerformed

    private void SignButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignButActionPerformed
                    String User = UserField.getText();
                    char Pass[] = PassField.getPassword();
                    String word = new String(Pass);
                    if(CustRadio.isSelected()&&!EmpRadio.isSelected()&&!AdminRadio.isSelected())
                    {
                        if(User.equals("cust")&&word.equals("pass"))
                        {
                            CustomerPortal cp = new CustomerPortal();
                            this.setVisible(false);
                            cp.setVisible(true);
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(this, "Invalid Credentials");
                        }
                    }
                    else if(AdminRadio.isSelected()&&!CustRadio.isSelected()&&!EmpRadio.isSelected())
                    {
                        if(User.equals("admin")&&word.equals("pass"))
                        {
                            JOptionPane.showMessageDialog(this,"Login Succesful");
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(this, "Invalid Credentials");
                        }
                    }
                    else if(EmpRadio.isSelected()&&!AdminRadio.isSelected()&&!CustRadio.isSelected())
                    {
                        if(User.equals("emp")&&word.equals("pass"))
                        {
                            JOptionPane.showMessageDialog(this,"Login Succesful");
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(this, "Invalid Credentials");
                        }
                    }
                    
    }//GEN-LAST:event_SignButActionPerformed

    private void PassFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PassFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PassFieldActionPerformed

    private void SignUpButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUpButActionPerformed
           SignUpPage sup = new SignUpPage();
           this.setVisible(false);
           sup.setVisible(true);
           
    }//GEN-LAST:event_SignUpButActionPerformed

    private void ExitButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButActionPerformed
                            System.exit(0);        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton AdminRadio;
    private javax.swing.JRadioButton CustRadio;
    private javax.swing.JRadioButton EmpRadio;
    private javax.swing.JButton ExitBut;
    private javax.swing.JLabel LoginLabel;
    private javax.swing.JPasswordField PassField;
    private javax.swing.JLabel PassLabel;
    private javax.swing.JButton SignBut;
    private javax.swing.JButton SignUpBut;
    private javax.swing.JTextField UserField;
    private javax.swing.JLabel UserLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JOptionPane jOptionPane1;
    // End of variables declaration//GEN-END:variables

    private static class Char {

        public Char() {
        }
    }
}
