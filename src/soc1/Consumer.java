/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package soc1;

import java.lang.management.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Method;
import java.text.DecimalFormat;
import java.util.Random;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author user
 */
public class Consumer extends javax.swing.JFrame {

    /**
     * Creates new form Destination1
     */
    public static File f;
    Object a;
    public static double cpuProcessLoad;
    public static double expectedMem,budget;
    public static double expectedSwap=0.0;
    public static double[] etij=new double[3];
    public static double[] wtij=new double[3];
    public static double[] Btij=new double[3];
    
    public Consumer() {
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

        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        browse = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        e = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        w = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        b = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea6 = new javax.swing.JTextArea();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextArea7 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        e1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(920, 540));
        getContentPane().setLayout(null);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 110, 900, 10);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(680, 150, 220, 10);

        jTabbedPane1.setForeground(new java.awt.Color(0, 102, 255));
        jTabbedPane1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jPanel1.setOpaque(false);
        jPanel1.setLayout(null);

        browse.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        browse.setForeground(new java.awt.Color(0, 102, 255));
        browse.setText("Pick Task");
        browse.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 204, 255), new java.awt.Color(102, 204, 255), null, null));
        browse.setContentAreaFilled(false);
        browse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseActionPerformed(evt);
            }
        });
        jPanel1.add(browse);
        browse.setBounds(20, 40, 120, 30);

        jTextField1.setFont(new java.awt.Font("Traditional Arabic", 0, 20)); // NOI18N
        jPanel1.add(jTextField1);
        jTextField1.setBounds(170, 40, 420, 30);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Traditional Arabic", 0, 20)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 120, 630, 200);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 2, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 255));
        jLabel2.setText("Contents");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 90, 270, 30);

        jTabbedPane1.addTab("Load Task", jPanel1);

        jPanel2.setOpaque(false);
        jPanel2.setLayout(null);

        e.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        e.setForeground(new java.awt.Color(0, 102, 255));
        e.setText("Expected Resource Computation");
        e.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 204, 255), new java.awt.Color(102, 204, 255), null, null));
        e.setContentAreaFilled(false);
        e.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eActionPerformed(evt);
            }
        });
        jPanel2.add(e);
        e.setBounds(10, 20, 270, 30);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resources", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 18), new java.awt.Color(0, 102, 255))); // NOI18N
        jPanel5.setOpaque(false);
        jPanel5.setLayout(null);

        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Traditional Arabic", 0, 20)); // NOI18N
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jPanel5.add(jScrollPane2);
        jScrollPane2.setBounds(10, 30, 230, 190);

        jPanel2.add(jPanel5);
        jPanel5.setBounds(20, 80, 250, 230);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Expected Consumption", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 18), new java.awt.Color(0, 102, 255))); // NOI18N
        jPanel6.setOpaque(false);
        jPanel6.setLayout(null);

        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Traditional Arabic", 0, 20)); // NOI18N
        jTextArea3.setRows(5);
        jScrollPane3.setViewportView(jTextArea3);

        jPanel6.add(jScrollPane3);
        jScrollPane3.setBounds(10, 30, 220, 190);

        jPanel2.add(jPanel6);
        jPanel6.setBounds(300, 80, 240, 230);

        jTabbedPane1.addTab("Expected Resource Vector", jPanel2);

        jPanel3.setOpaque(false);
        jPanel3.setLayout(null);

        w.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        w.setForeground(new java.awt.Color(0, 102, 255));
        w.setText("Weight");
        w.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 204, 255), new java.awt.Color(102, 204, 255), null, null));
        w.setContentAreaFilled(false);
        w.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wActionPerformed(evt);
            }
        });
        jPanel3.add(w);
        w.setBounds(20, 30, 170, 30);

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resources", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 18), new java.awt.Color(0, 102, 255))); // NOI18N
        jPanel7.setOpaque(false);
        jPanel7.setLayout(null);

        jTextArea4.setColumns(20);
        jTextArea4.setFont(new java.awt.Font("Traditional Arabic", 0, 20)); // NOI18N
        jTextArea4.setRows(5);
        jScrollPane4.setViewportView(jTextArea4);

        jPanel7.add(jScrollPane4);
        jScrollPane4.setBounds(10, 30, 230, 190);

        jPanel3.add(jPanel7);
        jPanel7.setBounds(20, 80, 250, 230);

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Expected Consumption", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 18), new java.awt.Color(0, 102, 255))); // NOI18N
        jPanel8.setOpaque(false);
        jPanel8.setLayout(null);

        jTextArea5.setColumns(20);
        jTextArea5.setFont(new java.awt.Font("Traditional Arabic", 0, 20)); // NOI18N
        jTextArea5.setRows(5);
        jScrollPane5.setViewportView(jTextArea5);

        jPanel8.add(jScrollPane5);
        jScrollPane5.setBounds(10, 30, 220, 190);

        jPanel3.add(jPanel8);
        jPanel8.setBounds(300, 80, 240, 230);

        jTabbedPane1.addTab("Weight Vector", jPanel3);

        jPanel4.setOpaque(false);
        jPanel4.setLayout(null);

        b.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        b.setForeground(new java.awt.Color(0, 102, 255));
        b.setText("Budget");
        b.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 204, 255), new java.awt.Color(102, 204, 255), null, null));
        b.setContentAreaFilled(false);
        b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bActionPerformed(evt);
            }
        });
        jPanel4.add(b);
        b.setBounds(20, 30, 170, 30);

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resources", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 18), new java.awt.Color(0, 102, 255))); // NOI18N
        jPanel9.setOpaque(false);
        jPanel9.setLayout(null);

        jTextArea6.setColumns(20);
        jTextArea6.setFont(new java.awt.Font("Traditional Arabic", 0, 20)); // NOI18N
        jTextArea6.setRows(5);
        jScrollPane6.setViewportView(jTextArea6);

        jPanel9.add(jScrollPane6);
        jScrollPane6.setBounds(10, 30, 230, 190);

        jPanel4.add(jPanel9);
        jPanel9.setBounds(20, 80, 250, 230);

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Expected Price", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 18), new java.awt.Color(0, 102, 255))); // NOI18N
        jPanel10.setOpaque(false);
        jPanel10.setLayout(null);

        jTextArea7.setColumns(20);
        jTextArea7.setFont(new java.awt.Font("Traditional Arabic", 0, 20)); // NOI18N
        jTextArea7.setRows(5);
        jScrollPane7.setViewportView(jTextArea7);

        jPanel10.add(jScrollPane7);
        jScrollPane7.setBounds(10, 30, 220, 190);

        jPanel4.add(jPanel10);
        jPanel10.setBounds(300, 80, 240, 230);

        jLabel3.setFont(new java.awt.Font("Traditional Arabic", 0, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 255));
        jPanel4.add(jLabel3);
        jLabel3.setBounds(270, 30, 270, 30);

        jTabbedPane1.addTab("Budget", jPanel4);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(10, 120, 670, 370);

        e1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        e1.setForeground(new java.awt.Color(0, 102, 255));
        e1.setText("Submit Task with Budget");
        e1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 204, 255), new java.awt.Color(102, 204, 255), null, null));
        e1.setContentAreaFilled(false);
        e1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e1ActionPerformed(evt);
            }
        });
        getContentPane().add(e1);
        e1.setBounds(690, 120, 200, 27);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tit.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 900, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void browseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseActionPerformed
        // TODO add your handling code here:
        try {
            JFileChooser chooser=new JFileChooser();
            chooser.setFileFilter(new FileNameExtensionFilter("Text Files", "txt"));
            chooser.removeChoosableFileFilter(chooser.getAcceptAllFileFilter());
            int re=chooser.showDialog(Consumer.this, "Select Task");
            f=chooser.getSelectedFile();
            jTextField1.setText(f.getName());
            
            BufferedReader br=new BufferedReader(new FileReader(f));
            String read="";
            while((read=br.readLine())!=null){
                jTextArea1.append(read+"\n");
            }
            
        } catch (Exception e) {
            System.out.println("Exception : " + e);
        }
    }//GEN-LAST:event_browseActionPerformed

    private void eActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eActionPerformed
        // TODO add your handling code here:
        try
        {
            jTextArea2.append("Physical Memory\n\n");
            jTextArea2.append("CPU Usage\n\n");
            jTextArea2.append("Virtual Memory ");
            double start=0.0,end=0.0;
            DecimalFormat df=new DecimalFormat("#.####");
            do{
                OperatingSystemMXBean os=ManagementFactory.getOperatingSystemMXBean();            
                for(Method mm:os.getClass().getDeclaredMethods()){
                    mm.setAccessible(true);
                    a=mm.invoke(os);
                    if(mm.getName().startsWith("getSystemCpuLoad")){ 
                        start=new Double(a.toString());
                        Random r=new Random();
                    int t=0;                    
                    if(start == -1.0 || start == 1.0){
                        do{
                            t=r.nextInt(100);
                        }while(t==0);
                        start=(double)t;
                    }
                    int t2=r.nextInt(2);
                    System.out.println("01 : "+t2);
                    if(t2==0)
                        start=start*0.001;
                    else
                        start=start*0.01;
                    }
                }            
                start=Double.parseDouble(df.format(start));
            }while(start==1.0);
            
            long startSystemTimeNano = getSystemTime( );
            long startUserTimeNano   = getUserTime( ); 
            //=====================================================Task=================================================
            BufferedReader br=new BufferedReader(new FileReader(f));
            String read="";
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            while((read=br.readLine())!=null){
                System.out.println(read);
            }
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            //=====================================================Task=================================================
            Runtime rt=Runtime.getRuntime();
            expectedMem=rt.totalMemory()-rt.freeMemory();
            
            long taskUserTimeNano    = getUserTime( ) - startUserTimeNano;
            long taskSystemTimeNano  = getSystemTime( ) - startSystemTimeNano;
            System.out.println("CPU Time : "+(taskUserTimeNano + taskSystemTimeNano));
            System.out.println("Memory : "+expectedMem);
            
            do{
                OperatingSystemMXBean oss=ManagementFactory.getOperatingSystemMXBean();            
                for(Method mm:oss.getClass().getDeclaredMethods()){
                    mm.setAccessible(true);
                    a=mm.invoke(oss);
                    if(mm.getName().startsWith("getSystemCpuLoad")){ 
                        end=new Double(a.toString());
                        Random r=new Random();
                    int t=0;                    
                    if(end == -1.0 || end == 1.0){
                        do{
                            t=r.nextInt(100);
                        }while(t==0);
                        end=(double)t;
                    }
                    int t2=r.nextInt(2);
                    System.out.println("01 : "+t2);
                    if(t2==0)
                        end=end*0.001;
                    else
                        end=end*0.01;
                    }
                }
                end=Double.parseDouble(df.format(end));
            }while(start==end);
            cpuProcessLoad=start-end;
            System.out.println("s : "+start+" e : " +end+" load : "+(start-end));
            if(cpuProcessLoad<0){
                cpuProcessLoad=cpuProcessLoad * -1;
                System.out.println(cpuProcessLoad);
            }
            
            //======================Display========================
            expectedMem=((expectedMem/1024)/1024)/1024;
            cpuProcessLoad=cpuProcessLoad * 100;
            
            expectedMem=Double.parseDouble(df.format(expectedMem));
            cpuProcessLoad=Double.parseDouble(df.format(cpuProcessLoad));
            
            jTextArea3.append(expectedMem+"\n\n");
            jTextArea3.append(cpuProcessLoad+"\n\n");
            jTextArea3.append(expectedSwap+"");
            
            etij[0]=expectedMem;
            etij[1]=cpuProcessLoad;
            etij[2]=expectedSwap;
        }
        catch(Exception e)
        {
            System.out.println("Exception : "+e);
        }
    }//GEN-LAST:event_eActionPerformed

    private void wActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wActionPerformed
        // TODO add your handling code here:
        try
        {
            //======================Expected Resource / Task length============================
            DecimalFormat df=new DecimalFormat("#.####");
            double memW,cpuW,swapW;
            double taskLengthb=f.length();
            double taskLength=((taskLengthb/1024)/1024);
            taskLength=Double.parseDouble(df.format(taskLength));
            System.out.println(taskLengthb+"bytes -> task len in gb : "+taskLength);
            memW=expectedMem/taskLength;
            cpuW=cpuProcessLoad/taskLength;
            swapW=expectedSwap/taskLength;
                       
            memW=Double.parseDouble(df.format(memW));
            cpuW=Double.parseDouble(df.format(cpuW));
            swapW=Double.parseDouble(df.format(swapW));
            
            if(cpuW>100){
                do{
                    cpuW=cpuW/10;
                }while(cpuW>100);
            }
                
            
            cpuW=Double.parseDouble(df.format(cpuW));
            
            jTextArea4.append("Physical Memory\n\n");
            jTextArea4.append("CPU Usage\n\n");
            jTextArea4.append("Virtual Memory ");
            
            jTextArea5.append(memW+"\n\n");
            jTextArea5.append(cpuW+"\n\n");
            jTextArea5.append(swapW+"");
            
            wtij[0]=memW;
            wtij[1]=cpuW;
            wtij[2]=swapW;
        }
        catch(Exception e)
        {
            System.out.println("Exception : "+e);
        }
    }//GEN-LAST:event_wActionPerformed

    private void bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bActionPerformed
        // TODO add your handling code here:
        try
        {
            jTextArea6.append("Physical Memory\n\n");
            jTextArea6.append("CPU Usage\n\n");
            jTextArea6.append("Virtual Memory ");
            DecimalFormat df=new DecimalFormat("#.####");
            double eMemPrice,eCpuPrice,eVmPrice;
            
            //==============Physical memory price 30% of physicalmem value================
            String pa=String.valueOf(expectedMem);
            int pdi=pa.indexOf(".");
            String p1=pa.substring(0, pdi);
            String p2=pa.substring(pdi+1);
            String p3="";
            if(pa.length()==3){
                p3=p1+p2+"0";
            }
            else
                p3=p1+p2;
            double pmbV=Double.parseDouble(p3);
            eMemPrice=(pmbV*30)/100;
            
            //==============CPU memory price 15% of cpu value================
            String ca=String.valueOf(cpuProcessLoad);
            int cdi=ca.indexOf(".");
            String c1=ca.substring(0, cdi);
            String c2=ca.substring(cdi+1);
            String c3="";
            if(ca.length()==3){
                c3=c1+c2+"0";
            }
            else
                c3=c1+c2;
            double cmbV=Double.parseDouble(c3);
            eCpuPrice=(cmbV * 15.0)/100;
            
            
            eVmPrice=(expectedSwap * 15)/100;
            
            jTextArea7.append(eMemPrice+"\n\n");
            jTextArea7.append(eCpuPrice+"\n\n");
            jTextArea7.append(eVmPrice+"");
            
            budget=eMemPrice+eCpuPrice+eVmPrice;
            budget=Double.parseDouble(df.format(budget));
            jLabel3.setText("Budget : "+budget);
            
            Btij[0]=eMemPrice;
            Btij[1]=eCpuPrice;
            Btij[2]=eVmPrice;
        }
        catch(Exception e)
        {
            System.out.println("Exception : "+e);
        }
    }//GEN-LAST:event_bActionPerformed

    private void e1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e1ActionPerformed
        // TODO add your handling code here:
        C2TaskSubmission c=new C2TaskSubmission();
        c.setVisible(true);
    }//GEN-LAST:event_e1ActionPerformed

        /** Get CPU time in nanoseconds. */
    public long getCpuTime( ) {
        ThreadMXBean bean = ManagementFactory.getThreadMXBean( );
        return bean.isCurrentThreadCpuTimeSupported( ) ?
            bean.getCurrentThreadCpuTime( ) : 0L;
    }

    /** Get user time in nanoseconds. */
    public long getUserTime( ) {
        ThreadMXBean bean = ManagementFactory.getThreadMXBean( );
        return bean.isCurrentThreadCpuTimeSupported( ) ?
            bean.getCurrentThreadUserTime( ) : 0L;
    }

    /** Get system time in nanoseconds. */
    public long getSystemTime( ) {
        ThreadMXBean bean = ManagementFactory.getThreadMXBean( );
        return bean.isCurrentThreadCpuTimeSupported( ) ?
            (bean.getCurrentThreadCpuTime() - bean.getCurrentThreadUserTime( )) : 0L;
    }
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
            java.util.logging.Logger.getLogger(Consumer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consumer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consumer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consumer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Consumer().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b;
    private javax.swing.JButton browse;
    private javax.swing.JButton e;
    private javax.swing.JButton e1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextArea jTextArea6;
    private javax.swing.JTextArea jTextArea7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton w;
    // End of variables declaration//GEN-END:variables
}
