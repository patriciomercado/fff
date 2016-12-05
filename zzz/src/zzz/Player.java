package zzz;
/**
 * 
 * @author patricio mercado y Javier Vargas
 */
public class Player {

	private String nombre;
	private int puntaje = 0;

        /**
         * Constructor de la clase, se genera con un nombre al momento de ser creado
         * @param name ingresa el nombre del jugador
         */
        public Player(String name){
            this.nombre = name;
        }
        
        /**
         * Cambia el nombre del jugador
         * @param Name nombre del jugador
         */
        public void setPlayerName(String Name){
            this.nombre = Name;
        }
        
        /**
         * retorna el nombre del jugador actual
         * @return nombre del jugador
         */
        public String getPlayerName(){
            return this.nombre;
        }
        
        /**
         * añade el puntaje obtenido del dado al puntaje del jugador
         * @param s valor del dado
         */
        public void addScore(int s){
            if(s > 0 && s < 3){
                if((this.puntaje-s) > 0){
                    this.puntaje -= s;
                    
                } else{
                    this.puntaje = 0;
                }
            }else{
                this.puntaje += s;
            }
        }
        
        /**
         * obtiene el valor del dado
         * @return valor deldado
         */
        public int getScore(){
            return (this.puntaje);
        }

}