package parte3;

import java.util.Scanner;

/**
 *
 * @author Javier Vargas
 */
public class parte3 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int voc = 0,con = 0;
        System.out.print("Ingrese una frase: ");
        String frase = scan.nextLine();
        for(int x=0;x<frase.length();x++) {
            if (frase.charAt(x) != ' '){
            if ((frase.charAt(x)=='a') || (frase.charAt(x)=='e') || (frase.charAt(x)=='i') || (frase.charAt(x)=='o') || (frase.charAt(x)=='u')){
            voc++;
            }
            else {
                con++;
            }
        }
        }
        System.out.println("Numero de Vocales: " +voc);
        System.out.println("Numero de consonantes: " +con);
    }
}
