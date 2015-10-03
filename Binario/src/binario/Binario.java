package binario;

import java.util.Scanner;

public class Binario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese numero: ");
        int numero = sc.nextInt();
        while (numero<0 || numero>255){
            int lock = 0;
            while (lock==0){
                System.out.println("numero incorrecto, ingrese de nuevo: ");
                numero = sc.nextInt(); 
                lock = 1;
            }
        }
        String binaryStr = Long.toString(numero,2);
        String output = String.format("%8s", binaryStr).replace(' ', '0');
        System.out.println("El binario es " +output);
    
    }
}
