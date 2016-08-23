package tarea2208;

import javax.swing.JOptionPane;

/**
 *
 * @author Okumura Rinzler
 */
public class UsoString {

    public static void main(String[] args) {
        boolean salir = true;
        while(salir){
            String  input = new String();
            try{
                input = leerString(input);
            } catch (NullPointerException ex){
                System.exit(0);
            }
            imprimirResultados(input);
        }   
    }
    
    
    public static String leerString(String palabras){ // Permite leer y retorna la cadena leída por teclado.
        try{
        palabras = (JOptionPane.showInputDialog(null, "Ingrese una Frase para continuar:"));
        } catch(NullPointerException ex){
            System.exit(0);
        }
        return palabras;
    }

    public static int largoCadena(String str){ 
        int largo = 0;
        largo = str.length();
        return (largo);
    }

    public static int contarVocales(String str){ // Permite contar la cantidad de vocales de una cadena
        str = str.toLowerCase();
        int vocal = 0;
        for(int i = 0; i < str.length(); i++){
            switch (str.charAt(i)){
                case 'a': 
                case 'e':                         
                case 'i': 
                case 'o': 
                case 'u':
                    vocal++;
                    break;
                default:
                    break;
            }
        }
        return vocal;
    }

    public static int contarConsonantes(String str){ // Permite contar la cantidad de consonantes de una cadena
        str = str.toLowerCase();
        str = str.replaceAll("a|e|i|o|u|", "");
        str = str.trim();
        int cons = str.length();
        return cons;
    }

    public static String invertirString(String str){ // Retorna la cadena invertida (derecha a izquierda)
        str = new StringBuilder(str).reverse().toString();
        return str;
    }

    public static boolean existeChar(String str, char ch){ // Permite saber si existe un caracter al menos una vez en la cadena
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ch){
                return true;
            }
        }
        return false;
    }

    public static boolean existeSubString(String str, String substr){ // Permite saber si existe una sub cadena substr dentro de la cadena str
        if(str.toLowerCase().contains(substr.toLowerCase())){
            return true;
        }
        return false;
    }

    public static char [] crearArrayChar(String str){ // Permite crear un arreglo de tipo char a partir de c/u de los caracteres de la cadena
    
        char [] letras = new char [str.length()];
        for(int i = 0; i < letras.length; i++){
            letras[i] = str.charAt(i);
        }
        return letras.clone();
    }
    
    public static String leerChar(String str){
        String out = "";
        boolean charExist = false;
            try{
                charExist = existeChar(str, JOptionPane.showInputDialog(null,"Ingrese "
                                                +"un caracter a buscar. \n solo se tomara "
                                                +"encuenta el primer caracter ingresado"
                                                + "\n si se deja en blanco, saldra del programa!"
                                                + "\n Cancele para salir").charAt(0));            
            } catch (Exception ex){
                System.exit(0);
            }
        if(charExist == true){
            out = "existe";
        }else{
            out = "no existe";
        }
        return out;
    }
    
    public static String leerFrase(String str){
        String out = "";
        boolean substring = false;
            try{
                substring = existeSubString(str, JOptionPane.showInputDialog(null,"Ingrese"
                                                +"una frase a buscar. \n"
                                                + "\n Presione cancelar para salir del programa!"));            
            } catch (Exception ex){
                System.exit(0);
            }
        if(substring == true){
            out = "existe";
        }else{
            out = "no existe";
        }        
        
        
        return out;
    }

    public static void imprimirResultados(String str) { // Permite ver por pantalla el resultado del uso de todos los métodos anteriores
        String aux = leerChar(str);
        String aux2 = leerFrase(str);
        String aux3 = "";
        char [] letras = crearArrayChar(str);
        for(int i = 0; i <letras.length; i++){
            aux3 += "["+letras[i]+"]";
        }
        
        JOptionPane.showMessageDialog(null,"El largo de la cadena es "+largoCadena(str)
                                           +"\nLa cantidad de vocales fue "+contarVocales(str)
                                           +"\nLa Cantidad de Consonantes fue de "+contarConsonantes(str)
                                           +"\nLa frase Invertida es "+invertirString(str)
                                           +"\nEl Caracter Ingresado "+aux
                                           +"\nLa subFrase Ingresada "+aux2
                                           +"\nLa Matriz de Char es "+aux3
                                           );
    } 
     

}
