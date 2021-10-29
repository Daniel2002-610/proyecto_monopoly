package vistas;

import clases_tarjetas.CALLE_JACKSON;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.*;
import javax.swing.plaf.ColorUIResource;
import jugadores.play1;
import jugadores.play2;
import jugadores.play3;
import jugadores.play4;
import jugadores.play5;
import jugadores.play6;
import tarjetas_compras.VBAR_BLACK_SPOT;
import tarjetas_compras.VBAR_FALCON;
import tarjetas_compras.VBIBLIOTECA_PUBLICA;
import tarjetas_compras.VCALLE_JACKSON;
import tarjetas_compras.VCALLE_TURNER;
import tarjetas_compras.VCALLE_WITCHMAN;
import tarjetas_compras.VCASA_CLUB;
import tarjetas_compras.VCASA_DE_HUESPEDES;
import tarjetas_compras.VCASA_DE_LA_RISA;
import tarjetas_compras.VCASA_NEIBOLT;
import tarjetas_compras.VCENTRO_COMERCIAL;
import tarjetas_compras.VCINE_CAPITOL;
import tarjetas_compras.VESCUELA_PRIMARIA;
import tarjetas_compras.VESCUELA_SECUNDARIA;
import tarjetas_compras.VFARMACIA_KEENE;
import tarjetas_compras.VIGLESIA_BAUTISTA;
import tarjetas_compras.VLA_CANTERA;
import tarjetas_compras.VLA_CASA_ANTIGUA;
import tarjetas_compras.VLOS_BALDÍOS;
import tarjetas_compras.VPARQUE_BASSEY;
import tarjetas_compras.VPARQUE_MEMORIAL;
import tarjetas_compras.VPARQUE_STRAWFORD;
import tarjetas_compras.VPUENTE_DE_LOS_BESOS;
import tarjetas_compras.VREPRESA;
import tarjetas_compras.VRESTAURANTE_JADE;
import tarjetas_compras.VTEATRO_ALADDIN;
import tarjetas_compras.VTIENDA_COSTELLO;
import tarjetas_compras.vTERMINAL_DE_BUSES;

/**
 *
 * @author edgar
 */
public class tablero extends javax.swing.JFrame {

    
    play1 pl1 = new play1();
    play2 pl2 = new play2();
    play3 pl3 = new play3();
    play4 pl4 = new play4();
    play5 pl5 = new play5();
    play6 pl6 = new play6();

    Random random = new Random();
    String comboj1, comboj2;
    public static int cont = 1;
    int dato, jugador1 = 1, jugador2 = 1, jugador3 = 1, jugador4 = 1, jugador5 = 1, jugador6 = 1;

    public tablero() {
        initComponents();
        this.setLocationRelativeTo(null);
        lbconta.setText(String.valueOf(cont));
        v1.setVisible(false);
        v2.setVisible(false);
        v3.setVisible(false);
        v4.setVisible(false);
        v5.setVisible(false);
        v6.setVisible(false);
        btnj1.setVisible(false);
        btnj2.setVisible(false);
        btnj3.setVisible(false);
        btnj4.setVisible(false);
        btnj5.setVisible(false);
        btnj6.setVisible(false);
      //  dinero11.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        turno = new javax.swing.JLabel();
        dinero6 = new javax.swing.JLabel();
        dinero5 = new javax.swing.JLabel();
        dinero4 = new javax.swing.JLabel();
        dinero3 = new javax.swing.JLabel();
        dinero2 = new javax.swing.JLabel();
        player6 = new javax.swing.JLabel();
        dinero = new javax.swing.JLabel();
        player5 = new javax.swing.JLabel();
        player4 = new javax.swing.JLabel();
        player3 = new javax.swing.JLabel();
        btnj4 = new javax.swing.JButton();
        btnj5 = new javax.swing.JButton();
        btnj6 = new javax.swing.JButton();
        player2 = new javax.swing.JLabel();
        player = new javax.swing.JLabel();
        lbconta = new javax.swing.JLabel();
        btnj3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        ficha_3 = new javax.swing.JLabel();
        ficha_2 = new javax.swing.JLabel();
        ficha_4 = new javax.swing.JLabel();
        ficha_6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        ficha_1 = new javax.swing.JLabel();
        btnj1 = new javax.swing.JButton();
        btnj2 = new javax.swing.JButton();
        ficha_5 = new javax.swing.JLabel();
        tablero = new javax.swing.JLabel();
        num = new javax.swing.JLabel();
        v3 = new javax.swing.JLabel();
        v2 = new javax.swing.JLabel();
        v1 = new javax.swing.JLabel();
        v5 = new javax.swing.JLabel();
        v4 = new javax.swing.JLabel();
        v6 = new javax.swing.JLabel();
        btn_mini = new javax.swing.JLabel();
        btn_cerrar = new javax.swing.JLabel();
        caja = new javax.swing.JTextField();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 0, 255));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        turno.setForeground(new java.awt.Color(255, 255, 255));
        turno.setText("jLabel1");
        getContentPane().add(turno, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, -1, -1));

        dinero6.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        dinero6.setForeground(new java.awt.Color(0, 0, 0));
        dinero6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(dinero6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1176, 635, 130, 20));

        dinero5.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        dinero5.setForeground(new java.awt.Color(0, 0, 0));
        dinero5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        dinero5.setText("          ");
        getContentPane().add(dinero5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1176, 475, 130, 20));

        dinero4.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        dinero4.setForeground(new java.awt.Color(0, 0, 0));
        dinero4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(dinero4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1176, 305, 130, 20));

        dinero3.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        dinero3.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(dinero3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 640, 130, 20));

        dinero2.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        dinero2.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(dinero2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 480, 130, 20));

        player6.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        player6.setForeground(new java.awt.Color(255, 255, 255));
        player6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(player6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 610, 150, 20));

        dinero.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        dinero.setForeground(new java.awt.Color(0, 0, 0));
        dinero.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dinero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dineroMouseClicked(evt);
            }
        });
        getContentPane().add(dinero, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 130, 20));

        player5.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        player5.setForeground(new java.awt.Color(255, 255, 255));
        player5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(player5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 450, 150, 20));

        player4.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        player4.setForeground(new java.awt.Color(255, 255, 255));
        player4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(player4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 280, 150, 20));

        player3.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        player3.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(player3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 610, 150, 20));

        btnj4.setText("j4");
        btnj4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnj4MouseClicked(evt);
            }
        });
        btnj4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnj4ActionPerformed(evt);
            }
        });
        getContentPane().add(btnj4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 140, 60, -1));

        btnj5.setText("j5");
        btnj5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnj5MouseClicked(evt);
            }
        });
        btnj5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnj5ActionPerformed(evt);
            }
        });
        getContentPane().add(btnj5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 90, 60, -1));

        btnj6.setText("j6");
        btnj6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnj6MouseClicked(evt);
            }
        });
        btnj6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnj6ActionPerformed(evt);
            }
        });
        getContentPane().add(btnj6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 30, 60, -1));

        player2.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        player2.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(player2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, 150, 20));

        player.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        player.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(player, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 150, 20));

        lbconta.setForeground(new java.awt.Color(255, 255, 255));
        lbconta.setText("jLabel1");
        getContentPane().add(lbconta, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, -1, -1));

        btnj3.setText("j3");
        btnj3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnj3MouseClicked(evt);
            }
        });
        btnj3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnj3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnj3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 140, 60, -1));

        jButton2.setText("iniciar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, -1, -1));

        ficha_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/ficha3.png"))); // NOI18N
        getContentPane().add(ficha_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 645, -1, -1));

        ficha_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/ficha2.png"))); // NOI18N
        getContentPane().add(ficha_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 620, -1, -1));

        ficha_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/ficha4.png"))); // NOI18N
        getContentPane().add(ficha_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 645, -1, -1));

        ficha_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/ficha6.png"))); // NOI18N
        getContentPane().add(ficha_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 670, -1, -1));

        jButton1.setText("jButton1");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, -1, -1));

        ficha_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/ficha1.png"))); // NOI18N
        getContentPane().add(ficha_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 620, -1, -1));

        btnj1.setText("j1");
        btnj1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnj1MouseClicked(evt);
            }
        });
        btnj1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnj1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnj1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 30, 60, -1));

        btnj2.setText("j2");
        btnj2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnj2MouseClicked(evt);
            }
        });
        btnj2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnj2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnj2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 90, 60, -1));

        ficha_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/ficha5.png"))); // NOI18N
        getContentPane().add(ficha_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 670, -1, -1));

        tablero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/tablero.jpg"))); // NOI18N
        getContentPane().add(tablero, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, -1, -1));

        num.setForeground(new java.awt.Color(255, 255, 255));
        num.setText("jLabel1");
        getContentPane().add(num, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, -1, -1));

        v3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/punteorojo.png"))); // NOI18N
        getContentPane().add(v3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 525, 310, 140));

        v2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/punteolila.png"))); // NOI18N
        getContentPane().add(v2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 365, 310, 140));

        v1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/punteoceleste.png"))); // NOI18N
        getContentPane().add(v1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 195, 310, 140));

        v5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/punteonaranja.png"))); // NOI18N
        getContentPane().add(v5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 365, 290, 140));

        v4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/punteomorado.png"))); // NOI18N
        getContentPane().add(v4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 195, 310, 140));

        v6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/punteorosa.png"))); // NOI18N
        getContentPane().add(v6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 525, 290, 140));

        btn_mini.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/boton_minimizar.png"))); // NOI18N
        btn_mini.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_mini.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_miniMouseClicked(evt);
            }
        });
        btn_mini.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_miniKeyPressed(evt);
            }
        });
        getContentPane().add(btn_mini, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 5, -1, -1));

        btn_cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/boton_cerrar.png"))); // NOI18N
        btn_cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_cerrarMouseClicked(evt);
            }
        });
        getContentPane().add(btn_cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1328, 5, -1, -1));
        getContentPane().add(caja, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 80, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondo.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btn_cerrarMouseClicked

    private void btn_miniKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_miniKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_miniKeyPressed

    private void btn_miniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_miniMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_btn_miniMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        inicio();
        turno.setText(pl1.nombre);
        dinero.setText(String.valueOf(pl1.dinero));


    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnj1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnj1ActionPerformed

    }//GEN-LAST:event_btnj1ActionPerformed

    private void btnj2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnj2ActionPerformed

    }//GEN-LAST:event_btnj2ActionPerformed

    private void btnj3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnj3ActionPerformed

    }//GEN-LAST:event_btnj3ActionPerformed

    private void btnj4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnj4ActionPerformed

    }//GEN-LAST:event_btnj4ActionPerformed

    private void btnj5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnj5ActionPerformed

    }//GEN-LAST:event_btnj5ActionPerformed

    private void btnj6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnj6ActionPerformed

    }//GEN-LAST:event_btnj6ActionPerformed

    private void btnj1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnj1MouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) {
            if (cont == 1) {
                dato = (int) Math.floor(Math.random() * 12 + 1);
                num.setText(String.valueOf(dato));
                jugador1 += dato;
                JOptionPane.showMessageDialog(null, dato);
                pasoj1();
            }
        }
        if (evt.getButton() == MouseEvent.BUTTON3) {
            turno();
        }
    }//GEN-LAST:event_btnj1MouseClicked

    private void btnj2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnj2MouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) {
            if (cont == 1) {
                dato = (int) Math.floor(Math.random() * 12 + 1);
                num.setText(String.valueOf(dato));
                jugador1 += dato;
                JOptionPane.showMessageDialog(null, dato);
                pasoj1();
                pasoj2();
            } else if (cont == 2) {
                dato = (int) Math.floor(Math.random() * 12 + 1);
                num.setText(String.valueOf(dato));
                jugador2 += dato;
                JOptionPane.showMessageDialog(null, dato);
                pasoj2();
                pasoj1();
            }
        }
        if (evt.getButton() == MouseEvent.BUTTON3) {
            turno();
        }
    }//GEN-LAST:event_btnj2MouseClicked

    private void btnj3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnj3MouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) {
            if (cont == 1) {
                dato = (int) Math.floor(Math.random() * 12 + 1);
                num.setText(String.valueOf(dato));
                jugador1 += dato;
                JOptionPane.showMessageDialog(null, dato);
                pasoj1();
                pasoj2();
                pasoj3();
            } else if (cont == 2) {
                dato = (int) Math.floor(Math.random() * 12 + 1);
                num.setText(String.valueOf(dato));
                jugador2 += dato;
                JOptionPane.showMessageDialog(null, dato);
                pasoj2();
                pasoj3();
                pasoj1();
            } else if (cont == 3) {
                dato = (int) Math.floor(Math.random() * 12 + 1);
                num.setText(String.valueOf(dato));
                jugador3 += dato;
                JOptionPane.showMessageDialog(null, dato);
                pasoj3();
                pasoj2();
                pasoj1();
            }
        }
        if (evt.getButton() == MouseEvent.BUTTON3) {
            turno();
        }
    }//GEN-LAST:event_btnj3MouseClicked

    private void btnj6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnj6MouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) {
            if (cont == 1) {
                dato = (int) Math.floor(Math.random() * 12 + 1);
                num.setText(String.valueOf(dato));
                jugador1 += dato;
                JOptionPane.showMessageDialog(null, dato);
                pasoj1();
                pasoj2();
                pasoj3();
                pasoj4();
                pasoj5();
                pasoj6();
            } else if (cont == 2) {
                dato = (int) Math.floor(Math.random() * 12 + 1);
                num.setText(String.valueOf(dato));
                jugador2 += dato;
                JOptionPane.showMessageDialog(null, dato);
                pasoj2();
                pasoj6();
                pasoj5();
                pasoj4();
                pasoj3();
                pasoj1();
            } else if (cont == 3) {
                dato = (int) Math.floor(Math.random() * 12 + 1);
                num.setText(String.valueOf(dato));
                jugador3 += dato;
                JOptionPane.showMessageDialog(null, dato);
                pasoj3();
                pasoj6();
                pasoj5();
                pasoj4();
                pasoj2();
                pasoj1();
            } else if (cont == 4) {
                dato = (int) Math.floor(Math.random() * 12 + 1);
                num.setText(String.valueOf(dato));
                jugador4 += dato;
                JOptionPane.showMessageDialog(null, dato);
                pasoj4();
                pasoj6();
                pasoj5();
                pasoj3();
                pasoj2();
                pasoj1();
            } else if (cont == 5) {
                dato = (int) Math.floor(Math.random() * 12 + 1);
                num.setText(String.valueOf(dato));
                jugador5 += dato;
                JOptionPane.showMessageDialog(null, dato);
                pasoj5();
                pasoj6();
                pasoj4();
                pasoj3();
                pasoj2();
                pasoj1();
            } else if (cont == 6) {
                dato = (int) Math.floor(Math.random() * 12 + 1);
                num.setText(String.valueOf(dato));
                jugador6 += dato;
                JOptionPane.showMessageDialog(null, dato);
                pasoj6();
                pasoj5();
                pasoj4();
                pasoj3();
                pasoj2();
                pasoj1();
            }
        }
        if (evt.getButton() == MouseEvent.BUTTON3) {
            turno();
        }
    }//GEN-LAST:event_btnj6MouseClicked

    private void btnj5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnj5MouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) {
            if (cont == 1) {
                dato = (int) Math.floor(Math.random() * 12 + 1);
                num.setText(String.valueOf(dato));
                jugador1 += dato;
                JOptionPane.showMessageDialog(null, dato);
                pasoj1();
                pasoj2();
                pasoj3();
                pasoj4();
                pasoj5();
            } else if (cont == 2) {
                dato = (int) Math.floor(Math.random() * 12 + 1);
                num.setText(String.valueOf(dato));
                jugador2 += dato;
                JOptionPane.showMessageDialog(null, dato);
                pasoj2();
                pasoj5();
                pasoj4();
                pasoj3();
                pasoj1();
            } else if (cont == 3) {
                dato = (int) Math.floor(Math.random() * 12 + 1);
                num.setText(String.valueOf(dato));
                jugador3 += dato;
                JOptionPane.showMessageDialog(null, dato);
                pasoj3();
                pasoj5();
                pasoj4();
                pasoj2();
                pasoj1();
            } else if (cont == 4) {
                dato = (int) Math.floor(Math.random() * 12 + 1);
                num.setText(String.valueOf(dato));
                jugador4 += dato;
                JOptionPane.showMessageDialog(null, dato);
                pasoj4();
                pasoj5();
                pasoj3();
                pasoj2();
                pasoj1();
            } else if (cont == 5) {
                dato = (int) Math.floor(Math.random() * 12 + 1);
                num.setText(String.valueOf(dato));
                jugador5 += dato;
                JOptionPane.showMessageDialog(null, dato);
                pasoj5();
                pasoj4();
                pasoj3();
                pasoj2();
                pasoj1();
            }
        }
        if (evt.getButton() == MouseEvent.BUTTON3) {
            turno();
        }
    }//GEN-LAST:event_btnj5MouseClicked

    private void btnj4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnj4MouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) {
            if (cont == 1) {
                dato = (int) Math.floor(Math.random() * 12 + 1);
                num.setText(String.valueOf(dato));
                jugador1 += dato;
                JOptionPane.showMessageDialog(null, dato);
                pasoj1();
                pasoj2();
                pasoj3();
                pasoj4();
            } else if (cont == 2) {
                dato = (int) Math.floor(Math.random() * 12 + 1);
                num.setText(String.valueOf(dato));
                jugador2 += dato;
                JOptionPane.showMessageDialog(null, dato);
                pasoj2();
                pasoj4();
                pasoj3();
                pasoj1();
            } else if (cont == 3) {
                dato = (int) Math.floor(Math.random() * 12 + 1);
                num.setText(String.valueOf(dato));
                jugador3 += dato;
                JOptionPane.showMessageDialog(null, dato);
                pasoj3();
                pasoj4();
                pasoj2();
                pasoj1();
            } else if (cont == 4) {
                dato = (int) Math.floor(Math.random() * 12 + 1);
                num.setText(String.valueOf(dato));
                jugador4 += dato;
                JOptionPane.showMessageDialog(null, dato);
                pasoj4();
                pasoj3();
                pasoj2();
                pasoj1();
            }
        }
        if (evt.getButton() == MouseEvent.BUTTON3) {
            turno();
        }
    }//GEN-LAST:event_btnj4MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jugador2++;
        pasoj2();
        verificarj2();
              
    }//GEN-LAST:event_jButton1ActionPerformed

    private void dineroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dineroMouseClicked
      dinero.setText(String.valueOf(pl1.dinero));
        JOptionPane.showMessageDialog(null, pl1.dinero);
    }//GEN-LAST:event_dineroMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tablero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_cerrar;
    private javax.swing.JLabel btn_mini;
    private javax.swing.JButton btnj1;
    private javax.swing.JButton btnj2;
    private javax.swing.JButton btnj3;
    private javax.swing.JButton btnj4;
    private javax.swing.JButton btnj5;
    private javax.swing.JButton btnj6;
    private javax.swing.JTextField caja;
    public static javax.swing.JLabel dinero;
    public static javax.swing.JLabel dinero2;
    public static javax.swing.JLabel dinero3;
    public static javax.swing.JLabel dinero4;
    public static javax.swing.JLabel dinero5;
    public static javax.swing.JLabel dinero6;
    private javax.swing.JLabel ficha_1;
    private javax.swing.JLabel ficha_2;
    private javax.swing.JLabel ficha_3;
    private javax.swing.JLabel ficha_4;
    private javax.swing.JLabel ficha_5;
    private javax.swing.JLabel ficha_6;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    public static javax.swing.JLabel lbconta;
    public static javax.swing.JLabel num;
    public static javax.swing.JLabel player;
    public static javax.swing.JLabel player2;
    public static javax.swing.JLabel player3;
    public static javax.swing.JLabel player4;
    public static javax.swing.JLabel player5;
    public static javax.swing.JLabel player6;
    private javax.swing.JLabel tablero;
    public static javax.swing.JLabel turno;
    private javax.swing.JLabel v1;
    private javax.swing.JLabel v2;
    private javax.swing.JLabel v3;
    private javax.swing.JLabel v4;
    private javax.swing.JLabel v5;
    private javax.swing.JLabel v6;
    // End of variables declaration//GEN-END:variables

    void turno() {
        if (!"".equals(player.getText())) {
            if (cont == 1) {
                turno.setText(pl1.nombre);
                cont = 1;
                lbconta.setText(String.valueOf(cont));
            }
        }
        if (!"".equals(player.getText()) && !"".equals(player2.getText())) {
            if (cont == 1) {
                turno.setText(pl2.nombre);
                cont = 2;
                lbconta.setText(String.valueOf(cont));
            } else if (cont == 2) {
                turno.setText(pl3.nombre);
                cont = 1;
                lbconta.setText(String.valueOf(cont));
            }
        }
        if (!"".equals(player.getText()) && !"".equals(player2.getText()) && !"".equals(player3.getText())) {
            if (cont == 1) {
                turno.setText(pl2.nombre);
                cont = 2;
                lbconta.setText(String.valueOf(cont));
            } else if (cont == 2) {
                turno.setText(pl3.nombre);
                cont = 3;
                lbconta.setText(String.valueOf(cont));
            } else if (cont == 3) {
                turno.setText(pl4.nombre);
                cont = 1;
                lbconta.setText(String.valueOf(cont));
            }
        }
        if (!"".equals(player.getText()) && !"".equals(player2.getText()) && !"".equals(player3.getText()) && !"".equals(player4.getText())) {
            if (cont == 1) {
                turno.setText(pl2.nombre);
                cont = 2;
                lbconta.setText(String.valueOf(cont));
            } else if (cont == 2) {
                turno.setText(pl3.nombre);
                cont = 3;
                lbconta.setText(String.valueOf(cont));
            } else if (cont == 3) {
                turno.setText(pl4.nombre);
                cont = 4;
                lbconta.setText(String.valueOf(cont));
            } else if (cont == 4) {
                turno.setText(pl5.nombre);
                cont = 1;
                lbconta.setText(String.valueOf(cont));
            }
        }
        if (!"".equals(player.getText()) && !"".equals(player2.getText()) && !"".equals(player3.getText()) && !"".equals(player4.getText()) && !"".equals(player5.getText())) {
            if (cont == 1) {
                turno.setText(pl2.nombre);
                cont = 2;
                lbconta.setText(String.valueOf(cont));
            } else if (cont == 2) {
                turno.setText(pl3.nombre);
                cont = 3;
                lbconta.setText(String.valueOf(cont));
            } else if (cont == 3) {
                turno.setText(pl4.nombre);
                cont = 4;
                lbconta.setText(String.valueOf(cont));
            } else if (cont == 4) {
                turno.setText(pl5.nombre);
                cont = 5;
                lbconta.setText(String.valueOf(cont));
            } else if (cont == 5) {
                turno.setText(pl6.nombre);
                cont = 1;
                lbconta.setText(String.valueOf(cont));
            }
        }
        if (!"".equals(player.getText()) && !"".equals(player2.getText()) && !"".equals(player3.getText()) && !"".equals(player4.getText()) && !"".equals(player5.getText()) && !"".equals(player6.getText())) {
            if (cont == 1) {
                turno.setText(pl2.nombre);
                cont = 2;
                lbconta.setText(String.valueOf(cont));
            } else if (cont == 2) {
                turno.setText(pl3.nombre);
                cont = 3;
                lbconta.setText(String.valueOf(cont));
            } else if (cont == 3) {
                turno.setText(pl4.nombre);
                cont = 4;
                lbconta.setText(String.valueOf(cont));
            } else if (cont == 4) {
                turno.setText(pl5.nombre);
                cont = 5;
                lbconta.setText(String.valueOf(cont));
            } else if (cont == 5) {
                turno.setText(pl6.nombre);
                cont = 6;
                lbconta.setText(String.valueOf(cont));
            } else if (cont == 6) {
                turno.setText(pl1.nombre);
                cont = 1;
                lbconta.setText(String.valueOf(cont));
            }

        }
    }

    void inicio() {
        player.setText(pl1.nombre);
        player2.setText(pl2.nombre);
        player3.setText(pl3.nombre);
        player4.setText(pl4.nombre);
        player5.setText(pl5.nombre);
        player6.setText(pl6.nombre);

        if (!"".equals(player.getText())) {
            dinero.setText(String.valueOf(pl1.dinero));
            v1.setVisible(true);
            btnj1.setVisible(true);
        }
        if (!"".equals(player.getText()) && !"".equals(player2.getText())) {
            dinero.setText(String.valueOf(pl1.dinero));
            v1.setVisible(true);
            btnj1.setVisible(false);
            dinero2.setText(String.valueOf(pl2.dinero));
            v2.setVisible(true);
            btnj2.setVisible(true);
        }
        if (!"".equals(player.getText()) && !"".equals(player2.getText()) && !"".equals(player3.getText())) {
            dinero.setText(String.valueOf(pl1.dinero));
            v1.setVisible(true);
            btnj1.setVisible(false);
            dinero2.setText(String.valueOf(pl2.dinero));
            v2.setVisible(true);
            btnj2.setVisible(false);
            dinero3.setText(String.valueOf(pl3.dinero));
            v3.setVisible(true);
            btnj3.setVisible(true);
        }
        if (!"".equals(player.getText()) && !"".equals(player2.getText()) && !"".equals(player3.getText()) && !"".equals(player4.getText())) {
            dinero.setText(String.valueOf(pl1.dinero));
            v1.setVisible(true);
            btnj1.setVisible(false);
            dinero2.setText(String.valueOf(pl2.dinero));
            v2.setVisible(true);
            btnj2.setVisible(false);
            dinero3.setText(String.valueOf(pl3.dinero));
            v3.setVisible(true);
            btnj3.setVisible(false);
            dinero4.setText(String.valueOf(pl4.dinero));
            v4.setVisible(true);
            btnj4.setVisible(true);
        }
        if (!"".equals(player.getText()) && !"".equals(player2.getText()) && !"".equals(player3.getText()) && !"".equals(player4.getText()) && !"".equals(player5.getText())) {
            dinero.setText(String.valueOf(pl1.dinero));
            v1.setVisible(true);
            btnj1.setVisible(false);
            dinero2.setText(String.valueOf(pl2.dinero));
            v2.setVisible(true);
            btnj2.setVisible(false);
            dinero3.setText(String.valueOf(pl3.dinero));
            v3.setVisible(true);
            btnj3.setVisible(false);
            dinero4.setText(String.valueOf(pl4.dinero));
            v4.setVisible(true);
            btnj4.setVisible(false);
            dinero5.setText(String.valueOf(pl5.dinero));
            v5.setVisible(true);
            btnj5.setVisible(true);
        }
        if (!"".equals(player.getText()) && !"".equals(player2.getText()) && !"".equals(player3.getText()) && !"".equals(player4.getText()) && !"".equals(player5.getText()) && !"".equals(player6.getText())) {
            dinero.setText(String.valueOf(pl1.dinero));
            v1.setVisible(true);
            btnj1.setVisible(false);
            dinero2.setText(String.valueOf(pl2.dinero));
            v2.setVisible(true);
            btnj2.setVisible(false);
            dinero3.setText(String.valueOf(pl3.dinero));
            v3.setVisible(true);
            btnj3.setVisible(false);
            dinero4.setText(String.valueOf(pl4.dinero));
            v4.setVisible(true);
            btnj4.setVisible(false);
            dinero5.setText(String.valueOf(pl5.dinero));
            v5.setVisible(true);
            btnj5.setVisible(false);
            dinero6.setText(String.valueOf(pl6.dinero));
            v6.setVisible(true);
            btnj6.setVisible(true);
        }

    }

    void pasoj1() {
        if (jugador1 == 1) {
            ficha_1.setLocation(980, 620);

        } else if (jugador1 == 2) {
            ficha_1.setLocation(913, 620);
        } else if (jugador1 == 3) {
            ficha_1.setLocation(859, 620);
        } else if (jugador1 == 4) {
            ficha_1.setLocation(803, 620);
        } else if (jugador1 == 5) {
            ficha_1.setLocation(749, 620);
        } else if (jugador1 == 6) {
            ficha_1.setLocation(695, 620);
        } else if (jugador1 == 7) {
            ficha_1.setLocation(639, 620);
        } else if (jugador1 == 8) {
            ficha_1.setLocation(585, 620);
        } else if (jugador1 == 9) {
            ficha_1.setLocation(529, 620);
        } else if (jugador1 == 10) {
            ficha_1.setLocation(474, 620);
        } else if (jugador1 == 11) {
            ficha_1.setLocation(390, 620);
        } else if (jugador1 == 12) {
            ficha_1.setLocation(430, 578);
        } else if (jugador1 == 13) {
            ficha_1.setLocation(430, 525);
        } else if (jugador1 == 14) {
            ficha_1.setLocation(430, 470);
        } else if (jugador1 == 15) {
            ficha_1.setLocation(430, 415);
        } else if (jugador1 == 16) {
            ficha_1.setLocation(430, 361);
        } else if (jugador1 == 17) {
            ficha_1.setLocation(430, 304);
        } else if (jugador1 == 18) {
            ficha_1.setLocation(430, 251);
        } else if (jugador1 == 19) {
            ficha_1.setLocation(430, 195);
        } else if (jugador1 == 20) {
            ficha_1.setLocation(430, 141);
        } else if (jugador1 == 21) {
            ficha_1.setLocation(390, 20);
        } else if (jugador1 == 22) {
            ficha_1.setLocation(474, 20);
        } else if (jugador1 == 23) {
            ficha_1.setLocation(530, 20);
        } else if (jugador1 == 24) {
            ficha_1.setLocation(585, 20);
        } else if (jugador1 == 25) {
            ficha_1.setLocation(640, 20);
        } else if (jugador1 == 26) {
            ficha_1.setLocation(695, 20);
        } else if (jugador1 == 27) {
            ficha_1.setLocation(749, 20);
        } else if (jugador1 == 28) {
            ficha_1.setLocation(804, 20);
        } else if (jugador1 == 29) {
            ficha_1.setLocation(859, 20);
        } else if (jugador1 == 30) {
            ficha_1.setLocation(914, 20);
        } else if (jugador1 == 31) {
            ficha_1.setLocation(980, 20);
        } else if (jugador1 == 32) {
            ficha_1.setLocation(980, 137);
        } else if (jugador1 == 33) {
            ficha_1.setLocation(980, 193);
        } else if (jugador1 == 34) {
            ficha_1.setLocation(980, 248);
        } else if (jugador1 == 35) {
            ficha_1.setLocation(980, 302);
        } else if (jugador1 == 36) {
            ficha_1.setLocation(980, 357);
        } else if (jugador1 == 37) {
            ficha_1.setLocation(980, 412);
        } else if (jugador1 == 38) {
            ficha_1.setLocation(980, 468);
        } else if (jugador1 == 39) {
            ficha_1.setLocation(980, 522);
        } else if (jugador1 == 40) {
            ficha_1.setLocation(980, 578);
        } else if (jugador1 == 41) {
            ficha_1.setLocation(980, 620);
        } else if (jugador1 == 42) {
            ficha_1.setLocation(913, 620);
        } else if (jugador1 == 43) {
            ficha_1.setLocation(859, 620);
        } else if (jugador1 == 44) {
            ficha_1.setLocation(803, 620);
        } else if (jugador1 == 45) {
            ficha_1.setLocation(749, 620);
        } else if (jugador1 == 46) {
            ficha_1.setLocation(695, 620);
        } else if (jugador1 == 47) {
            ficha_1.setLocation(639, 620);
        } else if (jugador1 == 48) {
            ficha_1.setLocation(585, 620);
        } else if (jugador1 == 49) {
            ficha_1.setLocation(529, 620);
        } else if (jugador1 == 50) {
            ficha_1.setLocation(474, 620);
        } else if (jugador1 == 51) {
            ficha_1.setLocation(390, 620);
        } else if (jugador1 == 52) {
            ficha_1.setLocation(430, 578);
        }
    }

    void pasoj2() {
        if (jugador2 == 1) {
            ficha_2.setLocation(1020, 620);
        } else if (jugador2 == 2) {
            ficha_2.setLocation(913, 645);
        } else if (jugador2 == 3) {
            ficha_2.setLocation(859, 645);
        } else if (jugador2 == 4) {
            ficha_2.setLocation(803, 645);
        } else if (jugador2 == 5) {
            ficha_2.setLocation(749, 645);
        } else if (jugador2 == 6) {
            ficha_2.setLocation(695, 645);
        } else if (jugador2 == 7) {
            ficha_2.setLocation(639, 645);
        } else if (jugador2 == 8) {
            ficha_2.setLocation(585, 645);
        } else if (jugador2 == 9) {
            ficha_2.setLocation(529, 645);
        } else if (jugador2 == 10) {
            ficha_2.setLocation(474, 645);
        } else if (jugador2 == 11) {
            ficha_2.setLocation(430, 620);
        } else if (jugador2 == 12) {
            ficha_2.setLocation(405, 578);
        } else if (jugador2 == 13) {
            ficha_2.setLocation(405, 525);
        } else if (jugador2 == 14) {
            ficha_2.setLocation(405, 470);
        } else if (jugador2 == 15) {
            ficha_2.setLocation(405, 415);
        } else if (jugador2 == 16) {
            ficha_2.setLocation(405, 361);
        } else if (jugador2 == 17) {
            ficha_2.setLocation(405, 304);
        } else if (jugador2 == 18) {
            ficha_2.setLocation(405, 251);
        } else if (jugador2 == 19) {
            ficha_2.setLocation(405, 195);
        } else if (jugador2 == 20) {
            ficha_2.setLocation(405, 141);
        } else if (jugador2 == 21) {
            ficha_2.setLocation(430, 20);
        } else if (jugador2 == 22) {
            ficha_2.setLocation(474, 45);
        } else if (jugador2 == 23) {
            ficha_2.setLocation(530, 45);
        } else if (jugador2 == 24) {
            ficha_2.setLocation(585, 45);
        } else if (jugador2 == 25) {
            ficha_2.setLocation(640, 45);
        } else if (jugador2 == 26) {
            ficha_2.setLocation(695, 45);
        } else if (jugador2 == 27) {
            ficha_2.setLocation(749, 45);
        } else if (jugador2 == 28) {
            ficha_2.setLocation(804, 45);
        } else if (jugador2 == 29) {
            ficha_2.setLocation(859, 45);
        } else if (jugador2 == 30) {
            ficha_2.setLocation(914, 45);
        } else if (jugador2 == 31) {
            ficha_2.setLocation(1020, 20);
        } else if (jugador2 == 32) {
            ficha_2.setLocation(1005, 137);
        } else if (jugador2 == 33) {
            ficha_2.setLocation(1005, 193);
        } else if (jugador2 == 34) {
            ficha_2.setLocation(1005, 248);
        } else if (jugador2 == 35) {
            ficha_2.setLocation(1005, 302);
        } else if (jugador2 == 36) {
            ficha_2.setLocation(1005, 357);
        } else if (jugador2 == 37) {
            ficha_2.setLocation(1005, 412);
        } else if (jugador2 == 38) {
            ficha_2.setLocation(1005, 468);
        } else if (jugador2 == 39) {
            ficha_2.setLocation(1005, 522);
        } else if (jugador2 == 40) {
            ficha_2.setLocation(1005, 578);
        } else if (jugador2 == 41) {
            ficha_2.setLocation(1020, 620);
        } else if (jugador2 == 42) {
            ficha_2.setLocation(913, 645);
        } else if (jugador2 == 43) {
            ficha_2.setLocation(859, 645);
        } else if (jugador2 == 44) {
            ficha_2.setLocation(803, 645);
        } else if (jugador2 == 45) {
            ficha_2.setLocation(749, 645);
        } else if (jugador2 == 46) {
            ficha_2.setLocation(695, 645);
        } else if (jugador2 == 47) {
            ficha_2.setLocation(639, 645);
        } else if (jugador2 == 48) {
            ficha_2.setLocation(585, 645);
        } else if (jugador2 == 49) {
            ficha_2.setLocation(529, 645);
        } else if (jugador2 == 50) {
            ficha_2.setLocation(474, 645);
        } else if (jugador2 == 51) {
            ficha_2.setLocation(430, 620);
        } else if (jugador2 == 52) {
            ficha_2.setLocation(405, 578);
        }

    }

    void pasoj3() {
        if (jugador3 == 1) {
            ficha_3.setLocation(980, 645);
        } else if (jugador3 == 2) {
            ficha_3.setLocation(913, 670);
        } else if (jugador3 == 3) {
            ficha_3.setLocation(859, 670);
        } else if (jugador3 == 4) {
            ficha_3.setLocation(803, 670);
        } else if (jugador3 == 5) {
            ficha_3.setLocation(749, 670);
        } else if (jugador3 == 6) {
            ficha_3.setLocation(695, 670);
        } else if (jugador3 == 7) {
            ficha_3.setLocation(639, 670);
        } else if (jugador3 == 8) {
            ficha_3.setLocation(585, 670);
        } else if (jugador3 == 9) {
            ficha_3.setLocation(529, 670);
        } else if (jugador3 == 10) {
            ficha_3.setLocation(474, 670);
        } else if (jugador3 == 11) {
            ficha_3.setLocation(390, 645);
        } else if (jugador3 == 12) {
            ficha_3.setLocation(380, 578);
        } else if (jugador3 == 13) {
            ficha_3.setLocation(380, 525);
        } else if (jugador3 == 14) {
            ficha_3.setLocation(380, 470);
        } else if (jugador3 == 15) {
            ficha_3.setLocation(380, 415);
        } else if (jugador3 == 16) {
            ficha_3.setLocation(380, 361);
        } else if (jugador3 == 17) {
            ficha_3.setLocation(380, 304);
        } else if (jugador3 == 18) {
            ficha_3.setLocation(380, 251);
        } else if (jugador3 == 19) {
            ficha_3.setLocation(380, 195);
        } else if (jugador3 == 20) {
            ficha_3.setLocation(380, 141);
        } else if (jugador3 == 21) {
            ficha_3.setLocation(390, 50);
        } else if (jugador3 == 22) {
            ficha_3.setLocation(474, 70);
        } else if (jugador3 == 23) {
            ficha_3.setLocation(530, 70);
        } else if (jugador3 == 24) {
            ficha_3.setLocation(585, 70);
        } else if (jugador3 == 25) {
            ficha_3.setLocation(640, 70);
        } else if (jugador3 == 26) {
            ficha_3.setLocation(695, 70);
        } else if (jugador3 == 27) {
            ficha_3.setLocation(749, 70);
        } else if (jugador3 == 28) {
            ficha_3.setLocation(804, 70);
        } else if (jugador3 == 29) {
            ficha_3.setLocation(859, 70);
        } else if (jugador3 == 30) {
            ficha_3.setLocation(914, 70);
        } else if (jugador3 == 31) {
            ficha_3.setLocation(980, 50);
        } else if (jugador3 == 32) {
            ficha_3.setLocation(1030, 137);
        } else if (jugador3 == 33) {
            ficha_3.setLocation(1030, 193);
        } else if (jugador3 == 34) {
            ficha_3.setLocation(1030, 248);
        } else if (jugador3 == 35) {
            ficha_3.setLocation(1030, 302);
        } else if (jugador3 == 36) {
            ficha_3.setLocation(1030, 357);
        } else if (jugador3 == 37) {
            ficha_3.setLocation(1030, 412);
        } else if (jugador3 == 38) {
            ficha_3.setLocation(1030, 468);
        } else if (jugador3 == 39) {
            ficha_3.setLocation(1030, 522);
        } else if (jugador3 == 40) {
            ficha_3.setLocation(1030, 578);
        } else if (jugador3 == 41) {
            ficha_3.setLocation(980, 645);
        } else if (jugador3 == 42) {
            ficha_3.setLocation(913, 670);
        } else if (jugador3 == 43) {
            ficha_3.setLocation(859, 670);
        } else if (jugador3 == 44) {
            ficha_3.setLocation(803, 670);
        } else if (jugador3 == 45) {
            ficha_3.setLocation(749, 670);
        } else if (jugador3 == 46) {
            ficha_3.setLocation(695, 670);
        } else if (jugador3 == 47) {
            ficha_3.setLocation(639, 670);
        } else if (jugador3 == 48) {
            ficha_3.setLocation(585, 670);
        } else if (jugador3 == 49) {
            ficha_3.setLocation(529, 670);
        } else if (jugador3 == 50) {
            ficha_3.setLocation(474, 670);
        } else if (jugador3 == 51) {
            ficha_3.setLocation(390, 645);
        } else if (jugador3 == 52) {
            ficha_3.setLocation(380, 578);
        }

    }

    void pasoj4() {
        if (jugador4 == 1) {
            ficha_4.setLocation(1020, 645);
        } else if (jugador4 == 2) {
            ficha_4.setLocation(936, 620);
        } else if (jugador4 == 3) {
            ficha_4.setLocation(882, 620);
        } else if (jugador4 == 4) {
            ficha_4.setLocation(826, 620);
        } else if (jugador4 == 5) {
            ficha_4.setLocation(772, 620);
        } else if (jugador4 == 6) {
            ficha_4.setLocation(718, 620);
        } else if (jugador4 == 7) {
            ficha_4.setLocation(662, 620);
        } else if (jugador4 == 8) {
            ficha_4.setLocation(608, 620);
        } else if (jugador4 == 9) {
            ficha_4.setLocation(552, 620);
        } else if (jugador4 == 10) {
            ficha_4.setLocation(497, 620);
        } else if (jugador4 == 11) {
            ficha_4.setLocation(430, 645);
        } else if (jugador4 == 12) {
            ficha_4.setLocation(430, 552);
        } else if (jugador4 == 13) {
            ficha_4.setLocation(430, 499);
        } else if (jugador4 == 14) {
            ficha_4.setLocation(430, 444);
        } else if (jugador4 == 15) {
            ficha_4.setLocation(430, 389);
        } else if (jugador4 == 16) {
            ficha_4.setLocation(430, 335);
        } else if (jugador4 == 17) {
            ficha_4.setLocation(430, 278);
        } else if (jugador4 == 18) {
            ficha_4.setLocation(430, 225);
        } else if (jugador4 == 19) {
            ficha_4.setLocation(430, 169);
        } else if (jugador4 == 20) {
            ficha_4.setLocation(430, 115);
        } else if (jugador4 == 21) {
            ficha_4.setLocation(430, 50);
        } else if (jugador4 == 22) {
            ficha_4.setLocation(497, 20);
        } else if (jugador4 == 23) {
            ficha_4.setLocation(553, 20);
        } else if (jugador4 == 24) {
            ficha_4.setLocation(608, 20);
        } else if (jugador4 == 25) {
            ficha_4.setLocation(663, 20);
        } else if (jugador4 == 26) {
            ficha_4.setLocation(718, 20);
        } else if (jugador4 == 27) {
            ficha_4.setLocation(772, 20);
        } else if (jugador4 == 28) {
            ficha_4.setLocation(827, 20);
        } else if (jugador4 == 29) {
            ficha_4.setLocation(882, 20);
        } else if (jugador4 == 30) {
            ficha_4.setLocation(937, 20);
        } else if (jugador4 == 31) {
            ficha_4.setLocation(1020, 50);
        } else if (jugador4 == 32) {
            ficha_4.setLocation(980, 114);
        } else if (jugador4 == 33) {
            ficha_4.setLocation(980, 167);
        } else if (jugador4 == 34) {
            ficha_4.setLocation(980, 222);
        } else if (jugador4 == 35) {
            ficha_4.setLocation(980, 276);
        } else if (jugador4 == 36) {
            ficha_4.setLocation(980, 331);
        } else if (jugador4 == 37) {
            ficha_4.setLocation(980, 386);
        } else if (jugador4 == 38) {
            ficha_4.setLocation(980, 442);
        } else if (jugador4 == 39) {
            ficha_4.setLocation(980, 496);
        } else if (jugador4 == 40) {
            ficha_4.setLocation(980, 552);
        } else if (jugador4 == 41) {
            ficha_4.setLocation(1020, 645);
        } else if (jugador4 == 42) {
            ficha_4.setLocation(936, 620);
        } else if (jugador4 == 43) {
            ficha_4.setLocation(882, 620);
        } else if (jugador4 == 44) {
            ficha_4.setLocation(826, 620);
        } else if (jugador4 == 45) {
            ficha_4.setLocation(772, 620);
        } else if (jugador4 == 46) {
            ficha_4.setLocation(718, 620);
        } else if (jugador4 == 47) {
            ficha_4.setLocation(662, 620);
        } else if (jugador4 == 48) {
            ficha_4.setLocation(608, 620);
        } else if (jugador4 == 49) {
            ficha_4.setLocation(552, 620);
        } else if (jugador4 == 50) {
            ficha_4.setLocation(497, 620);
        } else if (jugador4 == 51) {
            ficha_4.setLocation(430, 645);
        } else if (jugador4 == 52) {
            ficha_4.setLocation(430, 552);
        }
    }

    void pasoj5() {
        if (jugador5 == 1) {
            ficha_5.setLocation(980, 670);
        } else if (jugador5 == 2) {
            ficha_5.setLocation(936, 645);
        } else if (jugador5 == 3) {
            ficha_5.setLocation(882, 645);
        } else if (jugador5 == 4) {
            ficha_5.setLocation(826, 645);
        } else if (jugador5 == 5) {
            ficha_5.setLocation(772, 645);
        } else if (jugador5 == 6) {
            ficha_5.setLocation(718, 645);
        } else if (jugador5 == 7) {
            ficha_5.setLocation(662, 645);
        } else if (jugador5 == 8) {
            ficha_5.setLocation(608, 645);
        } else if (jugador5 == 9) {
            ficha_5.setLocation(552, 645);
        } else if (jugador5 == 10) {
            ficha_5.setLocation(497, 645);
        } else if (jugador5 == 11) {
            ficha_5.setLocation(390, 670);
        } else if (jugador5 == 12) {
            ficha_5.setLocation(405, 552);
        } else if (jugador5 == 13) {
            ficha_5.setLocation(405, 499);
        } else if (jugador5 == 14) {
            ficha_5.setLocation(405, 444);
        } else if (jugador5 == 15) {
            ficha_5.setLocation(405, 389);
        } else if (jugador5 == 16) {
            ficha_5.setLocation(405, 335);
        } else if (jugador5 == 17) {
            ficha_5.setLocation(405, 278);
        } else if (jugador5 == 18) {
            ficha_5.setLocation(405, 225);
        } else if (jugador5 == 19) {
            ficha_5.setLocation(405, 169);
        } else if (jugador5 == 20) {
            ficha_5.setLocation(405, 115);
        } else if (jugador5 == 21) {
            ficha_5.setLocation(390, 80);
        } else if (jugador5 == 22) {
            ficha_5.setLocation(497, 45);
        } else if (jugador5 == 23) {
            ficha_5.setLocation(553, 45);
        } else if (jugador5 == 24) {
            ficha_5.setLocation(608, 45);
        } else if (jugador5 == 25) {
            ficha_5.setLocation(663, 45);
        } else if (jugador5 == 26) {
            ficha_5.setLocation(718, 45);
        } else if (jugador5 == 27) {
            ficha_5.setLocation(772, 45);
        } else if (jugador5 == 28) {
            ficha_5.setLocation(827, 45);
        } else if (jugador5 == 29) {
            ficha_5.setLocation(882, 45);
        } else if (jugador5 == 30) {
            ficha_5.setLocation(937, 45);
        } else if (jugador5 == 31) {
            ficha_5.setLocation(980, 80);
        } else if (jugador5 == 32) {
            ficha_5.setLocation(1005, 114);
        } else if (jugador5 == 33) {
            ficha_5.setLocation(1005, 167);
        } else if (jugador5 == 34) {
            ficha_5.setLocation(1005, 222);
        } else if (jugador5 == 35) {
            ficha_5.setLocation(1005, 276);
        } else if (jugador5 == 36) {
            ficha_5.setLocation(1005, 331);
        } else if (jugador5 == 37) {
            ficha_5.setLocation(1005, 386);
        } else if (jugador5 == 38) {
            ficha_5.setLocation(1005, 442);
        } else if (jugador5 == 39) {
            ficha_5.setLocation(1005, 496);
        } else if (jugador5 == 40) {
            ficha_5.setLocation(1005, 552);
        } else if (jugador5 == 41) {
            ficha_5.setLocation(980, 670);
        } else if (jugador5 == 42) {
            ficha_5.setLocation(936, 645);
        } else if (jugador5 == 43) {
            ficha_5.setLocation(882, 645);
        } else if (jugador5 == 44) {
            ficha_5.setLocation(826, 645);
        } else if (jugador5 == 45) {
            ficha_5.setLocation(772, 645);
        } else if (jugador5 == 46) {
            ficha_5.setLocation(718, 645);
        } else if (jugador5 == 47) {
            ficha_5.setLocation(662, 645);
        } else if (jugador5 == 48) {
            ficha_5.setLocation(608, 645);
        } else if (jugador5 == 49) {
            ficha_5.setLocation(552, 645);
        } else if (jugador5 == 50) {
            ficha_5.setLocation(497, 645);
        } else if (jugador5 == 51) {
            ficha_5.setLocation(390, 670);
        } else if (jugador5 == 52) {
            ficha_5.setLocation(405, 552);
        }

    }

    void pasoj6() {
        if (jugador6 == 1) {
            ficha_6.setLocation(1020, 670);
        } else if (jugador6 == 2) {
            ficha_6.setLocation(936, 670);
        } else if (jugador6 == 3) {
            ficha_6.setLocation(882, 670);
        } else if (jugador6 == 4) {
            ficha_6.setLocation(826, 670);
        } else if (jugador6 == 5) {
            ficha_6.setLocation(772, 670);
        } else if (jugador6 == 6) {
            ficha_6.setLocation(718, 670);
        } else if (jugador6 == 7) {
            ficha_6.setLocation(662, 670);
        } else if (jugador6 == 8) {
            ficha_6.setLocation(608, 670);
        } else if (jugador6 == 9) {
            ficha_6.setLocation(552, 670);
        } else if (jugador6 == 10) {
            ficha_6.setLocation(497, 670);
        } else if (jugador6 == 11) {
            ficha_6.setLocation(430, 670);
        } else if (jugador6 == 12) {
            ficha_6.setLocation(380, 552);
        } else if (jugador6 == 13) {
            ficha_6.setLocation(380, 499);
        } else if (jugador6 == 14) {
            ficha_6.setLocation(380, 444);
        } else if (jugador6 == 15) {
            ficha_6.setLocation(380, 389);
        } else if (jugador6 == 16) {
            ficha_6.setLocation(380, 335);
        } else if (jugador6 == 17) {
            ficha_6.setLocation(380, 278);
        } else if (jugador6 == 18) {
            ficha_6.setLocation(380, 225);
        } else if (jugador6 == 19) {
            ficha_6.setLocation(380, 167);
        } else if (jugador6 == 20) {
            ficha_6.setLocation(380, 115);
        } else if (jugador6 == 21) {
            ficha_6.setLocation(430, 80);
        } else if (jugador6 == 22) {
            ficha_6.setLocation(497, 70);
        } else if (jugador6 == 23) {
            ficha_6.setLocation(553, 70);
        } else if (jugador6 == 24) {
            ficha_6.setLocation(608, 70);
        } else if (jugador6 == 25) {
            ficha_6.setLocation(663, 70);
        } else if (jugador6 == 26) {
            ficha_6.setLocation(718, 70);
        } else if (jugador6 == 27) {
            ficha_6.setLocation(772, 70);
        } else if (jugador6 == 28) {
            ficha_6.setLocation(827, 70);
        } else if (jugador6 == 29) {
            ficha_6.setLocation(882, 70);
        } else if (jugador6 == 30) {
            ficha_6.setLocation(937, 70);
        } else if (jugador6 == 31) {
            ficha_6.setLocation(1020, 80);
        } else if (jugador6 == 32) {
            ficha_6.setLocation(1030, 114);
        } else if (jugador6 == 33) {
            ficha_6.setLocation(1030, 167);
        } else if (jugador6 == 34) {
            ficha_6.setLocation(1030, 222);
        } else if (jugador6 == 35) {
            ficha_6.setLocation(1030, 276);
        } else if (jugador6 == 36) {
            ficha_6.setLocation(1030, 331);
        } else if (jugador6 == 37) {
            ficha_6.setLocation(1030, 386);
        } else if (jugador6 == 38) {
            ficha_6.setLocation(1030, 442);
        } else if (jugador6 == 39) {
            ficha_6.setLocation(1030, 496);
        } else if (jugador6 == 40) {
            ficha_6.setLocation(1030, 552);
        } else if (jugador6 == 41) {
            ficha_6.setLocation(1020, 670);
        } else if (jugador6 == 42) {
            ficha_6.setLocation(936, 670);
        } else if (jugador6 == 43) {
            ficha_6.setLocation(882, 670);
        } else if (jugador6 == 44) {
            ficha_6.setLocation(826, 670);
        } else if (jugador6 == 45) {
            ficha_6.setLocation(772, 670);
        } else if (jugador6 == 46) {
            ficha_6.setLocation(718, 670);
        } else if (jugador6 == 47) {
            ficha_6.setLocation(662, 670);
        } else if (jugador6 == 48) {
            ficha_6.setLocation(608, 670);
        } else if (jugador6 == 49) {
            ficha_6.setLocation(552, 670);
        } else if (jugador6 == 50) {
            ficha_6.setLocation(497, 670);
        } else if (jugador6 == 51) {
            ficha_6.setLocation(430, 670);
        } else if (jugador6 == 52) {
            ficha_6.setLocation(380, 552);
        }

    }

    void verificarj1() {
        if (jugador1 > 40) {
            int reset;
            reset = jugador1 - 40;
            jugador1 = reset;
            JOptionPane.showMessageDialog(null, "felicidades");

        } else if (jugador1 == 2) {
           VCALLE_JACKSON jack = new VCALLE_JACKSON();  
            jack.setVisible(true);
        } else if (jugador1 == 3) {
            JOptionPane.showMessageDialog(null, "Pesadilla");
        } else if (jugador1 == 4) {
            VLOS_BALDÍOS bal = new VLOS_BALDÍOS();
            bal.setVisible(true);
        } else if (jugador1 == 5) {
            JOptionPane.showMessageDialog(null, "Impuestos");
        } else if (jugador1 == 6) {
            vTERMINAL_DE_BUSES bus = new vTERMINAL_DE_BUSES();
            bus.setVisible(true);
        } else if (jugador1 == 7) {
            VBAR_BLACK_SPOT bar = new VBAR_BLACK_SPOT();
            bar.setVisible(true);
        } else if (jugador1 == 8) {
            JOptionPane.showMessageDialog(null, "suspiro");
        } else if (jugador1 == 9) {
            VCASA_NEIBOLT nei = new VCASA_NEIBOLT();
            nei.setVisible(true);
        } else if (jugador1 == 10) {
            VCALLE_TURNER tur = new VCALLE_TURNER();
            tur.setVisible(true);
        } else if (jugador1 == 11) {
            JOptionPane.showMessageDialog(null, "pasadita de carcel");
        } else if (jugador1 == 12) {
            VBAR_FALCON fal = new VBAR_FALCON();
            fal.setVisible(true);
        } else if (jugador1 == 13) {
            VBIBLIOTECA_PUBLICA bil = new VBIBLIOTECA_PUBLICA();
            bil.setVisible(true);
        } else if (jugador1 == 14) {
            VIGLESIA_BAUTISTA igle = new VIGLESIA_BAUTISTA();
            igle.setVisible(true);
        } else if (jugador1 == 15) {
            VTIENDA_COSTELLO tie = new VTIENDA_COSTELLO();
            tie.setVisible(true);
        } else if (jugador1 == 16) {
            VPUENTE_DE_LOS_BESOS besos = new VPUENTE_DE_LOS_BESOS();
            besos.setVisible(true);
        } else if (jugador1 == 17) {
            VCENTRO_COMERCIAL come = new VCENTRO_COMERCIAL();
            come.setVisible(true);
        } else if (jugador1 == 18) {
            JOptionPane.showMessageDialog(null, "pesadilla");
        } else if (jugador1 == 19) {
            VESCUELA_PRIMARIA prima = new VESCUELA_PRIMARIA();
            prima.setVisible(true);
        } else if (jugador1 == 20) {
            VTEATRO_ALADDIN teatro = new VTEATRO_ALADDIN();
            teatro.setVisible(true);
        } else if (jugador1 == 21) {
            JOptionPane.showMessageDialog(null, "descanso gratis");
        } else if (jugador1 == 22) {
            VCASA_CLUB club = new VCASA_CLUB();
            club.setVisible(true);
        } else if (jugador1 == 23) {
            JOptionPane.showMessageDialog(null, "suspiro");
        } else if (jugador1 == 24) {
            VRESTAURANTE_JADE jade = new VRESTAURANTE_JADE();
            jade.setVisible(true);
        } else if (jugador1 == 25) {
            VCASA_DE_HUESPEDES hues = new VCASA_DE_HUESPEDES();
            hues.setVisible(true);
        } else if (jugador1 == 26) {
            VESCUELA_SECUNDARIA secu = new VESCUELA_SECUNDARIA();
            secu.setVisible(true);
        } else if (jugador1 == 27) {
            VPARQUE_MEMORIAL memo = new VPARQUE_MEMORIAL();
            memo.setVisible(true);
        } else if (jugador1 == 28) {
            VFARMACIA_KEENE farm = new VFARMACIA_KEENE();
            farm.setVisible(true);
        } else if (jugador1 == 29) {
            VREPRESA repre = new VREPRESA();
            repre.setVisible(true);
        } else if (jugador1 == 30) {
            VCASA_DE_LA_RISA risa = new VCASA_DE_LA_RISA();
            risa.setVisible(true);
        } else if (jugador1 == 31) {
            JOptionPane.showMessageDialog(null, "vaya a la carcel");
        } else if (jugador1 == 32) {
            VLA_CANTERA cantera = new VLA_CANTERA();
            cantera.setVisible(true);
        } else if (jugador1 == 33) {
            VCALLE_WITCHMAN wit = new VCALLE_WITCHMAN();
            wit.setVisible(true);
        } else if (jugador1 == 34) {
            JOptionPane.showMessageDialog(null, "pesadilla");
        } else if (jugador1 == 35) {
            VPARQUE_STRAWFORD straw = new VPARQUE_STRAWFORD();
            straw.setVisible(true);
        } else if (jugador1 == 36) {
            VPARQUE_BASSEY bas = new VPARQUE_BASSEY();
            bas.setVisible(true);
        } else if (jugador1 == 37) {
            JOptionPane.showMessageDialog(null, "suspiro");
        } else if (jugador1 == 38) {
            VCINE_CAPITOL capi = new VCINE_CAPITOL();
            capi.setVisible(true);
        } else if (jugador1 == 39) {
            JOptionPane.showMessageDialog(null, "impuesto de lujo");
        } else if (jugador1 == 40) {
            VLA_CASA_ANTIGUA casa = new VLA_CASA_ANTIGUA();
            casa.setVisible(true);
        }
    }

    void verificarj2() {
        if (jugador2 > 40) {
            int reset;
            reset = jugador2 - 40;
            jugador2 = reset;
            JOptionPane.showMessageDialog(null, "felicidades");

        } else if (jugador2 == 2) {
            VCALLE_JACKSON jack = new VCALLE_JACKSON();
            jack.setVisible(true);
        } else if (jugador2 == 3) {
            JOptionPane.showMessageDialog(null, "Pesadilla");
        } else if (jugador2 == 4) {
            VLOS_BALDÍOS bal = new VLOS_BALDÍOS();
            bal.setVisible(true);
        } else if (jugador2 == 5) {
            JOptionPane.showMessageDialog(null, "Impuestos");
        } else if (jugador2 == 6) {
            vTERMINAL_DE_BUSES bus = new vTERMINAL_DE_BUSES();
            bus.setVisible(true);
        } else if (jugador2 == 7) {
            VBAR_BLACK_SPOT bar = new VBAR_BLACK_SPOT();
            bar.setVisible(true);
        } else if (jugador2 == 8) {
            JOptionPane.showMessageDialog(null, "suspiro");
        } else if (jugador2 == 9) {
            VCASA_NEIBOLT nei = new VCASA_NEIBOLT();
            nei.setVisible(true);
        } else if (jugador2 == 10) {
            VCALLE_TURNER tur = new VCALLE_TURNER();
            tur.setVisible(true);
        } else if (jugador2 == 11) {
            JOptionPane.showMessageDialog(null, "pasadita de carcel");
        } else if (jugador2 == 12) {
            VBAR_FALCON fal = new VBAR_FALCON();
            fal.setVisible(true);
        } else if (jugador2 == 13) {
            VBIBLIOTECA_PUBLICA bil = new VBIBLIOTECA_PUBLICA();
            bil.setVisible(true);
        } else if (jugador2 == 14) {
            VIGLESIA_BAUTISTA igle = new VIGLESIA_BAUTISTA();
            igle.setVisible(true);
        } else if (jugador2 == 15) {
            VTIENDA_COSTELLO tie = new VTIENDA_COSTELLO();
            tie.setVisible(true);
        } else if (jugador2 == 16) {
            VPUENTE_DE_LOS_BESOS besos = new VPUENTE_DE_LOS_BESOS();
            besos.setVisible(true);
        } else if (jugador2 == 17) {
            VCENTRO_COMERCIAL come = new VCENTRO_COMERCIAL();
            come.setVisible(true);
        } else if (jugador2 == 18) {
            JOptionPane.showMessageDialog(null, "pesadilla");
        } else if (jugador2 == 19) {
            VESCUELA_PRIMARIA prima = new VESCUELA_PRIMARIA();
            prima.setVisible(true);
        } else if (jugador2 == 20) {
            VTEATRO_ALADDIN teatro = new VTEATRO_ALADDIN();
            teatro.setVisible(true);
        } else if (jugador2 == 21) {
            JOptionPane.showMessageDialog(null, "descanso gratis");
        } else if (jugador2 == 22) {
            VCASA_CLUB club = new VCASA_CLUB();
            club.setVisible(true);
        } else if (jugador2 == 23) {
            JOptionPane.showMessageDialog(null, "suspiro");
        } else if (jugador2 == 24) {
            VRESTAURANTE_JADE jade = new VRESTAURANTE_JADE();
            jade.setVisible(true);
        } else if (jugador2 == 25) {
            VCASA_DE_HUESPEDES hues = new VCASA_DE_HUESPEDES();
            hues.setVisible(true);
        } else if (jugador2 == 26) {
            VESCUELA_SECUNDARIA secu = new VESCUELA_SECUNDARIA();
            secu.setVisible(true);
        } else if (jugador2 == 27) {
            VPARQUE_MEMORIAL memo = new VPARQUE_MEMORIAL();
            memo.setVisible(true);
        } else if (jugador2 == 28) {
            VFARMACIA_KEENE farm = new VFARMACIA_KEENE();
            farm.setVisible(true);
        } else if (jugador2 == 29) {
            VREPRESA repre = new VREPRESA();
            repre.setVisible(true);
        } else if (jugador2 == 30) {
            VCASA_DE_LA_RISA risa = new VCASA_DE_LA_RISA();
            risa.setVisible(true);
        } else if (jugador2 == 31) {
            JOptionPane.showMessageDialog(null, "vaya a la carcel");
        } else if (jugador2 == 32) {
            VLA_CANTERA cantera = new VLA_CANTERA();
            cantera.setVisible(true);
        } else if (jugador2 == 33) {
            VCALLE_WITCHMAN wit = new VCALLE_WITCHMAN();
            wit.setVisible(true);
        } else if (jugador2 == 34) {
            JOptionPane.showMessageDialog(null, "pesadilla");
        } else if (jugador2 == 35) {
            VPARQUE_STRAWFORD straw = new VPARQUE_STRAWFORD();
            straw.setVisible(true);
        } else if (jugador2 == 36) {
            VPARQUE_BASSEY bas = new VPARQUE_BASSEY();
            bas.setVisible(true);
        } else if (jugador2 == 37) {
            JOptionPane.showMessageDialog(null, "suspiro");
        } else if (jugador2 == 38) {
            VCINE_CAPITOL capi = new VCINE_CAPITOL();
            capi.setVisible(true);
        } else if (jugador2 == 39) {
            JOptionPane.showMessageDialog(null, "impuesto de lujo");
        } else if (jugador2 == 40) {
            VLA_CASA_ANTIGUA casa = new VLA_CASA_ANTIGUA();
            casa.setVisible(true);
        }

    }

    void verificarj3() {
        if (jugador3 > 40) {
            int reset;
            reset = jugador3 - 40;
            jugador3 = reset;
            JOptionPane.showMessageDialog(null, "felicidades");

        } else if (jugador3 == 2) {
            VCALLE_JACKSON jack = new VCALLE_JACKSON();
            jack.setVisible(true);
        } else if (jugador3 == 3) {
            JOptionPane.showMessageDialog(null, "Pesadilla");
        } else if (jugador3 == 4) {
            VLOS_BALDÍOS bal = new VLOS_BALDÍOS();
            bal.setVisible(true);
        } else if (jugador3 == 5) {
            JOptionPane.showMessageDialog(null, "Impuestos");
        } else if (jugador3 == 6) {
            vTERMINAL_DE_BUSES bus = new vTERMINAL_DE_BUSES();
            bus.setVisible(true);
        } else if (jugador3 == 7) {
            VBAR_BLACK_SPOT bar = new VBAR_BLACK_SPOT();
            bar.setVisible(true);
        } else if (jugador3 == 8) {
            JOptionPane.showMessageDialog(null, "suspiro");
        } else if (jugador3 == 9) {
            VCASA_NEIBOLT nei = new VCASA_NEIBOLT();
            nei.setVisible(true);
        } else if (jugador3 == 10) {
            VCALLE_TURNER tur = new VCALLE_TURNER();
            tur.setVisible(true);
        } else if (jugador3 == 11) {
            JOptionPane.showMessageDialog(null, "pasadita de carcel");
        } else if (jugador3 == 12) {
            VBAR_FALCON fal = new VBAR_FALCON();
            fal.setVisible(true);
        } else if (jugador3 == 13) {
            VBIBLIOTECA_PUBLICA bil = new VBIBLIOTECA_PUBLICA();
            bil.setVisible(true);
        } else if (jugador3 == 14) {
            VIGLESIA_BAUTISTA igle = new VIGLESIA_BAUTISTA();
            igle.setVisible(true);
        } else if (jugador3 == 15) {
            VTIENDA_COSTELLO tie = new VTIENDA_COSTELLO();
            tie.setVisible(true);
        } else if (jugador3 == 16) {
            VPUENTE_DE_LOS_BESOS besos = new VPUENTE_DE_LOS_BESOS();
            besos.setVisible(true);
        } else if (jugador3 == 17) {
            VCENTRO_COMERCIAL come = new VCENTRO_COMERCIAL();
            come.setVisible(true);
        } else if (jugador3 == 18) {
            JOptionPane.showMessageDialog(null, "pesadilla");
        } else if (jugador3 == 19) {
            VESCUELA_PRIMARIA prima = new VESCUELA_PRIMARIA();
            prima.setVisible(true);
        } else if (jugador3 == 20) {
            VTEATRO_ALADDIN teatro = new VTEATRO_ALADDIN();
            teatro.setVisible(true);
        } else if (jugador3 == 21) {
            JOptionPane.showMessageDialog(null, "descanso gratis");
        } else if (jugador3 == 22) {
            VCASA_CLUB club = new VCASA_CLUB();
            club.setVisible(true);
        } else if (jugador3 == 23) {
            JOptionPane.showMessageDialog(null, "suspiro");
        } else if (jugador3 == 24) {
            VRESTAURANTE_JADE jade = new VRESTAURANTE_JADE();
            jade.setVisible(true);
        } else if (jugador3 == 25) {
            VCASA_DE_HUESPEDES hues = new VCASA_DE_HUESPEDES();
            hues.setVisible(true);
        } else if (jugador3 == 26) {
            VESCUELA_SECUNDARIA secu = new VESCUELA_SECUNDARIA();
            secu.setVisible(true);
        } else if (jugador3 == 27) {
            VPARQUE_MEMORIAL memo = new VPARQUE_MEMORIAL();
            memo.setVisible(true);
        } else if (jugador3 == 28) {
            VFARMACIA_KEENE farm = new VFARMACIA_KEENE();
            farm.setVisible(true);
        } else if (jugador3 == 29) {
            VREPRESA repre = new VREPRESA();
            repre.setVisible(true);
        } else if (jugador3 == 30) {
            VCASA_DE_LA_RISA risa = new VCASA_DE_LA_RISA();
            risa.setVisible(true);
        } else if (jugador3 == 31) {
            JOptionPane.showMessageDialog(null, "vaya a la carcel");
        } else if (jugador3 == 32) {
            VLA_CANTERA cantera = new VLA_CANTERA();
            cantera.setVisible(true);
        } else if (jugador3 == 33) {
            VCALLE_WITCHMAN wit = new VCALLE_WITCHMAN();
            wit.setVisible(true);
        } else if (jugador3 == 34) {
            JOptionPane.showMessageDialog(null, "pesadilla");
        } else if (jugador3 == 35) {
            VPARQUE_STRAWFORD straw = new VPARQUE_STRAWFORD();
            straw.setVisible(true);
        } else if (jugador3 == 36) {
            VPARQUE_BASSEY bas = new VPARQUE_BASSEY();
            bas.setVisible(true);
        } else if (jugador3 == 37) {
            JOptionPane.showMessageDialog(null, "suspiro");
        } else if (jugador3 == 38) {
            VCINE_CAPITOL capi = new VCINE_CAPITOL();
            capi.setVisible(true);
        } else if (jugador3 == 39) {
            JOptionPane.showMessageDialog(null, "impuesto de lujo");
        } else if (jugador3 == 40) {
            VLA_CASA_ANTIGUA casa = new VLA_CASA_ANTIGUA();
            casa.setVisible(true);
        }

    }

    void verificarj4() {
        if (jugador4 > 40) {
            int reset;
            reset = jugador4 - 40;
            jugador4 = reset;
            JOptionPane.showMessageDialog(null, "felicidades");

        } else if (jugador4 == 2) {
            VCALLE_JACKSON jack = new VCALLE_JACKSON();
            jack.setVisible(true);
        } else if (jugador4 == 3) {
            JOptionPane.showMessageDialog(null, "Pesadilla");
        } else if (jugador4 == 4) {
            VLOS_BALDÍOS bal = new VLOS_BALDÍOS();
            bal.setVisible(true);
        } else if (jugador4 == 5) {
            JOptionPane.showMessageDialog(null, "Impuestos");
        } else if (jugador4 == 6) {
            vTERMINAL_DE_BUSES bus = new vTERMINAL_DE_BUSES();
            bus.setVisible(true);
        } else if (jugador4 == 7) {
            VBAR_BLACK_SPOT bar = new VBAR_BLACK_SPOT();
            bar.setVisible(true);
        } else if (jugador4 == 8) {
            JOptionPane.showMessageDialog(null, "suspiro");
        } else if (jugador4 == 9) {
            VCASA_NEIBOLT nei = new VCASA_NEIBOLT();
            nei.setVisible(true);
        } else if (jugador4 == 10) {
            VCALLE_TURNER tur = new VCALLE_TURNER();
            tur.setVisible(true);
        } else if (jugador4 == 11) {
            JOptionPane.showMessageDialog(null, "pasadita de carcel");
        } else if (jugador4 == 12) {
            VBAR_FALCON fal = new VBAR_FALCON();
            fal.setVisible(true);
        } else if (jugador4 == 13) {
            VBIBLIOTECA_PUBLICA bil = new VBIBLIOTECA_PUBLICA();
            bil.setVisible(true);
        } else if (jugador4 == 14) {
            VIGLESIA_BAUTISTA igle = new VIGLESIA_BAUTISTA();
            igle.setVisible(true);
        } else if (jugador4 == 15) {
            VTIENDA_COSTELLO tie = new VTIENDA_COSTELLO();
            tie.setVisible(true);
        } else if (jugador4 == 16) {
            VPUENTE_DE_LOS_BESOS besos = new VPUENTE_DE_LOS_BESOS();
            besos.setVisible(true);
        } else if (jugador4 == 17) {
            VCENTRO_COMERCIAL come = new VCENTRO_COMERCIAL();
            come.setVisible(true);
        } else if (jugador4 == 18) {
            JOptionPane.showMessageDialog(null, "pesadilla");
        } else if (jugador4 == 19) {
            VESCUELA_PRIMARIA prima = new VESCUELA_PRIMARIA();
            prima.setVisible(true);
        } else if (jugador4 == 20) {
            VTEATRO_ALADDIN teatro = new VTEATRO_ALADDIN();
            teatro.setVisible(true);
        } else if (jugador4 == 21) {
            JOptionPane.showMessageDialog(null, "descanso gratis");
        } else if (jugador4 == 22) {
            VCASA_CLUB club = new VCASA_CLUB();
            club.setVisible(true);
        } else if (jugador4 == 23) {
            JOptionPane.showMessageDialog(null, "suspiro");
        } else if (jugador4 == 24) {
            VRESTAURANTE_JADE jade = new VRESTAURANTE_JADE();
            jade.setVisible(true);
        } else if (jugador4 == 25) {
            VCASA_DE_HUESPEDES hues = new VCASA_DE_HUESPEDES();
            hues.setVisible(true);
        } else if (jugador4 == 26) {
            VESCUELA_SECUNDARIA secu = new VESCUELA_SECUNDARIA();
            secu.setVisible(true);
        } else if (jugador4 == 27) {
            VPARQUE_MEMORIAL memo = new VPARQUE_MEMORIAL();
            memo.setVisible(true);
        } else if (jugador4 == 28) {
            VFARMACIA_KEENE farm = new VFARMACIA_KEENE();
            farm.setVisible(true);
        } else if (jugador4 == 29) {
            VREPRESA repre = new VREPRESA();
            repre.setVisible(true);
        } else if (jugador4 == 30) {
            VCASA_DE_LA_RISA risa = new VCASA_DE_LA_RISA();
            risa.setVisible(true);
        } else if (jugador4 == 31) {
            JOptionPane.showMessageDialog(null, "vaya a la carcel");
        } else if (jugador4 == 32) {
            VLA_CANTERA cantera = new VLA_CANTERA();
            cantera.setVisible(true);
        } else if (jugador4 == 33) {
            VCALLE_WITCHMAN wit = new VCALLE_WITCHMAN();
            wit.setVisible(true);
        } else if (jugador4 == 34) {
            JOptionPane.showMessageDialog(null, "pesadilla");
        } else if (jugador4 == 35) {
            VPARQUE_STRAWFORD straw = new VPARQUE_STRAWFORD();
            straw.setVisible(true);
        } else if (jugador4 == 36) {
            VPARQUE_BASSEY bas = new VPARQUE_BASSEY();
            bas.setVisible(true);
        } else if (jugador4 == 37) {
            JOptionPane.showMessageDialog(null, "suspiro");
        } else if (jugador4 == 38) {
            VCINE_CAPITOL capi = new VCINE_CAPITOL();
            capi.setVisible(true);
        } else if (jugador4 == 39) {
            JOptionPane.showMessageDialog(null, "impuesto de lujo");
        } else if (jugador4 == 40) {
            VLA_CASA_ANTIGUA casa = new VLA_CASA_ANTIGUA();
            casa.setVisible(true);
        }

    }

    void verificarj5() {
        if (jugador5 > 40) {
            int reset;
            reset = jugador5 - 40;
            jugador5 = reset;
            JOptionPane.showMessageDialog(null, "felicidades");

        } else if (jugador5 == 2) {
            VCALLE_JACKSON jack = new VCALLE_JACKSON();
            jack.setVisible(true);
        } else if (jugador5 == 3) {
            JOptionPane.showMessageDialog(null, "Pesadilla");
        } else if (jugador5 == 4) {
            VLOS_BALDÍOS bal = new VLOS_BALDÍOS();
            bal.setVisible(true);
        } else if (jugador5 == 5) {
            JOptionPane.showMessageDialog(null, "Impuestos");
        } else if (jugador5 == 6) {
            vTERMINAL_DE_BUSES bus = new vTERMINAL_DE_BUSES();
            bus.setVisible(true);
        } else if (jugador5 == 7) {
            VBAR_BLACK_SPOT bar = new VBAR_BLACK_SPOT();
            bar.setVisible(true);
        } else if (jugador5 == 8) {
            JOptionPane.showMessageDialog(null, "suspiro");
        } else if (jugador5 == 9) {
            VCASA_NEIBOLT nei = new VCASA_NEIBOLT();
            nei.setVisible(true);
        } else if (jugador5 == 10) {
            VCALLE_TURNER tur = new VCALLE_TURNER();
            tur.setVisible(true);
        } else if (jugador5 == 11) {
            JOptionPane.showMessageDialog(null, "pasadita de carcel");
        } else if (jugador5 == 12) {
            VBAR_FALCON fal = new VBAR_FALCON();
            fal.setVisible(true);
        } else if (jugador5 == 13) {
            VBIBLIOTECA_PUBLICA bil = new VBIBLIOTECA_PUBLICA();
            bil.setVisible(true);
        } else if (jugador5 == 14) {
            VIGLESIA_BAUTISTA igle = new VIGLESIA_BAUTISTA();
            igle.setVisible(true);
        } else if (jugador5 == 15) {
            VTIENDA_COSTELLO tie = new VTIENDA_COSTELLO();
            tie.setVisible(true);
        } else if (jugador5 == 16) {
            VPUENTE_DE_LOS_BESOS besos = new VPUENTE_DE_LOS_BESOS();
            besos.setVisible(true);
        } else if (jugador5 == 17) {
            VCENTRO_COMERCIAL come = new VCENTRO_COMERCIAL();
            come.setVisible(true);
        } else if (jugador5 == 18) {
            JOptionPane.showMessageDialog(null, "pesadilla");
        } else if (jugador5 == 19) {
            VESCUELA_PRIMARIA prima = new VESCUELA_PRIMARIA();
            prima.setVisible(true);
        } else if (jugador5 == 20) {
            VTEATRO_ALADDIN teatro = new VTEATRO_ALADDIN();
            teatro.setVisible(true);
        } else if (jugador5 == 21) {
            JOptionPane.showMessageDialog(null, "descanso gratis");
        } else if (jugador5 == 22) {
            VCASA_CLUB club = new VCASA_CLUB();
            club.setVisible(true);
        } else if (jugador5 == 23) {
            JOptionPane.showMessageDialog(null, "suspiro");
        } else if (jugador5 == 24) {
            VRESTAURANTE_JADE jade = new VRESTAURANTE_JADE();
            jade.setVisible(true);
        } else if (jugador5 == 25) {
            VCASA_DE_HUESPEDES hues = new VCASA_DE_HUESPEDES();
            hues.setVisible(true);
        } else if (jugador5 == 26) {
            VESCUELA_SECUNDARIA secu = new VESCUELA_SECUNDARIA();
            secu.setVisible(true);
        } else if (jugador5 == 27) {
            VPARQUE_MEMORIAL memo = new VPARQUE_MEMORIAL();
            memo.setVisible(true);
        } else if (jugador5 == 28) {
            VFARMACIA_KEENE farm = new VFARMACIA_KEENE();
            farm.setVisible(true);
        } else if (jugador5 == 29) {
            VREPRESA repre = new VREPRESA();
            repre.setVisible(true);
        } else if (jugador5 == 30) {
            VCASA_DE_LA_RISA risa = new VCASA_DE_LA_RISA();
            risa.setVisible(true);
        } else if (jugador5 == 31) {
            JOptionPane.showMessageDialog(null, "vaya a la carcel");
        } else if (jugador5 == 32) {
            VLA_CANTERA cantera = new VLA_CANTERA();
            cantera.setVisible(true);
        } else if (jugador5 == 33) {
            VCALLE_WITCHMAN wit = new VCALLE_WITCHMAN();
            wit.setVisible(true);
        } else if (jugador5 == 34) {
            JOptionPane.showMessageDialog(null, "pesadilla");
        } else if (jugador5 == 35) {
            VPARQUE_STRAWFORD straw = new VPARQUE_STRAWFORD();
            straw.setVisible(true);
        } else if (jugador5 == 36) {
            VPARQUE_BASSEY bas = new VPARQUE_BASSEY();
            bas.setVisible(true);
        } else if (jugador5 == 37) {
            JOptionPane.showMessageDialog(null, "suspiro");
        } else if (jugador5 == 38) {
            VCINE_CAPITOL capi = new VCINE_CAPITOL();
            capi.setVisible(true);
        } else if (jugador5 == 39) {
            JOptionPane.showMessageDialog(null, "impuesto de lujo");
        } else if (jugador5 == 40) {
            VLA_CASA_ANTIGUA casa = new VLA_CASA_ANTIGUA();
            casa.setVisible(true);
        }

    }

    void verificarj6() {
        if (jugador6 > 40) {
            int reset;
            reset = jugador6 - 40;
            jugador6 = reset;
            JOptionPane.showMessageDialog(null, "felicidades");

        } else if (jugador6 == 2) {
            VCALLE_JACKSON jack = new VCALLE_JACKSON();
            jack.setVisible(true);
        } else if (jugador6 == 3) {
            JOptionPane.showMessageDialog(null, "Pesadilla");
        } else if (jugador6 == 4) {
            VLOS_BALDÍOS bal = new VLOS_BALDÍOS();
            bal.setVisible(true);
        } else if (jugador6 == 5) {
            JOptionPane.showMessageDialog(null, "Impuestos");
        } else if (jugador6 == 6) {
            vTERMINAL_DE_BUSES bus = new vTERMINAL_DE_BUSES();
            bus.setVisible(true);
        } else if (jugador6 == 7) {
            VBAR_BLACK_SPOT bar = new VBAR_BLACK_SPOT();
            bar.setVisible(true);
        } else if (jugador6 == 8) {
            JOptionPane.showMessageDialog(null, "suspiro");
        } else if (jugador6 == 9) {
            VCASA_NEIBOLT nei = new VCASA_NEIBOLT();
            nei.setVisible(true);
        } else if (jugador6 == 10) {
            VCALLE_TURNER tur = new VCALLE_TURNER();
            tur.setVisible(true);
        } else if (jugador6 == 11) {
            JOptionPane.showMessageDialog(null, "pasadita de carcel");
        } else if (jugador6 == 12) {
            VBAR_FALCON fal = new VBAR_FALCON();
            fal.setVisible(true);
        } else if (jugador6 == 13) {
            VBIBLIOTECA_PUBLICA bil = new VBIBLIOTECA_PUBLICA();
            bil.setVisible(true);
        } else if (jugador6 == 14) {
            VIGLESIA_BAUTISTA igle = new VIGLESIA_BAUTISTA();
            igle.setVisible(true);
        } else if (jugador6 == 15) {
            VTIENDA_COSTELLO tie = new VTIENDA_COSTELLO();
            tie.setVisible(true);
        } else if (jugador6 == 16) {
            VPUENTE_DE_LOS_BESOS besos = new VPUENTE_DE_LOS_BESOS();
            besos.setVisible(true);
        } else if (jugador6 == 17) {
            VCENTRO_COMERCIAL come = new VCENTRO_COMERCIAL();
            come.setVisible(true);
        } else if (jugador6 == 18) {
            JOptionPane.showMessageDialog(null, "pesadilla");
        } else if (jugador6 == 19) {
            VESCUELA_PRIMARIA prima = new VESCUELA_PRIMARIA();
            prima.setVisible(true);
        } else if (jugador6 == 20) {
            VTEATRO_ALADDIN teatro = new VTEATRO_ALADDIN();
            teatro.setVisible(true);
        } else if (jugador6 == 21) {
            JOptionPane.showMessageDialog(null, "descanso gratis");
        } else if (jugador6 == 22) {
            VCASA_CLUB club = new VCASA_CLUB();
            club.setVisible(true);
        } else if (jugador6 == 23) {
            JOptionPane.showMessageDialog(null, "suspiro");
        } else if (jugador6 == 24) {
            VRESTAURANTE_JADE jade = new VRESTAURANTE_JADE();
            jade.setVisible(true);
        } else if (jugador6 == 25) {
            VCASA_DE_HUESPEDES hues = new VCASA_DE_HUESPEDES();
            hues.setVisible(true);
        } else if (jugador6 == 26) {
            VESCUELA_SECUNDARIA secu = new VESCUELA_SECUNDARIA();
            secu.setVisible(true);
        } else if (jugador6 == 27) {
            VPARQUE_MEMORIAL memo = new VPARQUE_MEMORIAL();
            memo.setVisible(true);
        } else if (jugador6 == 28) {
            VFARMACIA_KEENE farm = new VFARMACIA_KEENE();
            farm.setVisible(true);
        } else if (jugador6 == 29) {
            VREPRESA repre = new VREPRESA();
            repre.setVisible(true);
        } else if (jugador6 == 30) {
            VCASA_DE_LA_RISA risa = new VCASA_DE_LA_RISA();
            risa.setVisible(true);
        } else if (jugador6 == 31) {
            JOptionPane.showMessageDialog(null, "vaya a la carcel");
        } else if (jugador6 == 32) {
            VLA_CANTERA cantera = new VLA_CANTERA();
            cantera.setVisible(true);
        } else if (jugador6 == 33) {
            VCALLE_WITCHMAN wit = new VCALLE_WITCHMAN();
            wit.setVisible(true);
        } else if (jugador6 == 34) {
            JOptionPane.showMessageDialog(null, "pesadilla");
        } else if (jugador6 == 35) {
            VPARQUE_STRAWFORD straw = new VPARQUE_STRAWFORD();
            straw.setVisible(true);
        } else if (jugador6 == 36) {
            VPARQUE_BASSEY bas = new VPARQUE_BASSEY();
            bas.setVisible(true);
        } else if (jugador6 == 37) {
            JOptionPane.showMessageDialog(null, "suspiro");
        } else if (jugador6 == 38) {
            VCINE_CAPITOL capi = new VCINE_CAPITOL();
            capi.setVisible(true);
        } else if (jugador6 == 39) {
            JOptionPane.showMessageDialog(null, "impuesto de lujo");
        } else if (jugador6 == 40) {
            VLA_CASA_ANTIGUA casa = new VLA_CASA_ANTIGUA();
            casa.setVisible(true);
        }

    }
}
