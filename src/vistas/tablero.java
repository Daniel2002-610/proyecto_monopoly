package vistas;

import clases_tarjetas.BAR_BLACK_SPOT;
import clases_tarjetas.BAR_FALCON;
import clases_tarjetas.BIBLIOTECA_PUBLICA;
import clases_tarjetas.CALLE_JACKSON;
import clases_tarjetas.CALLE_TURNER;
import clases_tarjetas.CALLE_WITCHMAN;
import clases_tarjetas.CASA_ANTIGUA;
import clases_tarjetas.CASA_CLUB;
import clases_tarjetas.CASA_DE_HUESPEDES;
import clases_tarjetas.CASA_DE_LA_RISA;
import clases_tarjetas.CASA_NEIBOLT;
import clases_tarjetas.CENTRO_COMERCIAL;
import clases_tarjetas.CINE_CAPITOL;
import clases_tarjetas.ESCUELA_PRIMARIA;
import clases_tarjetas.ESCUELA_SECUNDARIA;
import clases_tarjetas.FARMACIA_KEENE;
import clases_tarjetas.IGLESIA_BAUTISTA;
import clases_tarjetas.LA_CANTERA;
import clases_tarjetas.LOS_BALDIOS;
import clases_tarjetas.PARQUE_BASSEY;
import clases_tarjetas.PARQUE_MEMORIAL;
import clases_tarjetas.PARQUE_STRAWFORD;
import clases_tarjetas.PUENTE_DE_LOS_BESOS;
import clases_tarjetas.REPRESA;
import clases_tarjetas.RESTAURANTE_JADE;
import clases_tarjetas.TEATRO_ALADDIN;
import clases_tarjetas.TERMINAL_DE_BUSES;
import clases_tarjetas.TIENDA_COSTELLO;
import java.awt.Color;
import java.util.HashSet;

import java.util.Random;
import java.util.Set;
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

    Random random = new Random();
    play1 pl1 = new play1();
    play2 pl2 = new play2();
    play3 pl3 = new play3();
    play4 pl4 = new play4();
    play5 pl5 = new play5();
    play6 pl6 = new play6();
    CALLE_JACKSON jacki = new CALLE_JACKSON();
    LOS_BALDIOS bali = new LOS_BALDIOS();
    TERMINAL_DE_BUSES busi = new TERMINAL_DE_BUSES();
    BAR_BLACK_SPOT bari = new BAR_BLACK_SPOT();
    CASA_NEIBOLT neii = new CASA_NEIBOLT();
    CALLE_TURNER turi = new CALLE_TURNER();
    BAR_FALCON fali = new BAR_FALCON();
    BIBLIOTECA_PUBLICA bili = new BIBLIOTECA_PUBLICA();
    IGLESIA_BAUTISTA iglei = new IGLESIA_BAUTISTA();
    TIENDA_COSTELLO tiei = new TIENDA_COSTELLO();
    PUENTE_DE_LOS_BESOS besosi = new PUENTE_DE_LOS_BESOS();
    CENTRO_COMERCIAL comei = new CENTRO_COMERCIAL();
    ESCUELA_PRIMARIA primai = new ESCUELA_PRIMARIA();
    TEATRO_ALADDIN teatroi = new TEATRO_ALADDIN();
    CASA_CLUB clubi = new CASA_CLUB();
    RESTAURANTE_JADE jadei = new RESTAURANTE_JADE();
    CASA_DE_HUESPEDES huesi = new CASA_DE_HUESPEDES();
    ESCUELA_SECUNDARIA secui = new ESCUELA_SECUNDARIA();
    PARQUE_MEMORIAL memoi = new PARQUE_MEMORIAL();
    FARMACIA_KEENE farmi = new FARMACIA_KEENE();
    REPRESA repri = new REPRESA();
    CASA_DE_LA_RISA risai = new CASA_DE_LA_RISA();
    LA_CANTERA canterai = new LA_CANTERA();
    CALLE_WITCHMAN witi = new CALLE_WITCHMAN();
    PARQUE_STRAWFORD strawi = new PARQUE_STRAWFORD();
    PARQUE_BASSEY basi = new PARQUE_BASSEY();
    CINE_CAPITOL capii = new CINE_CAPITOL();
    CASA_ANTIGUA casai = new CASA_ANTIGUA();

    public int cont = 1;
    String comboj1, comboj2;
    public String comprador;
    int dato, jugador1 = 1, jugador2 = 1, jugador3 = 1, jugador4 = 1, jugador5 = 1, jugador6 = 1;

    public tablero() {
        initComponents();
        this.setLocationRelativeTo(null);
        pay.setVisible(true);
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

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dinero6 = new javax.swing.JLabel();
        player6 = new javax.swing.JLabel();
        v6 = new javax.swing.JLabel();
        player5 = new javax.swing.JLabel();
        dinero5 = new javax.swing.JLabel();
        v5 = new javax.swing.JLabel();
        player2 = new javax.swing.JLabel();
        player4 = new javax.swing.JLabel();
        dinero4 = new javax.swing.JLabel();
        v4 = new javax.swing.JLabel();
        player3 = new javax.swing.JLabel();
        ficha_3 = new javax.swing.JLabel();
        ficha_2 = new javax.swing.JLabel();
        prop = new javax.swing.JLabel();
        pay = new javax.swing.JLabel();
        ficha_4 = new javax.swing.JLabel();
        conta = new javax.swing.JLabel();
        ficha_6 = new javax.swing.JLabel();
        ficha_1 = new javax.swing.JLabel();
        dinero3 = new javax.swing.JLabel();
        btninicio = new javax.swing.JLabel();
        v3 = new javax.swing.JLabel();
        ficha_5 = new javax.swing.JLabel();
        player = new javax.swing.JLabel();
        dinero2 = new javax.swing.JLabel();
        v2 = new javax.swing.JLabel();
        prueba = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btn_mini = new javax.swing.JLabel();
        turno = new javax.swing.JLabel();
        dinero = new javax.swing.JLabel();
        btnj1 = new javax.swing.JLabel();
        btnj2 = new javax.swing.JLabel();
        btnj3 = new javax.swing.JLabel();
        btnj4 = new javax.swing.JLabel();
        btnj5 = new javax.swing.JLabel();
        btnj6 = new javax.swing.JLabel();
        btntirar = new javax.swing.JLabel();
        v1 = new javax.swing.JLabel();
        btn_cerrar = new javax.swing.JLabel();
        tablero = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 0, 255));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dinero6.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        dinero6.setForeground(new java.awt.Color(0, 0, 0));
        dinero6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        dinero6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dinero6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dinero6MouseClicked(evt);
            }
        });
        getContentPane().add(dinero6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 510, 120, 20));

        player6.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        player6.setForeground(new java.awt.Color(255, 255, 255));
        player6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(player6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 480, 170, 30));

        v6.setForeground(new java.awt.Color(255, 255, 255));
        v6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/punteomorado.png"))); // NOI18N
        getContentPane().add(v6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 410, -1, -1));

        player5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        player5.setForeground(new java.awt.Color(255, 255, 255));
        player5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(player5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 310, 170, 30));

        dinero5.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        dinero5.setForeground(new java.awt.Color(0, 0, 0));
        dinero5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        dinero5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dinero5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dinero5MouseClicked(evt);
            }
        });
        getContentPane().add(dinero5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 340, 120, 20));

        v5.setForeground(new java.awt.Color(255, 255, 255));
        v5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/punteonaranja.png"))); // NOI18N
        getContentPane().add(v5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 240, -1, -1));

        player2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        player2.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(player2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 170, 30));

        player4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        player4.setForeground(new java.awt.Color(255, 255, 255));
        player4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(player4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 150, 170, 30));

        dinero4.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        dinero4.setForeground(new java.awt.Color(0, 0, 0));
        dinero4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        dinero4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dinero4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dinero4MouseClicked(evt);
            }
        });
        getContentPane().add(dinero4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 180, 120, 20));

        v4.setForeground(new java.awt.Color(255, 255, 255));
        v4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/punteorosa.png"))); // NOI18N
        getContentPane().add(v4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 80, -1, -1));

        player3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        player3.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(player3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 590, 170, 30));

        ficha_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/ficha2.png"))); // NOI18N
        getContentPane().add(ficha_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 645, -1, -1));

        ficha_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/ficha3.png"))); // NOI18N
        getContentPane().add(ficha_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 620, -1, -1));

        prop.setForeground(new java.awt.Color(255, 255, 255));
        prop.setText("jLabel1");
        getContentPane().add(prop, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 660, -1, -1));

        pay.setForeground(new java.awt.Color(255, 255, 255));
        pay.setText("jLabel1");
        getContentPane().add(pay, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 660, -1, -1));

        ficha_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/ficha6.png"))); // NOI18N
        getContentPane().add(ficha_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 645, -1, -1));

        conta.setForeground(new java.awt.Color(255, 255, 255));
        conta.setText("jLabel1");
        getContentPane().add(conta, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, -1, -1));

        ficha_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/ficha4.png"))); // NOI18N
        getContentPane().add(ficha_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 670, -1, -1));

        ficha_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/ficha1.png"))); // NOI18N
        getContentPane().add(ficha_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 620, -1, -1));

        dinero3.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        dinero3.setForeground(new java.awt.Color(0, 0, 0));
        dinero3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dinero3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dinero3MouseClicked(evt);
            }
        });
        getContentPane().add(dinero3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 623, 120, 20));

        btninicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/inicio.png"))); // NOI18N
        btninicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btninicio.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        btninicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btninicioMouseClicked(evt);
            }
        });
        getContentPane().add(btninicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 210, -1, -1));

        v3.setForeground(new java.awt.Color(255, 255, 255));
        v3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/punteolila.png"))); // NOI18N
        getContentPane().add(v3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, -1, -1));

        ficha_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/ficha5.png"))); // NOI18N
        getContentPane().add(ficha_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 670, -1, -1));

        player.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        player.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(player, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 170, 30));

        dinero2.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        dinero2.setForeground(new java.awt.Color(0, 0, 0));
        dinero2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dinero2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dinero2MouseClicked(evt);
            }
        });
        getContentPane().add(dinero2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 453, 120, 20));

        v2.setForeground(new java.awt.Color(255, 255, 255));
        v2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/punteorojo.png"))); // NOI18N
        getContentPane().add(v2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));

        prueba.setForeground(new java.awt.Color(255, 255, 255));
        prueba.setText("jLabel1");
        getContentPane().add(prueba, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, -1, -1));

        jButton5.setText("cambiar contador");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        jButton4.setText("j2");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 70, -1));

        jButton3.setText("jButton2");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, -1, -1));

        jButton2.setText("j1");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 70, -1));

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

        turno.setForeground(new java.awt.Color(255, 255, 255));
        turno.setText("jLabel1");
        turno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                turnoMouseClicked(evt);
            }
        });
        getContentPane().add(turno, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        dinero.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        dinero.setForeground(new java.awt.Color(0, 0, 0));
        dinero.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dinero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dineroMouseClicked(evt);
            }
        });
        getContentPane().add(dinero, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 302, 120, 20));

        btnj1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/333-10.png"))); // NOI18N
        btnj1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnj1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnj1MouseClicked(evt);
            }
        });
        getContentPane().add(btnj1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 630, -1, -1));

        btnj2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/333-10.png"))); // NOI18N
        btnj2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnj2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnj2MouseClicked(evt);
            }
        });
        getContentPane().add(btnj2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 630, -1, -1));

        btnj3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/333-10.png"))); // NOI18N
        btnj3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnj3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnj3MouseClicked(evt);
            }
        });
        getContentPane().add(btnj3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 630, -1, -1));

        btnj4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/333-10.png"))); // NOI18N
        btnj4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnj4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnj4MouseClicked(evt);
            }
        });
        getContentPane().add(btnj4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 630, -1, -1));

        btnj5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/333-10.png"))); // NOI18N
        btnj5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnj5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnj5MouseClicked(evt);
            }
        });
        getContentPane().add(btnj5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 630, -1, -1));

        btnj6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/333-10.png"))); // NOI18N
        btnj6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnj6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnj6MouseClicked(evt);
            }
        });
        getContentPane().add(btnj6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 630, -1, -1));

        btntirar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/2222-10.png"))); // NOI18N
        btntirar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btntirar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btntirarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btntirarMouseEntered(evt);
            }
        });
        getContentPane().add(btntirar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1099, 570, 200, -1));

        v1.setForeground(new java.awt.Color(255, 255, 255));
        v1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/punteoceleste.png"))); // NOI18N
        getContentPane().add(v1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        btn_cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/boton_cerrar.png"))); // NOI18N
        btn_cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_cerrarMouseClicked(evt);
            }
        });
        getContentPane().add(btn_cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1328, 5, -1, -1));

        tablero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/tablero.jpg"))); // NOI18N
        getContentPane().add(tablero, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, -1, -1));

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

        cont = 2;
        jugador1 = 2;
        pasoj1();
        verificarj1();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void dineroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dineroMouseClicked
        dinero.setText(String.valueOf(pl1.dinero));
    }//GEN-LAST:event_dineroMouseClicked

    private void dinero2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dinero2MouseClicked
        dinero2.setText(String.valueOf(pl2.dinero));
    }//GEN-LAST:event_dinero2MouseClicked

    private void dinero3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dinero3MouseClicked
        dinero3.setText(String.valueOf(pl3.dinero));
    }//GEN-LAST:event_dinero3MouseClicked

    private void dinero4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dinero4MouseClicked
        dinero4.setText(String.valueOf(pl4.dinero));
    }//GEN-LAST:event_dinero4MouseClicked

    private void dinero5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dinero5MouseClicked
        dinero5.setText(String.valueOf(pl5.dinero));
    }//GEN-LAST:event_dinero5MouseClicked

    private void dinero6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dinero6MouseClicked
        dinero6.setText(String.valueOf(pl6.dinero));
    }//GEN-LAST:event_dinero6MouseClicked

    private void btninicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btninicioMouseClicked
        inicio();
        btninicio.setVisible(false);
        conta.setText(String.valueOf(cont));
        turno.setText(pl1.nombre);
    }//GEN-LAST:event_btninicioMouseClicked

    private void btnj1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnj1MouseClicked
        if (cont == 1) {
            dato = (int) Math.floor(Math.random() * 12 + 1);
            jugador1 += dato;
            JOptionPane.showMessageDialog(null, dato);
            pasoj1();
            verificarj1();
        }
    }//GEN-LAST:event_btnj1MouseClicked

    private void btnj2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnj2MouseClicked
        if (cont == 1) {
            dato = (int) Math.floor(Math.random() * 12 + 1);
            jugador1 += dato;
            JOptionPane.showMessageDialog(null, dato);
            pasoj1();
            verificarj1();
            pasoj2();
        } else if (cont == 2) {
            dato = (int) Math.floor(Math.random() * 12 + 1);
            jugador2 += dato;
            JOptionPane.showMessageDialog(null, dato);
            pasoj2();
            verificarj2();
            pasoj1();
        }

    }//GEN-LAST:event_btnj2MouseClicked

    private void btnj3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnj3MouseClicked
        if (cont == 1) {
            dato = (int) Math.floor(Math.random() * 12 + 1);
            jugador1 += dato;
            JOptionPane.showMessageDialog(null, dato);
            pasoj1();
            verificarj1();
            pasoj2();
            pasoj3();
        } else if (cont == 2) {
            dato = (int) Math.floor(Math.random() * 12 + 1);
            jugador2 += dato;
            JOptionPane.showMessageDialog(null, dato);
            pasoj2();
            verificarj2();
            pasoj3();
            pasoj1();
        } else if (cont == 3) {
            dato = (int) Math.floor(Math.random() * 12 + 1);
            jugador3 += dato;
            JOptionPane.showMessageDialog(null, dato);
            pasoj3();
            verificarj3();
            pasoj2();
            pasoj1();
        }
    }//GEN-LAST:event_btnj3MouseClicked

    private void btnj4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnj4MouseClicked
        if (cont == 1) {
            dato = (int) Math.floor(Math.random() * 12 + 1);
            jugador1 += dato;
            JOptionPane.showMessageDialog(null, dato);
            pasoj1();
            verificarj1();
            pasoj2();
            pasoj3();
            pasoj4();
        } else if (cont == 2) {
            dato = (int) Math.floor(Math.random() * 12 + 1);
            jugador2 += dato;
            JOptionPane.showMessageDialog(null, dato);
            pasoj2();
            verificarj2();
            pasoj4();
            pasoj3();
            pasoj1();
        } else if (cont == 3) {
            dato = (int) Math.floor(Math.random() * 12 + 1);
            jugador3 += dato;
            JOptionPane.showMessageDialog(null, dato);
            pasoj3();
            verificarj3();
            pasoj4();
            pasoj2();
            pasoj1();
        } else if (cont == 4) {
            dato = (int) Math.floor(Math.random() * 12 + 1);
            jugador4 += dato;
            JOptionPane.showMessageDialog(null, dato);
            pasoj4();
            verificarj4();
            pasoj3();
            pasoj2();
            pasoj1();
        }

    }//GEN-LAST:event_btnj4MouseClicked

    private void btnj5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnj5MouseClicked

        if (cont == 1) {
            dato = (int) Math.floor(Math.random() * 12 + 1);
            jugador1 += dato;
            JOptionPane.showMessageDialog(null, dato);
            pasoj1();
            verificarj1();
            pasoj2();
            pasoj3();
            pasoj4();
            pasoj5();
        } else if (cont == 2) {
            dato = (int) Math.floor(Math.random() * 12 + 1);
            jugador2 += dato;
            JOptionPane.showMessageDialog(null, dato);
            pasoj2();
            verificarj2();
            pasoj5();
            pasoj4();
            pasoj3();
            pasoj1();
        } else if (cont == 3) {
            dato = (int) Math.floor(Math.random() * 12 + 1);
            jugador3 += dato;
            JOptionPane.showMessageDialog(null, dato);
            pasoj3();
            verificarj3();
            pasoj5();
            pasoj4();
            pasoj2();
            pasoj1();
        } else if (cont == 4) {
            dato = (int) Math.floor(Math.random() * 12 + 1);
            jugador4 += dato;
            JOptionPane.showMessageDialog(null, dato);
            pasoj4();
            verificarj4();
            pasoj5();
            pasoj3();
            pasoj2();
            pasoj1();
        } else if (cont == 5) {
            dato = (int) Math.floor(Math.random() * 12 + 1);
            jugador5 += dato;
            JOptionPane.showMessageDialog(null, dato);
            pasoj5();
            verificarj5();
            pasoj4();
            pasoj3();
            pasoj2();
            pasoj1();
        }
    }//GEN-LAST:event_btnj5MouseClicked

    private void btnj6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnj6MouseClicked
        if (cont == 1) {
            dato = (int) Math.floor(Math.random() * 12 + 1);
            jugador1 += dato;
            JOptionPane.showMessageDialog(null, dato);
            pasoj1();
            verificarj1();
            pasoj2();
            pasoj3();
            pasoj4();
            pasoj5();
            pasoj6();
        } else if (cont == 2) {
            dato = (int) Math.floor(Math.random() * 12 + 1);
            jugador2 += dato;
            JOptionPane.showMessageDialog(null, dato);
            pasoj2();
            verificarj2();
            pasoj6();
            pasoj5();
            pasoj4();
            pasoj3();
            pasoj1();
        } else if (cont == 3) {
            dato = (int) Math.floor(Math.random() * 12 + 1);
            jugador3 += dato;
            JOptionPane.showMessageDialog(null, dato);
            pasoj3();
            verificarj3();
            pasoj6();
            pasoj5();
            pasoj4();
            pasoj2();
            pasoj1();
        } else if (cont == 4) {
            dato = (int) Math.floor(Math.random() * 12 + 1);
            jugador4 += dato;
            JOptionPane.showMessageDialog(null, dato);
            pasoj4();
            verificarj4();
            pasoj6();
            pasoj5();
            pasoj3();
            pasoj2();
            pasoj1();
        } else if (cont == 5) {
            dato = (int) Math.floor(Math.random() * 12 + 1);
            jugador5 += dato;
            JOptionPane.showMessageDialog(null, dato);
            pasoj5();
            verificarj5();
            pasoj6();
            pasoj4();
            pasoj3();
            pasoj2();
            pasoj1();
        } else if (cont == 6) {
            dato = (int) Math.floor(Math.random() * 12 + 1);
            jugador6 += dato;
            JOptionPane.showMessageDialog(null, dato);
            pasoj6();
            verificarj6();
            pasoj5();
            pasoj4();
            pasoj3();
            pasoj2();
            pasoj1();
        }
    }//GEN-LAST:event_btnj6MouseClicked

    private void btntirarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btntirarMouseClicked
//        turno();

        if (cont == 1) {
            cont = 2;
            conta.setText(String.valueOf(cont));
            turno.setText(pl2.nombre);
        } else if (cont == 2) {
            cont = 3;
            conta.setText(String.valueOf(cont));
            turno.setText(pl3.nombre);
        } else if (cont == 3) {
            cont = 4;
            conta.setText(String.valueOf(cont));
            turno.setText(pl4.nombre);
        } else if (cont == 4) {
            cont = 5;
            conta.setText(String.valueOf(cont));
            turno.setText(pl5.nombre);
        } else if (cont == 5) {
            cont = 6;
            conta.setText(String.valueOf(cont));
            turno.setText(pl6.nombre);
        } else if (cont == 6) {
            cont = 1;
            conta.setText(String.valueOf(cont));
            turno.setText(pl1.nombre);
        }


    }//GEN-LAST:event_btntirarMouseClicked

    private void btntirarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btntirarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btntirarMouseEntered

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
   JOptionPane.showMessageDialog(null, cont);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        jugador2 = 2;
        pasoj2();
        verificarj2();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if (cont == 1) {
            cont = 2;
            conta.setText(String.valueOf(cont));
            turno.setText(pl1.nombre);
        } else if (cont == 2) {
            cont = 1;
            conta.setText(String.valueOf(cont));
            turno.setText(pl2.nombre);
        }

    }//GEN-LAST:event_jButton5ActionPerformed

    private void turnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_turnoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_turnoMouseClicked

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
    private javax.swing.JLabel btninicio;
    private javax.swing.JLabel btnj1;
    private javax.swing.JLabel btnj2;
    private javax.swing.JLabel btnj3;
    private javax.swing.JLabel btnj4;
    private javax.swing.JLabel btnj5;
    private javax.swing.JLabel btnj6;
    private javax.swing.JLabel btntirar;
    public javax.swing.JLabel conta;
    public javax.swing.JLabel dinero;
    public javax.swing.JLabel dinero2;
    public javax.swing.JLabel dinero3;
    public javax.swing.JLabel dinero4;
    public javax.swing.JLabel dinero5;
    public javax.swing.JLabel dinero6;
    private javax.swing.JLabel ficha_1;
    private javax.swing.JLabel ficha_2;
    private javax.swing.JLabel ficha_3;
    private javax.swing.JLabel ficha_4;
    private javax.swing.JLabel ficha_5;
    private javax.swing.JLabel ficha_6;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    public javax.swing.JLabel pay;
    public javax.swing.JLabel player;
    public javax.swing.JLabel player2;
    public javax.swing.JLabel player3;
    public javax.swing.JLabel player4;
    public javax.swing.JLabel player5;
    public javax.swing.JLabel player6;
    public javax.swing.JLabel prop;
    public javax.swing.JLabel prueba;
    private javax.swing.JLabel tablero;
    private javax.swing.JLabel turno;
    public javax.swing.JLabel v1;
    public javax.swing.JLabel v2;
    public javax.swing.JLabel v3;
    public javax.swing.JLabel v4;
    public javax.swing.JLabel v5;
    public javax.swing.JLabel v6;
    // End of variables declaration//GEN-END:variables

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

    void turno() {
        if (!"".equals(player.getText())) {
            if (cont == 1) {
                turno.setText(pl1.nombre);
                cont = 1;
                conta.setText(String.valueOf(cont));
            }
        }
        if (!"".equals(player.getText()) && !"".equals(dinero.getText())) {
            if (cont == 1) {
                turno.setText(pl2.nombre);
                cont = 2;
                conta.setText(String.valueOf(cont));
            } else if (cont == 2) {
                turno.setText(pl3.nombre);
                cont = 1;
                conta.setText(String.valueOf(cont));
            }
        }
        if (!"".equals(player.getText()) && !"".equals(dinero.getText()) && !"".equals(v1.getText())) {
            if (cont == 1) {
                turno.setText(pl2.nombre);
                cont = 2;
                conta.setText(String.valueOf(cont));
            } else if (cont == 2) {
                turno.setText(pl3.nombre);
                cont = 3;
                conta.setText(String.valueOf(cont));
            } else if (cont == 3) {
                turno.setText(pl4.nombre);
                cont = 1;
                conta.setText(String.valueOf(cont));
            }
        }
        if (!"".equals(player.getText()) && !"".equals(dinero.getText()) && !"".equals(v1.getText()) && !"".equals(player4.getText())) {
            if (cont == 1) {
                turno.setText(pl2.nombre);
                cont = 2;
                conta.setText(String.valueOf(cont));
            } else if (cont == 2) {
                turno.setText(pl3.nombre);
                cont = 3;
                conta.setText(String.valueOf(cont));
            } else if (cont == 3) {
                turno.setText(pl4.nombre);
                cont = 4;
                conta.setText(String.valueOf(cont));
            } else if (cont == 4) {
                turno.setText(pl5.nombre);
                cont = 1;
                conta.setText(String.valueOf(cont));
            }
        }
        if (!"".equals(player.getText()) && !"".equals(dinero.getText()) && !"".equals(v1.getText()) && !"".equals(player4.getText()) && !"".equals(player5.getText())) {
            if (cont == 1) {
                turno.setText(pl2.nombre);
                cont = 2;
                conta.setText(String.valueOf(cont));
            } else if (cont == 2) {
                turno.setText(pl3.nombre);
                cont = 3;
                conta.setText(String.valueOf(cont));
            } else if (cont == 3) {
                turno.setText(pl4.nombre);
                cont = 4;
                conta.setText(String.valueOf(cont));
            } else if (cont == 4) {
                turno.setText(pl5.nombre);
                cont = 5;
                conta.setText(String.valueOf(cont));
            } else if (cont == 5) {
                turno.setText(pl6.nombre);
                cont = 1;
                conta.setText(String.valueOf(cont));
            }
        }
        if (!"".equals(player.getText()) && !"".equals(dinero.getText()) && !"".equals(v1.getText()) && !"".equals(player4.getText()) && !"".equals(player5.getText()) && !"".equals(player6.getText())) {
            if (cont == 1) {
                turno.setText(pl2.nombre);
                cont = 2;
                conta.setText(String.valueOf(cont));
            } else if (cont == 2) {
                turno.setText(pl3.nombre);
                cont = 3;
                conta.setText(String.valueOf(cont));
            } else if (cont == 3) {
                turno.setText(pl4.nombre);
                cont = 4;
                conta.setText(String.valueOf(cont));
            } else if (cont == 4) {
                turno.setText(pl5.nombre);
                cont = 5;
                conta.setText(String.valueOf(cont));
            } else if (cont == 5) {
                turno.setText(pl6.nombre);
                cont = 6;
                conta.setText(String.valueOf(cont));
            } else if (cont == 6) {
                turno.setText(pl1.nombre);
                cont = 1;
                conta.setText(String.valueOf(cont));
            }

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
            pl1.dinero += 200;
            dinero.setText(String.valueOf(pl1.dinero));
            reset = jugador1 - 40;
            jugador1 = reset;
            JOptionPane.showMessageDialog(null, "Ganaste Q200");

        } else if (jugador1 == 2) {

            CALLE_JACKSON jack1 = new CALLE_JACKSON();
            if ("".equals(jack1.dueño)) {
                VCALLE_JACKSON jack = new VCALLE_JACKSON();
                jack.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le pagaste " + jacki.paso + " a " + jacki.dueño);
                pay.setText(String.valueOf(jacki.paso));
                prop.setText(jacki.dueño);
                pagar();                
               
            }
        } else if (jugador1 == 3) {
            JOptionPane.showMessageDialog(null, "Pesadilla");
        } else if (jugador1 == 4) {
            LOS_BALDIOS bali = new LOS_BALDIOS();
            if ("".equals(bali.dueño)) {
                VLOS_BALDÍOS bal = new VLOS_BALDÍOS();
                bal.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + bali.paso + " a " + bali.dueño);
            }
        } else if (jugador1 == 5) {
            JOptionPane.showMessageDialog(null, "Impuestos");
        } else if (jugador1 == 6) {
            TERMINAL_DE_BUSES busi = new TERMINAL_DE_BUSES();
            if ("".equals(busi.dueño)) {
                vTERMINAL_DE_BUSES bus = new vTERMINAL_DE_BUSES();
                bus.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + busi.paso + " a " + busi.dueño);
            }
        } else if (jugador1 == 7) {
            BAR_BLACK_SPOT bari = new BAR_BLACK_SPOT();
            if ("".equals(bari.dueño)) {
                VBAR_BLACK_SPOT bar = new VBAR_BLACK_SPOT();
                bar.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + bari.paso + " a " + bari.dueño);
            }
        } else if (jugador1 == 8) {
            JOptionPane.showMessageDialog(null, "suspiro");
        } else if (jugador1 == 9) {
            CASA_NEIBOLT neii = new CASA_NEIBOLT();
            if ("".equals(neii.dueño)) {
                VCASA_NEIBOLT nei = new VCASA_NEIBOLT();
                nei.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + neii.paso + " a " + neii.dueño);
            }
        } else if (jugador1 == 10) {
            CALLE_TURNER turi = new CALLE_TURNER();
            if ("".equals(turi.dueño)) {
                VCALLE_TURNER tur = new VCALLE_TURNER();
                tur.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + turi.paso + " a " + turi.dueño);
            }
        } else if (jugador1 == 11) {
            JOptionPane.showMessageDialog(null, "pasadita de carcel");
        } else if (jugador1 == 12) {
            BAR_FALCON fali = new BAR_FALCON();
            if ("".equals(fali.dueño)) {
                VBAR_FALCON fal = new VBAR_FALCON();
                fal.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + fali.paso + " a " + fali.dueño);
            }
        } else if (jugador1 == 13) {
            BIBLIOTECA_PUBLICA bili = new BIBLIOTECA_PUBLICA();
            if ("".equals(bili.dueño)) {
                VBIBLIOTECA_PUBLICA bil = new VBIBLIOTECA_PUBLICA();
                bil.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + bili.paso + " a " + bili.dueño);
            }
        } else if (jugador1 == 14) {
            IGLESIA_BAUTISTA iglei = new IGLESIA_BAUTISTA();
            if ("".equals(iglei.dueño)) {
                VIGLESIA_BAUTISTA igle = new VIGLESIA_BAUTISTA();
                igle.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + iglei.paso + " a " + iglei.dueño);
            }
        } else if (jugador1 == 15) {
            TIENDA_COSTELLO tiei = new TIENDA_COSTELLO();
            if ("".equals(tiei.dueño)) {
                VTIENDA_COSTELLO tie = new VTIENDA_COSTELLO();
                tie.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + tiei.paso + " a " + tiei.dueño);
            }
        } else if (jugador1 == 16) {
            PUENTE_DE_LOS_BESOS besosi = new PUENTE_DE_LOS_BESOS();
            if ("".equals(besosi.dueño)) {
                VPUENTE_DE_LOS_BESOS besos = new VPUENTE_DE_LOS_BESOS();
                besos.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + besosi.paso + " a " + besosi.dueño);
            }
        } else if (jugador1 == 17) {
            CENTRO_COMERCIAL comei = new CENTRO_COMERCIAL();
            if ("".equals(comei.dueño)) {
                VCENTRO_COMERCIAL come = new VCENTRO_COMERCIAL();
                come.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + comei.paso + " a " + comei.dueño);
            }
        } else if (jugador1 == 18) {
            JOptionPane.showMessageDialog(null, "pesadilla");
        } else if (jugador1 == 19) {
            ESCUELA_PRIMARIA primai = new ESCUELA_PRIMARIA();
            if ("".equals(primai.dueño)) {
                VESCUELA_PRIMARIA prima = new VESCUELA_PRIMARIA();
                prima.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + primai.paso + " a " + primai.dueño);
            }
        } else if (jugador1 == 20) {
            TEATRO_ALADDIN teatroi = new TEATRO_ALADDIN();
            if ("".equals(teatroi.dueño)) {
                VTEATRO_ALADDIN teatro = new VTEATRO_ALADDIN();
                teatro.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + teatroi.paso + " a " + teatroi.dueño);
            }
        } else if (jugador1 == 21) {
            JOptionPane.showMessageDialog(null, "descanso gratis");
        } else if (jugador1 == 22) {
            CASA_CLUB clubi = new CASA_CLUB();
            if ("".equals(clubi.dueño)) {
                VCASA_CLUB club = new VCASA_CLUB();
                club.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + clubi.paso + " a " + clubi.dueño);
            }
        } else if (jugador1 == 23) {
            JOptionPane.showMessageDialog(null, "suspiro");
        } else if (jugador1 == 24) {
            RESTAURANTE_JADE jadei = new RESTAURANTE_JADE();
            if ("".equals(jadei.dueño)) {
                VRESTAURANTE_JADE jade = new VRESTAURANTE_JADE();
                jade.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + jadei.paso + " a " + jadei.dueño);
            }
        } else if (jugador1 == 25) {
            CASA_DE_HUESPEDES huesi = new CASA_DE_HUESPEDES();
            if ("".equals(huesi.dueño)) {
                VCASA_DE_HUESPEDES hues = new VCASA_DE_HUESPEDES();
                hues.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + huesi.paso + " a " + huesi.dueño);
            }
        } else if (jugador1 == 26) {
            ESCUELA_SECUNDARIA secui = new ESCUELA_SECUNDARIA();
            if ("".equals(secui.dueño)) {
                VESCUELA_SECUNDARIA secu = new VESCUELA_SECUNDARIA();
                secu.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + secui.paso + " a " + secui.dueño);
            }
        } else if (jugador1 == 27) {
            PARQUE_MEMORIAL memoi = new PARQUE_MEMORIAL();
            if ("".equals(memoi.dueño)) {
                VPARQUE_MEMORIAL memo = new VPARQUE_MEMORIAL();
                memo.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + memoi.paso + " a " + memoi.dueño);
            }
        } else if (jugador1 == 28) {
            FARMACIA_KEENE farmi = new FARMACIA_KEENE();
            if ("".equals(farmi.dueño)) {
                VFARMACIA_KEENE farm = new VFARMACIA_KEENE();
                farm.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + farmi.paso + " a " + farmi.dueño);
            }
        } else if (jugador1 == 29) {
            REPRESA repri = new REPRESA();
            if ("".equals(repri.dueño)) {
                VREPRESA repre = new VREPRESA();
                repre.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + repri.paso + " a " + repri.dueño);
            }
        } else if (jugador1 == 30) {
            CASA_DE_LA_RISA risai = new CASA_DE_LA_RISA();
            if ("".equals(risai.dueño)) {
                VCASA_DE_LA_RISA risa = new VCASA_DE_LA_RISA();
                risa.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + risai.paso + " a " + risai.dueño);
            }
        } else if (jugador1 == 31) {
            JOptionPane.showMessageDialog(null, "vaya a la carcel");
        } else if (jugador1 == 32) {
            LA_CANTERA canterai = new LA_CANTERA();
            if ("".equals(canterai.dueño)) {
                VLA_CANTERA cantera = new VLA_CANTERA();
                cantera.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + canterai.paso + " a " + canterai.dueño);
            }
        } else if (jugador1 == 33) {
            CALLE_WITCHMAN witi = new CALLE_WITCHMAN();
            if ("".equals(witi.dueño)) {
                VCALLE_WITCHMAN wit = new VCALLE_WITCHMAN();
                wit.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + witi.paso + " a " + witi.dueño);
            }
        } else if (jugador1 == 34) {
            JOptionPane.showMessageDialog(null, "pesadilla");
        } else if (jugador1 == 35) {
            PARQUE_STRAWFORD strawi = new PARQUE_STRAWFORD();
            if ("".equals(strawi.dueño)) {
                VPARQUE_STRAWFORD straw = new VPARQUE_STRAWFORD();
                straw.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + strawi.paso + " a " + strawi.dueño);
            }
        } else if (jugador1 == 36) {
            PARQUE_BASSEY basi = new PARQUE_BASSEY();
            if ("".equals(basi.dueño)) {
                VPARQUE_BASSEY bas = new VPARQUE_BASSEY();
                bas.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + basi.paso + " a " + basi.dueño);
            }
        } else if (jugador1 == 37) {
            JOptionPane.showMessageDialog(null, "suspiro");
        } else if (jugador1 == 38) {
            CINE_CAPITOL capii = new CINE_CAPITOL();
            if ("".equals(capii.dueño)) {
                VCINE_CAPITOL capi = new VCINE_CAPITOL();
                capi.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + capii.paso + " a " + capii.dueño);
            }
        } else if (jugador1 == 39) {
            JOptionPane.showMessageDialog(null, "impuesto de lujo");
        } else if (jugador1 == 40) {
            CASA_ANTIGUA casai = new CASA_ANTIGUA();
            if ("".equals(casai.dueño)) {
                VLA_CASA_ANTIGUA casa = new VLA_CASA_ANTIGUA();
                casa.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + casai.paso + " a " + casai.dueño);
            }
        }

    }

    void verificarj2() {
        if (jugador2 > 40) {
            int reset;
            pl2.dinero += 200;
            dinero2.setText(String.valueOf(pl2.dinero));
            reset = jugador2 - 40;
            jugador2 = reset;
            JOptionPane.showMessageDialog(null, "Ganaste Q200");

        } else if (jugador2 == 2) {

            CALLE_JACKSON jack1 = new CALLE_JACKSON();
            if ("".equals(jack1.dueño)) {
                VCALLE_JACKSON jack = new VCALLE_JACKSON();
                jack.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + jacki.paso + " a " + jacki.dueño);
               pay.setText(String.valueOf(jacki.paso));
                prop.setText(jacki.dueño);
                pagar();  
            }
        } else if (jugador2 == 3) {
            JOptionPane.showMessageDialog(null, "Pesadilla");
        } else if (jugador2 == 4) {
            LOS_BALDIOS bali = new LOS_BALDIOS();
            if ("".equals(bali.dueño)) {
                VLOS_BALDÍOS bal = new VLOS_BALDÍOS();
                bal.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + bali.paso + " a " + bali.dueño);
            }
        } else if (jugador2 == 5) {
            JOptionPane.showMessageDialog(null, "Impuestos");
        } else if (jugador2 == 6) {
            TERMINAL_DE_BUSES busi = new TERMINAL_DE_BUSES();
            if ("".equals(busi.dueño)) {
                vTERMINAL_DE_BUSES bus = new vTERMINAL_DE_BUSES();
                bus.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + busi.paso + " a " + busi.dueño);
            }
        } else if (jugador2 == 7) {
            BAR_BLACK_SPOT bari = new BAR_BLACK_SPOT();
            if ("".equals(bari.dueño)) {
                VBAR_BLACK_SPOT bar = new VBAR_BLACK_SPOT();
                bar.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + bari.paso + " a " + bari.dueño);
            }
        } else if (jugador2 == 8) {
            JOptionPane.showMessageDialog(null, "suspiro");
        } else if (jugador2 == 9) {
            CASA_NEIBOLT neii = new CASA_NEIBOLT();
            if ("".equals(neii.dueño)) {
                VCASA_NEIBOLT nei = new VCASA_NEIBOLT();
                nei.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + neii.paso + " a " + neii.dueño);
            }
        } else if (jugador2 == 10) {
            CALLE_TURNER turi = new CALLE_TURNER();
            if ("".equals(turi.dueño)) {
                VCALLE_TURNER tur = new VCALLE_TURNER();
                tur.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + turi.paso + " a " + turi.dueño);
            }
        } else if (jugador2 == 11) {
            JOptionPane.showMessageDialog(null, "pasadita de carcel");
        } else if (jugador2 == 12) {
            BAR_FALCON fali = new BAR_FALCON();
            if ("".equals(fali.dueño)) {
                VBAR_FALCON fal = new VBAR_FALCON();
                fal.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + fali.paso + " a " + fali.dueño);
            }
        } else if (jugador2 == 13) {
            BIBLIOTECA_PUBLICA bili = new BIBLIOTECA_PUBLICA();
            if ("".equals(bili.dueño)) {
                VBIBLIOTECA_PUBLICA bil = new VBIBLIOTECA_PUBLICA();
                bil.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + bili.paso + " a " + bili.dueño);
            }
        } else if (jugador2 == 14) {
            IGLESIA_BAUTISTA iglei = new IGLESIA_BAUTISTA();
            if ("".equals(iglei.dueño)) {
                VIGLESIA_BAUTISTA igle = new VIGLESIA_BAUTISTA();
                igle.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + iglei.paso + " a " + iglei.dueño);
            }
        } else if (jugador2 == 15) {
            TIENDA_COSTELLO tiei = new TIENDA_COSTELLO();
            if ("".equals(tiei.dueño)) {
                VTIENDA_COSTELLO tie = new VTIENDA_COSTELLO();
                tie.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + tiei.paso + " a " + tiei.dueño);
            }
        } else if (jugador2 == 16) {
            PUENTE_DE_LOS_BESOS besosi = new PUENTE_DE_LOS_BESOS();
            if ("".equals(besosi.dueño)) {
                VPUENTE_DE_LOS_BESOS besos = new VPUENTE_DE_LOS_BESOS();
                besos.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + besosi.paso + " a " + besosi.dueño);
            }
        } else if (jugador2 == 17) {
            CENTRO_COMERCIAL comei = new CENTRO_COMERCIAL();
            if ("".equals(comei.dueño)) {
                VCENTRO_COMERCIAL come = new VCENTRO_COMERCIAL();
                come.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + comei.paso + " a " + comei.dueño);
            }
        } else if (jugador2 == 18) {
            JOptionPane.showMessageDialog(null, "pesadilla");
        } else if (jugador2 == 19) {
            ESCUELA_PRIMARIA primai = new ESCUELA_PRIMARIA();
            if ("".equals(primai.dueño)) {
                VESCUELA_PRIMARIA prima = new VESCUELA_PRIMARIA();
                prima.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + primai.paso + " a " + primai.dueño);
            }
        } else if (jugador2 == 20) {
            TEATRO_ALADDIN teatroi = new TEATRO_ALADDIN();
            if ("".equals(teatroi.dueño)) {
                VTEATRO_ALADDIN teatro = new VTEATRO_ALADDIN();
                teatro.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + teatroi.paso + " a " + teatroi.dueño);
            }
        } else if (jugador2 == 21) {
            JOptionPane.showMessageDialog(null, "descanso gratis");
        } else if (jugador2 == 22) {
            CASA_CLUB clubi = new CASA_CLUB();
            if ("".equals(clubi.dueño)) {
                VCASA_CLUB club = new VCASA_CLUB();
                club.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + clubi.paso + " a " + clubi.dueño);
            }
        } else if (jugador2 == 23) {
            JOptionPane.showMessageDialog(null, "suspiro");
        } else if (jugador2 == 24) {
            RESTAURANTE_JADE jadei = new RESTAURANTE_JADE();
            if ("".equals(jadei.dueño)) {
                VRESTAURANTE_JADE jade = new VRESTAURANTE_JADE();
                jade.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + jadei.paso + " a " + jadei.dueño);
            }
        } else if (jugador2 == 25) {
            CASA_DE_HUESPEDES huesi = new CASA_DE_HUESPEDES();
            if ("".equals(huesi.dueño)) {
                VCASA_DE_HUESPEDES hues = new VCASA_DE_HUESPEDES();
                hues.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + huesi.paso + " a " + huesi.dueño);
            }
        } else if (jugador2 == 26) {
            ESCUELA_SECUNDARIA secui = new ESCUELA_SECUNDARIA();
            if ("".equals(secui.dueño)) {
                VESCUELA_SECUNDARIA secu = new VESCUELA_SECUNDARIA();
                secu.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + secui.paso + " a " + secui.dueño);
            }
        } else if (jugador2 == 27) {
            PARQUE_MEMORIAL memoi = new PARQUE_MEMORIAL();
            if ("".equals(memoi.dueño)) {
                VPARQUE_MEMORIAL memo = new VPARQUE_MEMORIAL();
                memo.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + memoi.paso + " a " + memoi.dueño);
            }
        } else if (jugador2 == 28) {
            FARMACIA_KEENE farmi = new FARMACIA_KEENE();
            if ("".equals(farmi.dueño)) {
                VFARMACIA_KEENE farm = new VFARMACIA_KEENE();
                farm.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + farmi.paso + " a " + farmi.dueño);
            }
        } else if (jugador2 == 29) {
            REPRESA repri = new REPRESA();
            if ("".equals(repri.dueño)) {
                VREPRESA repre = new VREPRESA();
                repre.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + repri.paso + " a " + repri.dueño);
            }
        } else if (jugador2 == 30) {
            CASA_DE_LA_RISA risai = new CASA_DE_LA_RISA();
            if ("".equals(risai.dueño)) {
                VCASA_DE_LA_RISA risa = new VCASA_DE_LA_RISA();
                risa.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + risai.paso + " a " + risai.dueño);
            }
        } else if (jugador2 == 31) {
            JOptionPane.showMessageDialog(null, "vaya a la carcel");
        } else if (jugador2 == 32) {
            LA_CANTERA canterai = new LA_CANTERA();
            if ("".equals(canterai.dueño)) {
                VLA_CANTERA cantera = new VLA_CANTERA();
                cantera.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + canterai.paso + " a " + canterai.dueño);
            }
        } else if (jugador2 == 33) {
            CALLE_WITCHMAN witi = new CALLE_WITCHMAN();
            if ("".equals(witi.dueño)) {
                VCALLE_WITCHMAN wit = new VCALLE_WITCHMAN();
                wit.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + witi.paso + " a " + witi.dueño);
            }
        } else if (jugador2 == 34) {
            JOptionPane.showMessageDialog(null, "pesadilla");
        } else if (jugador2 == 35) {
            PARQUE_STRAWFORD strawi = new PARQUE_STRAWFORD();
            if ("".equals(strawi.dueño)) {
                VPARQUE_STRAWFORD straw = new VPARQUE_STRAWFORD();
                straw.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + strawi.paso + " a " + strawi.dueño);
            }
        } else if (jugador2 == 36) {
            PARQUE_BASSEY basi = new PARQUE_BASSEY();
            if ("".equals(basi.dueño)) {
                VPARQUE_BASSEY bas = new VPARQUE_BASSEY();
                bas.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + basi.paso + " a " + basi.dueño);
            }
        } else if (jugador2 == 37) {
            JOptionPane.showMessageDialog(null, "suspiro");
        } else if (jugador2 == 38) {
            CINE_CAPITOL capii = new CINE_CAPITOL();
            if ("".equals(capii.dueño)) {
                VCINE_CAPITOL capi = new VCINE_CAPITOL();
                capi.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + capii.paso + " a " + capii.dueño);
            }
        } else if (jugador2 == 39) {
            JOptionPane.showMessageDialog(null, "impuesto de lujo");
        } else if (jugador2 == 40) {
            CASA_ANTIGUA casai = new CASA_ANTIGUA();
            if ("".equals(casai.dueño)) {
                VLA_CASA_ANTIGUA casa = new VLA_CASA_ANTIGUA();
                casa.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + casai.paso + " a " + casai.dueño);
            }
        }

    }

    void verificarj3() {
        if (jugador3 > 40) {
            int reset;
            pl3.dinero += 200;
            dinero3.setText(String.valueOf(pl3.dinero));
            reset = jugador3 - 40;
            jugador3 = reset;
            JOptionPane.showMessageDialog(null, "Ganaste Q200");

        } else if (jugador3 == 2) {

            CALLE_JACKSON jack1 = new CALLE_JACKSON();
            if ("".equals(jack1.dueño)) {
                VCALLE_JACKSON jack = new VCALLE_JACKSON();
                jack.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + jacki.paso + " a " + jacki.dueño);
            }
        } else if (jugador3 == 3) {
            JOptionPane.showMessageDialog(null, "Pesadilla");
        } else if (jugador3 == 4) {
            LOS_BALDIOS bali = new LOS_BALDIOS();
            if ("".equals(bali.dueño)) {
                VLOS_BALDÍOS bal = new VLOS_BALDÍOS();
                bal.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + bali.paso + " a " + bali.dueño);
            }
        } else if (jugador3 == 5) {
            JOptionPane.showMessageDialog(null, "Impuestos");
        } else if (jugador3 == 6) {
            TERMINAL_DE_BUSES busi = new TERMINAL_DE_BUSES();
            if ("".equals(busi.dueño)) {
                vTERMINAL_DE_BUSES bus = new vTERMINAL_DE_BUSES();
                bus.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + busi.paso + " a " + busi.dueño);
            }
        } else if (jugador3 == 7) {
            BAR_BLACK_SPOT bari = new BAR_BLACK_SPOT();
            if ("".equals(bari.dueño)) {
                VBAR_BLACK_SPOT bar = new VBAR_BLACK_SPOT();
                bar.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + bari.paso + " a " + bari.dueño);
            }
        } else if (jugador3 == 8) {
            JOptionPane.showMessageDialog(null, "suspiro");
        } else if (jugador3 == 9) {
            CASA_NEIBOLT neii = new CASA_NEIBOLT();
            if ("".equals(neii.dueño)) {
                VCASA_NEIBOLT nei = new VCASA_NEIBOLT();
                nei.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + neii.paso + " a " + neii.dueño);
            }
        } else if (jugador3 == 10) {
            CALLE_TURNER turi = new CALLE_TURNER();
            if ("".equals(turi.dueño)) {
                VCALLE_TURNER tur = new VCALLE_TURNER();
                tur.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + turi.paso + " a " + turi.dueño);
            }
        } else if (jugador3 == 11) {
            JOptionPane.showMessageDialog(null, "pasadita de carcel");
        } else if (jugador3 == 12) {
            BAR_FALCON fali = new BAR_FALCON();
            if ("".equals(fali.dueño)) {
                VBAR_FALCON fal = new VBAR_FALCON();
                fal.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + fali.paso + " a " + fali.dueño);
            }
        } else if (jugador3 == 13) {
            BIBLIOTECA_PUBLICA bili = new BIBLIOTECA_PUBLICA();
            if ("".equals(bili.dueño)) {
                VBIBLIOTECA_PUBLICA bil = new VBIBLIOTECA_PUBLICA();
                bil.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + bili.paso + " a " + bili.dueño);
            }
        } else if (jugador3 == 14) {
            IGLESIA_BAUTISTA iglei = new IGLESIA_BAUTISTA();
            if ("".equals(iglei.dueño)) {
                VIGLESIA_BAUTISTA igle = new VIGLESIA_BAUTISTA();
                igle.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + iglei.paso + " a " + iglei.dueño);
            }
        } else if (jugador3 == 15) {
            TIENDA_COSTELLO tiei = new TIENDA_COSTELLO();
            if ("".equals(tiei.dueño)) {
                VTIENDA_COSTELLO tie = new VTIENDA_COSTELLO();
                tie.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + tiei.paso + " a " + tiei.dueño);
            }
        } else if (jugador3 == 16) {
            PUENTE_DE_LOS_BESOS besosi = new PUENTE_DE_LOS_BESOS();
            if ("".equals(besosi.dueño)) {
                VPUENTE_DE_LOS_BESOS besos = new VPUENTE_DE_LOS_BESOS();
                besos.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + besosi.paso + " a " + besosi.dueño);
            }
        } else if (jugador3 == 17) {
            CENTRO_COMERCIAL comei = new CENTRO_COMERCIAL();
            if ("".equals(comei.dueño)) {
                VCENTRO_COMERCIAL come = new VCENTRO_COMERCIAL();
                come.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + comei.paso + " a " + comei.dueño);
            }
        } else if (jugador3 == 18) {
            JOptionPane.showMessageDialog(null, "pesadilla");
        } else if (jugador3 == 19) {
            ESCUELA_PRIMARIA primai = new ESCUELA_PRIMARIA();
            if ("".equals(primai.dueño)) {
                VESCUELA_PRIMARIA prima = new VESCUELA_PRIMARIA();
                prima.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + primai.paso + " a " + primai.dueño);
            }
        } else if (jugador3 == 20) {
            TEATRO_ALADDIN teatroi = new TEATRO_ALADDIN();
            if ("".equals(teatroi.dueño)) {
                VTEATRO_ALADDIN teatro = new VTEATRO_ALADDIN();
                teatro.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + teatroi.paso + " a " + teatroi.dueño);
            }
        } else if (jugador3 == 21) {
            JOptionPane.showMessageDialog(null, "descanso gratis");
        } else if (jugador3 == 22) {
            CASA_CLUB clubi = new CASA_CLUB();
            if ("".equals(clubi.dueño)) {
                VCASA_CLUB club = new VCASA_CLUB();
                club.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + clubi.paso + " a " + clubi.dueño);
            }
        } else if (jugador3 == 23) {
            JOptionPane.showMessageDialog(null, "suspiro");
        } else if (jugador3 == 24) {
            RESTAURANTE_JADE jadei = new RESTAURANTE_JADE();
            if ("".equals(jadei.dueño)) {
                VRESTAURANTE_JADE jade = new VRESTAURANTE_JADE();
                jade.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + jadei.paso + " a " + jadei.dueño);
            }
        } else if (jugador3 == 25) {
            CASA_DE_HUESPEDES huesi = new CASA_DE_HUESPEDES();
            if ("".equals(huesi.dueño)) {
                VCASA_DE_HUESPEDES hues = new VCASA_DE_HUESPEDES();
                hues.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + huesi.paso + " a " + huesi.dueño);
            }
        } else if (jugador3 == 26) {
            ESCUELA_SECUNDARIA secui = new ESCUELA_SECUNDARIA();
            if ("".equals(secui.dueño)) {
                VESCUELA_SECUNDARIA secu = new VESCUELA_SECUNDARIA();
                secu.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + secui.paso + " a " + secui.dueño);
            }
        } else if (jugador3 == 27) {
            PARQUE_MEMORIAL memoi = new PARQUE_MEMORIAL();
            if ("".equals(memoi.dueño)) {
                VPARQUE_MEMORIAL memo = new VPARQUE_MEMORIAL();
                memo.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + memoi.paso + " a " + memoi.dueño);
            }
        } else if (jugador3 == 28) {
            FARMACIA_KEENE farmi = new FARMACIA_KEENE();
            if ("".equals(farmi.dueño)) {
                VFARMACIA_KEENE farm = new VFARMACIA_KEENE();
                farm.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + farmi.paso + " a " + farmi.dueño);
            }
        } else if (jugador3 == 29) {
            REPRESA repri = new REPRESA();
            if ("".equals(repri.dueño)) {
                VREPRESA repre = new VREPRESA();
                repre.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + repri.paso + " a " + repri.dueño);
            }
        } else if (jugador3 == 30) {
            CASA_DE_LA_RISA risai = new CASA_DE_LA_RISA();
            if ("".equals(risai.dueño)) {
                VCASA_DE_LA_RISA risa = new VCASA_DE_LA_RISA();
                risa.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + risai.paso + " a " + risai.dueño);
            }
        } else if (jugador3 == 31) {
            JOptionPane.showMessageDialog(null, "vaya a la carcel");
        } else if (jugador3 == 32) {
            LA_CANTERA canterai = new LA_CANTERA();
            if ("".equals(canterai.dueño)) {
                VLA_CANTERA cantera = new VLA_CANTERA();
                cantera.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + canterai.paso + " a " + canterai.dueño);
            }
        } else if (jugador3 == 33) {
            CALLE_WITCHMAN witi = new CALLE_WITCHMAN();
            if ("".equals(witi.dueño)) {
                VCALLE_WITCHMAN wit = new VCALLE_WITCHMAN();
                wit.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + witi.paso + " a " + witi.dueño);
            }
        } else if (jugador3 == 34) {
            JOptionPane.showMessageDialog(null, "pesadilla");
        } else if (jugador3 == 35) {
            PARQUE_STRAWFORD strawi = new PARQUE_STRAWFORD();
            if ("".equals(strawi.dueño)) {
                VPARQUE_STRAWFORD straw = new VPARQUE_STRAWFORD();
                straw.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + strawi.paso + " a " + strawi.dueño);
            }
        } else if (jugador3 == 36) {
            PARQUE_BASSEY basi = new PARQUE_BASSEY();
            if ("".equals(basi.dueño)) {
                VPARQUE_BASSEY bas = new VPARQUE_BASSEY();
                bas.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + basi.paso + " a " + basi.dueño);
            }
        } else if (jugador3 == 37) {
            JOptionPane.showMessageDialog(null, "suspiro");
        } else if (jugador3 == 38) {
            CINE_CAPITOL capii = new CINE_CAPITOL();
            if ("".equals(capii.dueño)) {
                VCINE_CAPITOL capi = new VCINE_CAPITOL();
                capi.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + capii.paso + " a " + capii.dueño);
            }
        } else if (jugador3 == 39) {
            JOptionPane.showMessageDialog(null, "impuesto de lujo");
        } else if (jugador3 == 40) {
            CASA_ANTIGUA casai = new CASA_ANTIGUA();
            if ("".equals(casai.dueño)) {
                VLA_CASA_ANTIGUA casa = new VLA_CASA_ANTIGUA();
                casa.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + casai.paso + " a " + casai.dueño);
            }
        }

    }

    void verificarj4() {
        if (jugador4 > 40) {
            int reset;
            pl4.dinero += 200;
            dinero4.setText(String.valueOf(pl4.dinero));
            reset = jugador4 - 40;
            jugador4 = reset;
            JOptionPane.showMessageDialog(null, "Ganaste Q200");

        } else if (jugador4 == 2) {

            CALLE_JACKSON jack1 = new CALLE_JACKSON();
            if ("".equals(jack1.dueño)) {
                VCALLE_JACKSON jack = new VCALLE_JACKSON();
                jack.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + jacki.paso + " a " + jacki.dueño);
            }
        } else if (jugador4 == 3) {
            JOptionPane.showMessageDialog(null, "Pesadilla");
        } else if (jugador4 == 4) {
            LOS_BALDIOS bali = new LOS_BALDIOS();
            if ("".equals(bali.dueño)) {
                VLOS_BALDÍOS bal = new VLOS_BALDÍOS();
                bal.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + bali.paso + " a " + bali.dueño);
            }
        } else if (jugador4 == 5) {
            JOptionPane.showMessageDialog(null, "Impuestos");
        } else if (jugador4 == 6) {
            TERMINAL_DE_BUSES busi = new TERMINAL_DE_BUSES();
            if ("".equals(busi.dueño)) {
                vTERMINAL_DE_BUSES bus = new vTERMINAL_DE_BUSES();
                bus.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + busi.paso + " a " + busi.dueño);
            }
        } else if (jugador4 == 7) {
            BAR_BLACK_SPOT bari = new BAR_BLACK_SPOT();
            if ("".equals(bari.dueño)) {
                VBAR_BLACK_SPOT bar = new VBAR_BLACK_SPOT();
                bar.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + bari.paso + " a " + bari.dueño);
            }
        } else if (jugador4 == 8) {
            JOptionPane.showMessageDialog(null, "suspiro");
        } else if (jugador4 == 9) {
            CASA_NEIBOLT neii = new CASA_NEIBOLT();
            if ("".equals(neii.dueño)) {
                VCASA_NEIBOLT nei = new VCASA_NEIBOLT();
                nei.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + neii.paso + " a " + neii.dueño);
            }
        } else if (jugador4 == 10) {
            CALLE_TURNER turi = new CALLE_TURNER();
            if ("".equals(turi.dueño)) {
                VCALLE_TURNER tur = new VCALLE_TURNER();
                tur.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + turi.paso + " a " + turi.dueño);
            }
        } else if (jugador4 == 11) {
            JOptionPane.showMessageDialog(null, "pasadita de carcel");
        } else if (jugador4 == 12) {
            BAR_FALCON fali = new BAR_FALCON();
            if ("".equals(fali.dueño)) {
                VBAR_FALCON fal = new VBAR_FALCON();
                fal.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + fali.paso + " a " + fali.dueño);
            }
        } else if (jugador4 == 13) {
            BIBLIOTECA_PUBLICA bili = new BIBLIOTECA_PUBLICA();
            if ("".equals(bili.dueño)) {
                VBIBLIOTECA_PUBLICA bil = new VBIBLIOTECA_PUBLICA();
                bil.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + bili.paso + " a " + bili.dueño);
            }
        } else if (jugador4 == 14) {
            IGLESIA_BAUTISTA iglei = new IGLESIA_BAUTISTA();
            if ("".equals(iglei.dueño)) {
                VIGLESIA_BAUTISTA igle = new VIGLESIA_BAUTISTA();
                igle.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + iglei.paso + " a " + iglei.dueño);
            }
        } else if (jugador4 == 15) {
            TIENDA_COSTELLO tiei = new TIENDA_COSTELLO();
            if ("".equals(tiei.dueño)) {
                VTIENDA_COSTELLO tie = new VTIENDA_COSTELLO();
                tie.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + tiei.paso + " a " + tiei.dueño);
            }
        } else if (jugador4 == 16) {
            PUENTE_DE_LOS_BESOS besosi = new PUENTE_DE_LOS_BESOS();
            if ("".equals(besosi.dueño)) {
                VPUENTE_DE_LOS_BESOS besos = new VPUENTE_DE_LOS_BESOS();
                besos.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + besosi.paso + " a " + besosi.dueño);
            }
        } else if (jugador4 == 17) {
            CENTRO_COMERCIAL comei = new CENTRO_COMERCIAL();
            if ("".equals(comei.dueño)) {
                VCENTRO_COMERCIAL come = new VCENTRO_COMERCIAL();
                come.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + comei.paso + " a " + comei.dueño);
            }
        } else if (jugador4 == 18) {
            JOptionPane.showMessageDialog(null, "pesadilla");
        } else if (jugador4 == 19) {
            ESCUELA_PRIMARIA primai = new ESCUELA_PRIMARIA();
            if ("".equals(primai.dueño)) {
                VESCUELA_PRIMARIA prima = new VESCUELA_PRIMARIA();
                prima.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + primai.paso + " a " + primai.dueño);
            }
        } else if (jugador4 == 20) {
            TEATRO_ALADDIN teatroi = new TEATRO_ALADDIN();
            if ("".equals(teatroi.dueño)) {
                VTEATRO_ALADDIN teatro = new VTEATRO_ALADDIN();
                teatro.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + teatroi.paso + " a " + teatroi.dueño);
            }
        } else if (jugador4 == 21) {
            JOptionPane.showMessageDialog(null, "descanso gratis");
        } else if (jugador4 == 22) {
            CASA_CLUB clubi = new CASA_CLUB();
            if ("".equals(clubi.dueño)) {
                VCASA_CLUB club = new VCASA_CLUB();
                club.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + clubi.paso + " a " + clubi.dueño);
            }
        } else if (jugador4 == 23) {
            JOptionPane.showMessageDialog(null, "suspiro");
        } else if (jugador4 == 24) {
            RESTAURANTE_JADE jadei = new RESTAURANTE_JADE();
            if ("".equals(jadei.dueño)) {
                VRESTAURANTE_JADE jade = new VRESTAURANTE_JADE();
                jade.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + jadei.paso + " a " + jadei.dueño);
            }
        } else if (jugador4 == 25) {
            CASA_DE_HUESPEDES huesi = new CASA_DE_HUESPEDES();
            if ("".equals(huesi.dueño)) {
                VCASA_DE_HUESPEDES hues = new VCASA_DE_HUESPEDES();
                hues.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + huesi.paso + " a " + huesi.dueño);
            }
        } else if (jugador4 == 26) {
            ESCUELA_SECUNDARIA secui = new ESCUELA_SECUNDARIA();
            if ("".equals(secui.dueño)) {
                VESCUELA_SECUNDARIA secu = new VESCUELA_SECUNDARIA();
                secu.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + secui.paso + " a " + secui.dueño);
            }
        } else if (jugador4 == 27) {
            PARQUE_MEMORIAL memoi = new PARQUE_MEMORIAL();
            if ("".equals(memoi.dueño)) {
                VPARQUE_MEMORIAL memo = new VPARQUE_MEMORIAL();
                memo.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + memoi.paso + " a " + memoi.dueño);
            }
        } else if (jugador4 == 28) {
            FARMACIA_KEENE farmi = new FARMACIA_KEENE();
            if ("".equals(farmi.dueño)) {
                VFARMACIA_KEENE farm = new VFARMACIA_KEENE();
                farm.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + farmi.paso + " a " + farmi.dueño);
            }
        } else if (jugador4 == 29) {
            REPRESA repri = new REPRESA();
            if ("".equals(repri.dueño)) {
                VREPRESA repre = new VREPRESA();
                repre.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + repri.paso + " a " + repri.dueño);
            }
        } else if (jugador4 == 30) {
            CASA_DE_LA_RISA risai = new CASA_DE_LA_RISA();
            if ("".equals(risai.dueño)) {
                VCASA_DE_LA_RISA risa = new VCASA_DE_LA_RISA();
                risa.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + risai.paso + " a " + risai.dueño);
            }
        } else if (jugador4 == 31) {
            JOptionPane.showMessageDialog(null, "vaya a la carcel");
        } else if (jugador4 == 32) {
            LA_CANTERA canterai = new LA_CANTERA();
            if ("".equals(canterai.dueño)) {
                VLA_CANTERA cantera = new VLA_CANTERA();
                cantera.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + canterai.paso + " a " + canterai.dueño);
            }
        } else if (jugador4 == 33) {
            CALLE_WITCHMAN witi = new CALLE_WITCHMAN();
            if ("".equals(witi.dueño)) {
                VCALLE_WITCHMAN wit = new VCALLE_WITCHMAN();
                wit.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + witi.paso + " a " + witi.dueño);
            }
        } else if (jugador4 == 34) {
            JOptionPane.showMessageDialog(null, "pesadilla");
        } else if (jugador4 == 35) {
            PARQUE_STRAWFORD strawi = new PARQUE_STRAWFORD();
            if ("".equals(strawi.dueño)) {
                VPARQUE_STRAWFORD straw = new VPARQUE_STRAWFORD();
                straw.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + strawi.paso + " a " + strawi.dueño);
            }
        } else if (jugador4 == 36) {
            PARQUE_BASSEY basi = new PARQUE_BASSEY();
            if ("".equals(basi.dueño)) {
                VPARQUE_BASSEY bas = new VPARQUE_BASSEY();
                bas.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + basi.paso + " a " + basi.dueño);
            }
        } else if (jugador4 == 37) {
            JOptionPane.showMessageDialog(null, "suspiro");
        } else if (jugador4 == 38) {
            CINE_CAPITOL capii = new CINE_CAPITOL();
            if ("".equals(capii.dueño)) {
                VCINE_CAPITOL capi = new VCINE_CAPITOL();
                capi.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + capii.paso + " a " + capii.dueño);
            }
        } else if (jugador4 == 39) {
            JOptionPane.showMessageDialog(null, "impuesto de lujo");
        } else if (jugador4 == 40) {
            CASA_ANTIGUA casai = new CASA_ANTIGUA();
            if ("".equals(casai.dueño)) {
                VLA_CASA_ANTIGUA casa = new VLA_CASA_ANTIGUA();
                casa.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + casai.paso + " a " + casai.dueño);
            }
        }

    }

    void verificarj5() {
        if (jugador5 > 40) {
            int reset;
            pl5.dinero += 200;
            dinero5.setText(String.valueOf(pl5.dinero));
            reset = jugador5 - 40;
            jugador5 = reset;
            JOptionPane.showMessageDialog(null, "Ganaste Q200");

        } else if (jugador5 == 2) {

            CALLE_JACKSON jack1 = new CALLE_JACKSON();
            if ("".equals(jack1.dueño)) {
                VCALLE_JACKSON jack = new VCALLE_JACKSON();
                jack.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + jacki.paso + " a " + jacki.dueño);
            }
        } else if (jugador5 == 3) {
            JOptionPane.showMessageDialog(null, "Pesadilla");
        } else if (jugador5 == 4) {
            LOS_BALDIOS bali = new LOS_BALDIOS();
            if ("".equals(bali.dueño)) {
                VLOS_BALDÍOS bal = new VLOS_BALDÍOS();
                bal.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + bali.paso + " a " + bali.dueño);
            }
        } else if (jugador5 == 5) {
            JOptionPane.showMessageDialog(null, "Impuestos");
        } else if (jugador5 == 6) {
            TERMINAL_DE_BUSES busi = new TERMINAL_DE_BUSES();
            if ("".equals(busi.dueño)) {
                vTERMINAL_DE_BUSES bus = new vTERMINAL_DE_BUSES();
                bus.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + busi.paso + " a " + busi.dueño);
            }
        } else if (jugador5 == 7) {
            BAR_BLACK_SPOT bari = new BAR_BLACK_SPOT();
            if ("".equals(bari.dueño)) {
                VBAR_BLACK_SPOT bar = new VBAR_BLACK_SPOT();
                bar.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + bari.paso + " a " + bari.dueño);
            }
        } else if (jugador5 == 8) {
            JOptionPane.showMessageDialog(null, "suspiro");
        } else if (jugador5 == 9) {
            CASA_NEIBOLT neii = new CASA_NEIBOLT();
            if ("".equals(neii.dueño)) {
                VCASA_NEIBOLT nei = new VCASA_NEIBOLT();
                nei.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + neii.paso + " a " + neii.dueño);
            }
        } else if (jugador5 == 10) {
            CALLE_TURNER turi = new CALLE_TURNER();
            if ("".equals(turi.dueño)) {
                VCALLE_TURNER tur = new VCALLE_TURNER();
                tur.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + turi.paso + " a " + turi.dueño);
            }
        } else if (jugador5 == 11) {
            JOptionPane.showMessageDialog(null, "pasadita de carcel");
        } else if (jugador5 == 12) {
            BAR_FALCON fali = new BAR_FALCON();
            if ("".equals(fali.dueño)) {
                VBAR_FALCON fal = new VBAR_FALCON();
                fal.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + fali.paso + " a " + fali.dueño);
            }
        } else if (jugador5 == 13) {
            BIBLIOTECA_PUBLICA bili = new BIBLIOTECA_PUBLICA();
            if ("".equals(bili.dueño)) {
                VBIBLIOTECA_PUBLICA bil = new VBIBLIOTECA_PUBLICA();
                bil.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + bili.paso + " a " + bili.dueño);
            }
        } else if (jugador5 == 14) {
            IGLESIA_BAUTISTA iglei = new IGLESIA_BAUTISTA();
            if ("".equals(iglei.dueño)) {
                VIGLESIA_BAUTISTA igle = new VIGLESIA_BAUTISTA();
                igle.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + iglei.paso + " a " + iglei.dueño);
            }
        } else if (jugador5 == 15) {
            TIENDA_COSTELLO tiei = new TIENDA_COSTELLO();
            if ("".equals(tiei.dueño)) {
                VTIENDA_COSTELLO tie = new VTIENDA_COSTELLO();
                tie.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + tiei.paso + " a " + tiei.dueño);
            }
        } else if (jugador5 == 16) {
            PUENTE_DE_LOS_BESOS besosi = new PUENTE_DE_LOS_BESOS();
            if ("".equals(besosi.dueño)) {
                VPUENTE_DE_LOS_BESOS besos = new VPUENTE_DE_LOS_BESOS();
                besos.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + besosi.paso + " a " + besosi.dueño);
            }
        } else if (jugador5 == 17) {
            CENTRO_COMERCIAL comei = new CENTRO_COMERCIAL();
            if ("".equals(comei.dueño)) {
                VCENTRO_COMERCIAL come = new VCENTRO_COMERCIAL();
                come.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + comei.paso + " a " + comei.dueño);
            }
        } else if (jugador5 == 18) {
            JOptionPane.showMessageDialog(null, "pesadilla");
        } else if (jugador5 == 19) {
            ESCUELA_PRIMARIA primai = new ESCUELA_PRIMARIA();
            if ("".equals(primai.dueño)) {
                VESCUELA_PRIMARIA prima = new VESCUELA_PRIMARIA();
                prima.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + primai.paso + " a " + primai.dueño);
            }
        } else if (jugador5 == 20) {
            TEATRO_ALADDIN teatroi = new TEATRO_ALADDIN();
            if ("".equals(teatroi.dueño)) {
                VTEATRO_ALADDIN teatro = new VTEATRO_ALADDIN();
                teatro.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + teatroi.paso + " a " + teatroi.dueño);
            }
        } else if (jugador5 == 21) {
            JOptionPane.showMessageDialog(null, "descanso gratis");
        } else if (jugador5 == 22) {
            CASA_CLUB clubi = new CASA_CLUB();
            if ("".equals(clubi.dueño)) {
                VCASA_CLUB club = new VCASA_CLUB();
                club.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + clubi.paso + " a " + clubi.dueño);
            }
        } else if (jugador5 == 23) {
            JOptionPane.showMessageDialog(null, "suspiro");
        } else if (jugador5 == 24) {
            RESTAURANTE_JADE jadei = new RESTAURANTE_JADE();
            if ("".equals(jadei.dueño)) {
                VRESTAURANTE_JADE jade = new VRESTAURANTE_JADE();
                jade.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + jadei.paso + " a " + jadei.dueño);
            }
        } else if (jugador5 == 25) {
            CASA_DE_HUESPEDES huesi = new CASA_DE_HUESPEDES();
            if ("".equals(huesi.dueño)) {
                VCASA_DE_HUESPEDES hues = new VCASA_DE_HUESPEDES();
                hues.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + huesi.paso + " a " + huesi.dueño);
            }
        } else if (jugador5 == 26) {
            ESCUELA_SECUNDARIA secui = new ESCUELA_SECUNDARIA();
            if ("".equals(secui.dueño)) {
                VESCUELA_SECUNDARIA secu = new VESCUELA_SECUNDARIA();
                secu.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + secui.paso + " a " + secui.dueño);
            }
        } else if (jugador5 == 27) {
            PARQUE_MEMORIAL memoi = new PARQUE_MEMORIAL();
            if ("".equals(memoi.dueño)) {
                VPARQUE_MEMORIAL memo = new VPARQUE_MEMORIAL();
                memo.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + memoi.paso + " a " + memoi.dueño);
            }
        } else if (jugador5 == 28) {
            FARMACIA_KEENE farmi = new FARMACIA_KEENE();
            if ("".equals(farmi.dueño)) {
                VFARMACIA_KEENE farm = new VFARMACIA_KEENE();
                farm.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + farmi.paso + " a " + farmi.dueño);
            }
        } else if (jugador5 == 29) {
            REPRESA repri = new REPRESA();
            if ("".equals(repri.dueño)) {
                VREPRESA repre = new VREPRESA();
                repre.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + repri.paso + " a " + repri.dueño);
            }
        } else if (jugador5 == 30) {
            CASA_DE_LA_RISA risai = new CASA_DE_LA_RISA();
            if ("".equals(risai.dueño)) {
                VCASA_DE_LA_RISA risa = new VCASA_DE_LA_RISA();
                risa.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + risai.paso + " a " + risai.dueño);
            }
        } else if (jugador5 == 31) {
            JOptionPane.showMessageDialog(null, "vaya a la carcel");
        } else if (jugador5 == 32) {
            LA_CANTERA canterai = new LA_CANTERA();
            if ("".equals(canterai.dueño)) {
                VLA_CANTERA cantera = new VLA_CANTERA();
                cantera.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + canterai.paso + " a " + canterai.dueño);
            }
        } else if (jugador5 == 33) {
            CALLE_WITCHMAN witi = new CALLE_WITCHMAN();
            if ("".equals(witi.dueño)) {
                VCALLE_WITCHMAN wit = new VCALLE_WITCHMAN();
                wit.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + witi.paso + " a " + witi.dueño);
            }
        } else if (jugador5 == 34) {
            JOptionPane.showMessageDialog(null, "pesadilla");
        } else if (jugador5 == 35) {
            PARQUE_STRAWFORD strawi = new PARQUE_STRAWFORD();
            if ("".equals(strawi.dueño)) {
                VPARQUE_STRAWFORD straw = new VPARQUE_STRAWFORD();
                straw.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + strawi.paso + " a " + strawi.dueño);
            }
        } else if (jugador5 == 36) {
            PARQUE_BASSEY basi = new PARQUE_BASSEY();
            if ("".equals(basi.dueño)) {
                VPARQUE_BASSEY bas = new VPARQUE_BASSEY();
                bas.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + basi.paso + " a " + basi.dueño);
            }
        } else if (jugador5 == 37) {
            JOptionPane.showMessageDialog(null, "suspiro");
        } else if (jugador5 == 38) {
            CINE_CAPITOL capii = new CINE_CAPITOL();
            if ("".equals(capii.dueño)) {
                VCINE_CAPITOL capi = new VCINE_CAPITOL();
                capi.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + capii.paso + " a " + capii.dueño);
            }
        } else if (jugador5 == 39) {
            JOptionPane.showMessageDialog(null, "impuesto de lujo");
        } else if (jugador5 == 40) {
            CASA_ANTIGUA casai = new CASA_ANTIGUA();
            if ("".equals(casai.dueño)) {
                VLA_CASA_ANTIGUA casa = new VLA_CASA_ANTIGUA();
                casa.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + casai.paso + " a " + casai.dueño);
            }
        }

    }

    void verificarj6() {
        if (jugador6 > 40) {
            int reset;
            pl6.dinero += 200;
            dinero6.setText(String.valueOf(pl6.dinero));
            reset = jugador6 - 40;
            jugador6 = reset;
            JOptionPane.showMessageDialog(null, "Ganaste Q200");

        } else if (jugador6 == 2) {

            CALLE_JACKSON jack1 = new CALLE_JACKSON();
            if ("".equals(jack1.dueño)) {
                VCALLE_JACKSON jack = new VCALLE_JACKSON();
                jack.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + jacki.paso + " a " + jacki.dueño);
            }
        } else if (jugador6 == 3) {
            JOptionPane.showMessageDialog(null, "Pesadilla");
        } else if (jugador6 == 4) {
            LOS_BALDIOS bali = new LOS_BALDIOS();
            if ("".equals(bali.dueño)) {
                VLOS_BALDÍOS bal = new VLOS_BALDÍOS();
                bal.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + bali.paso + " a " + bali.dueño);
            }
        } else if (jugador6 == 5) {
            JOptionPane.showMessageDialog(null, "Impuestos");
        } else if (jugador6 == 6) {
            TERMINAL_DE_BUSES busi = new TERMINAL_DE_BUSES();
            if ("".equals(busi.dueño)) {
                vTERMINAL_DE_BUSES bus = new vTERMINAL_DE_BUSES();
                bus.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + busi.paso + " a " + busi.dueño);
            }
        } else if (jugador6 == 7) {
            BAR_BLACK_SPOT bari = new BAR_BLACK_SPOT();
            if ("".equals(bari.dueño)) {
                VBAR_BLACK_SPOT bar = new VBAR_BLACK_SPOT();
                bar.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + bari.paso + " a " + bari.dueño);
            }
        } else if (jugador6 == 8) {
            JOptionPane.showMessageDialog(null, "suspiro");
        } else if (jugador6 == 9) {
            CASA_NEIBOLT neii = new CASA_NEIBOLT();
            if ("".equals(neii.dueño)) {
                VCASA_NEIBOLT nei = new VCASA_NEIBOLT();
                nei.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + neii.paso + " a " + neii.dueño);
            }
        } else if (jugador6 == 10) {
            CALLE_TURNER turi = new CALLE_TURNER();
            if ("".equals(turi.dueño)) {
                VCALLE_TURNER tur = new VCALLE_TURNER();
                tur.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + turi.paso + " a " + turi.dueño);
            }
        } else if (jugador6 == 11) {
            JOptionPane.showMessageDialog(null, "pasadita de carcel");
        } else if (jugador6 == 12) {
            BAR_FALCON fali = new BAR_FALCON();
            if ("".equals(fali.dueño)) {
                VBAR_FALCON fal = new VBAR_FALCON();
                fal.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + fali.paso + " a " + fali.dueño);
            }
        } else if (jugador6 == 13) {
            BIBLIOTECA_PUBLICA bili = new BIBLIOTECA_PUBLICA();
            if ("".equals(bili.dueño)) {
                VBIBLIOTECA_PUBLICA bil = new VBIBLIOTECA_PUBLICA();
                bil.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + bili.paso + " a " + bili.dueño);
            }
        } else if (jugador6 == 14) {
            IGLESIA_BAUTISTA iglei = new IGLESIA_BAUTISTA();
            if ("".equals(iglei.dueño)) {
                VIGLESIA_BAUTISTA igle = new VIGLESIA_BAUTISTA();
                igle.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + iglei.paso + " a " + iglei.dueño);
            }
        } else if (jugador6 == 15) {
            TIENDA_COSTELLO tiei = new TIENDA_COSTELLO();
            if ("".equals(tiei.dueño)) {
                VTIENDA_COSTELLO tie = new VTIENDA_COSTELLO();
                tie.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + tiei.paso + " a " + tiei.dueño);
            }
        } else if (jugador6 == 16) {
            PUENTE_DE_LOS_BESOS besosi = new PUENTE_DE_LOS_BESOS();
            if ("".equals(besosi.dueño)) {
                VPUENTE_DE_LOS_BESOS besos = new VPUENTE_DE_LOS_BESOS();
                besos.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + besosi.paso + " a " + besosi.dueño);
            }
        } else if (jugador6 == 17) {
            CENTRO_COMERCIAL comei = new CENTRO_COMERCIAL();
            if ("".equals(comei.dueño)) {
                VCENTRO_COMERCIAL come = new VCENTRO_COMERCIAL();
                come.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + comei.paso + " a " + comei.dueño);
            }
        } else if (jugador6 == 18) {
            JOptionPane.showMessageDialog(null, "pesadilla");
        } else if (jugador6 == 19) {
            ESCUELA_PRIMARIA primai = new ESCUELA_PRIMARIA();
            if ("".equals(primai.dueño)) {
                VESCUELA_PRIMARIA prima = new VESCUELA_PRIMARIA();
                prima.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + primai.paso + " a " + primai.dueño);
            }
        } else if (jugador6 == 20) {
            TEATRO_ALADDIN teatroi = new TEATRO_ALADDIN();
            if ("".equals(teatroi.dueño)) {
                VTEATRO_ALADDIN teatro = new VTEATRO_ALADDIN();
                teatro.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + teatroi.paso + " a " + teatroi.dueño);
            }
        } else if (jugador6 == 21) {
            JOptionPane.showMessageDialog(null, "descanso gratis");
        } else if (jugador6 == 22) {
            CASA_CLUB clubi = new CASA_CLUB();
            if ("".equals(clubi.dueño)) {
                VCASA_CLUB club = new VCASA_CLUB();
                club.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + clubi.paso + " a " + clubi.dueño);
            }
        } else if (jugador6 == 23) {
            JOptionPane.showMessageDialog(null, "suspiro");
        } else if (jugador6 == 24) {
            RESTAURANTE_JADE jadei = new RESTAURANTE_JADE();
            if ("".equals(jadei.dueño)) {
                VRESTAURANTE_JADE jade = new VRESTAURANTE_JADE();
                jade.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + jadei.paso + " a " + jadei.dueño);
            }
        } else if (jugador6 == 25) {
            CASA_DE_HUESPEDES huesi = new CASA_DE_HUESPEDES();
            if ("".equals(huesi.dueño)) {
                VCASA_DE_HUESPEDES hues = new VCASA_DE_HUESPEDES();
                hues.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + huesi.paso + " a " + huesi.dueño);
            }
        } else if (jugador6 == 26) {
            ESCUELA_SECUNDARIA secui = new ESCUELA_SECUNDARIA();
            if ("".equals(secui.dueño)) {
                VESCUELA_SECUNDARIA secu = new VESCUELA_SECUNDARIA();
                secu.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + secui.paso + " a " + secui.dueño);
            }
        } else if (jugador6 == 27) {
            PARQUE_MEMORIAL memoi = new PARQUE_MEMORIAL();
            if ("".equals(memoi.dueño)) {
                VPARQUE_MEMORIAL memo = new VPARQUE_MEMORIAL();
                memo.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + memoi.paso + " a " + memoi.dueño);
            }
        } else if (jugador6 == 28) {
            FARMACIA_KEENE farmi = new FARMACIA_KEENE();
            if ("".equals(farmi.dueño)) {
                VFARMACIA_KEENE farm = new VFARMACIA_KEENE();
                farm.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + farmi.paso + " a " + farmi.dueño);
            }
        } else if (jugador6 == 29) {
            REPRESA repri = new REPRESA();
            if ("".equals(repri.dueño)) {
                VREPRESA repre = new VREPRESA();
                repre.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + repri.paso + " a " + repri.dueño);
            }
        } else if (jugador6 == 30) {
            CASA_DE_LA_RISA risai = new CASA_DE_LA_RISA();
            if ("".equals(risai.dueño)) {
                VCASA_DE_LA_RISA risa = new VCASA_DE_LA_RISA();
                risa.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + risai.paso + " a " + risai.dueño);
            }
        } else if (jugador6 == 31) {
            JOptionPane.showMessageDialog(null, "vaya a la carcel");
        } else if (jugador6 == 32) {
            LA_CANTERA canterai = new LA_CANTERA();
            if ("".equals(canterai.dueño)) {
                VLA_CANTERA cantera = new VLA_CANTERA();
                cantera.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + canterai.paso + " a " + canterai.dueño);
            }
        } else if (jugador6 == 33) {
            CALLE_WITCHMAN witi = new CALLE_WITCHMAN();
            if ("".equals(witi.dueño)) {
                VCALLE_WITCHMAN wit = new VCALLE_WITCHMAN();
                wit.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + witi.paso + " a " + witi.dueño);
            }
        } else if (jugador6 == 34) {
            JOptionPane.showMessageDialog(null, "pesadilla");
        } else if (jugador6 == 35) {
            PARQUE_STRAWFORD strawi = new PARQUE_STRAWFORD();
            if ("".equals(strawi.dueño)) {
                VPARQUE_STRAWFORD straw = new VPARQUE_STRAWFORD();
                straw.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + strawi.paso + " a " + strawi.dueño);
            }
        } else if (jugador6 == 36) {
            PARQUE_BASSEY basi = new PARQUE_BASSEY();
            if ("".equals(basi.dueño)) {
                VPARQUE_BASSEY bas = new VPARQUE_BASSEY();
                bas.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + basi.paso + " a " + basi.dueño);
            }
        } else if (jugador6 == 37) {
            JOptionPane.showMessageDialog(null, "suspiro");
        } else if (jugador6 == 38) {
            CINE_CAPITOL capii = new CINE_CAPITOL();
            if ("".equals(capii.dueño)) {
                VCINE_CAPITOL capi = new VCINE_CAPITOL();
                capi.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + capii.paso + " a " + capii.dueño);
            }
        } else if (jugador6 == 39) {
            JOptionPane.showMessageDialog(null, "impuesto de lujo");
        } else if (jugador6 == 40) {
            CASA_ANTIGUA casai = new CASA_ANTIGUA();
            if ("".equals(casai.dueño)) {
                VLA_CASA_ANTIGUA casa = new VLA_CASA_ANTIGUA();
                casa.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Le debes pagar " + casai.paso + " a " + casai.dueño);
            }
        }

    }

    void pagar() {
        if (cont == 2 && prop.getText().equals(pl1.nombre) ) {
            int par = Integer.parseInt(pay.getText());
            pl2.dinero -= par;
            pl1.dinero += par;
        } else if (cont == 3 && prop.getText().equals(pl1.nombre)) {
            int par = Integer.parseInt(pay.getText());
            pl3.dinero -= par;
            pl1.dinero += par;
        } else if (cont == 4 && prop.getText().equals(pl1.nombre)) {
            int par = Integer.parseInt(pay.getText());
            pl4.dinero -= par;
            pl1.dinero += par;
        } else if (cont == 5 && prop.getText().equals(pl1.nombre)) {
            int par = Integer.parseInt(pay.getText());
            pl5.dinero -= par;
            pl1.dinero += par;
        } else if (cont == 6 && prop.getText().equals(pl1.nombre)) {
            int par = Integer.parseInt(pay.getText());
            pl6.dinero -= par;
            pl1.dinero += par;
        }else  if (cont == 1 && prop.getText().equals(pl2.nombre)) {
            int par = Integer.parseInt(pay.getText());
            pl1.dinero -= par;
            pl2.dinero += par;
        } else if (cont == 3 && prop.getText().equals(pl2.nombre)) {
            int par = Integer.parseInt(pay.getText());
            pl3.dinero -= par;
            pl2.dinero += par;
        } else if (cont == 4 && prop.getText().equals(pl2.nombre)) {
            int par = Integer.parseInt(pay.getText());
            pl4.dinero -= par;
            pl2.dinero += par;
        } else if (cont == 5 && prop.getText().equals(pl2.nombre)) {
            int par = Integer.parseInt(pay.getText());
            pl5.dinero -= par;
            pl2.dinero += par;
        } else if (cont == 6 && prop.getText().equals(pl2.nombre)) {
            int par = Integer.parseInt(pay.getText());
            pl6.dinero -= par;
            pl2.dinero += par;
        }else  if (cont == 1 && prop.getText().equals(pl3.nombre)) {
            int par = Integer.parseInt(pay.getText());
            pl1.dinero -= par;
            pl3.dinero += par;
        } else if (cont == 2 && prop.getText().equals(pl3.nombre)) {
            int par = Integer.parseInt(pay.getText());
            pl2.dinero -= par;
            pl3.dinero += par;
        } else if (cont == 4 && prop.getText().equals(pl3.nombre)) {
            int par = Integer.parseInt(pay.getText());
            pl4.dinero -= par;
            pl3.dinero += par;
        } else if (cont == 5 && prop.getText().equals(pl3.nombre)) {
            int par = Integer.parseInt(pay.getText());
            pl5.dinero -= par;
            pl3.dinero += par;
        } else if (cont == 6 && prop.getText().equals(pl3.nombre)) {
            int par = Integer.parseInt(pay.getText());
            pl6.dinero -= par;
            pl3.dinero += par;
        }else if (cont == 1 && prop.getText().equals(pl4.nombre)) {
            int par = Integer.parseInt(pay.getText());
            pl1.dinero -= par;
            pl4.dinero += par;
        } else if (cont == 2 && prop.getText().equals(pl4.nombre)) {
            int par = Integer.parseInt(pay.getText());
            pl2.dinero -= par;
            pl4.dinero += par;
        } else if (cont == 3 && prop.getText().equals(pl4.nombre)) {
            int par = Integer.parseInt(pay.getText());
            pl3.dinero -= par;
            pl4.dinero += par;
        } else if (cont == 5 && prop.getText().equals(pl4.nombre) ) {
            int par = Integer.parseInt(pay.getText());
            pl5.dinero -= par;
            pl4.dinero += par;
        } else if (cont == 6&& prop.getText().equals(pl4.nombre)) {
            int par = Integer.parseInt(pay.getText());
            pl6.dinero -= par;
            pl4.dinero += par;
        }else  if (cont == 1 && prop.getText().equals(pl5.nombre)) {
            int par = Integer.parseInt(pay.getText());
            pl1.dinero -= par;
            pl5.dinero += par;
        } else if (cont == 2 && prop.getText().equals(pl5.nombre)) {
            int par = Integer.parseInt(pay.getText());
            pl2.dinero -= par;
            pl5.dinero += par;
        } else if (cont == 3 && prop.getText().equals(pl5.nombre)) {
            int par = Integer.parseInt(pay.getText());
            pl3.dinero -= par;
            pl5.dinero += par;
        } else if (cont == 4 && prop.getText().equals(pl5.nombre)) {
            int par = Integer.parseInt(pay.getText());
            pl4.dinero -= par;
            pl5.dinero += par;
        } else if (cont == 6 && prop.getText().equals(pl5.nombre)) {
            int par = Integer.parseInt(pay.getText());
            pl6.dinero -= par;
            pl5.dinero += par;
        }else if (cont == 1 && prop.getText().equals(pl6.nombre)) {
            int par = Integer.parseInt(pay.getText());
            pl1.dinero -= par;
            pl6.dinero += par;
        } else if (cont == 2 && prop.getText().equals(pl6.nombre)) {
            int par = Integer.parseInt(pay.getText());
            pl2.dinero -= par;
            pl6.dinero += par;
        } else if (cont == 3 && prop.getText().equals(pl6.nombre)) {
            int par = Integer.parseInt(pay.getText());
            pl3.dinero -= par;
            pl6.dinero += par;
        } else if (cont == 4 && prop.getText().equals(pl6.nombre)) {
            int par = Integer.parseInt(pay.getText());
            pl4.dinero -= par;
            pl6.dinero += par;
        } else if (cont == 5 && prop.getText().equals(pl6.nombre)) {
            int par = Integer.parseInt(pay.getText());
            pl5.dinero -= par;
            pl6.dinero += par;
        }
        dinero.setText(String.valueOf(pl1.dinero));
        dinero2.setText(String.valueOf(pl2.dinero));
        dinero3.setText(String.valueOf(pl3.dinero));
        dinero4.setText(String.valueOf(pl4.dinero));
        dinero5.setText(String.valueOf(pl5.dinero));
        dinero6.setText(String.valueOf(pl6.dinero));

    }

   

   

  

   

    void pagarj6() {
        
       

    }

  
}
