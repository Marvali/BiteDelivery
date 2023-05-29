/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaz;

/**
 *
 * @author isaac
 */
public class MenuInicial extends javax.swing.JFrame {

    /**
     * Creates new form MenuInicial
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

        jPanel1 = new javax.swing.JPanel();
        BotonIniciarSesion = new javax.swing.JLabel();
        BotonRegistrase = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotonIniciarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botonInicioSesion.png"))); // NOI18N
        BotonIniciarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonIniciarSesionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonIniciarSesionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonIniciarSesionMouseExited(evt);
            }
        });
        jPanel1.add(BotonIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));

        BotonRegistrase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botonRegistrarse.png"))); // NOI18N
        BotonRegistrase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonRegistraseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonRegistraseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonRegistraseMouseExited(evt);
            }
        });
        jPanel1.add(BotonRegistrase, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bite logo-100x100.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logotipoletras.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 302, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(67, 67, 67))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 110));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondo2.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 780, 360));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 779, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 468, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonIniciarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonIniciarSesionMouseClicked
        // TODO add your handling code here:
        //open MenuIniciarSesionN

        MenuIniciarSesionN menuIniciarSesion = new MenuIniciarSesionN();
        menuIniciarSesion.setVisible(true);
        dispose();
       
        this.setVisible(false);
    }//GEN-LAST:event_BotonIniciarSesionMouseClicked

    private void BotonRegistraseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonRegistraseMouseClicked
        // TODO add your handling code here:
        //open VentanaRegistro
        VentanaRegistrarse ventanaRegistro = new VentanaRegistrarse();
        ventanaRegistro.setVisible(true);
        dispose();
    }//GEN-LAST:event_BotonRegistraseMouseClicked

    private void BotonIniciarSesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonIniciarSesionMouseEntered
        // TODO add your handling code here:
    BotonIniciarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botonInicioSesion2.png")));

    }//GEN-LAST:event_BotonIniciarSesionMouseEntered

    private void BotonIniciarSesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonIniciarSesionMouseExited
        // TODO add your handling code here:
    BotonIniciarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botonInicioSesion.png")));
    }//GEN-LAST:event_BotonIniciarSesionMouseExited

    private void BotonRegistraseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonRegistraseMouseEntered
        // TODO add your handling code here:
    BotonRegistrase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botonRegistrarse2.png")));

    }//GEN-LAST:event_BotonRegistraseMouseEntered

    private void BotonRegistraseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonRegistraseMouseExited
        // TODO add your handling code here:
    BotonRegistrase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botonRegistrarse.png")));
    }//GEN-LAST:event_BotonRegistraseMouseExited

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BotonIniciarSesion;
    private javax.swing.JLabel BotonRegistrase;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
