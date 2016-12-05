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
import javax.swing.JTextArea;

/**
 *
 * @author patricio mercado y Javier Vargas
 * 
 * Clase que maneja los metodos de la ventana principal del juego
 */
public class Juego {
    private int turnoJug = 0;
    private boolean lanzamiento = false;
    private boolean siguiente = false;
    private DataManager file = new DataManager();
    private ArrayList<Player> plaArr = new ArrayList<>();
    Dado dad = new Dado();
    String ganador = "";
    
    /**
     * constructor del juego con el cual recibe el arraylist de jugadores
     * @param p 
     */
    public Juego(ArrayList<Player> p) {
        this.plaArr = p;
        
    }
    /**
     * devuelve el ArrayList de Players
     * @return 
     */
    public ArrayList<Player> getarrayListPlayer(){
        return plaArr;
    }
    /**
     * devuelve la cantidad de jugadores actuales
     * @return 
     */
    public int getTurnoJug() {
        return turnoJug;
    }
    
    /**
     * Este metodo simula el cambio de turno, añadiendo el puntaje al jugador actual y 
     * avanzando al siguiente jugador
     * @param dado ingresa el valor del dado para ser añadido al score del jugador
     */
    public void turnos(int dado){
        
            plaArr.get(turnoJug).addScore(dado);
            lanzamiento = false;
            turnoJug++;
            if (turnoJug >= plaArr.size()) {
                turnoJug = 0;
            }
    }
    
    /**
     * verifica si el jugador actual es o no ganador del juego, checkeando si su puntaje
     * sobrepasa el limite establecido
     * @return false si gana, true si continua jugando
     */
    public boolean winer(){
        if (plaArr.get(turnoJug).getScore() >= 50) {
            this.ganador = plaArr.get(turnoJug).getPlayerName();
            return false;
        }
        return true;
    }

    /**
     * obtiene la informacion del jugador ganador
     * @return devuelve el nombre del ganador
     */
    public String getGanador() {
        return ganador;
    }
    
    /**
     * prepara el siguiente turno y lanzamiento
     */
    public void lanzamientoSet(){
        lanzamiento = true;
        siguiente = true;
    }
    
    /**
     * Checkea si se lanzo el dado o no, si lo hizodaun mensaje, sino simula el 
     * lanzamiento mostrandolo por pantalla
     * @param boton se configura para que muestre el valor del dado
     * @param preg realiza el cambio en la pregunta segun el numero que salga.
     * @return devuelve si se sale de laventana para presentar al ganador o no
     */
    public boolean chequear(JButton boton, JTextArea preg){
        if(lanzamiento == false){
            JOptionPane.showMessageDialog(null, "Lanza el Dado Primero");
        }else{
            turnos(Integer.parseInt(boton.getText()));
            boton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zzz/dados-04.gif")));
            preg.setText("");
            siguiente = false;
        }
        return winer();
    }
    
    /**
     * Simula el lanzamiento del dado, en caso de haber tirado una vez, se bloquea y lanzaun mensaje,
     * en caso contrario simula el lanzamiento mostrando el valor por pantalla
     * @param boton se configura el valor del dado a mostrar
     * @param pregun se cambia la pregunta de la pantalla
     */
    public void lanzarDado(JButton boton, JTextArea pregun){
        if(siguiente == true){
            JOptionPane.showMessageDialog(null, "Ya lanzaste el dado");
        }else{
            boton.setIcon(null);
            boton.setText(Integer.toString(dad.lanzarDado()));
            lanzamientoSet();
            cambiarPregunta(pregun);
        }
    }
    
    /**
     * Genera la pregunta, leyendola del ArrayList de preguntas
     * @param preg Ingresa el TextArea a modificar para mostrar la pregunta
     */
    public void cambiarPregunta(JTextArea preg){
        preg.setText(file.azarPregunta());
    }
    
    /**
     * actualiza los valores de los scores de todos los jugadores
     * @param score1
     * @param score2
     * @param score3
     * @param score4
     * @param score5
     * @param score6
     * @param score7 
     */
    public void actualizarLabels(JLabel score1, JLabel score2, JLabel score3, JLabel score4, JLabel score5, JLabel score6, JLabel score7) {
                score1.setText(""+plaArr.get(0).getScore());
                score2.setText(""+plaArr.get(1).getScore());
                
        switch(plaArr.size()){
            case 3:
                score3.setText(""+plaArr.get(2).getScore());
                break;
            case 4:
                score3.setText(""+plaArr.get(2).getScore());
                score4.setText(""+plaArr.get(3).getScore());
                break;
            case 5:
                score3.setText(""+plaArr.get(2).getScore());
                score4.setText(""+plaArr.get(3).getScore());
                score5.setText(""+plaArr.get(4).getScore());
                break;
            case 6:
                score3.setText(""+plaArr.get(2).getScore());
                score4.setText(""+plaArr.get(3).getScore());
                score5.setText(""+plaArr.get(4).getScore());
                score6.setText(""+plaArr.get(5).getScore());
                break;
            case 7:
                score3.setText(""+plaArr.get(2).getScore());
                score4.setText(""+plaArr.get(3).getScore());
                score5.setText(""+plaArr.get(4).getScore());
                score6.setText(""+plaArr.get(5).getScore());
                score7.setText(""+plaArr.get(6).getScore());
                break;
                
        }
    }
}
