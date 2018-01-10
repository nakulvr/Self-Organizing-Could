/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package soc1;

import java.awt.Color;
import java.sql.*;
import java.util.ArrayList;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;
/**
 *
 * @author user
 */
public class CAN extends ApplicationFrame{
    /**
     * Creates a new CAN network.
     *
     * @param title  the frame title.
     */
    Connection con;
    Statement st;
    ResultSet rs;
    int count=0;
    ArrayList<Integer> nodeId=new ArrayList<Integer>();
    ArrayList<Double> mem=new ArrayList<Double>();
    ArrayList<Double> cpu=new ArrayList<Double>();
    
    public CAN(final String title) {

        super(title);

        final XYDataset dataset = createDataset();
        final JFreeChart chart = createChart(dataset);
        final ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(500, 300));
        setContentPane(chartPanel);

    }
    
    /**
     * Creates a sample dataset.
     * 
     * @return a sample dataset.
     */
    private XYDataset createDataset() {
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/socDB","root","");
            st=con.createStatement();
            
            rs=st.executeQuery("select * from can");
            while(rs.next()){
                count++;
                nodeId.add(rs.getInt(1));
                mem.add(rs.getDouble(2));
                cpu.add(rs.getDouble(3));
            }
        }
        catch(Exception e){
            System.out.println("Exception : "+e);
        }
        
        String node;
        XYSeries[] series=new XYSeries[count];
        final XYSeriesCollection dataset = new XYSeriesCollection();
        
        for(int i=0;i<count;i++){
            node="Node"+(nodeId.get(i));
            series[i]=new XYSeries(node);
            series[i].add(mem.get(i),cpu.get(i));
            dataset.addSeries(series[i]);
        }     
        return dataset;
    }
    
    /**
     * Creates a chart.
     * 
     * @param dataset  the data for the chart.
     * 
     * @return a chart.
     */
    private JFreeChart createChart(final XYDataset dataset) {
        
        // create the chart...
        final JFreeChart chart = ChartFactory.createXYLineChart(
            "Content Addressable Network",      // chart title
            "CPU (%)",                      // x axis label
            "Physical Memory (GB)",                      // y axis label
            dataset,                  // data
            PlotOrientation.VERTICAL,
            true,                     // include legend
            true,                     // tooltips
            false                     // urls
        );

        
        chart.setBackgroundPaint(Color.white);
        final XYPlot plot = chart.getXYPlot();
        plot.setBackgroundPaint(Color.lightGray);    
        plot.setDomainGridlinePaint(Color.white);
        plot.setRangeGridlinePaint(Color.white);
        
        final XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        renderer.setSeriesLinesVisible(0, false);
        renderer.setSeriesShapesVisible(1, true);
        renderer.setSeriesLinesVisible(1, false);
        renderer.setSeriesLinesVisible(2, false);
        plot.setRenderer(renderer);

        // change the auto tick unit selection to integer units only...
        final NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
        rangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());
        // OPTIONAL CUSTOMISATION COMPLETED.
                
        return chart;
        
    }
//    public static void main(final String[] args) {
//
//        final CAN network = new CAN("Content Addressable Network");
//        network.pack();
//        RefineryUtilities.centerFrameOnScreen(network);
//        network.setVisible(true);
//
//    }
}
