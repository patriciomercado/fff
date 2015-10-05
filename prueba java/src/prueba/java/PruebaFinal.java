import java.util.Scanner;
// Repare el codigo e indique que es lo que hace.

/*
*El codigo recibe un numero inngresado por el usuario y dependiendo de este
*muestra desde el 1 hasta el numero que ingreso el usuario, repitiendo el numero
*que lleve el contador.
* ej:5
*1
*22
*333
*4444
*55555
*/
public class PruebaFinal {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int r=0;
        do{
            System.out.print("mensaje de condicion: ");
            r = sc.nextInt();
        }while( r <=1);
        System.out.println("valor ingresado: " +r);
        for (int k=1;k<=r; k++){
            for(int i=0;i<k;i++){
                System.out.print(k);
            }
            System.out.println("");
        }
    }
}