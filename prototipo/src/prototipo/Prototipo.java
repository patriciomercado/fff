package prototipo;

import java.util.*;
/**
 *
 * @author yojvn
 */
public class Prototipo {

    public static void main(String[] args) {
        
        //Main del programa principal, de momento con salidas en consola las cuales se reemplazaran con JOption y JFrame
        //Se solicita el numero de equipos que participaran en X torneo
        System.out.println("Especifique cantidad de equipos a participar: ");
        int largoTabla = leer();
        int anchoTabla = 2;
        int contPartido = 0;
        String [][] bracket = new String [largoTabla][anchoTabla];
        
        //Llama a la funcion para inscribir los equipos en la matriz
        inscripcionEquipos(bracket,largoTabla);
        
        //Ciclo para preguntar por los resultados de cada partido
        while (contPartido < largoTabla){
            resultadoMatch(bracket,contPartido);
            contPartido += 2;
        }
        mostrar(bracket, contPartido);
    }
    
    //Método para leer numeros
    public static int leer() {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        boolean salir = false;
        do {
            try {
                System.out.println("(Sólo Números pares)");
                num = sc.nextInt();
                salir = false;
            } catch (InputMismatchException exc) {
                sc.nextLine();
                System.out.println("Debe introducir solo numeros. \n Intente nuevamente\n");
                salir = true;
            }
        } while (salir);
        return num;
    }
    
    //Método para la inscripcion de equipos segun la cantidad dictada al principio
    public static void inscripcionEquipos(String tabla[][], int num){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < num; i++){
            System.out.println("Favor ingrese nombre del equipo Nº " +(i + 1));
            tabla[i][0] = sc.nextLine();
        }
    }
    
    //Método que pregunta por el resultado de cada Match (partida)
    public static void resultadoMatch(String tabla[][], int nPartido){
        int localWinner;
        Scanner sc = new Scanner(System.in);
        System.out.println("Es el turno de " +tabla[nPartido][0] + " Contra " + tabla[nPartido+1][0]);
        System.out.println("Quien paso la ronda?\n " +"1) " +tabla[nPartido][0] +"\n 2) " +tabla[nPartido+1][0]);
        localWinner = sc.nextInt();
        if(localWinner == 1){
            tabla[nPartido][1] = "Pass";
            tabla[nPartido+1][1] = "Fail";
        } else {
            tabla[nPartido+1][1] = "Pass";
            tabla[nPartido][1] = "Fail";
        }
    }
    
    //Método que muestra los resultados de cada equipo al final de la primera ronda
    public static void mostrar(String tabla[][], int num){
        for(int i = 0; i < num; i++){
            System.out.print("Resultado ronda "+(i+1) +" : " +tabla[i][0] +" " +tabla[i][1] +"\n" );
        }
    }
    
}
