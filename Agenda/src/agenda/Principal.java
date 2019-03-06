package agenda;



import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan-Jesus
 */
public class Principal extends javax.swing.JFrame  {

 private ArrayList<Persona> contacto;
 
    public Principal() {
         initComponents();
        contacto=new ArrayList<>();
        Serializacion deserializadora= new  Serializacion();
        contacto=(ArrayList<Persona>) deserializadora.leerObjetos("MisContactos.data");
       buttonGroup1.add(this.CargarSerializacion);
        buttonGroup1.add(this.CargarArchivoTxt);
        buttonGroup2.add(this.GuardarSerializacion);
        buttonGroup2.add(this.GuardarArchivoTxt);
        this.setTitle("AGENDA 1.0");
        this.setLocationRelativeTo(null);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel7 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        CargarSerializacion = new javax.swing.JRadioButton();
        CargarArchivoTxt = new javax.swing.JRadioButton();
        Salir = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        Buscar = new javax.swing.JButton();
        txt_bnombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        txt_telefono = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Actualizar = new javax.swing.JButton();
        Agregar = new javax.swing.JButton();
        CambiarNombre = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        GuardarSerializacion = new javax.swing.JRadioButton();
        GuardarArchivoTxt = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        Cerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Cargar Datos"));

        CargarSerializacion.setText("Serializacion");
        CargarSerializacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargarSerializacionActionPerformed(evt);
            }
        });

        CargarArchivoTxt.setText("ArchivoTxt");
        CargarArchivoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargarArchivoTxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CargarArchivoTxt)
                    .addComponent(CargarSerializacion))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CargarSerializacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CargarArchivoTxt)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 403, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        Buscar.setText("Buscar");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });

        jLabel4.setText("Introduzca el nombre de contacto:");

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del contacto"));

        txt_telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_telefonoKeyTyped(evt);
            }
        });

        jLabel2.setText("Telefono:");

        txt_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nombreKeyTyped(evt);
            }
        });

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

        Agregar.setText("Agregar  contacto");
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });

        CambiarNombre.setText("Cambiar nombre");
        CambiarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CambiarNombreActionPerformed(evt);
            }
        });

        Eliminar.setText("Eliminar contacto");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Guardar cambios"));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 88, Short.MAX_VALUE)
        );

        GuardarSerializacion.setText("Serializacion");
        GuardarSerializacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarSerializacionActionPerformed(evt);
            }
        });

        GuardarArchivoTxt.setText("ArchivoTxt");
        GuardarArchivoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarArchivoTxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(GuardarArchivoTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(95, 95, 95))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(GuardarSerializacion)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(GuardarSerializacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GuardarArchivoTxt)))
        );

        jLabel1.setText("Recuerde guardar ");

        Cerrar.setText("Salir");
        Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_bnombre)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(CambiarNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Agregar, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Cerrar)))
                        .addGap(340, 340, 340)
                        .addComponent(Salir)))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_bnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(Agregar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CambiarNombre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Eliminar))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
        if(CargarSerializacion.isSelected()||CargarArchivoTxt.isSelected()){
        String nombre=txt_nombre.getText();
        String telefono=txt_telefono.getText();
        boolean repetido =false;
        for(Persona p:contacto){
       if( p.getNombre().equals(nombre)){
       repetido=true;}
        } 
       if(repetido){
           JOptionPane.showMessageDialog(this, "Ya existe un profesor con dni","Error", JOptionPane.ERROR_MESSAGE);
       }else if(Metodos.validarTelefono(telefono)){
           Persona n=new Persona(nombre,telefono);
          contacto.add(n);
          JOptionPane.showMessageDialog(this, "Se ha añadido el contacto","PROCESO COMPLETADO", JOptionPane.INFORMATION_MESSAGE); 
          }else{
           JOptionPane.showMessageDialog(this, "Numero Invalido","ERROR", JOptionPane.ERROR_MESSAGE);
          } 
      }else{ JOptionPane.showMessageDialog(null, "No ha cargado ningún dato","ERROR", JOptionPane.ERROR_MESSAGE);}
    }//GEN-LAST:event_AgregarActionPerformed

    private void CambiarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CambiarNombreActionPerformed
    if(CargarSerializacion.isSelected()||CargarArchivoTxt.isSelected()){
        String telefono=txt_telefono.getText();
        String cambio=txt_nombre.getText();
        
        
        if(cambio.length()==0){     
        JOptionPane.showMessageDialog(this, "No introdujo ningun nombre","Error", JOptionPane.ERROR_MESSAGE);
        }else{
            for(Persona p: contacto){
       if( p.getTelefono().equals(telefono)){
         p.setNombre(cambio);
      }}
          JOptionPane.showMessageDialog(this, "El nombre ha sido cambiado con exito","Exito", JOptionPane.INFORMATION_MESSAGE); 
        }
         }else{ JOptionPane.showMessageDialog(null, "No ha cargado ningún dato","ERROR", JOptionPane.ERROR_MESSAGE);}
    }//GEN-LAST:event_CambiarNombreActionPerformed

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
       if(CargarSerializacion.isSelected()||CargarArchivoTxt.isSelected()){
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
       JOptionPane.showMessageDialog(this, "Contacto no encontrado","", JOptionPane.ERROR_MESSAGE);
       }  
        }else{ JOptionPane.showMessageDialog(null, "No ha cargado ningún dato","ERROR", JOptionPane.ERROR_MESSAGE);}
    }//GEN-LAST:event_BuscarActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed

       
      
    }//GEN-LAST:event_SalirActionPerformed

    private void ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarActionPerformed
        this.txt_nombre.setText("");
        this.txt_bnombre.setText("");
        this.txt_telefono.setText("");
    }//GEN-LAST:event_ActualizarActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
     if(CargarSerializacion.isSelected()||CargarArchivoTxt.isSelected()){    
        String name=this.txt_nombre.getText();
         this.txt_nombre.setText("");
        this.txt_telefono.setText("");
         for(Persona p: contacto){
       if( p.getNombre().equals(name)){   
       p.setNombre("Unknow");
       p.setTelefono("0000000000");
       }
      } 
      JOptionPane.showMessageDialog(this, "El proceso se completo con exito","Contacto Eliminado", JOptionPane.INFORMATION_MESSAGE);
       }else{ JOptionPane.showMessageDialog(null, "No ha cargado ningún dato","ERROR", JOptionPane.ERROR_MESSAGE);}
     
    }//GEN-LAST:event_EliminarActionPerformed

    private void txt_nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreKeyTyped
       char validar=evt.getKeyChar();
      if(Character.isDigit(validar)){
      getToolkit().beep();
      evt.consume();
      JOptionPane.showMessageDialog(this, "Debe ingresar solo letras","ERROR", JOptionPane.ERROR_MESSAGE);
      }
    }//GEN-LAST:event_txt_nombreKeyTyped

    private void txt_telefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_telefonoKeyTyped
         char validar=evt.getKeyChar();
      if(Character.isLetter(validar)){
      getToolkit().beep();
      evt.consume();
      JOptionPane.showMessageDialog(this, "Debe ingresar solo letras","ERROR", JOptionPane.ERROR_MESSAGE);
      }
    }//GEN-LAST:event_txt_telefonoKeyTyped

    private void CargarSerializacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargarSerializacionActionPerformed
       contacto=new ArrayList<>();
        Serializacion deserializadora= new  Serializacion();
        contacto=(ArrayList<Persona>) deserializadora.leerObjetos("MisContactos.data");
    }//GEN-LAST:event_CargarSerializacionActionPerformed

    private void CargarArchivoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargarArchivoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CargarArchivoTxtActionPerformed

    private void GuardarSerializacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarSerializacionActionPerformed
    Serializacion serializadora= new  Serializacion();
   serializadora.escribirObjetos(contacto);
  JOptionPane.showMessageDialog(this, "Su modificacion ha sido guardad en el disco duro","Exito", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_GuardarSerializacionActionPerformed

    private void CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarActionPerformed
         System.exit(0);
    }//GEN-LAST:event_CerrarActionPerformed

    private void GuardarArchivoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarArchivoTxtActionPerformed
        if(CargarSerializacion.isSelected()==true){
        Archivotxt archivo=new Archivotxt();
        archivo.escribir(contacto);
        JOptionPane.showMessageDialog(null, "Sus contactos se han guardado en un archivo de texto");
        }
        else{JOptionPane.showMessageDialog(null, "No ha cargado ningún dato");}
    }//GEN-LAST:event_GuardarArchivoTxtActionPerformed

    /**
     * @param args the command line arguments
     */
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
    private javax.swing.JRadioButton CargarArchivoTxt;
    private javax.swing.JRadioButton CargarSerializacion;
    private javax.swing.JButton Cerrar;
    private javax.swing.JButton Eliminar;
    private javax.swing.JRadioButton GuardarArchivoTxt;
    private javax.swing.JRadioButton GuardarSerializacion;
    private javax.swing.JButton Salir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
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

    private void GuardarSerializacion(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
