/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaz;

import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JOptionPane;

import com.mycompany.bitedelivery.Comidas;
import com.mycompany.bitedelivery.Direccion;
import com.mycompany.bitedelivery.GuardoDatos;
import com.mycompany.bitedelivery.Restaurante;

/**
 *
 * @author isaac
 */
public class MenuAdminEditarRestaurante extends javax.swing.JFrame {
Restaurante selectedRestaurante;
private static ArrayList<Comidas> foodList;
private static ArrayList<String> ingredientes1 = new ArrayList<>();
private static ArrayList<String> ingredientes2 = new ArrayList<>();
private static ArrayList<String> ingredientes3 = new ArrayList<>();

    /**
     * Creates new form MenuAdminEditarRestaurante
     */
    public MenuAdminEditarRestaurante() {
        initComponents();
        checkifNew();
    }

    private void checkifNew(){
        if (GuardoDatos.nuevoRestaurante == false) {
            setInfoRestaurante();
            
        }
    }
            
        

    
    private void setInfoRestaurante(){
        //setear la informacion del restaurante seleccionado
        //nombre, calificacion, tiempo medio de envio, servicio de catering
        //y las comidas que ofrece
        txtNombre.setText(GuardoDatos.selectedRestaurantName);
        
        for (int i = 0; i < GuardoDatos.getRestaurantes().size(); i++) {
            if (GuardoDatos.getRestaurantes().get(i).getNombre().equals(GuardoDatos.selectedRestaurantName)) {
                selectedRestaurante = GuardoDatos.getRestaurantes().get(i);
                txtNombre.setText(selectedRestaurante.getNombre());
                txtCalle.setText(selectedRestaurante.getDireccion().getCalle());
                int numero = selectedRestaurante.getDireccion().getNumero();
                txtNumero.setText(String.valueOf(numero));
                txtEspecialidad.setText(selectedRestaurante.getEspecialidad());
                int zip = selectedRestaurante.getDireccion().getZip();
                txtZip.setText(String.valueOf(zip));
                txtCalificacion.setText(String.valueOf(selectedRestaurante.getCalificacion()));
                txtGastosEnvio.setText(String.valueOf(selectedRestaurante.getGastosEnvio()));
                txtTiempoMedio.setText(String.valueOf(selectedRestaurante.getTiempoMedioEnvio()));
                foodList = selectedRestaurante.getComidas();
                //comida 1
                txtComida1.setText(foodList.get(0).getTitulo());
                ingredientes1 = foodList.get(0).getIngredientes();
                ingredientes2 = foodList.get(1).getIngredientes();
                ingredientes3 = foodList.get(2).getIngredientes();
                txt1Ingrediente1.setText(ingredientes1.get(0));
                txt1Ingrediente2.setText(ingredientes1.get(1));
                txt1Ingrediente3.setText(ingredientes1.get(2));
                txtFoto1.setText(foodList.get(0).getFotografia());
                txtPrecio1.setText(String.valueOf(foodList.get(0).getPrecio_venta()));
                //comida 2
                txtComida2.setText(foodList.get(1).getTitulo());
                txt2Ingrediente1.setText(ingredientes2.get(0));
                txt2Ingrediente2.setText(ingredientes2.get(1));
                txt2Ingrediente3.setText(ingredientes2.get(2));
                txtFoto2.setText(foodList.get(1).getFotografia());
                txtPrecio2.setText(String.valueOf(foodList.get(1).getPrecio_venta()));
                //comida 3
                txtComida3.setText(foodList.get(2).getTitulo());
                txt3Ingrediente1.setText(ingredientes3.get(0));
                txt3Ingrediente2.setText(ingredientes3.get(1));
                txt3Ingrediente3.setText(ingredientes3.get(2));
                txtFoto3.setText(foodList.get(2).getFotografia());
                txtPrecio3.setText(String.valueOf(foodList.get(2).getPrecio_venta()));



                if (selectedRestaurante.isServicioCatering()) {
                    jComboServicioCatering.setSelectedIndex(0);
                } else {
                    jComboServicioCatering.setSelectedIndex(1);
                }
                
            }
        }
        
    
}



private void editarRestaurante(){
    //editar la informacion del restaurante seleccionado
    //nombre, calificacion, tiempo medio de envio, servicio de catering
    //y las comidas que ofrece
    
    //crear un nuevo restaurante con la informacion editada
    //y eliminar el restaurante anterior
    // Create a new Direccion object with the edited address information
        Direccion direccion = new Direccion(txtCalle.getText(), Integer.parseInt(txtNumero.getText()), Integer.parseInt(txtZip.getText()));

        // Create a new ArrayList to hold the edited Comidas objects
        ArrayList<Comidas> comidaList = new ArrayList<>();

        // Create new Comidas objects with the edited information and add them to the ArrayList
        Comidas comida1 = new Comidas(txtComida1.getText(), new ArrayList<>(Arrays.asList(txt1Ingrediente1.getText(), txt1Ingrediente2.getText(), txt1Ingrediente3.getText())), Double.parseDouble(txtPrecio1.getText()), txtFoto1.getText());
        comidaList.add(comida1);

        Comidas comida2 = new Comidas(txtComida2.getText(), new ArrayList<>(Arrays.asList(txt2Ingrediente1.getText(), txt2Ingrediente2.getText(), txt2Ingrediente3.getText())), Double.parseDouble(txtPrecio2.getText()), txtFoto2.getText());
        comidaList.add(comida2);

        Comidas comida3 = new Comidas(txtComida3.getText(), new ArrayList<>(Arrays.asList(txt3Ingrediente1.getText(), txt3Ingrediente2.getText(), txt3Ingrediente3.getText())), Double.parseDouble(txtPrecio3.getText()), txtFoto3.getText());
        comidaList.add(comida3);

        // Create a new Restaurante object with the edited information
        Restaurante newRestaurante = new Restaurante(txtNombre.getText(), direccion, txtEspecialidad.getText(), Double.parseDouble(txtCalificacion.getText()), Double.parseDouble(txtGastosEnvio.getText()), Integer.parseInt(txtTiempoMedio.getText()), jComboServicioCatering.getSelectedIndex() == 0, comidaList);
        if (!GuardoDatos.nuevoRestaurante) {
            GuardoDatos.getRestaurantes().remove(selectedRestaurante);
        }
        
        GuardoDatos.getRestaurantes().add(newRestaurante);
        GuardoDatos.saveDataRestaurantes();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtCalle = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        txtEspecialidad = new javax.swing.JTextField();
        txtZip = new javax.swing.JTextField();
        txtCalificacion = new javax.swing.JTextField();
        txtGastosEnvio = new javax.swing.JTextField();
        txtTiempoMedio = new javax.swing.JTextField();
        txtComida1 = new javax.swing.JTextField();
        txtComida2 = new javax.swing.JTextField();
        txtComida3 = new javax.swing.JTextField();
        jComboServicioCatering = new javax.swing.JComboBox<>();
        butonBack = new javax.swing.JButton();
        txt1Ingrediente1 = new javax.swing.JTextField();
        txt1Ingrediente2 = new javax.swing.JTextField();
        txt1Ingrediente3 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtPrecio1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtFoto1 = new javax.swing.JTextField();
        txt2Ingrediente1 = new javax.swing.JTextField();
        txt2Ingrediente2 = new javax.swing.JTextField();
        txt2Ingrediente3 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtPrecio2 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtFoto2 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txt3Ingrediente1 = new javax.swing.JTextField();
        txt3Ingrediente2 = new javax.swing.JTextField();
        txt3Ingrediente3 = new javax.swing.JTextField();
        txtPrecio3 = new javax.swing.JTextField();
        txtFoto3 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        buttonSave = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Nombre");

        jLabel2.setText("Calle");

        jLabel3.setText("Numero calle");

        jLabel4.setText("Especialidad");

        jLabel5.setText("Codigoi Postal");

        jLabel6.setText("Calificacion");

        jLabel7.setText("Gastos de envio");

        jLabel8.setText("TIempo medio");

        jLabel9.setText("Servicio catering");

        jLabel10.setText("Comida 1");

        jLabel11.setText("Comida 2");

        jLabel12.setText("Comida 3");

        jComboServicioCatering.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No" }));

        butonBack.setText("Volver a los restaurantes");
        butonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butonBackActionPerformed(evt);
            }
        });

        jLabel13.setText("Ingredientes");

        jLabel14.setText("Precio");

        jLabel15.setText("Foto");

        jLabel17.setText("Ingredientes");

        jLabel18.setText("Precio");

        jLabel16.setText("Foto");

        jLabel19.setText("Precio");

        jLabel20.setText("Foto");

        jLabel21.setText("Ingredientes");

        buttonSave.setText("Guardar informacion");
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
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel19)
                            .addComponent(jLabel16)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel21)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboServicioCatering, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtNombre)
                                        .addComponent(txtCalle)
                                        .addComponent(txtNumero)
                                        .addComponent(txtEspecialidad)
                                        .addComponent(txtZip)
                                        .addComponent(txtCalificacion)
                                        .addComponent(txtGastosEnvio)
                                        .addComponent(txtTiempoMedio, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtFoto3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPrecio3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt3Ingrediente3))
                                .addGap(133, 133, 133)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel13)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel15)
                                            .addComponent(jLabel14))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel11)
                                            .addGap(9, 9, 9)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel18)
                                            .addComponent(jLabel17))))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt2Ingrediente3)
                                    .addComponent(txt2Ingrediente2)
                                    .addComponent(txt2Ingrediente1)
                                    .addComponent(txt1Ingrediente3)
                                    .addComponent(txt1Ingrediente1)
                                    .addComponent(txtComida1)
                                    .addComponent(txt1Ingrediente2)
                                    .addComponent(txtFoto1)
                                    .addComponent(txtPrecio1)
                                    .addComponent(txtComida2, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                                    .addComponent(txtFoto2)
                                    .addComponent(txtPrecio2))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(buttonSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(butonBack, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE))))
                        .addGap(14, 14, 14))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt3Ingrediente1)
                            .addComponent(txtComida3)
                            .addComponent(txt3Ingrediente2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(440, Short.MAX_VALUE)
                    .addComponent(jLabel20)
                    .addGap(216, 216, 216)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel10)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtComida1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt1Ingrediente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt1Ingrediente2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt1Ingrediente3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtZip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtFoto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addComponent(txtComida2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtCalificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt2Ingrediente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtGastosEnvio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt2Ingrediente2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtTiempoMedio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt2Ingrediente3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jComboServicioCatering, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecio2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtComida3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt3Ingrediente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(txtFoto2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt3Ingrediente2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(txt3Ingrediente3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPrecio3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFoto3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addContainerGap(15, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(33, 33, 33)
                        .addComponent(butonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(605, Short.MAX_VALUE)
                    .addComponent(jLabel20)
                    .addGap(238, 238, 238)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void butonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butonBackActionPerformed
        // TODO add your handling code here:
        MenuAdminRestaurantes menuAdminRestaurantes = new MenuAdminRestaurantes();
        menuAdminRestaurantes.setVisible(true);
        dispose();
    }//GEN-LAST:event_butonBackActionPerformed

    private void buttonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSaveActionPerformed
        // TODO add your handling code here:
        //dialogo confirmacion
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(this, "¿Desea guardar los cambios?", "Confirmar", dialogButton);
        if(dialogResult == 0) {
            //System.out.println("Yes option");
            //guardar cambios
            editarRestaurante();
            dispose();
            MenuAdminRestaurantes menuAdminRestaurantes = new MenuAdminRestaurantes();
            menuAdminRestaurantes.setVisible(true);
        } else {
            //System.out.println("No Option");
        }
        
        
        
    }//GEN-LAST:event_buttonSaveActionPerformed

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
            java.util.logging.Logger.getLogger(MenuAdminEditarRestaurante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAdminEditarRestaurante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAdminEditarRestaurante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAdminEditarRestaurante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAdminEditarRestaurante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butonBack;
    private javax.swing.JButton buttonSave;
    private javax.swing.JComboBox<String> jComboServicioCatering;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txt1Ingrediente1;
    private javax.swing.JTextField txt1Ingrediente2;
    private javax.swing.JTextField txt1Ingrediente3;
    private javax.swing.JTextField txt2Ingrediente1;
    private javax.swing.JTextField txt2Ingrediente2;
    private javax.swing.JTextField txt2Ingrediente3;
    private javax.swing.JTextField txt3Ingrediente1;
    private javax.swing.JTextField txt3Ingrediente2;
    private javax.swing.JTextField txt3Ingrediente3;
    private javax.swing.JTextField txtCalificacion;
    private javax.swing.JTextField txtCalle;
    private javax.swing.JTextField txtComida1;
    private javax.swing.JTextField txtComida2;
    private javax.swing.JTextField txtComida3;
    private javax.swing.JTextField txtEspecialidad;
    private javax.swing.JTextField txtFoto1;
    private javax.swing.JTextField txtFoto2;
    private javax.swing.JTextField txtFoto3;
    private javax.swing.JTextField txtGastosEnvio;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtPrecio1;
    private javax.swing.JTextField txtPrecio2;
    private javax.swing.JTextField txtPrecio3;
    private javax.swing.JTextField txtTiempoMedio;
    private javax.swing.JTextField txtZip;
    // End of variables declaration//GEN-END:variables
}
