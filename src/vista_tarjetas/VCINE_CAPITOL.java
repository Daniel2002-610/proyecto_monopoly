/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista_tarjetas;

import javax.swing.JOptionPane;

/**
 *
 * @author edgar
 */
public class VCINE_CAPITOL extends javax.swing.JFrame {

    /**
     * Creates new form CINE_CAPITOL
     */
    public VCINE_CAPITOL() {
        initComponents();
        setLocationRelativeTo(null);
      btncomprar.setVisible(true);
      btnsaltar.setVisible(true);
      btnsubastar.setVisible(true);
      btnaceptar.setVisible(false);
      nombres.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btncomprar = new javax.swing.JLabel();
        btnsubastar = new javax.swing.JLabel();
        btnsaltar = new javax.swing.JLabel();
        btnaceptar = new javax.swing.JLabel();
        nombres = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btncomprar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/btncomprar.png"))); // NOI18N
        btncomprar.setToolTipText("");
        btncomprar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btncomprar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncomprarMouseClicked(evt);
            }
        });
        getContentPane().add(btncomprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        btnsubastar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/btnsubartar.png"))); // NOI18N
        btnsubastar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnsubastarMouseClicked(evt);
            }
        });
        getContentPane().add(btnsubastar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        btnsaltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/btnsaltar.png"))); // NOI18N
        btnsaltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnsaltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnsaltarMouseClicked(evt);
            }
        });
        getContentPane().add(btnsaltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, -1, -1));

        btnaceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/btnacepatar.png"))); // NOI18N
        btnaceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnaceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnaceptarMouseClicked(evt);
            }
        });
        getContentPane().add(btnaceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        nombres.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(nombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 150, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/CAPITOL_1.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 8, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondo2.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 240));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncomprarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncomprarMouseClicked
        JOptionPane.showMessageDialog(null, "comprar");
    }//GEN-LAST:event_btncomprarMouseClicked

    private void btnsubastarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsubastarMouseClicked
        btncomprar.setVisible(false);
        btnsaltar.setVisible(false);
        btnsubastar.setVisible(false);
        btnaceptar.setVisible(true);
        nombres.setVisible(true);
    }//GEN-LAST:event_btnsubastarMouseClicked

    private void btnsaltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsaltarMouseClicked
        this.hide();
    }//GEN-LAST:event_btnsaltarMouseClicked

    private void btnaceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnaceptarMouseClicked
        JOptionPane.showMessageDialog(null, "comprar");
        this.hide();
    }//GEN-LAST:event_btnaceptarMouseClicked

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
            java.util.logging.Logger.getLogger(VCINE_CAPITOL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VCINE_CAPITOL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VCINE_CAPITOL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VCINE_CAPITOL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VCINE_CAPITOL().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnaceptar;
    private javax.swing.JLabel btncomprar;
    private javax.swing.JLabel btnsaltar;
    private javax.swing.JLabel btnsubastar;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JComboBox<String> nombres;
    // End of variables declaration//GEN-END:variables
}
