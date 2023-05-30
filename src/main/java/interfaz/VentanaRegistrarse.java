/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaz;

import com.mycompany.bitedelivery.*;

import javax.swing.*;
import java.io.Serializable;
import java.util.Date;

import static com.mycompany.bitedelivery.GuardoDatos.*;

/**
 *
 * @author isaac
 */
public class VentanaRegistrarse extends javax.swing.JFrame  implements Serializable{
    private String modelo;
    /**
     * Creates new form VentanaRegistrarse
     */
    public VentanaRegistrarse() {
        initComponents();
        hideEmpresa();
    }
private void hideEmpresa(){
     modelo = (String) eleccionCombo.getSelectedItem();
        if (modelo.equals("Empresa")) {
            textoCIF.setVisible(true);
            jLabel6.setVisible(true);
            textoDNI.setVisible(false);
            jLabel5.setVisible(false);
            textoWeb.setVisible(true);
            jLabel12.setVisible(true);
        } else {
            textoCIF.setVisible(false);
            jLabel6.setVisible(false);
            textoDNI.setVisible(true);
            jLabel5.setVisible(true);
            textoWeb.setVisible(false);
            jLabel12.setVisible(false);
        }
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        textoNombre = new javax.swing.JTextField();
        textoCorreo = new javax.swing.JTextField();
        Registrarse = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        textoContraseña = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        textoDNI = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        textoCIF = new javax.swing.JTextField();
        eleccionCombo = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        textoCalle = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        textoNumero = new javax.swing.JFormattedTextField();
        textoZip = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        textoTelefono = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        textoWeb = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        textoTitularTarjeta = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel14 = new javax.swing.JLabel();
        textoNumeroTarjeta = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(new ImageIcon(getClass().getResource("/images/logos/bite logo-32x32.png")).getImage());

        textoCorreo.setToolTipText("");

        Registrarse.setText("Registrarse");
        Registrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarseActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre");

        jLabel3.setText("Correo");

        jLabel4.setText("Contraseña");

        textoContraseña.setText("jPasswordField1");
        textoContraseña.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textoContraseñaFocusGained(evt);
            }
        });

        jLabel5.setText("DNI");

        textoDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoDNIActionPerformed(evt);
            }
        });
        textoDNI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textoDNIKeyTyped(evt);
            }
        });

        jLabel6.setText("CIF");

        eleccionCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Particular", "Empresa" }));
        eleccionCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eleccionComboActionPerformed(evt);
            }
        });

        jLabel7.setText("Calle");

        jLabel8.setText("Numero");

        jLabel9.setText("Codigo Postal");

        textoNumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textoNumeroKeyTyped(evt);
            }
        });

        textoZip.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textoZipKeyTyped(evt);
            }
        });

        jLabel10.setText("Numero Tarjetas");

        jLabel11.setText("Telefono");

        textoTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoTelefonoActionPerformed(evt);
            }
        });
        textoTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textoTelefonoKeyTyped(evt);
            }
        });

        jLabel12.setText("WEBPAGE");

        textoWeb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoWebActionPerformed(evt);
            }
        });

        jLabel13.setText("TItular Tarjeta");

        jLabel14.setText("Fecha caducidad");

        textoNumeroTarjeta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textoNumeroTarjetaKeyTyped(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/VentanaRegistrarse/logotipoletras.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bite logo-100x100.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel15))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textoDNI))
                    .addComponent(eleccionCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textoContraseña, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                            .addComponent(textoTelefono)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(60, 60, 60)
                        .addComponent(textoCIF)))
                .addGap(95, 95, 95)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addGap(82, 82, 82))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addGap(64, 64, 64)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel10)
                            .addComponent(jLabel14))
                        .addGap(19, 19, 19)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Registrarse)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(textoZip, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                        .addComponent(textoNumero)
                        .addComponent(textoCalle)
                        .addComponent(textoWeb)
                        .addComponent(textoTitularTarjeta)
                        .addComponent(textoNumeroTarjeta)))
                .addGap(0, 49, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eleccionCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoCalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(textoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(textoZip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(textoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(textoWeb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(textoTitularTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(textoCIF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(textoNumeroTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(Registrarse)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public Direccion crearDireccion( ) {
        Direccion direccion = null;
        //if calle is empty numero emty zip empty parseInt
       if (!textoCalle.getText().isEmpty() && !textoNumero.getText().isEmpty() && !textoZip.getText().isEmpty()) {
    String calle = textoCalle.getText();
    int numero = Integer.parseInt(textoNumero.getText());
    String zipText = textoZip.getText();
    if (zipText.length() != 5) {
        JOptionPane.showMessageDialog(null, "El codigo postal debe tener 5 digitos", "Error", JOptionPane.ERROR_MESSAGE);
        return null;
    }
    int zip = Integer.parseInt(zipText);
    direccion = new Direccion(calle, numero, zip);
} else {
    JOptionPane.showMessageDialog(null, "Rellene todos los campos de la direccion", "Error", JOptionPane.ERROR_MESSAGE);
}
        return direccion;
        
    }

    public TarjetaCredito crearTarjeta() {
        //if numeroTarjeta is empty parseInt and textoTitularTarjeta and jDateChooser1 is not empty
        TarjetaCredito tarjeta = null;
        Date fechaActual = new Date();
        Date fechaCaducidad = jDateChooser1.getDate();
        
        
        if (!textoNumeroTarjeta.getText().isEmpty() && !textoTitularTarjeta.getText().isEmpty() && fechaCaducidad.after(fechaActual)&& fechaCaducidad != null ) {



            long numeroTarjeta = Long.parseLong(textoNumeroTarjeta.getText());
            String titularTarjeta = textoTitularTarjeta.getText();
            System.out.println("fecha actual");
            System.out.println(new Date());

            tarjeta = new TarjetaCredito(titularTarjeta,numeroTarjeta, fechaCaducidad);
        } else {
            JOptionPane.showMessageDialog(null, "Rellene todos los campos de la tarjeta y asegurese de que la fecha de caducidad no es anterior a la actual");
        }



        return tarjeta;
    }
    private void textoDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoDNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoDNIActionPerformed

    private void RegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarseActionPerformed

        // TODO add your handling code here:
        String nombre = textoNombre.getText();
        String correo = textoCorreo.getText();
        String contraseña = textoContraseña.getText();
        String dni = textoDNI.getText();
        String cif = textoCIF.getText();
        
        jDateChooser1.setDateFormatString("dd/MM/yyyy");
        


        TarjetaCredito tarjeta = crearTarjeta();
        Direccion direccion = crearDireccion();
        String modelo = (String) eleccionCombo.getSelectedItem();
        int telefono =Integer.parseInt(textoTelefono.getText());
        String web = textoWeb.getText();
        //print(nombre, apellido, correo, contraseña, dni);
        if (modelo.equals("Empresa")) {
            if (nombre.equals("") || correo.equals("") || contraseña.equals("") || cif.equals("") || tarjeta.equals("") || telefono==0 || web.equals("") || direccion.equals("") || tarjeta.equals("") || jDateChooser1.getDate()== null    ) {
                JOptionPane.showMessageDialog(null, "Rellene todos los campos");
            } else {

                //String email, String password, String nombre, Direccion direccion, TarjetaCredito tarjetaCredito, int telefono, String CIF, String web
                UsuarioEmpresa empresa;
                empresa = new UsuarioEmpresa(correo, contraseña, nombre, direccion, tarjeta, telefono, cif, web);
                    //imprimir(empresa);
                //imprimir empresa
                

                
                System.out.println(empresa.toString());
                loadDataEmpresas();
                registerEmpresa(empresa);

                saveDataEmpresas();
                for (int i = 0; i < empresas.size(); i++) {
                    System.out.println("leyendo de la lista de empresas " + i);
                   System.out.println(empresa.toString());

                    
                    System.out.println("saliendo de la lista de empresas " + i);



                }

                JOptionPane.showMessageDialog(null, "Registrado correctamente");
                //set invisible
                //open MenuIniciarSesion
                MenuIniciarSesionN menu = new MenuIniciarSesionN();
                menu.setVisible(true);
                dispose();
               

            }
        } else {
            if (nombre.equals("") || correo.equals("") || contraseña.equals("") || dni.equals("") || tarjeta.equals("") || telefono==0 || direccion.equals("")  || tarjeta.equals("") || jDateChooser1.getDate()== null   )  {
                JOptionPane.showMessageDialog(null, "Rellene todos los campos");
            } else {
                UsuarioParticular particular;
                particular = new UsuarioParticular(correo, contraseña, nombre, direccion, tarjeta,telefono, dni);
                //imprimir(particular);
                //imprimir particular
               
                System.out.println(particular.toString());
                loadDataParticulares();
                registerParticular(particular);
                saveDataParticulares();
                JOptionPane.showMessageDialog(null, "Registrado correctamente");
                MenuIniciarSesionN menu = new MenuIniciarSesionN();
                menu.setVisible(true);
                dispose();
                


            }
            //set invisible
           
        }

    }//GEN-LAST:event_RegistrarseActionPerformed

    private void textoContraseñaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textoContraseñaFocusGained
        // TODO add your handling code here:
        textoContraseña.setText("");

    }//GEN-LAST:event_textoContraseñaFocusGained

    private void eleccionComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eleccionComboActionPerformed
        // TODO add your handling code here:
        hideEmpresa();
    }//GEN-LAST:event_eleccionComboActionPerformed

    private void textoTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoTelefonoActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_textoTelefonoActionPerformed

    private void textoNumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoNumeroKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo numeros");
        }
        if (textoNumero.getText().length() == 5) {
            evt.consume();
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "Maximo 5 digitos");
        }

    }//GEN-LAST:event_textoNumeroKeyTyped

    private void textoWebActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoWebActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoWebActionPerformed

    private void textoNumeroTarjetaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoNumeroTarjetaKeyTyped
        // TODO add your handling code here:
        //maximo 16 digitos
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo numeros");
        }
        if (textoNumeroTarjeta.getText().length() == 16) {
            evt.consume();
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "Maximo 16 digitos");
        }
        
    }//GEN-LAST:event_textoNumeroTarjetaKeyTyped

    private void textoTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoTelefonoKeyTyped
        // TODO add your handling code here:
        //maximo 9 digitos
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo numeros");
        }
        if (textoTelefono.getText().length() == 9) {
            evt.consume();
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "Maximo 9 digitos");
        }
        
    }//GEN-LAST:event_textoTelefonoKeyTyped

    private void textoZipKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoZipKeyTyped
        // TODO add your handling code here:
        //maximo 5 digitos
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo numeros");
        }
        if (textoZip.getText().length() == 5) {
            evt.consume();
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "Maximo 5 digitos");
        }
    }//GEN-LAST:event_textoZipKeyTyped

    private void textoDNIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoDNIKeyTyped
        // TODO add your handling code here:
        //maximo 9 digitos
        if (textoDNI.getText().length() == 9) {
            evt.consume();
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "Maximo 9 digitos");
        }
        //check last character
        if (textoDNI.getText().length() == 7) {
            char c = evt.getKeyChar();
            if (Character.isLetter(c)) {
                getToolkit().beep();
                evt.consume();
                JOptionPane.showMessageDialog(null, "los primeros 8 digitos deben ser numeros");
            }
        }

    }//GEN-LAST:event_textoDNIKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistrarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistrarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistrarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistrarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaRegistrarse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Registrarse;
    private javax.swing.JComboBox<String> eleccionCombo;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField textoCIF;
    private javax.swing.JTextField textoCalle;
    private javax.swing.JPasswordField textoContraseña;
    private javax.swing.JTextField textoCorreo;
    private javax.swing.JTextField textoDNI;
    private javax.swing.JTextField textoNombre;
    private javax.swing.JFormattedTextField textoNumero;
    private javax.swing.JFormattedTextField textoNumeroTarjeta;
    private javax.swing.JTextField textoTelefono;
    private javax.swing.JTextField textoTitularTarjeta;
    private javax.swing.JTextField textoWeb;
    private javax.swing.JFormattedTextField textoZip;
    // End of variables declaration//GEN-END:variables
}
