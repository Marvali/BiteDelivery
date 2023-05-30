/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaz;

import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

import com.mycompany.bitedelivery.GuardoDatos;
import com.mycompany.bitedelivery.UsuarioEmpresa;
import com.mycompany.bitedelivery.UsuarioParticular;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author isaac
 */
public class MenuAdminUsuarios extends javax.swing.JFrame {
DefaultTableModel UsuariosParticulares = new DefaultTableModel();
DefaultTableModel UsuariosEmpresas = new DefaultTableModel();
private ArrayList<UsuarioParticular> listaUsuariosParticulares;
private ArrayList<UsuarioEmpresa> listaUsuariosEmpresas;
    /**
     * Creates new form MenuAdminUsuarios
     */
    public MenuAdminUsuarios() {
        initComponents();
        setModeloTablaParticulares();
        setDataTablaParticulares();
        setModeloTablaEmpresas();
        setDataTablaEmpresas();
    }


    private void setModeloTablaParticulares(){
        //String email, String password, String nombre, Direccion direccion,TarjetaCredito tarjeta, int telefono, String DNI
String [] cabecera = {"Email", "Password", "Nombre", "Calle","Codigo Postal","Numero", "Telefono", "DNI"};
        UsuariosParticulares.setColumnIdentifiers(cabecera);
        tablaUsuariosParticulares.setModel(UsuariosParticulares);
    }
    
    private void setDataTablaParticulares(){
        //String email, String password, String nombre, Direccion direccion,TarjetaCredito tarjeta, int telefono, String DNI
        UsuariosParticulares.setRowCount(0);
        listaUsuariosParticulares = new ArrayList<>();
        GuardoDatos.saveDataParticulares();
        GuardoDatos.loadDataParticulares();
        listaUsuariosParticulares = GuardoDatos.particulares;
        for (UsuarioParticular usuarioParticular : listaUsuariosParticulares) {
           String[] datosFila = {usuarioParticular.getEmail(), usuarioParticular.getPassword(), usuarioParticular.getNombre(), usuarioParticular.getDireccion().getCalle(), String.valueOf(usuarioParticular.getDireccion().getZip()), String.valueOf(usuarioParticular.getDireccion().getNumero()), String.valueOf(usuarioParticular.getTelefono()), usuarioParticular.getDNI()};
              UsuariosParticulares.addRow(datosFila);
        }
    }
    
    private void setModeloTablaEmpresas(){
        //String email, String password, String nombre, Direccion direccion,TarjetaCredito tarjeta, int telefono, String DNI
String [] cabecera = {"Email", "Password", "Nombre", "Calle","Codigo Postal","Numero", "Telefono", "CIF","web"};
        UsuariosEmpresas.setColumnIdentifiers(cabecera);
        tablaUsuariosEmpresas.setModel(UsuariosEmpresas);
    }
    
    private void setDataTablaEmpresas(){
       
        UsuariosEmpresas.setRowCount(0);
        listaUsuariosEmpresas = new ArrayList<>();
        GuardoDatos.saveDataEmpresas();
        GuardoDatos.loadDataEmpresas();
        listaUsuariosEmpresas = GuardoDatos.empresas;
        for (UsuarioEmpresa usuarioEmpresa : listaUsuariosEmpresas) {
           String[] datosFila = {usuarioEmpresa.getEmail(), usuarioEmpresa.getPassword(), usuarioEmpresa.getNombre(), usuarioEmpresa.getDireccion().getCalle(), String.valueOf(usuarioEmpresa.getDireccion().getZip()), String.valueOf(usuarioEmpresa.getDireccion().getNumero()), String.valueOf(usuarioEmpresa.getTelefono()), usuarioEmpresa.getCIF(),usuarioEmpresa.getWeb()};
              UsuariosEmpresas.addRow(datosFila);
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
        tablaUsuariosParticulares = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaUsuariosEmpresas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        buttonBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tablaUsuariosParticulares.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaUsuariosParticulares);

        tablaUsuariosEmpresas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tablaUsuariosEmpresas);

        jLabel1.setText("Particulares");

        jLabel2.setText("Empresas");

        buttonBack.setText("Atras");
        buttonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
                        .addComponent(jScrollPane2)))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(buttonBack)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBackActionPerformed
        // TODO add your handling code here:
        dispose();
        new MenuAdmin().setVisible(true);
    }//GEN-LAST:event_buttonBackActionPerformed

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
            java.util.logging.Logger.getLogger(MenuAdminUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAdminUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAdminUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAdminUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAdminUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaUsuariosEmpresas;
    private javax.swing.JTable tablaUsuariosParticulares;
    // End of variables declaration//GEN-END:variables
}
