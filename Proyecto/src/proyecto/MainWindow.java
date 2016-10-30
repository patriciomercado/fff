/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import javax.swing.JOptionPane;

/**
 *
 * @author Okumura Rinzler
 */
public class MainWindow {
    
    
    public int buton_Action(){
        String [] options = {"2","3","4"};
        int n = JOptionPane.showOptionDialog(null,
		"Cuantos jugadores son?",
		"Una Simple Pregunta",
		JOptionPane.YES_NO_OPTION,
		JOptionPane.QUESTION_MESSAGE,
		null,     //don't use a custom Icon
		options,  //the titles of buttons
		options[0]) + 2;
        return (n);
    } 
    
    public void rules(){
        JOptionPane.showMessageDialog(null, "Reglas: \n");
    }
    
    public void WinSwitch(int g){
        Gamers game = new Gamers();
        switch(g){
                case 2:
                    game.setPlayers(g);
                    game.LabelsCorrection();
                    game.setVisible(true);
                    break;
                case 3:
                    game.setPlayers(g);
                    game.LabelsCorrection();
                    game.setVisible(true);
                    break;
                case 4:
                    game.setPlayers(g);
                    game.setVisible(true);
                    break;
        }
    }
    
    
}
