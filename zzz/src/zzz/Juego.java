/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zzz;

import java.util.ArrayList;
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
            
            turnoJug++;
            if (turnoJug >= p.size()) {
                turnoJug = 0;
            }
        
    }
    
    public void chequear(int puntos){
        if(lanzamiento == false){
            JOptionPane.showMessageDialog(null, "Lanza el Dado Primero");
        }else{
            turnos(puntos);
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
}
