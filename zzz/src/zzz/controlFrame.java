/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zzz;

import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author patricio mercado
 */
public class controlFrame {
    int cantidadJugadores =0;

    public controlFrame( int cantidadJugadores) {
       this.cantidadJugadores = cantidadJugadores;
    }
    
    public void correctorJlabels(){
        switch(cantidadJugadores){
            case 2:
                break;
        }
    }
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
