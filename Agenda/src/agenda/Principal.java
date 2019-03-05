package agenda;



import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan-Jesus
 */
public class Principal extends javax.swing.JFrame  {
    boolean nombre1=true;

 private ArrayList<Persona> contacto;
 
    public Principal() {
     
        initComponents();
        this.setTitle("AGENDA 1.0");
        this.setLocationRelativeTo(null);
         buttonGroup3.add(this.CargarSerializacion);
       buttonGroup3.add(this.CargarTxt);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel7 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        txt_telefono = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Actualizar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        Buscar = new javax.swing.JButton();
        txt_bnombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        CargarSerializacion = new javax.swing.JRadioButton();
        CargarTxt = new javax.swing.JRadioButton();
        Salir = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        Elimininar = new javax.swing.JButton();
        CambiarNombre = new javax.swing.JButton();
        Agregar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        GuardarSerializacion = new javax.swing.JButton();
        GuardarTxt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del contacto"));

        jLabel2.setText("Telefono:");

        jLabel3.setText("Nombre:");

        Actualizar.setText("Actualizar");
        Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(Actualizar)
                .addGap(0, 51, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addComponent(Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        Buscar.setText("Buscar");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });

        jLabel4.setText("Introduzca el nombre de contacto:");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cargar Datos"));

        CargarSerializacion.setText("Serializacion");
        CargarSerializacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargarSerializacionActionPerformed(evt);
            }
        });

        CargarTxt.setText("Archivo Txt");
        CargarTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargarTxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CargarSerializacion)
                    .addComponent(CargarTxt))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CargarSerializacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CargarTxt)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_bnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_bnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        Elimininar.setText("Eliminar contacto");
        Elimininar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ElimininarActionPerformed(evt);
            }
        });

        CambiarNombre.setText("Cambiar nombre");
        CambiarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CambiarNombreActionPerformed(evt);
            }
        });

        Agregar.setText("Agregar  contacto");
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Guardar datos"));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 59, Short.MAX_VALUE)
        );

        GuardarSerializacion.setText("Serializacion");
        GuardarSerializacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarSerializacionActionPerformed(evt);
            }
        });

        GuardarTxt.setText("Archivo Txt");
        GuardarTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarTxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(GuardarSerializacion)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(GuardarTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(GuardarSerializacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(GuardarTxt)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Elimininar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Agregar, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(CambiarNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(Agregar)
                        .addGap(8, 8, 8)
                        .addComponent(CambiarNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Elimininar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Salir))
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93)
                        .addComponent(Salir)
                        .addContainerGap())
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
        String nombre=txt_nombre.getText();
        String telefono=txt_telefono.getText();
        boolean repetido =false;
        if(CargarSerializacion.isSelected()==true){
        if(isNumeric(telefono)==true){
        if(nombre.length()==0){
            JOptionPane.showMessageDialog(null, "Debe introducir un nombre");
        }else{
        for(Persona p:contacto){
       if( p.getNombre().equals(nombre)){
       repetido=true;}
        } 
       if(repetido){
           JOptionPane.showMessageDialog(this, "Ya existe un contacto con ese nombre","Error", JOptionPane.ERROR_MESSAGE);
       }else if(Metodos.validarTelefono(telefono)){
           Persona n=new Persona(nombre,telefono);
          contacto.add(n);
          JOptionPane.showMessageDialog(this, "Se ha añadido el contacto","PROCESO COMPLETADO", JOptionPane.INFORMATION_MESSAGE); 
          }else{
           JOptionPane.showMessageDialog(this, "Numero Invalido","ERROR", JOptionPane.ERROR_MESSAGE);
          }         
        }}else{
           JOptionPane.showMessageDialog(null, "Debe introducir solamente números");
          } 
        }else{
           JOptionPane.showMessageDialog(null, "No ha cargado ningún dato"); 
        }
    }//GEN-LAST:event_AgregarActionPerformed

    private void CambiarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CambiarNombreActionPerformed
    
        String telefono=txt_telefono.getText();
        String cambio=txt_nombre.getText();
        
        if(CargarSerializacion.isSelected()==true){
        if(cambio.length()==0){     
        JOptionPane.showMessageDialog(this, "No introdujo ningun nombre","Error", JOptionPane.INFORMATION_MESSAGE);
        }else{
            for(Persona p: contacto){
       if( p.getTelefono().equals(telefono)){
         p.setNombre(cambio);
      }}
          JOptionPane.showMessageDialog(this, "El nombre ha sido cambiado con exito","Exito", JOptionPane.INFORMATION_MESSAGE); 
        }
        }else{
           JOptionPane.showMessageDialog(null, "No ha cargado ningún dato"); 
           
        }
    }//GEN-LAST:event_CambiarNombreActionPerformed

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
      if(CargarSerializacion.isSelected()==true)
      {
       String name=this.txt_bnombre.getText(); 
       this.txt_nombre.setText("");
       this.txt_telefono.setText("");
       boolean repetido =false;
       Persona buscado=null;
        for(Persona p: contacto){
       if( p.getNombre().equals(name)){
       repetido=true;  
       buscado=p;
      }
        } 
       if(repetido){
          JOptionPane.showMessageDialog(this, "Contacto encontrado","", JOptionPane.INFORMATION_MESSAGE);
         this.txt_nombre.setText(buscado.getNombre());
         this.txt_telefono.setText(buscado.getTelefono());     
    }else{
       JOptionPane.showMessageDialog(this, "Contacto no encontrado","", JOptionPane.INFORMATION_MESSAGE);
       }   
      }else{JOptionPane.showMessageDialog(this, "No ha cargado ningún dato","", JOptionPane.ERROR_MESSAGE);}
    }//GEN-LAST:event_BuscarActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
     
        System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

    private void ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarActionPerformed
        this.txt_nombre.setText("");
        this.txt_bnombre.setText("");
        this.txt_telefono.setText("");
    }//GEN-LAST:event_ActualizarActionPerformed

    private void ElimininarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ElimininarActionPerformed
         String name=this.txt_nombre.getText();
         if(CargarSerializacion.isSelected()==true){
         this.txt_nombre.setText("");
        this.txt_telefono.setText("");
         for(Persona p: contacto){
       if( p.getNombre().equals(name)){
        contacto.remove(p);
       
       JOptionPane.showMessageDialog(this, "El proceso se completo con exito","Contacto Eliminado", JOptionPane.INFORMATION_MESSAGE);
      }else{JOptionPane.showMessageDialog(this, "El proceso no se completo con exito","Contacto No Eliminado", JOptionPane.ERROR_MESSAGE);}
     }
         }else{
           JOptionPane.showMessageDialog(null, "No ha cargado ningún dato");  
         }
    }//GEN-LAST:event_ElimininarActionPerformed

    private void GuardarSerializacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarSerializacionActionPerformed
        if(CargarSerializacion.isSelected()==true){
        Serializacion serializadora= new  Serializacion();
        serializadora.escribirObjetos(contacto);
  JOptionPane.showMessageDialog(this, "Su modificacion ha sido guardad en el disco duro","Exito", JOptionPane.INFORMATION_MESSAGE);
        }else{
           JOptionPane.showMessageDialog(null, "No ha cargado ningún dato");  
         }
    
    }//GEN-LAST:event_GuardarSerializacionActionPerformed

    private void CargarSerializacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargarSerializacionActionPerformed
        contacto=new ArrayList<>();
        Serializacion deserializadora= new  Serializacion();
        contacto=(ArrayList<Persona>) deserializadora.leerObjetos("MisContactos.data"); 
        JOptionPane.showMessageDialog(this, "Ha cargado sus datos por serializacion","Carga", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_CargarSerializacionActionPerformed

    private void CargarTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargarTxtActionPerformed
        contacto=new ArrayList<>();
        Archivotxt archivo1=new Archivotxt();
        contacto=(ArrayList<Persona>) archivo1.leer("Contactos.txt");
        JOptionPane.showMessageDialog(null, "Sus contactos se han cargado de un archivo de texto");
    }//GEN-LAST:event_CargarTxtActionPerformed

    private void GuardarTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarTxtActionPerformed
        if(CargarSerializacion.isSelected()==true){
        Archivotxt archivo=new Archivotxt();
        archivo.escribir(contacto);
        JOptionPane.showMessageDialog(null, "Sus contactos se han guardado en un archivo de texto");
        }else{
           JOptionPane.showMessageDialog(null, "No ha cargado ningún dato");  
         }
    }//GEN-LAST:event_GuardarTxtActionPerformed

    public static void main(String args[]){
  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Actualizar;
    private javax.swing.JButton Agregar;
    private javax.swing.JButton Buscar;
    private javax.swing.JButton CambiarNombre;
    private javax.swing.JRadioButton CargarSerializacion;
    private javax.swing.JRadioButton CargarTxt;
    private javax.swing.JButton Elimininar;
    private javax.swing.JButton GuardarSerializacion;
    private javax.swing.JButton GuardarTxt;
    private javax.swing.JButton Salir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField txt_bnombre;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
    public static boolean isNumeric(String cadena) {

        boolean resultado;

        try {
            Integer.parseInt(cadena);
            resultado = true;
        } catch (NumberFormatException excepcion) {
            resultado = false;
        }

        return resultado;
    }
}
