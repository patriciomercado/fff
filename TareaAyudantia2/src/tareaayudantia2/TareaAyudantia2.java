package tareaayudantia2;

import java.util.Scanner;

/**
 *
 * @author Javier Vargas
 * Desarrollo de la Tarea Ayudantia 2
 * Campeonato Caridad de equipos de futbol(?)
 * 
 */

public class TareaAyudantia2 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int puntos = 0;
        int goles;
        int partidosJugados;
        
        System.out.println("Cuatos partidos jugo el equipo?");
        partidosJugados = sc.nextInt();
        
        System.out.println("Cuatos goles compró el equipo?");
        goles = sc.nextInt();  
        
        //Inicio de las matrizes original y la modificada
        int [][] partidos = new int [2][partidosJugados];
        String [][] tabla = new String [2][partidosJugados];
        
        //se generan numeros random entre 0 y 3 para los partidos
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < partidosJugados; j++) {
                partidos[i][j] = (int) Math.floor(Math.random() * (0 - 4) + 4);
                tabla[i][j] = Integer.toString(partidos[i][j]);
            }
        }
        
        //se buscan partidos empatados, y se les suma un gol
        for (int j = 0; j < partidosJugados; j++) {
           if (goles > 0) {
                if (partidos[0][j] == partidos[1][j]){
                    partidos[0][j] = partidos[0][j] + 1;
                    goles--;
                }
            }
        }
        
        //Aca se rellenan los partidos hasta que marque como ganador
        for (int j = 0; j < partidosJugados; j++) {
            if (goles > 0) {
                while ((partidos[0][j] <= partidos[1][j]) && (goles > 0)) {
                    partidos[0][j] = partidos[0][j] + 1;
                    goles--;
                }
            }
        }
        
        //Se recorre la matriz para calcular el total de puntos
        for (int j = 0; j < partidosJugados; j++) {
            if (partidos[0][j] > partidos[1][j]) {
                puntos+=3;
            }else if (partidos[0][j] == partidos[1][j]) {
                puntos += 1;
            }
        }
        
        System.out.println("La Tabla de resultado es: ");
        System.out.println("Original - Con goles comprados");
        
        //Ultimo recorrido para imprimir los datos de ambas matrizes
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < partidosJugados; j++) {
                System.out.print(tabla[i][j] + " " + tabla[i+1][j] + "      ");
                System.out.println(partidos[i][j] + " " + partidos[i+1][j]);
            }
            System.out.println("La puntuación final es: " + puntos);
        }
        sc.close();
    }
    
}
