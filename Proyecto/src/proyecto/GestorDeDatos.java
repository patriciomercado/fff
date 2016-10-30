import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;


public class GestorDeDatos {
	
	//lee los archivos de los jugadores y las preguntas
	
	ArrayList<String> preguntas= new ArrayList<String>();
	ArrayList<String> ranking = new ArrayList<String>();

	
	public GestorDeDatos(){
		listaPreguntas("Preguntas.txt");
	}
	
	
	 public void crear(String nombre, String texto){
	        
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
		    String cadenaIntroduciada = aux +"#\n"+texto;
		    crear(archivo, cadenaIntroduciada);
		}
	 
	 public int largo(String tipoFichero){
	     String ficheroCompleto = leerFichero(tipoFichero);
	        String[] arrayFichero = ficheroCompleto.split("#");
	        return(arrayFichero.length/8);
	}
	
	
	public void listaPreguntas(String listaPreguntas){
		//Las preguntas estan separadas por "#" aqui se separa la cadena completa en un ArrayList
		
	     String ficheroPreguntas = leerFichero(listaPreguntas);
	        String[] arrayFichero = ficheroPreguntas.split("#");
	        ArrayList<String> pregunta = new ArrayList<String>();
	       
	        for (int i = 0; i < arrayFichero.length; i++) {
				pregunta.add(arrayFichero[i]);
			}
	       
	       
	        this.preguntas = pregunta;
	}
	
	
	public String leerFichero(String nombre){
		// lee un archivo y devuelve la cadena completa
		
		try{
		    File f;
		    FileReader lectorArchivo;
		    f = new File(nombre);
		    lectorArchivo = new FileReader(f);
		    BufferedReader br = new BufferedReader(lectorArchivo);
		    String l="";
		    String aux="";
		    while(true){
		        aux=br.readLine();
		        if(aux!=null)
		            l=l+aux;
		        else
		            break;
		    }
		    br.close();
		    lectorArchivo.close();
		   
		    return l;
		}catch(IOException e){
		System.out.println("Error:"+e.getMessage());
		}
		return null;
		}
	
}
