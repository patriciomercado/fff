package tareaparte2;
import java.util.*;
/**
 *
 * @author Javier Vargas
 */


public class parte2 {
    
    public static String capitalizar(String s) {
        if (s.length() == 0) return s;
        return s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
    }
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        String t = " ";
        System.out.print("Ingrese una frase ");
        String frase = scan.nextLine();
        System.out.println("La frase es: " +frase +".");
        System.out.println("En minúscula: " +frase.toLowerCase() +".");
        System.out.println("En mayúscula: " +frase.toUpperCase() +".");
        System.out.println("Substring: " +frase.substring(4) +".");
        System.out.println("La frase es: " +frase.replaceAll("a","u") +".");
        System.out.println("El largo es: " +frase.length() +".");
        frase = t+frase+t;
        System.out.println("La frase con espacios es: " +frase +".");
        System.out.println("El nuevo largo es: " +frase.length() +".");
        System.out.println("El largo de la cadena aplicando trim es: " +frase.trim().length() +".");
        System.out.println("IndexOF: " +frase.indexOf("a") +" LasIndexOf: " +frase.lastIndexOf("a"));
        System.out.println("IndexOF: " +frase.indexOf("pz") +" LasIndexOf: " +frase.lastIndexOf("pz"));
        frase = "JaViEr iGnacIO VaRgAs NaHuEl";
        
        String line = frase;
        String[] words = line.split("\\s");
        for (String s : words) {
             System.out.print(capitalizar(s) + " ");
        }
    }
            
}
