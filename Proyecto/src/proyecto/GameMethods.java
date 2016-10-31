package proyecto;

import java.util.ArrayList;

public class GameMethods {        
 
        ArrayList<String> preguntas = new ArrayList<String>();
	ArrayList<String> ranking = new ArrayList<String>();
        
        DataManager file = new DataManager();

	public void preguntaAzar() {
		int azar =(int)(Math.random()*39+0);

	}
        
        public void armarPreguntas(){
            preguntas = file.listaPreguntas("Preguntas.txt");
        }
        
	

}