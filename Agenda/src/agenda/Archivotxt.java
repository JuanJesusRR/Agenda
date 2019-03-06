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
            JOptionPane.showMessageDialog(null,"Ha sucedido un error:"+e);
        }
    }
    
public Object leer(String nombreArchivo){
            Object retorno=null;
           
        try {
            File myFile=new File(nombreArchivo);
            FileReader fileReader=new FileReader(myFile);
            BufferedReader reader=new BufferedReader(fileReader);
            String line;
                try {
                    retorno=line=reader.readLine();
                    reader.close();
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Ha sucedido un error:"+ex);
                }
            
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Ha sucedido un error:"+ex);
        }
   
        return retorno;
        
        
        }

/*package agenda;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Archivotxt {
    FileWriter writer=null;

    
    public void escribir(Object Objeto){
        try{
            writer=new FileWriter("Contactos.txt");
            writer.write(Objeto.toString());
            writer.close();
            
        }catch(IOException e){
            JOptionPane.showMessageDialog(null,"Ha sucedido un error:"+e);
        }
    }
    
public ArrayList<Persona> leer(String nombreArchivo){
            String retorno=null;
            Persona persona=new Persona();
            ArrayList<Persona> fragmento=new ArrayList();
            ArrayList<String> prueba=new ArrayList();
            
            for (int i = 0; i <prueba.size(); i=i+2) {
         persona.setNombre(prueba.get(i));
         persona.setTelefono(prueba.get(i+1));    
         fragmento.add(persona);
    }
            
            
        try {
            File myFile=new File(nombreArchivo);
            FileReader fileReader=new FileReader(myFile);
            BufferedReader reader=new BufferedReader(fileReader);
           
                try {
                    
                    while((retorno = reader.readLine())!=null) {
                        //prueba = retorno.split(",");
                   
                    
                    
                    }
                   
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Ha sucedido un error:"+ex);
                }
            
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Ha sucedido un error:"+ex);
        }
   
        return fragmento;
        
        
        }
    
    
    
}

  */  
    
    
}
