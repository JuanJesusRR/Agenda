package agenda;

import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Archivotxt {
    File archivo=new File("Contactos.txt");
    FileOutputStream salida=null;
    FileInputStream entrada=null;
    ObjectOutputStream writer=null;
    ObjectInputStream reader=null;
    Persona personaTemp=null;
    ArrayList<Persona> personas=new ArrayList<>();
 
    public void escribir(Object Objeto){
        try{
            salida=new FileOutputStream(archivo);
            writer=new ObjectOutputStream(salida);
            writer.writeObject(Objeto);
            
        }catch(IOException e){
            JOptionPane.showMessageDialog(null,"Ha sucedido un error:"+e);
        }
        finally{
            if(salida!=null){
                try {
                    salida.close();
                    if(writer!=null){
                        writer.close();
                    }
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null,"Ha sucedido un error:"+ex);
                }
            }
        }
    }
    
public ArrayList<Persona> leer(String nombreArchivo){
            
           
        try {
            entrada=new FileInputStream(archivo);
            reader=new ObjectInputStream(entrada);
            personas=(ArrayList<Persona>) reader.readObject();
            
        } catch (IOException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Ha sucedido un error:"+ex);
        
        }
        finally{
            if(entrada!=null){
                try {
                    entrada.close();
                    if(reader!=null){
                        reader.close();
                    }
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Ha sucedido un error:"+ex);
                }
                
            }
        }
   
        return personas;
        
        
        }

}