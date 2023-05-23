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
        textoApellido = new javax.swing.JTextField();
        textoCorreo = new javax.swing.JTextField();
        Registrarse = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textoCorreo.setToolTipText("");

        Registrarse.setText("Registrarse");
        Registrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarseActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre");

        jLabel2.setText("Apellido");

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

        jLabel10.setText("Numero Tarjetas");

        jLabel11.setText("Telefono");

        textoTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoTelefonoActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(eleccionCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGap(42, 42, 42)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel10)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(textoContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(textoDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(179, 179, 179)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel13)
                                                .addComponent(jLabel12))))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(textoTelefono, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(textoCIF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel14))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(textoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(textoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(textoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(188, 188, 188)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel9)
                                                .addComponent(jLabel8)
                                                .addComponent(jLabel7)))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(textoCalle, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(textoZip, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textoNumero, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Registrarse, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(textoWeb, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                    .addComponent(textoTitularTarjeta, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textoNumeroTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(59, 59, 59)))
                        .addGap(37, 37, 37))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(textoCalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)
                        .addComponent(textoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(textoZip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(eleccionCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(textoWeb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textoDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(textoTitularTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(textoCIF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(textoNumeroTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))))
                .addGap(64, 64, 64)
                .addComponent(Registrarse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(textoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public Direccion crearDireccion( ) {
        Direccion direccion = null;
        //if calle is empty numero emty zip empty parseInt
        if (!textoCalle.getText().isEmpty() && !textoNumero.getText().isEmpty() && !textoZip.getText().isEmpty()) {
            String calle = textoCalle.getText();
            // get number from textfield convert to int
            int numero = Integer.parseInt(textoNumero.getText());
            int zip = Integer.parseInt(textoZip.getText());
            direccion = new Direccion(calle, numero, zip);
            
        } else {
            JOptionPane.showMessageDialog(null, "Rellene todos los campos de la direccion");
        }
        return direccion;
        
    }

    public TarjetaCredito crearTarjeta() {
        //if numeroTarjeta is empty parseInt and textoTitularTarjeta and jDateChooser1 is not empty
        TarjetaCredito tarjeta = null;
        

        return tarjeta;
    }
    private void textoDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoDNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoDNIActionPerformed

    private void RegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarseActionPerformed

        // TODO add your handling code here:
        String nombre = textoNombre.getText();
        String apellido = textoApellido.getText();
        String correo = textoCorreo.getText();
        String contraseña = textoContraseña.getText();
        String dni = textoDNI.getText();
        String cif = textoCIF.getText();

        TarjetaCredito tarjeta = crearTarjeta();
        Direccion direccion = crearDireccion();
        String modelo = (String) eleccionCombo.getSelectedItem();
        int telefono =Integer.parseInt(textoTelefono.getText());
        String web = textoWeb.getText();
        //print(nombre, apellido, correo, contraseña, dni);
        if (modelo.equals("Empresa")) {
            if (nombre.equals("") || correo.equals("") || contraseña.equals("") || cif.equals("") || tarjeta.equals("") || telefono==0 || web.equals("")) {
                JOptionPane.showMessageDialog(null, "Rellene todos los campos");
            } else {

                //String email, String password, String nombre, Direccion direccion, TarjetaCredito tarjetaCredito, int telefono, String CIF, String web
                UsuarioEmpresa empresa;
                empresa = new UsuarioEmpresa(correo, contraseña, nombre, direccion, tarjeta, telefono, cif, web);
                    //imprimir(empresa);
                //imprimir empresa
                System.out.println(empresa.getNombre());
                System.out.println(empresa.getCorreo());
                System.out.println(empresa.getPassword());
                System.out.println(empresa.getTelefono());
                System.out.println(empresa.getTarjeta());

                System.out.println(empresa.getDireccion()); //to string usuario empresa
                System.out.println(empresa.getDireccion().getCalle());
                System.out.println(empresa.getDireccion().getNumero());
                System.out.println(empresa.getDireccion().getZip());
                System.out.println(empresa.toString());
                registerEmpresa(empresa);
                saveDataEmpresas();
                for (int i = 0; i < empresas.size(); i++) {
                    System.out.println("Empresa, entro en el bucle " + i);
                    System.out.println(empresas.get(i).getNombre());
                    System.out.println(empresas.get(i).getDireccion().getCalle());
                    System.out.println(empresas.get(i).getDireccion().getNumero());
                    System.out.println(empresas.get(i).getDireccion().getZip());
                    System.out.println(empresas.get(i).getCorreo());
                    System.out.println(empresas.get(i).getPassword());
                    System.out.println("Empresa, final del en el bucle " + i);
                }
                JOptionPane.showMessageDialog(null, "Registrado correctamente");

                loadData();
                for (int i = 0; i < prueba.size(); i++) {
                    System.out.println("Usuario, entro en el bucle " + i);
                    System.out.println(prueba.get(i).getNombre());
                    System.out.println(prueba.get(i).getDireccion().getCalle());
                    System.out.println(prueba.get(i).getDireccion().getNumero());
                    System.out.println(prueba.get(i).getDireccion().getZip());
                    System.out.println(prueba.get(i).getCorreo());
                    System.out.println(prueba.get(i).getPassword());
                    System.out.println("leyendo" + i);
                }

            }
        } else {
            if (nombre.equals("") || correo.equals("") || contraseña.equals("") || dni.equals("") || tarjeta.equals("") || telefono==0) {
                JOptionPane.showMessageDialog(null, "Rellene todos los campos");
            } else {
                UsuarioParticular particular;
                particular = new UsuarioParticular(correo, contraseña, nombre, direccion, tarjeta,telefono, dni);
                //imprimir(particular);
                //imprimir particular
                System.out.println(particular.getNombre());
                System.out.println(particular.getCorreo());
                System.out.println(particular.getPassword());
                System.out.println(particular.getTarjeta());
                System.out.println(particular.getDNI());
                System.out.println(particular.getDireccion()); //to string usuario empresa
                System.out.println(particular.getDireccion().getCalle());
                System.out.println(particular.getDireccion().getNumero());
                System.out.println(particular.getDireccion().getZip());
                System.out.println(particular.toString());

                JOptionPane.showMessageDialog(null, "Registrado correctamente");

            }
        }

    }//GEN-LAST:event_RegistrarseActionPerformed

    private void textoContraseñaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textoContraseñaFocusGained
        // TODO add your handling code here:
        textoContraseña.setText("");

    }//GEN-LAST:event_textoContraseñaFocusGained

    private void eleccionComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eleccionComboActionPerformed
        // TODO add your handling code here:
        modelo = (String) eleccionCombo.getSelectedItem();
        if (modelo.equals("Empresa")) {
            textoCIF.setVisible(true);
            jLabel6.setVisible(true);
            textoDNI.setVisible(false);
            jLabel5.setVisible(false);
        } else {
            textoCIF.setVisible(false);
            jLabel6.setVisible(false);
            textoDNI.setVisible(true);
            jLabel5.setVisible(true);

        }
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField textoApellido;
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
