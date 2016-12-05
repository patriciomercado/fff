/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zzz;


import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author patricio mercado y Javier Vargas
 */

public class DataManager {
		
	/**
         * Metodo que crea y asigna valores a un archivo
         * @param nombre define el nombre del archivo a utilizar
         * @param texto es todo el texto que se añadira al archivo despues de su creacion
         */
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

         
         /**
          * Añade una cadena a un archivo existente, añadiendo el caracter # para poder realizar un posterior Split
          * @param archivo nombre del archivo
          * @param texto texto a aladir al archivo
          */
	 public void agregar(String archivo, String texto){
		    
		    String aux =leerFichero(archivo);
		    String cadenaIntroduciada = aux +"\n#"+texto;
		    crear(archivo, cadenaIntroduciada);
		}
	 
	 
	/**
         * Genera un ArrayList con cada frase que hay en el archivo Preguntas.txt, adicionalmente las separapormedio del conector #
         * @return Un arraylist de objeto de tipo String
         */
	public ArrayList<String> listaPreguntas(){
                //el parametro 
		//Las preguntas estan separadas por "#" aqui se separa la cadena completa en un ArrayList
		
	     String ficheroPreguntas = leerFichero("Preguntas.txt");
	        String [] arrayFichero = ficheroPreguntas.split("#");
	        ArrayList<String> preguntas = new ArrayList<>();
	       
	        for (int i = 0; i < arrayFichero.length; i++) {
				preguntas.add(arrayFichero[i]);
			}
	       
	       
	        return (preguntas);
	}
        
        /**
         * Llamando al metodoanterior, se procede a extraer una pregunta almacenada en el ArrayList de preguntas
         * @return sedevuelve un String con el contenido requerido.
         */
        public String azarPregunta(){ 
            ArrayList<String> preguntas = listaPreguntas();
            int azar=(int) (Math.random()*preguntas.size()+0); 
            return preguntas.get(azar); 
        }
        
        /**
         * Se agrega al Ranking al Ultimo Jugador que gano el juego, el cual se escribe en un archivo.
         * @param jugador sera el String que se ingresara al Archivo.
         */
	public void addRanking(String jugador){
            try {
                agregar("Ranking.txt", jugador);
            } catch (Exception e) {
                 crear("Ranking.txt", jugador);
                JOptionPane.showMessageDialog(null, "No se encontro \n"
                        + "ranking de borrachos \n"
                        + "Seras el primero");
            }
        }
        
        /**
         * Obtiene los nombres de aquellos que han jagado el juego, en casode no existir lanza un mensaje de error.
         * @return returnla el String de nombres sin separar, en caso de no existir se le asigna un valor null
         */
	public String ranking(){
            try {
                 String ranking = leerFichero("Ranking.txt");
                 return ranking;
            } catch (Exception e) {
                crear("Ranking.txt", "");
                JOptionPane.showMessageDialog(null, "No se encontro \n"
                        + "ranking de borrachos");
            }
             return null;
        } 
        
        /**
         * El siguiente Metodo Realiza la tarea de leer archivos verificando si existen o no
         * @param nombre Define el nombre del archivo que se va a leer
         * @return retorna lo que haya dentro del archivo, como tipo String
         */
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
