package tareaayudantia2;
import java.util.Scanner;
/**
 *
 * @author Javier Vargas
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
        
        int [][] partidos = new int [2][partidosJugados];
        String [][] tabla = new String [2][partidosJugados];
        
        for (int i=0;i<2;i++){
            for (int j=0; j<partidosJugados;j++){
                partidos[i][j] = (int)Math.floor(Math.random()*(0-4)+4);
                tabla[i][j] = Integer.toString(partidos[i][j]);
            }
        }
        
        for(int j=0;j<partidosJugados;j++){
           if(goles>0){
                if(partidos[0][j]==partidos[1][j]){
                    partidos[0][j]=partidos[0][j]+1;
                    goles--;
                }
            }
       }
        
        for (int i=0;i<1;i++){
            for (int j=0; j<partidosJugados;j++){
                if(goles>0){
                    while((partidos[i][j]<=partidos[i+1][j]) && (goles>0)){
                        partidos[i][j]=partidos[i][j]+1;
                        goles--;
                    }
                }
            }
        }
        
        for (int j=0; j<partidosJugados;j++){
            if(partidos[0][j]>partidos[1][j]){
                puntos+=3;
            }else if(partidos[0][j]==partidos[1][j]){
                puntos+=1;
            }
        }
        
        System.out.println("La Tabla de resultado es: \n Original - Con goles comprados");
        
        for (int i=0;i<1;i++){
            for (int j=0; j<partidosJugados;j++){
                System.out.println(tabla[i][j]+" "+tabla[i+1][j]+"      "+partidos[i][j]+" "+partidos[i+1][j]);
            }
            System.out.println(goles);
            System.out.println(puntos);
        }
    }
    
}
