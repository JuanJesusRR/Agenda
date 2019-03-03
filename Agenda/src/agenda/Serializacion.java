
package agenda;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Serializacion {
    private ObjectInputStream lectorDeObjetos;
    private ObjectOutputStream escritorDeObjetos;
    
    public void escribirObjetos(Object Objecto) {
        try {
            escritorDeObjetos=new ObjectOutputStream(new FileOutputStream("MisContactos.data"));
             escritorDeObjetos.writeObject(Objecto);
           
            
        } catch (IOException ex) {
            Logger.getLogger(Serializacion.class.getName()).log(Level.SEVERE, null, ex);
        }
  
    
    }
        public Object leerObjetos(String nombreArchivo){
            Object retorno=null;
            
        try {
            lectorDeObjetos= new  ObjectInputStream(new FileInputStream(nombreArchivo) );
                try {
                    retorno=lectorDeObjetos.readObject();
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Serializacion.class.getName()).log(Level.SEVERE, null, ex);
                }
            
        } catch (IOException ex) {
            Logger.getLogger(Serializacion.class.getName()).log(Level.SEVERE, null, ex);
        }
   
        return retorno;
        
        
        }

    void leerObjetos(ArrayList<Persona> contacto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void leerObjetos(Persona a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
