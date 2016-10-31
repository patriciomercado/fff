/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

/**
 *
 * @author Okumura Rinzler
 */
public class GamersMethods {
    private final Game game = new Game();
    
    public void setPlayersGame(int p){ //Setea la cantidad de jugadores
        game.setPlayers(p);
    }
    
    public void setGamersName(String G1, String G2, String G3, String G4) { //Recibe los nombres de los jugadores, para cambiarlos en la siguiente ventana.
        String [] Gamers = {G1, G2, G3, G4};
        game.setWindowsReady(Gamers);
        game.fillPlayersCollection(Gamers);
     }
    
    public void setVisibleGame(){ //Muestra la pantalla de juego
        game.setVisible(true);
    }
}
