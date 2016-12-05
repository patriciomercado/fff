/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GoD;

import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author patricio mercado y Javier Vargas
 */
public class controlFrame {
    private int cantidadJugadores =0;

    /**
     * constructor de la clase que define la cantidad de jugadores para el resto de los metodos
     * @param cantidadJugadores 
     */
    public controlFrame( int cantidadJugadores) {
       this.cantidadJugadores = cantidadJugadores;
    }

    
    /**
     * corrige las labels de los jugadores enla ventana, para ocultar los jugadores incativos de la partida
     * @param jug1
     * @param jug2
     * @param jug3
     * @param jug4
     * @param jug5
     * @param jug6
     * @param jug7 
     */
    public void correctorTextField(JTextField jug1,JTextField jug2,JTextField jug3,JTextField jug4,JTextField jug5,JTextField jug6,JTextField jug7){
        switch (cantidadJugadores){
            case 2:
                jug3.setVisible(false);
                jug4.setVisible(false);
                jug5.setVisible(false);
                jug6.setVisible(false);
                jug7.setVisible(false);
                
                break;
            case 3:
                jug4.setVisible(false);
                jug5.setVisible(false);
                jug6.setVisible(false);
                jug7.setVisible(false);
                               
                break;    
            case 4:
                jug5.setVisible(false);
                jug6.setVisible(false);
                jug7.setVisible(false);
                break;
            case 5:
                jug6.setVisible(false);
                jug7.setVisible(false);
                break;
            case 6:
                jug7.setVisible(false);
                break;            
        }
        
    }
    
    /**
     * Cambia las JLabels por los nombres de los Jugadores Almacenados en el ArrayList de Jugadores
     * @param p
     * @param jug1
     * @param jug2
     * @param jug3
     * @param jug4
     * @param jug5
     * @param jug6
     * @param jug7 
     */
        public void mostrarJugadores(ArrayList<Player> p,JLabel jug1,JLabel jug2,JLabel jug3,JLabel jug4,JLabel jug5,JLabel jug6,JLabel jug7){
                switch (p.size()){
                    case 2:
                        jug1.setText(p.get(0).getPlayerName());
                        jug2.setText(p.get(1).getPlayerName());
                        break;
                    
                    case 3:
                        jug1.setText(p.get(0).getPlayerName());
                        jug2.setText(p.get(1).getPlayerName());
                        jug3.setText(p.get(2).getPlayerName());
                        break;
                        
                    case 4:
                        jug1.setText(p.get(0).getPlayerName());
                        jug2.setText(p.get(1).getPlayerName());
                        jug3.setText(p.get(2).getPlayerName());
                        jug4.setText(p.get(3).getPlayerName());
                        break;
                        
                    case 5:
                        jug1.setText(p.get(0).getPlayerName());
                        jug2.setText(p.get(1).getPlayerName());
                        jug3.setText(p.get(2).getPlayerName());
                        jug4.setText(p.get(3).getPlayerName());
                        jug5.setText(p.get(4).getPlayerName());
                        break;    
                              
                    case 6:
                        jug1.setText(p.get(0).getPlayerName());
                        jug2.setText(p.get(1).getPlayerName());
                        jug3.setText(p.get(2).getPlayerName());
                        jug4.setText(p.get(3).getPlayerName());
                        jug5.setText(p.get(4).getPlayerName());
                        jug6.setText(p.get(5).getPlayerName());
                        break;
                        
                    case 7:
                        jug1.setText(p.get(0).getPlayerName());
                        jug2.setText(p.get(1).getPlayerName());
                        jug3.setText(p.get(2).getPlayerName());
                        jug4.setText(p.get(3).getPlayerName());
                        jug5.setText(p.get(4).getPlayerName());
                        jug6.setText(p.get(5).getPlayerName());
                        jug7.setText(p.get(6).getPlayerName());
                        break;
          
                }
    }
    
        /**
         * Muestra elpuntaje de todos los jugadores
         * @param p
         * @param jug1
         * @param jug2
         * @param jug3
         * @param jug4
         * @param jug5
         * @param jug6
         * @param jug7 
         */
    public void mostrarPuntaje(ArrayList<Player> p,JLabel jug1,JLabel jug2,JLabel jug3,JLabel jug4,JLabel jug5,JLabel jug6,JLabel jug7){
                switch (p.size()){
                    case 2:
                        jug1.setText(""+p.get(0).getScore());
                        jug2.setText(""+p.get(1).getScore());
                        
                        break;
                    
                    case 3:
                        jug1.setText(""+p.get(0).getScore());
                        jug2.setText(""+p.get(1).getScore());
                        jug3.setText(""+p.get(2).getScore());
                        break;
                        
                    case 4:
                        jug1.setText(""+p.get(0).getScore());
                        jug2.setText(""+p.get(1).getScore());
                        jug3.setText(""+p.get(2).getScore());
                        jug4.setText(""+p.get(3).getScore());
                        
                        break;
                        
                    case 5:
                        jug1.setText(""+p.get(0).getScore());
                        jug2.setText(""+p.get(1).getScore());
                        jug3.setText(""+p.get(2).getScore());
                        jug4.setText(""+p.get(3).getScore());
                        jug5.setText(""+p.get(4).getScore());
                        
                        break;    
                              
                    case 6:
                        jug1.setText(""+p.get(0).getScore());
                        jug2.setText(""+p.get(1).getScore());
                        jug3.setText(""+p.get(2).getScore());
                        jug4.setText(""+p.get(3).getScore());
                        jug5.setText(""+p.get(4).getScore());
                        jug6.setText(""+p.get(5).getScore());
                        
                        break;
                        
                    case 7:
                        jug1.setText(""+p.get(0).getScore());
                        jug2.setText(""+p.get(1).getScore());
                        jug3.setText(""+p.get(2).getScore());
                        jug4.setText(""+p.get(3).getScore());
                        jug5.setText(""+p.get(4).getScore());
                        jug6.setText(""+p.get(5).getScore());
                        jug7.setText(""+p.get(6).getScore());
                        break;
          
                }
    }
    
    /**
     * oculta las JLabels de los jugadoresinactivos en la ventana
     * @param jug1
     * @param jug2
     * @param jug3
     * @param jug4
     * @param jug5
     * @param jug6
     * @param jug7 
     */
    public void quitarJLabel(JLabel jug1,JLabel jug2,JLabel jug3,JLabel jug4,JLabel jug5,JLabel jug6,JLabel jug7){
        switch (cantidadJugadores){
            case 2:
                jug3.setVisible(false);
                jug4.setVisible(false);
                jug5.setVisible(false);
                jug6.setVisible(false);
                jug7.setVisible(false);
                
                break;
            case 3:
                jug4.setVisible(false);
                jug5.setVisible(false);
                jug6.setVisible(false);
                jug7.setVisible(false);
                               
                break;    
            case 4:
                jug5.setVisible(false);
                jug6.setVisible(false);
                jug7.setVisible(false);
                break;
            case 5:
                jug6.setVisible(false);
                jug7.setVisible(false);
                break;
            case 6:
                jug7.setVisible(false);
                break;            
        }
        
    }
        
    
}
