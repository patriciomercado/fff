package Tarea2;
import java.util.Scanner;
/**
 *
 * @author Javier Vargas
 */
public class Tarea2 {
        public static void main(String[] args) {

        int num1,num2,num3;
        Scanner scan = new Scanner(System.in);
        System.out.print("ingrese el numero 1 ");
        num1 = scan.nextInt();
        System.out.print("Ingrese el numero 2 ");
        num2 = scan.nextInt();
        System.out.print("Ingrese el Numero 3 ");
        num3 = scan.nextInt();
        
        if (num1 == num2 && num2 == num3)
            System.out.println("Los Numeros son Iguales.");
        if (num1 > num2 && num1 > num3)   
            if (num2 > num3)
                System.out.println("El numero 1 (" +num1 +") es mayor que el numero 2 " +"(" +num2 +")" +" que es mayor que el numero 3 (" +num3 +")");
            else
                System.out.println("El numero 1 (" +num1 +") es mayor que el numero 3 " +"(" +num3 +")" +" que es mayor que el numero 2 (" +num2 +")");
        if (num2 > num1 && num2 > num3)
            if(num1 > num3)
                System.out.println("El numero 2 (" +num2 +") es mayor que el numero 1 " +"(" +num1 +")" +" que es mayor que el numero 3 (" +num3 +")");
            else
                System.out.println("El numero 2 (" +num1 +") es mayor que el numero 3 " +"(" +num3 +")" +" que es mayor que el numero 1 (" +num1 +")");
        if (num3 > num2 && num3 > num1)
            if(num2 > num1)
                System.out.println("El numero 3 (" +num3 +") es mayor que el numero 2 " +"(" +num2 +")" +" que es mayor que el numero 1 (" +num1 +")");
            else
                System.out.println("El numero 3 (" +num3 +") es mayor que el numero 1 " +"(" +num1 +")" +" que es mayor que el numero 2 (" +num2 +")");
        }
}
