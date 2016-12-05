/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GoD;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author patricio mercado y Javier Vargas
 */

/**
 * 
 * Constructor de la Clase Gamers que maneja todo lo que tiene que ver con los jugadores
 */
public class Gamers {
       private int numJugadores;
       private ArrayList<Player> Gamers = new ArrayList<Player>();
       
       public Gamers() {
       }
       
       /**
        * Agrega Jugadores al ArrayList de jugadores, creando primero una instancia temporal
        * para posteriormente ser agregada.
        * @param nombre Variable con el nombre del jugador.
        */
       public void addGamers(String nombre){
           Player p = new Player( nombre);
           Gamers.add(p);
       }

       /**
        * Metodo que devuelve el ArrayList de Gamers
        * @return 
        */
    public ArrayList<Player> getGamers() {
        return Gamers;
    }
  
    
    
       
     /**
      * Metodo que permite la seleccion de jugadores a traves de un Imput Dialog con ComboBox
      * 
      */
     public void numJugadores() {
         //recibe por un combobox la cantidad de jugadores
        Object cantidad = JOptionPane.showInputDialog(null,"Seleccione Cantidad de Jugadores",
         "Jugadores", JOptionPane.QUESTION_MESSAGE, null,
        new Object[] { "2", "3","4","5","6","7" },"Seleccione");
        this.numJugadores = Integer.parseInt(""+cantidad);
         }

     /**
      * Devuelve la cantidad dejugadores actualmente en partida.
      * @return numJugdores, de tipo int que contiene la cantidad de jugadores.
      */
    public int getNumJugadores() {
        return numJugadores;
    }

    /**
     * Configura la cantidad de Jugadoresque estaran en Partida
     * @param numJugadores Variable de tipo intque contiene la cantidad de jugadores
     */
    public void setNumJugadores(int numJugadores) {
        this.numJugadores = numJugadores;
    }

  
     
     
}
