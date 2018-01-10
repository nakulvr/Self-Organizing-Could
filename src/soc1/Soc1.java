/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package soc1;

/**
 *
 * @author user
 */
public class Soc1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String fileName="filename.txt";
        String pdfFileName=fileName.substring(0,(fileName.indexOf(".")));
            System.out.println(pdfFileName);
    }
}
