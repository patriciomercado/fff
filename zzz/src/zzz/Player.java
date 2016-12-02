package zzz;

public class Player {

	private String nombre;
	private int puntaje = 0;

        public Player(String name){
            this.nombre = name;
        }
        
        public void setPlayerName(String Name){
            this.nombre = Name;
        }
        
        public String getPlayerName(){
            return this.nombre;
        }
        
        public void addScore(int s){
            if(s > 0 && s < 3){
                if((puntaje-s) < 0){
                    this.puntaje = 0;
                } else{
                    this.puntaje -= s;
                }
            }else{
                this.puntaje += s;
            }
        }
        
        public int getScore(){
            return (this.puntaje);
        }

}