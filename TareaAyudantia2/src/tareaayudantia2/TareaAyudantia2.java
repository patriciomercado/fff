/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaayudantia2;
import java.util.Scanner;
/**
 *
 * @author Javier Vargas
 */
public class TareaAyudantia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int puntos = 0;
        
        System.out.println("Cuatos partidos jugo el equipo?");
        
        int N = sc.nextInt();
        
        System.out.println("Cuatos goles compró el equipo?");
        
        int G = sc.nextInt();     
        int [][] partidos = new int [2][N];
        
        String [][] tabla = new String [2][N];
        
        for (int i=0;i<2;i++){
            for (int j=0; j<N;j++){
                partidos[i][j] = (int)Math.floor(Math.random()*(0-4)+4);
                tabla[i][j] = Integer.toString(partidos[i][j]);
            }
        }
        
        for(int j=0;j<N;j++){
           if(G>0){
                if(partidos[0][j]==partidos[1][j]){
                    partidos[0][j]=partidos[0][j]+1;
                    G--;
                }
            }
       }
        
        for (int i=0;i<1;i++){
            for (int j=0; j<N;j++){
                if(G>0){
                    while(partidos[i][j]<=partidos[i+1][j] && G>0){
                        partidos[i][j]=partidos[i][j]+1;
                        G--;
                    }
                }
            }
        }
        
        for (int j=0; j<N;j++){
            if(partidos[0][j]>partidos[1][j]){
                puntos+=3;
            }else if(partidos[0][j]==partidos[1][j]){
                puntos+=1;
            }
        }
        
        System.out.println("La Tabla de resultado es: \n Original - Con goles comprados");
        
        for (int i=0;i<1;i++){
            for (int j=0; j<N;j++){
                System.out.println(tabla[i][j]+" "+tabla[i+1][j]+"      "+partidos[i][j]+" "+partidos[i+1][j]);
            }
            System.out.println(G);
            System.out.println(puntos);
        }
    }
    
}
