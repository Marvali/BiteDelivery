/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaz;

import javax.swing.JOptionPane;

import com.mycompany.bitedelivery.GuardoDatos;

/**
 *
 * @author isaac
 */
public class Perfil extends javax.swing.JFrame {

    /**
     * Creates new form PerfilUsuario
     */
    public Perfil() {
        initComponents();
        getUserType();
        setUserInfo();
    }
    public void getUserType(){
        if(GuardoDatos.tipoUsuario.equals("particular")){
        txtCif.setVisible(false);
        jLabelcif.setVisible(false);
        txtWebPage.setVisible(false);
        jLabelweb.setVisible(false);
        txtDni.setVisible(true);
        jLabeldni.setVisible(true);
    

        }else if(GuardoDatos.tipoUsuario.equals("empresa")){
        txtCif.setVisible(true);
        jLabelcif.setVisible(true);
        txtWebPage.setVisible(true);
        jLabelweb.setVisible(true);
        txtDni.setVisible(false);
        jLabeldni.setVisible(false);
    }
    }
    public void setUserInfo(){
        if(GuardoDatos.tipoUsuario.equals("particular")){

        txtNombre.setText(GuardoDatos.particularActual.getNombre());
        txtEmail.setText(GuardoDatos.particularActual.getEmail());
        txtCalle.setText(GuardoDatos.particularActual.getDireccion().getCalle());
        int numero = GuardoDatos.particularActual.getDireccion().getNumero();
        txtNumero.setText(String.valueOf(numero));
        int zip = GuardoDatos.particularActual.getDireccion().getZip();
        txtZip.setText(String.valueOf(zip));
        int telefono = GuardoDatos.particularActual.getTelefono();
        txtTelefono.setText(String.valueOf(telefono));
        txtPassword.setText(GuardoDatos.particularActual.getPassword());
        txtDni.setText(GuardoDatos.particularActual.getDNI());
        long tarjeta = GuardoDatos.particularActual.getTarjeta().getNumero();
        txtNumeroTarjeta.setText(String.valueOf(tarjeta));
        txtTitularTarjeta.setText(GuardoDatos.particularActual.getTarjeta().getTitular());
        


        }else if(GuardoDatos.tipoUsuario.equals("empresa")){


        txtNombre.setText(GuardoDatos.empresaActual.getNombre());
        txtEmail.setText(GuardoDatos.empresaActual.getEmail());
        txtCalle.setText(GuardoDatos.empresaActual.getDireccion().getCalle());
        int numero = GuardoDatos.empresaActual.getDireccion().getNumero();
        txtNumero.setText(String.valueOf(numero));
        int zip = GuardoDatos.empresaActual.getDireccion().getZip();
        txtZip.setText(String.valueOf(zip));
        int telefono = GuardoDatos.empresaActual.getTelefono();
        txtTelefono.setText(String.valueOf(telefono));
        txtPassword.setText(GuardoDatos.empresaActual.getPassword());
        txtCif.setText(GuardoDatos.empresaActual.getCIF());
        txtWebPage.setText(GuardoDatos.empresaActual.getWeb());
        long tarjeta = GuardoDatos.empresaActual.getTarjeta().getNumero();
        txtNumeroTarjeta.setText(String.valueOf(tarjeta));
        txtTitularTarjeta.setText(GuardoDatos.empresaActual.getTarjeta().getTitular());
        
        }

        
    }

    public void saveNewUserInfo(){
        if(GuardoDatos.tipoUsuario.equals("particular")){
            //find the user in the arraylist delete 
            
            for(int i=0;i<GuardoDatos.particulares.size();i++){
                if(GuardoDatos.particulares.get(i).getEmail().equals(GuardoDatos.particularActual.getEmail())){
                    GuardoDatos.particulares.remove(i);
                }
            }

            GuardoDatos.particularActual.setNombre(txtNombre.getText());
            GuardoDatos.particularActual.setEmail(txtEmail.getText());
            GuardoDatos.particularActual.getDireccion().setCalle(txtCalle.getText());
            GuardoDatos.particularActual.getDireccion().setNumero(Integer.parseInt(txtNumero.getText()));
            GuardoDatos.particularActual.getDireccion().setZip(Integer.parseInt(txtZip.getText()));
            GuardoDatos.particularActual.setTelefono(Integer.parseInt(txtTelefono.getText()));
            char[] passwordChars = txtPassword.getPassword();
            String password = new String(passwordChars);
            GuardoDatos.particularActual.setPassword(password);
            GuardoDatos.particularActual.setDNI(txtDni.getText());
            GuardoDatos.particularActual.getTarjeta().setNumero(Integer.parseInt(txtNumeroTarjeta.getText()));
            GuardoDatos.particularActual.getTarjeta().setTitular(txtTitularTarjeta.getText());
            // if jDateChooser1 is null, get the date from particularActual
            if(jDateChooser1.getDate() == null){
                GuardoDatos.particularActual.getTarjeta().setFechaCaducidad(GuardoDatos.particularActual.getTarjeta().getFechaCaducidad());
            }else{
            GuardoDatos.particularActual.getTarjeta().setFechaCaducidad(jDateChooser1.getDate());
            }
            //add the new user to the arraylist and save it
            GuardoDatos.registerParticular(GuardoDatos.particularActual);
            GuardoDatos.saveDataParticulares();
            GuardoDatos.loadDataParticulares();

            
        }else if(GuardoDatos.tipoUsuario.equals("empresa")){

             //find the user in the arraylist and delete it
            for(int i=0;i<GuardoDatos.empresas.size();i++){
                if(GuardoDatos.empresas.get(i).getEmail().equals(GuardoDatos.empresaActual.getEmail())){
                    GuardoDatos.empresas.remove(i);
                }
            }
           
            GuardoDatos.empresaActual.setNombre(txtNombre.getText());
            GuardoDatos.empresaActual.setEmail(txtEmail.getText());
            GuardoDatos.empresaActual.getDireccion().setCalle(txtCalle.getText());
            GuardoDatos.empresaActual.getDireccion().setNumero(Integer.parseInt(txtNumero.getText()));
            GuardoDatos.empresaActual.getDireccion().setZip(Integer.parseInt(txtZip.getText()));
            GuardoDatos.empresaActual.setTelefono(Integer.parseInt(txtTelefono.getText()));
            char[] passwordChars = txtPassword.getPassword();
            String password = new String(passwordChars);
            GuardoDatos.empresaActual.setPassword(password);
            GuardoDatos.empresaActual.setCIF(txtCif.getText());
            GuardoDatos.empresaActual.setWeb(txtWebPage.getText());
            GuardoDatos.empresaActual.getTarjeta().setNumero(Integer.parseInt(txtNumeroTarjeta.getText()));
            GuardoDatos.empresaActual.getTarjeta().setTitular(txtTitularTarjeta.getText());
            // if jDateChooser1 is null, get the date from empresaActual
            if(jDateChooser1.getDate() == null){
                GuardoDatos.empresaActual.getTarjeta().setFechaCaducidad(GuardoDatos.empresaActual.getTarjeta().getFechaCaducidad());
            }else{
            GuardoDatos.empresaActual.getTarjeta().setFechaCaducidad(jDateChooser1.getDate());
            }


            //add the new user to the arraylist and save it
            GuardoDatos.registerEmpresa(GuardoDatos.empresaActual);
            GuardoDatos.saveDataEmpresas();
            GuardoDatos.loadDataEmpresas();

            
            




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

        txtNombre = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtCalle = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        txtZip = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        txtDni = new javax.swing.JTextField();
        txtCif = new javax.swing.JTextField();
        txtWebPage = new javax.swing.JTextField();
        jLabelnombre = new javax.swing.JLabel();
        jLabel2email = new javax.swing.JLabel();
        jLabelpassword = new javax.swing.JLabel();
        jLabeltelfono = new javax.swing.JLabel();
        jLabeldni = new javax.swing.JLabel();
        jLabelcif = new javax.swing.JLabel();
        jLabelweb = new javax.swing.JLabel();
        jLabelcalle = new javax.swing.JLabel();
        jLabelnumero = new javax.swing.JLabel();
        jLabelzip = new javax.swing.JLabel();
        txtTitularTarjeta = new javax.swing.JTextField();
        txtNumeroTarjeta = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        buttonSave = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEmailKeyTyped(evt);
            }
        });

        txtCalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCalleActionPerformed(evt);
            }
        });
        txtCalle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCalleKeyTyped(evt);
            }
        });

        txtNumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroKeyTyped(evt);
            }
        });

        txtZip.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtZipKeyTyped(evt);
            }
        });

        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });

        txtPassword.setText("jPasswordField1");
        txtPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPasswordFocusGained(evt);
            }
        });
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPasswordKeyTyped(evt);
            }
        });

        txtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDniKeyTyped(evt);
            }
        });

        txtCif.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCifKeyTyped(evt);
            }
        });

        txtWebPage.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtWebPageKeyTyped(evt);
            }
        });

        jLabelnombre.setText("Nombre");

        jLabel2email.setText("Email");

        jLabelpassword.setText("Contraseña");

        jLabeltelfono.setText("Telefono");

        jLabeldni.setText("DNI");

        jLabelcif.setText("CIF");

        jLabelweb.setText("Web");

        jLabelcalle.setText("Calle");

        jLabelnumero.setText("Numero");

        jLabelzip.setText("Zip");

        txtTitularTarjeta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTitularTarjetaKeyTyped(evt);
            }
        });

        txtNumeroTarjeta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroTarjetaKeyTyped(evt);
            }
        });

        jLabel1.setText("Titular");

        jLabel2.setText("N tarjeta");

        jLabel3.setText("Fecha cad");

        buttonSave.setText("Guardar");
        buttonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabelnombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2email, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabelpassword)
                            .addComponent(jLabeltelfono)
                            .addComponent(jLabeldni)
                            .addComponent(jLabelcif)
                            .addComponent(jLabelweb))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtWebPage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDni, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCif, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelcalle)
                            .addComponent(jLabelnumero)
                            .addComponent(jLabelzip)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(37, 37, 37)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCalle, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtTitularTarjeta, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtNumeroTarjeta, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtZip, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)))
                .addContainerGap(268, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(buttonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(149, 149, 149))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelnombre)
                    .addComponent(jLabelcalle))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2email)
                        .addComponent(jLabelnumero)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtZip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelpassword)
                    .addComponent(jLabelzip))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabeltelfono))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabeldni))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelcif)
                            .addComponent(txtTitularTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtWebPage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelweb)
                            .addComponent(txtNumeroTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(27, 27, 27)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3))
                .addGap(4, 4, 4)
                .addComponent(buttonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
        //jdialog max 20 characters
    
        
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtCalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCalleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCalleActionPerformed

    private void txtPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusGained
        // TODO add your handling code here:
        txtPassword.setText("");
    }//GEN-LAST:event_txtPasswordFocusGained

    private void buttonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSaveActionPerformed
        // TODO add your handling code here:
        //jdialog to confirm, are u sure?

        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(this, "¿Estás seguro de que quieres guardar los cambios?", "Confirmar", dialogButton);
        if (dialogResult == 0) {
            saveNewUserInfo();
            JOptionPane.showMessageDialog(this, "Cambios guardados correctamente");
            this.dispose();
        
        }

    }//GEN-LAST:event_buttonSaveActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        // TODO add your handling code here:
        //jdialog max 20 characters
        if (txtNombre.getText().length() >= 20) {
            evt.consume();
        
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "Maximo 20 caracteres");
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyTyped
        // TODO add your handling code here:
        //jdialog max 20 characters
        if (txtEmail.getText().length() >= 20) {
            evt.consume();
        
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "Maximo 20 caracteres");
        }
    }//GEN-LAST:event_txtEmailKeyTyped

    private void txtPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyTyped
        // TODO add your handling code here:
        //jdialog max 20 characters
        if (txtPassword.getText().length() >= 20) {
            evt.consume();
        
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "Maximo 20 caracteres");
        }
    }//GEN-LAST:event_txtPasswordKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        // TODO add your handling code here:
        //jdialog max 9 characters
        if (txtTelefono.getText().length() >= 9) {
            evt.consume();
        
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "Maximo 9 caracteres");
        }

    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniKeyTyped
        // TODO add your handling code here:
        //jdialog max 9 characters
        if (txtDni.getText().length() >= 9) {
            evt.consume();
        
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "Maximo 9 caracteres");
        }
        //fist 8 numbers, last letter
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            if (txtDni.getText().length() < 8) {
                evt.consume();
        
                getToolkit().beep();
                JOptionPane.showMessageDialog(null, "Introduce 8 numeros primero");
            }
        }
        
    }//GEN-LAST:event_txtDniKeyTyped

    private void txtCifKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCifKeyTyped
        // TODO add your handling code here:
        //jdialog max 9 characters
        if (txtCif.getText().length() >= 9) {
            evt.consume();
        
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "Maximo 9 caracteres");
        }
        //fist 8 numbers, last letter
       
    }//GEN-LAST:event_txtCifKeyTyped

    private void txtWebPageKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtWebPageKeyTyped
        // TODO add your handling code here:
        //jdialog max 20 characters
        if (txtWebPage.getText().length() >= 20) {
            evt.consume();
        
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "Maximo 20 caracteres");
        }
    }//GEN-LAST:event_txtWebPageKeyTyped

    private void txtCalleKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCalleKeyTyped
        // TODO add your handling code here:
        //jdialog max 20 characters
        if (txtCalle.getText().length() >= 20) {
            evt.consume();
        
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "Maximo 20 caracteres");
        }
    }//GEN-LAST:event_txtCalleKeyTyped

    private void txtNumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroKeyTyped
        // TODO add your handling code here:
        //jdialog max 3 characters
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo numeros");
        }
        if (txtNumero.getText().length() == 3) {
            evt.consume();
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "Maximo 3 digitos");
        }

    }//GEN-LAST:event_txtNumeroKeyTyped

    private void txtZipKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtZipKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo numeros");
        }
        if (txtZip.getText().length() == 5) {
            evt.consume();
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "Maximo 5 digitos");
        }

    }//GEN-LAST:event_txtZipKeyTyped

    private void txtTitularTarjetaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTitularTarjetaKeyTyped
        // TODO add your handling code here:
        //max 20 characters
        if (txtTitularTarjeta.getText().length() == 20) {
            evt.consume();
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "Maximo 20 caracteres");
        }
        
    }//GEN-LAST:event_txtTitularTarjetaKeyTyped

    private void txtNumeroTarjetaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroTarjetaKeyTyped
        // TODO add your handling code here:
        //max 16 characters
        if (txtNumeroTarjeta.getText().length() == 16) {
            evt.consume();
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "Maximo 16 caracteres");
        }
    }//GEN-LAST:event_txtNumeroTarjetaKeyTyped

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
            java.util.logging.Logger.getLogger(Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Perfil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonSave;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel2email;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelcalle;
    private javax.swing.JLabel jLabelcif;
    private javax.swing.JLabel jLabeldni;
    private javax.swing.JLabel jLabelnombre;
    private javax.swing.JLabel jLabelnumero;
    private javax.swing.JLabel jLabelpassword;
    private javax.swing.JLabel jLabeltelfono;
    private javax.swing.JLabel jLabelweb;
    private javax.swing.JLabel jLabelzip;
    private javax.swing.JTextField txtCalle;
    private javax.swing.JTextField txtCif;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtNumeroTarjeta;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTitularTarjeta;
    private javax.swing.JTextField txtWebPage;
    private javax.swing.JTextField txtZip;
    // End of variables declaration//GEN-END:variables
}
