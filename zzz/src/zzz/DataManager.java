package zzz;

import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;



public class DataManager {
	
	//lee los archivos de los jugadores y las preguntas	
	
	 public void crear(String nombre, String texto){
	        //parametros nombre del archivo y texto a introducir
	        File f = new File(nombre);
	        try{
	        FileWriter w = new FileWriter(f);
	        BufferedWriter bw = new BufferedWriter(w);
	        PrintWriter wr = new PrintWriter(bw);	
	        wr.write(texto);
	        bw.newLine();
	       
	        wr.close();
	        bw.close();
	        }catch(IOException e){};
	        
	 }

         
         
	 public void agregar(String archivo, String texto){
		    
		    String aux =leerFichero(archivo);
		    String cadenaIntroduciada = aux +"\n#"+texto;
		    crear(archivo, cadenaIntroduciada);
		}
	 
	 
	
	public ArrayList<String> listaPreguntas(){
                //el parametro 
		//Las preguntas estan separadas por "#" aqui se separa la cadena completa en un ArrayList
		
	     String ficheroPreguntas = leerFichero(leerFichero("Preguntas.txt"));
	        String [] arrayFichero = ficheroPreguntas.split("#");
	        ArrayList<String> preguntas = new ArrayList<>();
	       
	        for (int i = 0; i < arrayFichero.length; i++) {
				preguntas.add(arrayFichero[i]);
			}
	       
	       
	        return (preguntas);
	}
        
        public String azarPregunta(){ 
            ArrayList<String> preguntas = listaPreguntas();
            int azar=(int) (Math.random()*preguntas.size()+0); 
            return preguntas.get(azar); 
        }
	
	public String ranking(){
            try {
                 String ranking = leerFichero(leerFichero("Ranking.txt"));
                 return ranking;
            } catch (Exception e) {
                crear("Ranking.txt", "");
                JOptionPane.showMessageDialog(null, "No se encontro \n"
                        + "ranking de borrachos");
            }
             return null;
        }
	public String leerFichero(String nombre){
		// lee un archivo y devuelve la cadena completa
		
		try{
		    File f;
		    FileReader lectorArchivo;
		    f = new File(nombre);
		    lectorArchivo = new FileReader(f);
		    BufferedReader br = new BufferedReader(lectorArchivo);
		    String l = "";
		    String aux = "";
		    while(true){
		        aux = br.readLine();
		        if(aux != null)
		            l += "\n" + aux;
		        else
		            break;
		    }
		    br.close();
		    lectorArchivo.close();
		   
		    return l;
		}catch(IOException e){
		System.out.println("Error:" + e.getMessage());
		}
		return null;
		}
	
}
