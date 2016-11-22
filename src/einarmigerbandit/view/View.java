/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package einarmigerbandit.view;

import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author kevin
 */
public class View extends javax.swing.JFrame {

    /**
     * Creates new form View
     */
    public View() {
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

        jPanel1 = new javax.swing.JPanel();
        btnStart = new javax.swing.JButton();
        btnStop = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        tfCounterLeft = new javax.swing.JTextField();
        tfCounterCenter = new javax.swing.JTextField();
        tfCounterRight = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Einarmiger Bandit");

        jPanel1.setLayout(new java.awt.GridBagLayout());

        btnStart.setText("Start");
        jPanel1.add(btnStart, new java.awt.GridBagConstraints());

        btnStop.setText("Stop");
        jPanel1.add(btnStop, new java.awt.GridBagConstraints());

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_END);

        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.LINE_AXIS));

        tfCounterLeft.setColumns(1);
        tfCounterLeft.setFont(new java.awt.Font("Monospaced", 1, 48)); // NOI18N
        tfCounterLeft.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfCounterLeft.setText("9");
        tfCounterLeft.setEnabled(false);
        tfCounterLeft.setFocusable(false);
        tfCounterLeft.setMargin(new java.awt.Insets(5, 5, 5, 5));
        jPanel2.add(tfCounterLeft);

        tfCounterCenter.setColumns(1);
        tfCounterCenter.setFont(new java.awt.Font("Monospaced", 1, 48)); // NOI18N
        tfCounterCenter.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfCounterCenter.setText("9");
        tfCounterCenter.setEnabled(false);
        tfCounterCenter.setFocusable(false);
        tfCounterCenter.setMargin(new java.awt.Insets(5, 5, 5, 5));
        jPanel2.add(tfCounterCenter);

        tfCounterRight.setColumns(1);
        tfCounterRight.setFont(new java.awt.Font("Monospaced", 1, 48)); // NOI18N
        tfCounterRight.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfCounterRight.setText("9");
        tfCounterRight.setEnabled(false);
        tfCounterRight.setFocusable(false);
        tfCounterRight.setMargin(new java.awt.Insets(5, 5, 5, 5));
        jPanel2.add(tfCounterRight);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public JButton getBtnStart() {
        return btnStart;
    }

    public JButton getBtnStop() {
        return btnStop;
    }

    public JTextField getTfCounterCenter() {
        return tfCounterCenter;
    }

    public JTextField getTfCounterLeft() {
        return tfCounterLeft;
    }

    public JTextField getTfCounterRight() {
        return tfCounterRight;
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
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnStart;
    private javax.swing.JButton btnStop;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField tfCounterCenter;
    private javax.swing.JTextField tfCounterLeft;
    private javax.swing.JTextField tfCounterRight;
    // End of variables declaration//GEN-END:variables
}