/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;


import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import jugadores.play1;
import jugadores.play2;
import jugadores.play3;
import jugadores.play4;
import jugadores.play5;
import jugadores.play6;

/**
 *
 * @author edgar
 */
public class inicio extends javax.swing.JFrame {

    tablero tab = new tablero();
    play1 pl1 = new play1();
    play2 pl2 = new play2();
    play3 pl3 = new play3();
    play4 pl4 = new play4();
    play5 pl5 = new play5();
    play6 pl6 = new play6();
    int contador = 1;

    /**
     * Creates new form inicio
     */
    public inicio() {
        initComponents();
        this.setLocationRelativeTo(null);
        cajanombre.setBackground(new java.awt.Color(0, 0, 0, 1));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cajanombre = new javax.swing.JTextField();
        txtjugador2 = new javax.swing.JLabel();
        btnagregar = new javax.swing.JLabel();
        btniniciar = new javax.swing.JLabel();
        txtjugador3 = new javax.swing.JLabel();
        txtjugador4 = new javax.swing.JLabel();
        txtjugador5 = new javax.swing.JLabel();
        txtjugador6 = new javax.swing.JLabel();
        txtjugador1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cajanombre.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        cajanombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cajanombre.setBorder(null);
        cajanombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cajanombreKeyPressed(evt);
            }
        });
        getContentPane().add(cajanombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 165, 20));

        txtjugador2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        getContentPane().add(txtjugador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        btnagregar.setFont(new java.awt.Font("it font", 0, 27)); // NOI18N
        btnagregar.setForeground(new java.awt.Color(255, 255, 255));
        btnagregar.setText("Agregar");
        btnagregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnagregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnagregarMouseClicked(evt);
            }
        });
        getContentPane().add(btnagregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, -1, -1));

        btniniciar.setFont(new java.awt.Font("it font", 0, 36)); // NOI18N
        btniniciar.setForeground(new java.awt.Color(255, 255, 255));
        btniniciar.setText("INICIAR");
        btniniciar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btniniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btniniciarMouseClicked(evt);
            }
        });
        getContentPane().add(btniniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 430, -1, -1));

        txtjugador3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        getContentPane().add(txtjugador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));

        txtjugador4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        getContentPane().add(txtjugador4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, -1, -1));

        txtjugador5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        getContentPane().add(txtjugador5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, -1, -1));

        txtjugador6.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        getContentPane().add(txtjugador6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, -1, -1));

        txtjugador1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        getContentPane().add(txtjugador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        jLabel2.setFont(new java.awt.Font("it font", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre del jugador");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondo_login.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cajanombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajanombreKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            agregar();
        }
    }//GEN-LAST:event_cajanombreKeyPressed

    private void btnagregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnagregarMouseClicked
        agregar();
    }//GEN-LAST:event_btnagregarMouseClicked

    private void btniniciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btniniciarMouseClicked
        //minimo de jugadores
        tab.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btniniciarMouseClicked

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
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnagregar;
    private javax.swing.JLabel btniniciar;
    private javax.swing.JTextField cajanombre;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel txtjugador1;
    private javax.swing.JLabel txtjugador2;
    private javax.swing.JLabel txtjugador3;
    private javax.swing.JLabel txtjugador4;
    private javax.swing.JLabel txtjugador5;
    private javax.swing.JLabel txtjugador6;
    // End of variables declaration//GEN-END:variables

    void agregar() {
        if (!"".equals(cajanombre.getText())) {
            if (contador == 1) {
                pl1.nombre = cajanombre.getText();
                txtjugador1.setText("1. " + cajanombre.getText());
                cajanombre.setText("");
                contador += 1;
                System.out.println(pl1.nombre);

            } else if (contador == 2) {
                pl2.nombre = cajanombre.getText();
                txtjugador2.setText("2. " + cajanombre.getText());
                cajanombre.setText("");
                contador += 1;
                System.out.println(pl2.nombre);
            } else if (contador == 3) {
                pl3.nombre = cajanombre.getText();
                txtjugador3.setText("3. " + cajanombre.getText());
                cajanombre.setText("");
                contador += 1;
                System.out.println(pl3.nombre);
            } else if (contador == 4) {
                pl4.nombre = cajanombre.getText();
                txtjugador4.setText("4. " + cajanombre.getText());
                cajanombre.setText("");
                contador += 1;
                System.out.println(pl4.nombre);
            } else if (contador == 5) {
                pl5.nombre = cajanombre.getText();
                txtjugador5.setText("5. " + cajanombre.getText());
                cajanombre.setText("");
                contador += 1;
                System.out.println(pl5.nombre);
            } else if (contador == 6) {
                pl6.nombre = cajanombre.getText();
                txtjugador6.setText("6. " + cajanombre.getText());
                cajanombre.setText("");
                contador += 1;
                System.out.println(pl5.nombre);
            } else {
                JOptionPane.showMessageDialog(null, "Lo siento, solo se adminten 6 jugadores");
                cajanombre.setText("");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese un nombre");
        }
    }
}
