package tareaprueba;
import java.util.*;
/**
 *
 * @author Javier Vargas
 */
public class Tareaprueba {

    public static void main(String[] args) {

        int num1,num2;
        Scanner scan = new Scanner(System.in);
        System.out.print("ingrese el numero 1 ");
        num1 = scan.nextInt();
        System.out.print("Ingrese el numero 2 ");
        num2 = scan.nextInt();
        if (num1 == num2)
            System.out.println("Los Numeros son Iguales.");
        else
            if(num1 > num2)
            System.out.println("El numero 1 " +"(" +num1 +")" + " es mayor que el numero 2 " +"(" +num2 +")");
            else
            System.out.println("El numero 2 " +"(" +num2 +")" +" es mayor que el numero 1 " +"(" +num1 +")"); 
    }  
}