/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package soc1;

import org.jfree.chart.plot.*;
import java.awt.*;
import java.sql.*;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author etpl22
 */
public class Graph{
    double[] ram=new double[6];
    double[] cpu=new double[6];
    public void getVal()throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/socDB","root","");
            Statement statement=con.createStatement();
            ResultSet rs=statement.executeQuery("select pm from can");
            int i=0;
            while(rs.next()){
                ram[i]=rs.getDouble(1);
                i++;
            }
            rs=statement.executeQuery("select cpu from can");
            i=0;
            while(rs.next()){
                cpu[i]=rs.getDouble(1);
                i++;
            }
    }
    
    public void showRam()
    {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for(int i=0;i<ram.length;i++){
            dataset.setValue(ram[i], "RAM space", "Node "+(i+1));
        }

          JFreeChart chart = ChartFactory.createBarChart
          ("RAM Efficiency in CAN","Virtual Machines", "RAM Usage in Percentage", dataset,
           PlotOrientation.VERTICAL, false,true, false);
          chart.setBackgroundPaint(Color.orange);
          chart.getTitle().setPaint(Color.blue);
          CategoryPlot p = chart.getCategoryPlot();
          p.setRangeGridlinePaint(Color.red);
          p.setBackgroundPaint(Color.LIGHT_GRAY);
          ChartFrame frame1=new ChartFrame("Performance Evaluation",chart);
          frame1.setVisible(true);
          frame1.setSize(600,600);
    }
    
    public void showCpu()
    {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for(int i=0;i<ram.length;i++){
            dataset.setValue(cpu[i], "CPU space", "Node "+(i+1));
        }

          JFreeChart chart = ChartFactory.createBarChart
          ("CPU Efficiency in CAN","Virtual Machines", "CPU Usage in Percentage", dataset,
           PlotOrientation.VERTICAL, false,true, false);
          chart.setBackgroundPaint(Color.orange);
          chart.getTitle().setPaint(Color.blue);
          CategoryPlot p = chart.getCategoryPlot();
          p.setRangeGridlinePaint(Color.red);
          p.setBackgroundPaint(Color.LIGHT_GRAY);
          ChartFrame frame1=new ChartFrame("Performance Evaluation",chart);
          frame1.setVisible(true);
          frame1.setSize(600,600);
    }


    
}
