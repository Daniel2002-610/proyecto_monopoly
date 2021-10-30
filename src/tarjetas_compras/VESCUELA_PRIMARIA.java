/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarjetas_compras;

import clases_tarjetas.ESCUELA_PRIMARIA;
import javax.swing.JOptionPane;
import jugadores.play1;
import jugadores.play2;
import jugadores.play3;
import jugadores.play4;
import jugadores.play5;
import jugadores.play6;
import vistas.tablero;
/**
 *
 * @author edgar
 */
public class VESCUELA_PRIMARIA extends javax.swing.JFrame {
    ESCUELA_PRIMARIA vdat = new ESCUELA_PRIMARIA();
    tablero tab = new tablero();
    play1 pl1 = new play1();
    play2 pl2 = new play2();
    play3 pl3 = new play3();
    play4 pl4 = new play4();
    play5 pl5 = new play5();
    play6 pl6 = new play6();
    public VESCUELA_PRIMARIA() {
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
        setUndecorated(true);
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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/PRIMARIA_1.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 8, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondo2.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 240));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncomprarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncomprarMouseClicked
     if ("".equals(vdat.dueño)) {
            if (tab.cont == 1) {
                vdat.dueño = pl1.nombre;
                pl1.dinero = pl1.dinero - vdat.precio;
                tab.dinero.setText(String.valueOf(pl1.dinero));
                JOptionPane.showMessageDialog(null, "VENDIDO");
                dispose();
            } else if (tab.cont == 2) {
                vdat.dueño = pl2.nombre;
                pl2.dinero = pl2.dinero - vdat.precio;
                tab.dinero2.setText(String.valueOf(pl2.dinero));
                JOptionPane.showMessageDialog(null, "VENDIDO");
                dispose();

            } else if (tab.cont == 3) {
                vdat.dueño = pl3.nombre;
                pl3.dinero = pl3.dinero - vdat.precio;
                tab.dinero3.setText(String.valueOf(pl3.dinero));
                JOptionPane.showMessageDialog(null, "VENDIDO");
                dispose();

            } else if (tab.cont == 4) {
                vdat.dueño = pl4.nombre;
                pl4.dinero = pl4.dinero - vdat.precio;
                tab.dinero4.setText(String.valueOf(pl4.dinero));
                JOptionPane.showMessageDialog(null, "VENDIDO");

                dispose();

            } else if (tab.cont == 5) {
                vdat.dueño = pl5.nombre;
                pl5.dinero = pl5.dinero - vdat.precio;
                tab.dinero5.setText(String.valueOf(pl5.dinero));
                JOptionPane.showMessageDialog(null, "VENDIDO");
                dispose();

            } else if (tab.cont == 6) {
                vdat.dueño = pl6.nombre;
                pl6.dinero = pl6.dinero - vdat.precio;
                tab.dinero6.setText(String.valueOf(pl6.dinero));
                JOptionPane.showMessageDialog(null, "VENDIDO");
                dispose();

            }

        }
    }//GEN-LAST:event_btncomprarMouseClicked

    private void btnsubastarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsubastarMouseClicked
        btncomprar.setVisible(false);
        btnsaltar.setVisible(false);
        btnsubastar.setVisible(false);
        btnaceptar.setVisible(true);
        nombres.setVisible(true);
    }//GEN-LAST:event_btnsubastarMouseClicked

    private void btnsaltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsaltarMouseClicked
       dispose();
    }//GEN-LAST:event_btnsaltarMouseClicked

    private void btnaceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnaceptarMouseClicked
        JOptionPane.showMessageDialog(null, "comprar");
       dispose();
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
            java.util.logging.Logger.getLogger(VESCUELA_PRIMARIA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VESCUELA_PRIMARIA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VESCUELA_PRIMARIA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VESCUELA_PRIMARIA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VESCUELA_PRIMARIA().setVisible(true);
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
