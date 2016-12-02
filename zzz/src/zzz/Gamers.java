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
public class Gamers {
       private int numJugadores;
       private ArrayList<Player> Gamers = new ArrayList<Player>();
       
       public Gamers() {
       }
       
       public void addGamers(String nombre){
           Player p = new Player( nombre);
           Gamers.add(p);
       }

    public ArrayList<Player> getGamers() {
        return Gamers;
    }
  
    
    
       
     
     public void numJugadores() {
         //recibe por un combobox la cantidad de jugadores
        Object cantidad = JOptionPane.showInputDialog(null,"Seleccione Cantidad de Jugadores",
         "Jugadores", JOptionPane.QUESTION_MESSAGE, null,
        new Object[] { "2", "3","4","5","6","7" },"Seleccione");
        this.numJugadores = Integer.parseInt(""+cantidad);
         }
     
     public void listaJugadores(){
         
         for (int i = 0; i < numJugadores; i++) {
             
         }
     }

    public int getNumJugadores() {
        return numJugadores;
    }

    public void setNumJugadores(int numJugadores) {
        this.numJugadores = numJugadores;
    }

  
     
     
}
