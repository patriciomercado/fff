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
public class Gam {

    public Gam() {
    }
    
        private ArrayList<Player> arrayPlayers = new ArrayList<Player>();
    
     public int numJugadores() {
         //recibe por un combobox la cantidad de jugadores
        Object color = JOptionPane.showInputDialog(null,"Seleccione Cantidad de Jugadores",
         "Jugadores", JOptionPane.QUESTION_MESSAGE, null,
        new Object[] { "2", "3","4","5","6","7" },"Seleccione");
        return Integer.parseInt(""+color);
         }
     
}
