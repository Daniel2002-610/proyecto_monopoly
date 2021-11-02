/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extras;

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
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import jugadores.play1;
import jugadores.play2;
import jugadores.play3;
import jugadores.play4;
import jugadores.play5;
import jugadores.play6;
import vistas.jpanel;

public class meta {

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
    jpanel jpanel = new jpanel();

    public void jack(JLabel ps) {
        if (pl1.nombre.equals(jacki.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/a1.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl2.nombre.equals(jacki.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/a2.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl3.nombre.equals(jacki.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/a3.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl4.nombre.equals(jacki.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/a4.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl5.nombre.equals(jacki.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/a5.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl6.nombre.equals(jacki.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/a6.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }

        //////  
      
////////
       
////////////////
      
/////////////
        
////
        
///////////////////////BBBBBBBBBBBBBBBBBBBB
       
////////////////
       
//////////////
       
///////////////////////////
        
///////////////
        
//////////////
       
/////////////////
       
       

    }

    public void casa(JLabel ps) {
 if (pl1.nombre.equals(casai.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/d1.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl2.nombre.equals(casai.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/d2.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl3.nombre.equals(casai.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/d3.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl4.nombre.equals(casai.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/d4.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl5.nombre.equals(casai.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/d5.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl6.nombre.equals(casai.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/d6.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
    }

    public void capi(JLabel ps) {
if (pl1.nombre.equals(capii.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/d1.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl2.nombre.equals(capii.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/d2.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl3.nombre.equals(capii.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/d3.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl4.nombre.equals(capii.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/d4.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl5.nombre.equals(capii.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/d5.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl6.nombre.equals(capii.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/d6.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
    }

    public void bas(JLabel ps) {
 if (pl1.nombre.equals(basi.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/d1.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl2.nombre.equals(basi.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/d2.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl3.nombre.equals(basi.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/d3.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl4.nombre.equals(basi.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/d4.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl5.nombre.equals(basi.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/d5.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl6.nombre.equals(basi.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/d6.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
    }

    public void strawi(JLabel ps) {
if (pl1.nombre.equals(strawi.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/d1.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl2.nombre.equals(strawi.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/d2.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl3.nombre.equals(strawi.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/d3.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl4.nombre.equals(strawi.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/d4.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl5.nombre.equals(strawi.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/d5.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl6.nombre.equals(strawi.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/d6.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
    }

    public void witi(JLabel ps) {
 if (pl1.nombre.equals(witi.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/d1.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl2.nombre.equals(witi.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/d2.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl3.nombre.equals(witi.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/d3.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl4.nombre.equals(witi.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/d4.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl5.nombre.equals(witi.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/d5.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl6.nombre.equals(witi.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/d6.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
    }

    public void cantera(JLabel ps) {
if (pl1.nombre.equals(canterai.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/d1.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl2.nombre.equals(canterai.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/d2.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl3.nombre.equals(canterai.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/d3.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl4.nombre.equals(canterai.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/d4.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl5.nombre.equals(canterai.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/d5.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl6.nombre.equals(canterai.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/d6.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
    }

    public void risa(JLabel ps) {
  if (pl1.nombre.equals(risai.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/c1.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl2.nombre.equals(risai.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/c2.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl3.nombre.equals(risai.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/c3.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl4.nombre.equals(risai.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/c4.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl5.nombre.equals(risai.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/c5.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl6.nombre.equals(risai.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/c6.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
    }

    public void repre(JLabel ps) {
  if (pl1.nombre.equals(repri.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/c1.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl2.nombre.equals(repri.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/c2.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl3.nombre.equals(repri.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/c3.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl4.nombre.equals(repri.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/c4.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl5.nombre.equals(repri.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/c5.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl6.nombre.equals(repri.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/c6.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
    }

    public void farmi(JLabel ps) {
 if (pl1.nombre.equals(farmi.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/c1.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl2.nombre.equals(farmi.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/c2.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl3.nombre.equals(farmi.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/c3.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl4.nombre.equals(farmi.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/c4.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl5.nombre.equals(farmi.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/c5.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl6.nombre.equals(farmi.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/c6.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
    }

    public void memo(JLabel ps) {
 if (pl1.nombre.equals(memoi.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/c1.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl2.nombre.equals(memoi.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/c2.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl3.nombre.equals(memoi.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/c3.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl4.nombre.equals(memoi.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/c4.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl5.nombre.equals(memoi.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/c5.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl6.nombre.equals(memoi.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/c6.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
    }

    public void secu(JLabel ps) {
  if (pl1.nombre.equals(secui.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/c1.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl2.nombre.equals(secui.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/c2.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl3.nombre.equals(secui.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/c3.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl4.nombre.equals(secui.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/c4.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl5.nombre.equals(secui.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/c5.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl6.nombre.equals(secui.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/c6.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
    }

    public void hues(JLabel ps) {
 if (pl1.nombre.equals(huesi.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/c1.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl2.nombre.equals(huesi.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/c2.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl3.nombre.equals(huesi.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/c3.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl4.nombre.equals(huesi.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/c4.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl5.nombre.equals(huesi.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/c5.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl6.nombre.equals(huesi.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/c6.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
    }

    public void jade(JLabel ps) {
if (pl1.nombre.equals(jadei.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/c1.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl2.nombre.equals(jadei.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/c2.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl3.nombre.equals(jadei.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/c3.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl4.nombre.equals(jadei.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/c4.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl5.nombre.equals(jadei.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/c5.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl6.nombre.equals(jadei.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/c6.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
    }

    public void clubi(JLabel ps) {
if (pl1.nombre.equals(clubi.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/c1.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl2.nombre.equals(clubi.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/c2.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl3.nombre.equals(clubi.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/c3.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl4.nombre.equals(clubi.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/c4.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl5.nombre.equals(clubi.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/c5.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl6.nombre.equals(clubi.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/c6.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
    }

    public void teatro(JLabel ps) {
if (pl1.nombre.equals(teatroi.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/b1.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl2.nombre.equals(teatroi.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/b2.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl3.nombre.equals(teatroi.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/b3.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl4.nombre.equals(teatroi.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/b4.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl5.nombre.equals(teatroi.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/b5.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl6.nombre.equals(teatroi.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/b6.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
    }

    public void prima(JLabel ps) {
 if (pl1.nombre.equals(primai.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/b1.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl2.nombre.equals(primai.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/b2.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl3.nombre.equals(primai.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/b3.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl4.nombre.equals(primai.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/b4.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl5.nombre.equals(primai.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/b5.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl6.nombre.equals(primai.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/b6.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }

    }

    public void comei(JLabel ps) {
 if (pl1.nombre.equals(comei.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/b1.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl2.nombre.equals(comei.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/b2.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl3.nombre.equals(comei.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/b3.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl4.nombre.equals(comei.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/b4.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl5.nombre.equals(comei.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/b5.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl6.nombre.equals(comei.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/b6.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
    }

    public void besos(JLabel ps) {
if (pl1.nombre.equals(besosi.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/b1.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl2.nombre.equals(besosi.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/b2.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl3.nombre.equals(besosi.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/b3.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl4.nombre.equals(besosi.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/b4.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl5.nombre.equals(besosi.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/b5.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl6.nombre.equals(besosi.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/b6.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
    }

    public void tien(JLabel ps) {
if (pl1.nombre.equals(tiei.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/b1.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl2.nombre.equals(tiei.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/b2.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl3.nombre.equals(tiei.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/b3.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl4.nombre.equals(tiei.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/b4.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl5.nombre.equals(tiei.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/b5.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl6.nombre.equals(tiei.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/b6.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
    }

    public void igle(JLabel ps) {
 if (pl1.nombre.equals(iglei.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/b1.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl2.nombre.equals(iglei.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/b2.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl3.nombre.equals(iglei.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/b3.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl4.nombre.equals(iglei.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/b4.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl5.nombre.equals(iglei.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/b5.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl6.nombre.equals(iglei.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/b6.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
    }

    public void bil(JLabel ps) {
 if (pl1.nombre.equals(bili.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/b1.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl2.nombre.equals(bili.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/b2.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl3.nombre.equals(bili.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/b3.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl4.nombre.equals(bili.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/b4.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl5.nombre.equals(bili.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/b5.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl6.nombre.equals(bili.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/b6.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
    }

    public void fal(JLabel ps) {
 if (pl1.nombre.equals(fali.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/b1.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl2.nombre.equals(fali.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/b2.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl3.nombre.equals(fali.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/b3.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl4.nombre.equals(fali.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/b4.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl5.nombre.equals(fali.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/b5.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl6.nombre.equals(fali.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/b6.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
    }

    public void turi(JLabel ps) {
if (pl1.nombre.equals(turi.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/a1.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl2.nombre.equals(turi.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/a2.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl3.nombre.equals(turi.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/a3.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl4.nombre.equals(turi.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/a4.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl5.nombre.equals(turi.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/a5.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl6.nombre.equals(turi.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/a6.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
    }

    public void nei(JLabel ps) {
if (pl1.nombre.equals(neii.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/a1.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl2.nombre.equals(neii.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/a2.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl3.nombre.equals(neii.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/a3.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl4.nombre.equals(neii.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/a4.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl5.nombre.equals(neii.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/a5.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl6.nombre.equals(neii.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/a6.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
    }

    public void bar(JLabel ps) {
  if (pl1.nombre.equals(bari.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/a1.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl2.nombre.equals(bari.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/a2.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl3.nombre.equals(bari.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/a3.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl4.nombre.equals(bari.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/a4.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl5.nombre.equals(bari.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/a5.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl6.nombre.equals(bari.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/a6.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
    }

    public void bus(JLabel ps) {
 if (pl1.nombre.equals(busi.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/a1.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl2.nombre.equals(busi.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/a2.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl3.nombre.equals(busi.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/a3.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl4.nombre.equals(busi.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/a4.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl5.nombre.equals(busi.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/a5.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl6.nombre.equals(busi.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/a6.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
    }

    public void bal(JLabel ps) {
  if (pl1.nombre.equals(bali.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/a1.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl2.nombre.equals(bali.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/a2.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl3.nombre.equals(bali.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/a3.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl4.nombre.equals(bali.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/a4.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl5.nombre.equals(bali.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/a5.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
        if (pl6.nombre.equals(bali.dueño)) {
            ImageIcon x2 = new ImageIcon(getClass().getResource("/recursos/a6.png"));
            ImageIcon icon2 = new ImageIcon(x2.getImage().getScaledInstance(ps.getWidth(), ps.getHeight(), Image.SCALE_DEFAULT));
            ps.setIcon(icon2);
        }
    }

   

}
