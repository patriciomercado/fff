/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameSBOMB;

import java.io.File;
import java.io.FileWriter;
import java.text.Collator;
import java.util.Scanner;

/**
 *
 * @author yojvn
 */
public class jugadores {
    
    public String [] readPlayers(){
        File fichero = new File("jugadores.txt");
		Scanner s = null;
                String [] jugadores = new String [4];
                int cont = 0;

		try {
			s = new Scanner(fichero);
                        
			while (s.hasNextLine()) {
				String linea = s.nextLine(); 
				jugadores[cont] = linea;
                                cont++;
			}

		} catch (Exception ex) {
			System.out.println("Mensaje: " + ex.getMessage());
		} finally {
			// Cerramos el fichero tanto si la lectura ha sido correcta o no
			try {
				if (s != null)
					s.close();
			} catch (Exception ex2) {
				System.out.println("Mensaje 2: " + ex2.getMessage());
			}
		}
        return jugadores.clone();
    }
    
    public int cantPlayers(){
        File fichero = new File("jugadores.txt");
        Collator comparador = Collator.getInstance();
        comparador.setStrength(Collator.PRIMARY);
		Scanner s = null;
                String [] jugadores = new String [4];
                int cont = 0;

		try {
			s = new Scanner(fichero);
                        
			while (s.hasNextLine()) {
				String linea = s.nextLine(); 
				jugadores[cont] = linea;
                                cont++;
			}

		} catch (Exception ex) {
			System.out.println("Mensaje: " + ex.getMessage());
		} finally {
			// Cerramos el fichero tanto si la lectura ha sido correcta o no
			try {
				if (s != null)
					s.close();
			} catch (Exception ex2) {
				System.out.println("Mensaje 2: " + ex2.getMessage());
			}
		}
                cont = 0;
        for(int i = 0; i < 4; i++){
            if( (jugadores[i]!=null) && (comparador.compare(jugadores[i], "0") != 0)){
                cont++;
            }
        }
        return cont;
    }
    
        public int cantPlayers2(){
        File fichero = new File("jugadores.txt");
        Collator comparador = Collator.getInstance();
        comparador.setStrength(Collator.PRIMARY);
		Scanner s = null;
                String [] jugadores = new String [4];
                int cont = 0;

		try {
			s = new Scanner(fichero);
                        
			while (s.hasNextLine()) {
				String linea = s.nextLine(); 
				jugadores[cont] = linea;
                                cont++;
			}

		} catch (Exception ex) {
			System.out.println("Mensaje: " + ex.getMessage());
		} finally {
			// Cerramos el fichero tanto si la lectura ha sido correcta o no
			try {
				if (s != null)
					s.close();
			} catch (Exception ex2) {
				System.out.println("Mensaje 2: " + ex2.getMessage());
			}
		}
                cont = -1;
        for(int i = 0; i < 4; i++){
            if(comparador.compare(jugadores[i], "0") == 0){
                cont++;
            }
            if(comparador.compare(jugadores[i], "1") == 0){
                cont++;
            }
            if(comparador.compare(jugadores[i], "2") == 0){
                cont++;
            }
            if(comparador.compare(jugadores[i], "3") == 0){
                cont++;
            }
            if(comparador.compare(jugadores[i], "4") == 0){
                cont++;
            }            
        }
        return cont;
    }
    
    public void writePlayers(int players){
        String [] cantPlayers = new String [4];
        cantPlayers[0] = "1";
        if(players == 2){
            cantPlayers[1] = "2";
        } else if(players == 3){
            cantPlayers[1] = "2";
            cantPlayers[2] = "3";
        }else if(players == 4){
            cantPlayers[1] = "2";
            cantPlayers[2] = "3";
            cantPlayers[3] = "4";
        }
        	FileWriter fichero = null;
		try {
			fichero = new FileWriter("jugadores.txt");
			for (String linea : cantPlayers) {
				fichero.write(linea + "\n");
			}
			fichero.close();
		} catch (Exception ex) {
			System.out.println("Mensaje de la excepción: " + ex.getMessage());
		}
    }
    
    public void deletePlayer(int player){
        File fichero = new File("jugadores.txt");
		Scanner s = null;
                String [] jugadores = new String [4];
                int cont = 0;

		try {
			s = new Scanner(fichero);
                        
			while (s.hasNextLine()) {
				String linea = s.nextLine(); 
				jugadores[cont] = linea;
                                cont++;
			}

		} catch (Exception ex) {
			System.out.println("Mensaje: " + ex.getMessage());
		} finally {
			// Cerramos el fichero tanto si la lectura ha sido correcta o no
			try {
				if (s != null)
					s.close();
			} catch (Exception ex2) {
				System.out.println("Mensaje 2: " + ex2.getMessage());
			}
		}
                
                for(int j = 0; j < 4; j++){
                    try{
                        if(Integer.parseInt(jugadores[j]) == player){
                            jugadores[j] = "0";
                        }
                    } catch (Exception ex){}

                }
        	FileWriter fichero2 = null;
		try {
			fichero2 = new FileWriter("jugadores.txt");
			for (String linea : jugadores) {
				fichero2.write(linea + "\n");
			}
			fichero2.close();
		} catch (Exception ex) {
			System.out.println("Mensaje de la excepción: " + ex.getMessage());
		}                
                
                
    }
    
    
}
