package agenda;

import java.io.*;
import javax.swing.JOptionPane;

public class Archivotxt {
    FileWriter writer=null;
    
    public void escribir(Object Objeto){
        try{
            writer=new FileWriter("Contactos.txt");
            writer.write(Objeto.toString());
            writer.close();
            
        }catch(IOException e){
            JOptionPane.showMessageDialog(null,"Ha sucedido un error"+e);
        }
    }
    
    
    
    
    
}
