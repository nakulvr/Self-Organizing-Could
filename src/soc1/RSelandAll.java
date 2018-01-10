/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package soc1;

import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.lowagie.text.Document;
import com.lowagie.text.pdf.*;
import java.awt.Color;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.sql.Connection;
import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import org.jfree.ui.RefineryUtilities;

/**
 *
 * @author etpl22
 */
public class RSelandAll extends javax.swing.JFrame {

    /**
     * Creates new form RSelandAll
     */
    public static double e[]=ResourceQuery.e;
    public static double w[]=ResourceQuery.w;
    public static double b=ResourceQuery.b;
    
    Connection con;
    Statement st;
    ResultSet rs;
    
    public static String taskId=ResourceQuery.taskId;
    public static File f;
    public static int selResId=0;
    ArrayList selRes=new ArrayList();
    ArrayList<Double> resCost=new ArrayList<Double>();
    
    public RSelandAll() {
        initComponents();
        try
        {
            UIManager.put("OptionPane.background", Color.WHITE);
            UIManager.put("Panel.background", Color.WHITE);
            UIManager.put("Button.background",Color.WHITE);
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/socDB","root","");
            st=con.createStatement();
            f=new File("./TaskReceived/"+taskId);
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
        vc = new javax.swing.JButton();
        e1 = new javax.swing.JButton();
        e2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        e3 = new javax.swing.JButton();
        e4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Resource Selection");
        setMinimumSize(new java.awt.Dimension(920, 540));
        getContentPane().setLayout(null);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 160, 900, 10);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(0, 110, 900, 10);

        vc.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        vc.setForeground(new java.awt.Color(0, 102, 255));
        vc.setText("View CAN");
        vc.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 204, 255), new java.awt.Color(102, 204, 255), null, null));
        vc.setContentAreaFilled(false);
        vc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vcActionPerformed(evt);
            }
        });
        getContentPane().add(vc);
        vc.setBounds(10, 120, 140, 30);

        e1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        e1.setForeground(new java.awt.Color(0, 102, 255));
        e1.setText("Available Resources");
        e1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 204, 255), new java.awt.Color(102, 204, 255), null, null));
        e1.setContentAreaFilled(false);
        e1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e1ActionPerformed(evt);
            }
        });
        getContentPane().add(e1);
        e1.setBounds(180, 120, 170, 30);

        e2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        e2.setForeground(new java.awt.Color(0, 102, 255));
        e2.setText("Selected Resource");
        e2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 204, 255), new java.awt.Color(102, 204, 255), null, null));
        e2.setContentAreaFilled(false);
        e2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e2ActionPerformed(evt);
            }
        });
        getContentPane().add(e2);
        e2.setBounds(380, 120, 160, 30);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Available VM within Budget", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 18), new java.awt.Color(0, 102, 255))); // NOI18N
        jPanel2.setOpaque(false);

        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Traditional Arabic", 0, 18)); // NOI18N
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(250, 180, 290, 290);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Available VM for R Demand", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 18), new java.awt.Color(0, 102, 255))); // NOI18N
        jPanel1.setOpaque(false);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Traditional Arabic", 0, 18)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 180, 230, 290);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Selected VM with Low Cost", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 18), new java.awt.Color(0, 102, 255))); // NOI18N
        jPanel3.setOpaque(false);

        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Traditional Arabic", 0, 18)); // NOI18N
        jTextArea3.setRows(5);
        jScrollPane3.setViewportView(jTextArea3);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 7, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(550, 180, 340, 160);

        e3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        e3.setForeground(new java.awt.Color(0, 102, 255));
        e3.setText("Task Execution");
        e3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 204, 255), new java.awt.Color(102, 204, 255), null, null));
        e3.setContentAreaFilled(false);
        e3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e3ActionPerformed(evt);
            }
        });
        getContentPane().add(e3);
        e3.setBounds(570, 120, 140, 30);

        e4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        e4.setForeground(new java.awt.Color(0, 102, 255));
        e4.setText("Receive Output");
        e4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 204, 255), new java.awt.Color(102, 204, 255), null, null));
        e4.setContentAreaFilled(false);
        e4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e4ActionPerformed(evt);
            }
        });
        //getContentPane().add(e4);
        e4.setBounds(740, 120, 140, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tit.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 900, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void vcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vcActionPerformed
        // TODO add your handling code here:
        try {
            
            CAN network = new CAN("Content Addressable Network");
            network.pack();
            RefineryUtilities.centerFrameOnScreen(network);
            network.setVisible(true);
        
        } catch (Exception e) {
            System.out.println("Exception : " + e);
        }
    }//GEN-LAST:event_vcActionPerformed

    private void e1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e1ActionPerformed
        // TODO add your handling code here:
        try{
            ArrayList resId=new ArrayList();
            ArrayList<Double> mcost=new ArrayList<Double>();
            ArrayList<Double> ccost=new ArrayList<Double>();
            ArrayList<Double> vcost=new ArrayList<Double>();
            
            rs=st.executeQuery("select ID,pmprice,cpuprice,smprice from can where pm>"+e[0]+" and cpu>="+e[1]+" and sm>="+e[2]+"");
            while(rs.next()){
                resId.add(rs.getInt(1));
                mcost.add(rs.getDouble(2));
                ccost.add(rs.getDouble(3));
                vcost.add(rs.getDouble(4));
            }
            System.out.println("client budget : "+b);
            System.out.println(resId.size()+" "+resId);
            jTextArea1.append("Resource ID\n=============\n");
            for(int i=0;i<resId.size();i++){
                jTextArea1.append(resId.get(i).toString()+"\n\n");
            }
            double actualCost=0.0;
            jTextArea2.append("RID\tCost\n=============\n\n");
            
            for(int i=0;i<resId.size();i++){
                actualCost=(e[0] * mcost.get(i))+(e[1]*ccost.get(i))+(e[2]*vcost.get(i));
                System.out.println(i+" "+actualCost+" b : "+b);
                if(actualCost <= b){
                    selRes.add(resId.get(i));
                    resCost.add(actualCost);
                    jTextArea2.append(resId.get(i).toString()+"\t"+actualCost+"\n\n");
                }
            }            
            System.out.println(selRes);
            //==========sorting 
        }catch(Exception e){
            System.out.println("Exception : "+e);
        }
    }//GEN-LAST:event_e1ActionPerformed

    private void e2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e2ActionPerformed
        // TODO add your handling code here:
        try{
            double max,min,dif;
            ArrayList<Double> diff = new ArrayList<Double>();
            ArrayList<Double> diffTemp = new ArrayList<Double>();
            for(int i=0;i<resCost.size();i++){
                max=Math.max(b, resCost.get(i));
                min=Math.min(b, resCost.get(i));
                dif=max-min;
                diff.add(dif);
                diffTemp.add(dif);
            }
            Collections.sort(diffTemp);
            double selDif=0;
            int selDifPos=0;
            selDif=diffTemp.get(diffTemp.size()-1);
            selDifPos=diff.indexOf(selDif);
            double selResCost=resCost.get(selDifPos);
            System.out.println(diff+"\t sort : "+diffTemp);
            selResId=Integer.parseInt(selRes.get(selDifPos).toString());
            jTextArea3.append("ResourceId\tCost\n===============================\n");
            jTextArea3.append(selResId+"\t"+selResCost);
            
        }catch(Exception e){           
            System.out.println("Exception : "+e);
        }
    }//GEN-LAST:event_e2ActionPerformed

    private void e3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e3ActionPerformed
        // TODO add your handling code here:
//        P6TaskToRes c = new P6TaskToRes();
//        c.setVisible(true);
        String msg="";
        int port=0;
        if(selResId == 1 || selResId ==2){
            port=1100;
            msg="Task sent to Resource "+selResId;
        }
            
        if(selResId == 3 || selResId ==4){
            port=1200;
            msg="Task sent to Resource "+selResId;
        }
        if(selResId == 5 || selResId ==6){
            port=1300;
            msg="Task sent to Resource "+selResId;
        }
        if(selResId == 7 || selResId ==8){
            port=1400;
            msg="Task sent to Resource "+selResId;
        }
        System.out.println("selected port : "+port);
        try{
            
            ServerSocket ss=new ServerSocket(port);
            Socket sk=ss.accept();
            System.out.println("Waiting");
            PrintStream ps=new PrintStream(sk.getOutputStream());
            
            BufferedReader br=new BufferedReader(new FileReader(f));
            String fileName=f.getName();
            ps.println(fileName);
            String read=""; 
            while((read=br.readLine())!=null){
                ps.println(read);
            }
            
            System.out.println("chellox");
            sk.close();
            ps.close();
            
        }catch(Exception e){
            System.out.println("Exception : "+e);
        }
    }//GEN-LAST:event_e3ActionPerformed

    private void e4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e4ActionPerformed
        try {
            // TODO add your handling code here:
            int ePort=0;
            Socket soc=new Socket("localhost",7000);
            BufferedReader br=new BufferedReader(new InputStreamReader(soc.getInputStream()));
            String r="";
            String fileName=br.readLine();
//            File f=new File(fileName+".pdf");
//            if(f.exists()){}
//            else
//                f.createNewFile();
                
            System.out.println(fileName+" recvd file name ");
            fileName=fileName+".pdf";
            com.itextpdf.text.Document document=new com.itextpdf.text.Document(PageSize.A4, 36, 72, 108, 80);        
            com.itextpdf.text.pdf.PdfWriter.getInstance(document,new FileOutputStream("./e/"+fileName));// pdf file name
            document.open();
            document.setMargins(40.25f, 40.25f, 50.30f, 60.30f);
        
            while((r=br.readLine())!=null){
                System.out.println("recvd : "+r);
                document.add(new Paragraph(r));            
                System.out.println("Text is inserted into pdf file"); 
            }
            System.out.println("out of while");
            document.close();
            JOptionPane.showMessageDialog(null,"Executed Job Received Successfully");
            
        } catch (DocumentException ex) {
            Logger.getLogger(RSelandAll.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnknownHostException ex) {
            Logger.getLogger(RSelandAll.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(RSelandAll.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_e4ActionPerformed

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
            java.util.logging.Logger.getLogger(RSelandAll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RSelandAll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RSelandAll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RSelandAll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new RSelandAll().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton e1;
    private javax.swing.JButton e2;
    private javax.swing.JButton e3;
    private javax.swing.JButton e4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JButton vc;
    // End of variables declaration//GEN-END:variables
}
