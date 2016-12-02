package zzz;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.*;

public class Game {        
 
       
	private ArrayList<String> ranking = new ArrayList<>();
        private ArrayList <Player> Players = new ArrayList<>();
        private final DataManager file = new DataManager();
        
        private int players;
        private boolean dado_lock = true;
        private int turn = -1;        

       
        
        
        
        
        
        
        
        
        public void setPlayers(int p){
            this.players = p;
        }
        
 
        
        
    protected void dado_number(JButton Dado, JTextArea Question) { //Simula el lanzamiento del dado, y muestra la accion en la ventana (ademas del numero del dado)
        if(dado_lock == false){

            dado_lock = true;
            
            int pregunta = Players.get(turn).getScore() + cara;
            if(pregunta >= preguntas.size()){
                Question.setText("Usted Es un Gran DRUNK!");
            } else{
                Question.setText(azarPregunta());
            }
        } else{
            JOptionPane.showMessageDialog(null, "ya lanzaste el dado!!!");
        }
    }

    
    
    protected boolean ScoreCheck(){ //Checkea el Score del Jugador actual, si supera el limite establecido, muestra la pantalla final.
        if(turn != -1){
            if((Players.get(turn).getScore()) > 50 ){
                frameWinner endFrame = new frameWinner();
                endFrame.setWiner(Players.get(turn).getPlayerName());
                endFrame.setVisible(true);
                return false;
            }
        }
        return true;
    }

  
	

}