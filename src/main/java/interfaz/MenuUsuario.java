/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
// 
package interfaz;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.List;

import javax.swing.table.DefaultTableModel;

import com.mycompany.bitedelivery.Restaurante;
import com.mycompany.bitedelivery.Direccion;
import com.mycompany.bitedelivery.GuardoDatos;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * esta clase representa el menu principal del restaurante
 * 
 * @author isaac
 */
public class MenuUsuario extends javax.swing.JFrame {
    DefaultTableModel prueba = new DefaultTableModel();
    private static ArrayList<Restaurante> ventaRestaurantes = new ArrayList<Restaurante>(); 
    /**
     * Creates new form MenuUsuario
     */
    public MenuUsuario() {
        initComponents();
        setModeloTabla();
        
        ordenProductos();
        
       
    }
    
    // opciones de ordenación Por relevancia (se muestran los restaurantes con la mejor calificación).Por tiempo medio de envío. Servicio de catering disponible o no
    private void setModeloTabla(){
        String[] cabecera = {"Nombre","Calificacion","Tiempo Medio envio ","Catering"};

        prueba.setColumnIdentifiers(cabecera);
        tablaRestaurantes.setModel(prueba); 
        
        
        

        }
 private void ordenProductos() {
    //ordenar por calificacion, tiempo medio de envio y servicio de catering de mayor a menor
    GuardoDatos.loadDataRestaurantes();
    ventaRestaurantes = GuardoDatos.getRestaurantes();
    ArrayList<Restaurante> ventaRestauranteszip = new ArrayList<Restaurante>();
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
        case "Codigo Postal":
            //get current user code postal and compare it with the restaurant code postal
            String tipo = GuardoDatos.tipoUsuario;

            if (tipo.equals("particular")) {
                
                String userZipPrefix = String.valueOf(GuardoDatos.particularActual.getDireccion().getZip()).substring(0, 3);
                for (Restaurante restaurante : ventaRestaurantes) {
                    String restaurantZipPrefix = String.valueOf(restaurante.getDireccion().getZip()).substring(0, 3);
                    if (restaurantZipPrefix.equals(userZipPrefix)) {
                        ventaRestauranteszip.add(restaurante);
                    }
                }
            } else if (tipo.equals("empresa")) {
                String userZipPrefix = String.valueOf(GuardoDatos.empresaActual.getDireccion().getZip()).substring(0, 3);
                for (Restaurante restaurante : ventaRestaurantes) {
                    String restaurantZipPrefix = String.valueOf(restaurante.getDireccion().getZip()).substring(0, 3);
                    if (restaurantZipPrefix.equals(userZipPrefix)) {
                        ventaRestauranteszip.add(restaurante);
                    }
                }
                

            }
            setDatosTabla(ventaRestauranteszip);
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
    private void setDatosTabla(ArrayList<Restaurante> restaurantes) {
         // añadir datos a la tabla
        prueba.setRowCount(0);
       

    for (Restaurante restaurante : restaurantes) {
        Object[] fila = {restaurante.getNombre(), restaurante.getCalificacion(), restaurante.getTiempoMedioEnvio(), restaurante.isServicioCatering() ? "Sí" : "No"};
        prueba.addRow(fila);
    }

    

    
}

    public  void setRestauranteSeleccionado() {
        //coge el String del restaurante seleccionado con getSelectedRow y lo guarda en la variable selectedRestaurantName que se encuentra en GuardoDatos
        int fila = tablaRestaurantes.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "No se ha seleccionado ningun Restaurante");
            
        }
        GuardoDatos.selectedRestaurantName = (String) prueba.getValueAt(fila, 0);
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
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        botonPerfil = new javax.swing.JButton();
        textoBuscador = new javax.swing.JTextField();
        botonBuscador = new javax.swing.JToggleButton();
        jCombo = new javax.swing.JComboBox<>();
        botonOpenRestaurant = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(new ImageIcon(getClass().getResource("/images/logos/bite logo-32x32.png")).getImage());
        setPreferredSize(new java.awt.Dimension(700, 700));

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

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MenuUsuario/logotipoletras.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MenuUsuario/bite logo-192x192.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        botonPerfil.setText("Ir a tu perfil");
        botonPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPerfilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        botonBuscador.setText("Buscador");
        botonBuscador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscadorActionPerformed(evt);
            }
        });

        jCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Codigo Postal", "Por relevancia", "Por tiempo medio de envio", "Servicio de catering disponible" }));
        jCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboActionPerformed(evt);
            }
        });

        botonOpenRestaurant.setText("Ver restaurante");
        botonOpenRestaurant.setToolTipText("");
        botonOpenRestaurant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOpenRestaurantActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel3.setText("Restaurantes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botonOpenRestaurant, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(121, 121, 121)
                                    .addComponent(botonBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(textoBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCombo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botonBuscador)
                        .addComponent(textoBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(botonOpenRestaurant)
                .addGap(124, 124, 124))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonBuscadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscadorActionPerformed
        // TODO add your handling c
        //boton buscador 
        String texto = textoBuscador.getText();

        String combo = jCombo.getSelectedItem().toString();


        if(texto.equals("")){
            JOptionPane.showMessageDialog(null, "No has introducido nada");
        }else{
           ventaRestaurantes= GuardoDatos.buscar(texto);
           setDatosTabla(ventaRestaurantes);
           if(ventaRestaurantes.size()==0){
               JOptionPane.showMessageDialog(null, "No se ha encontrado nada");
            }}

    }//GEN-LAST:event_botonBuscadorActionPerformed

    private void jComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboActionPerformed
        // TODO add your handling code here:
       
    ordenProductos();
    }//GEN-LAST:event_jComboActionPerformed

    private void botonOpenRestaurantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOpenRestaurantActionPerformed
        // TODO add your handling code here:
        //abrir ventana de restaurante setvisible true
        if(tablaRestaurantes.getSelectedRow()==-1){
            JOptionPane.showMessageDialog(null, "No has seleccionado ningun restaurante");
        }else{
        setRestauranteSeleccionado();
        MenuComida menuRestaurante = new MenuComida();
        menuRestaurante.setVisible(true);
        
        }
        

    }//GEN-LAST:event_botonOpenRestaurantActionPerformed

    private void botonPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPerfilActionPerformed
        // TODO add your handling code here:
        //abrir ventana de perfil setvisible true
        Perfil perfil = new Perfil();
        perfil.setVisible(true);
        
        
        
    }//GEN-LAST:event_botonPerfilActionPerformed

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
            java.util.logging.Logger.getLogger(MenuUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton botonBuscador;
    private javax.swing.JButton botonOpenRestaurant;
    private javax.swing.JButton botonPerfil;
    private javax.swing.JComboBox<String> jCombo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaRestaurantes;
    private javax.swing.JTextField textoBuscador;
    // End of variables declaration//GEN-END:variables
}

