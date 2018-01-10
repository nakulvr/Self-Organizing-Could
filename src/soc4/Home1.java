/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package soc4;

import java.sql.*;

/**
 *
 * @author user
 */
public class Home1 extends javax.swing.JFrame {

    /**
     * Creates new form Home1
     */
    Connection con;
    Statement st;
    
    public Home1() {
        initComponents();
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/socDB","root","");
            st=con.createStatement();
            //st.executeUpdate("truncate table can");
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

        src = new javax.swing.JButton();
        dst = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(920, 540));
        getContentPane().setLayout(null);

        src.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        src.setForeground(new java.awt.Color(0, 102, 255));
        src.setText("Provider");
        src.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 204, 255), new java.awt.Color(102, 204, 255), null, null));
        src.setContentAreaFilled(false);
        src.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                srcActionPerformed(evt);
            }
        });
        getContentPane().add(src);
        src.setBounds(80, 190, 120, 30);

        dst.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        dst.setForeground(new java.awt.Color(0, 102, 255));
        dst.setText("Consumer");
        dst.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 204, 255), new java.awt.Color(102, 204, 255), null, null));
        dst.setContentAreaFilled(false);
        dst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dstActionPerformed(evt);
            }
        });
        getContentPane().add(dst);
        dst.setBounds(370, 390, 120, 30);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 110, 900, 10);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(0, 300, 900, 10);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/hom.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 900, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void srcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_srcActionPerformed
        // TODO add your handling code here:
        try
        {
            Provider1 s=new Provider1();
            s.setVisible(true);
            
            Provider1b sb=new Provider1b();
            sb.setVisible(true);
        }
        catch(Exception e){
            System.out.println("Exception : "+e);
        }
    }//GEN-LAST:event_srcActionPerformed

    private void dstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dstActionPerformed
        // TODO add your handling code here:
//        Consumer s=new Consumer();
//        s.setVisible(true);
    }//GEN-LAST:event_dstActionPerformed

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
            java.util.logging.Logger.getLogger(Home1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Home1().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dst;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton src;
    // End of variables declaration//GEN-END:variables
}