import java.util.Scanner;
/**
 *
 * @author Javier Vargas
 */
public class parte3 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
    int s = 1,ampo = 0;
    String amp = "APAGADA";
        while (s!=0){
            if(ampo==5){
                System.out.println("La Ampolleta se quemo");
                amp = "QUEMADA";
            }
                
        System.out.println("La Ampolleta esta "+amp);
        System.out.println("Escoga la opcion que desee hacer: ");
        System.out.println("1) Encender/apagar Ampolleta ");
        System.out.println("2) Cambiar ampolleta ");
        System.out.println("0) Salir ");
        s = scan.nextInt();
        switch (s) {
            case 1:  if(amp == "APAGADA" && ampo<5){
                        System.out.println("La ampolleta se encenció.");
                        amp="ENCENDIDA";
                        ampo++;
                        }
                    else{
                        if(ampo<5){
                        System.out.println("La ampolleta se apago.");
                        amp="APAGADA";
                        }
                    }
                     break;
            case 2:  System.out.println("Se cambio la ampolleta.");
                     amp = "APAGADA";
                     ampo = 0;
                     break;
            case 0: System.out.println("Adios!");
                     break;
            default: System.out.println("Opcion Incorrecta Ingrese de nuevo. ");
                     break;
        }
        }
    }
}
