/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package soc4;
import com.itextpdf.text.Document;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;

/**
 *
 * @author user
 */
public class TextToPDF {
    public static void main(String arg[]){
    try{
        File f=new File("./TaskReceived/"+arg[0]); //text file name
        BufferedReader br=new BufferedReader(new FileReader(f));
        Document document=new Document(PageSize.A4, 36, 72, 108, 80);        
        PdfWriter.getInstance(document,new FileOutputStream("./CompletedTask/"+arg[1]+".pdf"));// pdf file name
        document.open();
        document.setMargins(40.25f, 40.25f, 50.30f, 60.30f);
        System.out.println(document.addCreationDate());
        String read="";        
        while((read=br.readLine())!=null){             
            document.add(new Paragraph(read));            
            System.out.println("Text is inserted into pdf file");            
        }
        document.close();
        File ff=new File("CompletedTask/"+arg[1]+".pdf"); // pdf file name
        if (Desktop.isDesktopSupported()) {
            Desktop dtop = Desktop.getDesktop();
            if (dtop.isSupported(Desktop.Action.OPEN)) {
                String temp2 = ff.getPath();      
                dtop.open(new File(temp2));
            }
        }
    }catch(Exception e){
        System.out.println("conversion Exception : "+e);
    }
  }

}
