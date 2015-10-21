package prototipo;

import java.util.*;
/**
 *
 * @author yojvn
 */
public class Prototipo {

    public static void main(String[] args) {
        
        System.out.println("Especifique cantidad de equipos a participar: ");
        int largoTabla = leer();
        int anchoTabla = 2;
        int contPartido = 0;
        String [][] bracket = new String [largoTabla][anchoTabla];
        inscripcionEquipos(bracket,largoTabla);
        while(contPartido<largoTabla){
            resultadoMatch(bracket,contPartido);
            contPartido++;
            contPartido++;
        }
        mostrar(bracket, contPartido);
    }
    
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
    
    public static void inscripcionEquipos(String tabla[][], int num){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < num; i++){
            System.out.println("Favor ingrese nombre del equipo Nº " +(i+1));
            tabla[i][0] = sc.nextLine();
        }
    }
    
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
    
    public static void mostrar(String tabla[][], int num){
        for(int i = 0; i < num; i++){
            System.out.print("Resultado ronda "+(i+1) +" : " +tabla[i][0] +" " +tabla[i][1] +"\n" );
        }
    }
    
}
