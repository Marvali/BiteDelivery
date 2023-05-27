/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaz;
import java.io.Serializable;
/**
 *
 * @author isaac
 */
public class MenuInicial extends javax.swing.JFrame implements Serializable  {

    /**
     * Creates new form menu
     */
   
    public MenuInicial() {

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

        Backgroud = new javax.swing.JPanel();
        iniciarSesion = new javax.swing.JLabel();
        registrarse = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BiteDelivery");
        setBackground(new java.awt.Color(255, 255, 255));
        setIconImages(null);
        setType(java.awt.Window.Type.UTILITY);

        Backgroud.setBackground(new java.awt.Color(255, 255, 255));
        Backgroud.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iniciarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botonInicioSesion.png"))); // NOI18N
        iniciarSesion.setText("jLabel2");
        iniciarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iniciarSesionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                iniciarSesionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                iniciarSesionMouseExited(evt);
            }
        });
        Backgroud.add(iniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 190, 50));

        registrarse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botonRegistrarse.png"))); // NOI18N
        registrarse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registrarseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                registrarseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                registrarseMouseExited(evt);
            }
        });
        Backgroud.add(registrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, 190, 60));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logos/bite logo-192x192.png"))); // NOI18N
        Backgroud.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 190, 190));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondo2.jpg"))); // NOI18N
        Backgroud.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 760));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Backgroud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Backgroud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void iniciarSesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iniciarSesionMouseEntered
        // TODO add your handling code here:
          iniciarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botoninicioSesion2.png"))); // NOI18N
    }//GEN-LAST:event_iniciarSesionMouseEntered

    private void iniciarSesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iniciarSesionMouseExited
        // TODO add your handling code here:
        iniciarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botoninicioSesion.png"))); // NOI18N
    }//GEN-LAST:event_iniciarSesionMouseExited

    private void iniciarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iniciarSesionMouseClicked
        // TODO add your handling code here:
        MenuLogin menu = new MenuLogin(this);
        menu.setVisible(true);
        
     
        
        
    }//GEN-LAST:event_iniciarSesionMouseClicked

    private void registrarseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarseMouseClicked
        // TODO add your handling code here:

        VentanaRegistrarse ventana = new VentanaRegistrarse();
        ventana.setVisible(true);


        
    }//GEN-LAST:event_registrarseMouseClicked

    private void registrarseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarseMouseEntered
        // TODO add your handling code here:
        registrarse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botonRegistrarse2.png"))); // NOI18N
    }//GEN-LAST:event_registrarseMouseEntered

    private void registrarseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarseMouseExited
        // TODO add your handling code here:
         registrarse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botonRegistrarse.png"))); // NOI18N
    }//GEN-LAST:event_registrarseMouseExited

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
            java.util.logging.Logger.getLogger(MenuInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MenuInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Backgroud;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel iniciarSesion;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel registrarse;
    // End of variables declaration//GEN-END:variables
}
