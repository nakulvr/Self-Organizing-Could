/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package soc3;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author user
 */
public class Evaluation extends javax.swing.JFrame {

    /**
     * Creates new form P3ReceiveTask
     */
    
    Connection con;
    Statement st;
    
    
    
    public Evaluation() {
        initComponents();
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://192.168.1.30:3306/socDB","root","");
            st=con.createStatement();
            
        }
        catch(Exception e){
            System.out.println("Exception : "+e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        e1 = new javax.swing.JButton();
        e2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Task Execution");
        setMinimumSize(new java.awt.Dimension(920, 540));
        getContentPane().setLayout(null);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 110, 900, 10);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(0, 160, 900, 10);

        e1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        e1.setForeground(new java.awt.Color(0, 102, 255));
        e1.setText("RAM Usage");
        e1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 204, 255), new java.awt.Color(102, 204, 255), null, null));
        e1.setContentAreaFilled(false);
        e1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e1ActionPerformed(evt);
            }
        });
        getContentPane().add(e1);
        e1.setBounds(70, 120, 150, 27);

        e2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        e2.setForeground(new java.awt.Color(0, 102, 255));
        e2.setText("CPU Usage");
        e2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 204, 255), new java.awt.Color(102, 204, 255), null, null));
        e2.setContentAreaFilled(false);
        e2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e2ActionPerformed(evt);
            }
        });
        getContentPane().add(e2);
        e2.setBounds(300, 120, 180, 27);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tit.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 900, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void e1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e1ActionPerformed
        try {
            //
            Graph g=new Graph();
            g.getVal();
            g.showRam();
        } catch (Exception ex) {
            Logger.getLogger(Evaluation.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_e1ActionPerformed

    private void e2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e2ActionPerformed
        try {
            // TODO add your handling code here:
            Graph g=new Graph();
                g.getVal();
                g.showCpu();
        } catch (Exception ex) {
            Logger.getLogger(Evaluation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_e2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Evaluation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Evaluation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Evaluation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Evaluation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Evaluation().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton e1;
    private javax.swing.JButton e2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
