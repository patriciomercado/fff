/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zzz;

import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author patricio mercado
 */
public class Juego {
    private int turnoJug = 0;
    private boolean lanzamiento = false;
    private boolean siguiente = false;
    private ArrayList<Player> p = new ArrayList<Player>();
    Dado d =new Dado();

    public Juego(ArrayList<Player> p) {
        this.p = p;
    }
    
    public void turnos(int dado){
        
            p.get(turnoJug).addScore(puntuacion(dado));
            lanzamiento = false;
            turnoJug++;
            if (turnoJug >= p.size()) {
                turnoJug = 0;
            }
    }
    
    public void lanzamientoSet(){
        lanzamiento = true;
        siguiente = true;
    }
    
    public void chequear(JButton boton){
        if(lanzamiento == false){
            JOptionPane.showMessageDialog(null, "Lanza el Dado Primero");
        }else{
            turnos(Integer.parseInt(boton.getText()));
            boton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zzz/dados-04.gif")));
            siguiente = false;
        }
    }
    
    public int puntuacion(int caraDado){
        int puntos = 0;
        if(caraDado > 0 && caraDado < 3){
                if((puntos-caraDado) < 0){
                    puntos= 0;
                } else{
                    puntos-= caraDado;
                }
        }else{
                puntos += caraDado;
        }
        return puntos;
    }
    
    public void lanzarDado(JButton boton){
        if(siguiente == true){
            JOptionPane.showMessageDialog(null, "Ya lanzaste el dado");
        }else{
            boton.setIcon(null);
            boton.setText(Integer.toString(d.lanzarDado()));
            lanzamientoSet();
        }
    }
    
    public void actualizarLabels(JLabel score1, JLabel score2, JLabel score3, JLabel score4, JLabel score5, JLabel score6, JLabel score7) {
        switch(turnoJug){
            case 0:
                
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
        }
    }
}
