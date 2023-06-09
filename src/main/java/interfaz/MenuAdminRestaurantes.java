/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaz;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import com.mycompany.bitedelivery.Comidas;
import com.mycompany.bitedelivery.GuardoDatos;
import com.mycompany.bitedelivery.Restaurante;
import javax.swing.ImageIcon;
/**
 *  Clase que representa el menu de administrador de restaurantes
 *  puede dar de alta, baja y modificar restaurantes
 * puede ver los restaurantes por orden de relevancia, tiempo medio de envio y servicio de catering
 * 
 * @author isaac
 * 
 */
public class MenuAdminRestaurantes extends javax.swing.JFrame {
private static ArrayList<Comidas> foodList;
DefaultTableModel prueba = new DefaultTableModel();
private static ArrayList<Restaurante> ventaRestaurantes = new ArrayList<Restaurante>(); 

    /**
     * Creates new form MenuAdminRestaurantes
     */
    public MenuAdminRestaurantes() {
        initComponents();
        setModeloTabla();
       ordenProductos();
       
    }
    /**
     *  metodo que da la cabezera a la tabla
     * 
     * 
     */
private void setModeloTabla(){
        String[] cabecera = {"Nombre","Calificacion","Tiempo Medio envio ","Catering"};

        prueba.setColumnIdentifiers(cabecera);
        tablaRestaurantes.setModel(prueba); 
        

        }
 
    /**
     *  metodo que ordena los restaurantes por relevancia, tiempo medio de envio y servicio de catering
     *  
     *  
     *  
     */
private void ordenProductos() {
    //ordenar por calificacion, tiempo medio de envio y servicio de catering de mayor a menor
    GuardoDatos.loadDataRestaurantes();
    ventaRestaurantes = GuardoDatos.getRestaurantes();
    String combo = jCombo.getSelectedItem().toString();
    Comparator<Restaurante> comparator = null;
    
    switch (combo) {
        case "Por relevancia":
            comparator = Comparator.comparing(Restaurante::getCalificacion).reversed();
            break;
        case "Por tiempo medio de envio":
            comparator = Comparator.comparing(Restaurante::getTiempoMedioEnvio);
            break;
        case "Servicio de catering disponible":
            comparator = Comparator.comparing(Restaurante::isServicioCatering).reversed();
            break;
        default:
            break;

    }
    if (comparator != null) {
        System.out.println("sin comparar");
        System.out.println(ventaRestaurantes.get(0).getNombre());
        System.out.println(ventaRestaurantes.get(1).getNombre());
        System.out.println(ventaRestaurantes.get(2).getNombre());
        Collections.sort(ventaRestaurantes, comparator);
        setDatosTabla(ventaRestaurantes);
        System.out.println("comparado");
        System.out.println(ventaRestaurantes.get(0).getNombre());
        System.out.println(ventaRestaurantes.get(1).getNombre());
        System.out.println(ventaRestaurantes.get(2).getNombre());

    }
    
    
}

/**
 *  metodo que añade los datos a la tabla
 * 
 * @param restaurantes
 * 
 */

private void setDatosTabla(ArrayList<Restaurante> restaurantes) {
         // añadir datos a la tabla
        prueba.setRowCount(0);
       

    for (Restaurante restaurante : restaurantes) {
        Object[] fila = {restaurante.getNombre(), restaurante.getCalificacion(), restaurante.getTiempoMedioEnvio(), restaurante.isServicioCatering() ? "Sí" : "No"};
        prueba.addRow(fila);
    }

    

    
}
/**
 *  metodo que selecciona el restaurante que se ha seleccionado en la tabla
 * 
 * 
 */

public  void setRestauranteSeleccionado() {
        //coge el String del restaurante seleccionado con getSelectedRow y lo guarda en la variable selectedRestaurantName que se encuentra en GuardoDatos
        int fila = tablaRestaurantes.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "No se ha seleccionado ningun Restaurante");
            
        }
        GuardoDatos.selectedRestaurantName = (String) prueba.getValueAt(fila, 0);
    }

/**
 * metodo que borra un restaurante
 *  
 *  
 */
private void deleteRestaurant(){
    int fila = tablaRestaurantes.getSelectedRow();
    GuardoDatos.selectedRestaurantName = (String) prueba.getValueAt(fila, 0);
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "No se ha seleccionado ningun Restaurante");
            
        }
        for (int i = 0; i < GuardoDatos.getRestaurantes().size(); i++) {
           
            if (GuardoDatos.getRestaurantes().get(i).getNombre().equals(GuardoDatos.selectedRestaurantName)) {
                GuardoDatos.getRestaurantes().remove(i);
                GuardoDatos.saveDataRestaurantes();
                JOptionPane.showMessageDialog(null, "Restaurante eliminado");
                setDatosTabla(GuardoDatos.getRestaurantes());
                break;
            }
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaRestaurantes = new javax.swing.JTable();
        butonRestaurantEdit = new javax.swing.JButton();
        jCombo = new javax.swing.JComboBox<>();
        buttonBack = new javax.swing.JButton();
        buttonDelete = new javax.swing.JButton();
        buttonNewRestaurant = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(new ImageIcon(getClass().getResource("/images/logos/bite logo-32x32.png")).getImage());

        tablaRestaurantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaRestaurantes);

        butonRestaurantEdit.setText("Editar Restaurante");
        butonRestaurantEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butonRestaurantEditActionPerformed(evt);
            }
        });

        jCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Por relevancia", "Por tiempo medio de envio", "Servicio de catering disponible" }));
        jCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboActionPerformed(evt);
            }
        });

        buttonBack.setText("Atras");
        buttonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBackActionPerformed(evt);
            }
        });

        buttonDelete.setText("BORRAR RESTAURANTE");
        buttonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteActionPerformed(evt);
            }
        });

        buttonNewRestaurant.setText("Dar de alta");
        buttonNewRestaurant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNewRestaurantActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MenuAdmin/logotipoletras.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MenuAdmin/bite logo-32x32.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(35, 35, 35))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(buttonBack)
                .addGap(92, 92, 92)
                .addComponent(butonRestaurantEdit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonDelete)
                .addGap(38, 38, 38))
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonNewRestaurant)))
                .addContainerGap(12, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonNewRestaurant))
                .addGap(7, 7, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butonRestaurantEdit)
                    .addComponent(buttonBack)
                    .addComponent(buttonDelete))
                .addGap(37, 37, 37))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboActionPerformed
        // TODO add your handling code here:
        ordenProductos();
    }//GEN-LAST:event_jComboActionPerformed

    private void butonRestaurantEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butonRestaurantEditActionPerformed
        // TODO add your handling code here:
        setRestauranteSeleccionado();
        MenuAdminEditarRestaurante menuAdminEditarRestaurante = new MenuAdminEditarRestaurante();
        menuAdminEditarRestaurante.setVisible(true);
        dispose();
    }//GEN-LAST:event_butonRestaurantEditActionPerformed

    private void buttonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBackActionPerformed
        // TODO add your handling code here:
        MenuAdmin menuAdmin = new MenuAdmin();
        menuAdmin.setVisible(true);
        dispose();
    }//GEN-LAST:event_buttonBackActionPerformed

    private void buttonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteActionPerformed
        // TODO add your handling code here:
        deleteRestaurant();
    }//GEN-LAST:event_buttonDeleteActionPerformed

    private void buttonNewRestaurantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNewRestaurantActionPerformed
        // TODO add your handling code here:
        GuardoDatos.nuevoRestaurante=true;
        MenuAdminEditarRestaurante menuAdminEditarRestaurante = new MenuAdminEditarRestaurante();
        menuAdminEditarRestaurante.setVisible(true);
        dispose();
    }//GEN-LAST:event_buttonNewRestaurantActionPerformed

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
            java.util.logging.Logger.getLogger(MenuAdminRestaurantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAdminRestaurantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAdminRestaurantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAdminRestaurantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAdminRestaurantes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butonRestaurantEdit;
    private javax.swing.JButton buttonBack;
    private javax.swing.JButton buttonDelete;
    private javax.swing.JButton buttonNewRestaurant;
    private javax.swing.JComboBox<String> jCombo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaRestaurantes;
    // End of variables declaration//GEN-END:variables
}
