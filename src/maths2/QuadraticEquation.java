/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maths2;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 *
 * @author ISoft
 */
public class QuadraticEquation extends javax.swing.JFrame {

    /**
     * Creates new form QuadraticEquation
     */
    public QuadraticEquation() {
        initComponents();
        setLocationRelativeTo(JOptionPane.getRootFrame());
        setTitle("ISoft Quadratic Equation Tool");
        setIconImage(new ImageIcon(getClass().getResource("icons8_Student_Center_20px_4.png")).getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The
     * content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtA = new javax.swing.JTextField();
        txtB = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtC = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnSolve = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtNum4 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtNum5 = new javax.swing.JTextField();
        btnRefresh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 0, 0));

        jLabel4.setFont(new java.awt.Font("Gabriola", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Quadratic Equation Solver");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(204, 0, 0));

        jLabel5.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maths/icons8_Info_20px_1.png"))); // NOI18N
        jLabel5.setText("ISoft");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Gabriola", 0, 32)); // NOI18N
        jLabel1.setText("a = ");
        jLabel1.setFocusTraversalPolicyProvider(true);
        jLabel1.setName("lab1"); // NOI18N

        txtA.setName(""); // NOI18N
        txtA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAKeyTyped(evt);
            }
        });

        txtB.setName(""); // NOI18N
        txtB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Gabriola", 0, 32)); // NOI18N
        jLabel2.setText("b = ");
        jLabel2.setFocusTraversalPolicyProvider(true);
        jLabel2.setName("lab1"); // NOI18N

        txtC.setName(""); // NOI18N
        txtC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Gabriola", 0, 32)); // NOI18N
        jLabel3.setText("c = ");
        jLabel3.setFocusTraversalPolicyProvider(true);
        jLabel3.setName("lab1"); // NOI18N

        btnSolve.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        btnSolve.setText("Solve");
        btnSolve.setFocusable(false);
        btnSolve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolveActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Gabriola", 0, 32)); // NOI18N
        jLabel6.setText("x1 = ");
        jLabel6.setFocusTraversalPolicyProvider(true);
        jLabel6.setName("lab1"); // NOI18N

        txtNum4.setEditable(false);
        txtNum4.setFocusable(false);
        txtNum4.setName(""); // NOI18N
        txtNum4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNum4KeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Gabriola", 0, 32)); // NOI18N
        jLabel7.setText("x2 = ");
        jLabel7.setFocusTraversalPolicyProvider(true);
        jLabel7.setName("lab1"); // NOI18N

        txtNum5.setEditable(false);
        txtNum5.setFocusable(false);
        txtNum5.setName(""); // NOI18N
        txtNum5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNum5KeyTyped(evt);
            }
        });

        btnRefresh.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        btnRefresh.setText("Refresh");
        btnRefresh.setFocusable(false);
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNum4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNum5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtA, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtB, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtC, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnSolve, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRefresh))))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtA, txtB, txtC});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtA, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(txtC, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txtB)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(40, 40, 40)
                .addComponent(btnSolve, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNum4)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNum5)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtA, txtB, txtC});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAKeyTyped
        if (Character.isAlphabetic(evt.getKeyChar()) ) {
            evt.consume();
        }
    }//GEN-LAST:event_txtAKeyTyped

    private void txtBKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBKeyTyped
        if (Character.isAlphabetic(evt.getKeyChar()) ) {
            evt.consume();
        }
    }//GEN-LAST:event_txtBKeyTyped

    private void txtCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCKeyTyped
        if (Character.isAlphabetic(evt.getKeyChar()) ) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCKeyTyped

    private void btnSolveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolveActionPerformed
        try {
            double a, b, c, w, x, y, z, ans1, ans2;
            a = Double.parseDouble(txtA.getText());
            b = Double.parseDouble(txtB.getText());
            c = Double.parseDouble(txtC.getText());
            w = (-b) / (2 * a);
            x = (b * b) - (4 * a * c);
            y = Math.sqrt(x);
            z = y / (2 * a);
            ans1 = w + z;
            ans2 = w - z;
            txtNum4.setText(String.format("%.2f", ans1));
            txtNum5.setText(String.format("%.2f", ans2));
        } catch (NumberFormatException nFE) {
            JOptionPane.showMessageDialog(null, nFE.getMessage(), "InputError", 3);
        }
    }//GEN-LAST:event_btnSolveActionPerformed

    private void txtNum4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNum4KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNum4KeyTyped

    private void txtNum5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNum5KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNum5KeyTyped

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if (JOptionPane.showConfirmDialog(null, "Exit Quadratic Equation Solver", "Student Companion",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            this.dispose();
            CompanionApp.main(null);
        }
    }//GEN-LAST:event_formWindowClosing

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        txtA.setText(null);
        txtB.setText(null);
        txtC.setText(null);
        txtNum4.setText(null);
        txtNum5.setText(null);
    }//GEN-LAST:event_btnRefreshActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(QuadraticEquation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuadraticEquation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuadraticEquation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuadraticEquation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuadraticEquation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSolve;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtA;
    private javax.swing.JTextField txtB;
    private javax.swing.JTextField txtC;
    private javax.swing.JTextField txtNum4;
    private javax.swing.JTextField txtNum5;
    // End of variables declaration//GEN-END:variables
}
