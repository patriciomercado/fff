/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraconmetodos;

import java.util.*;

/**
 *
 * @author yojvn
 */
public class CalculadoraConMetodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        int num1 = 0;
        int num2 = 0;
        boolean salir = false;

        while (salir == false) {

            menu();
            do {
                try {
                    System.out.println("Número opcion: ");
                    opcion = sc.nextInt();

                    salir = false;
                } catch (InputMismatchException exc) {
                    sc.nextLine();
                    System.out.println("Debe introducir solo numeros. \n Intente nuevamente\n");
                    salir = true;
                }
            } while (salir);
            if (opcion != 7) {
                num1 = leer();
                num2 = leer();
            }
            switch (opcion) {

                case 1:
                    mostrar(Integer.toString(suma(num1, num2)));
                    break;
                case 2:
                    mostrar(Integer.toString(rest(num1, num2)));
                    break;
                case 4: if(num2 != 0){
                            mostrar(Double.toString(div(num1, num2)));
                        } else {
                            System.out.println("El Dividendo no puede ser cero!!!");
                        }
                    break;
                case 3:
                    mostrar(Integer.toString(mult(num1, num2)));
                    break;
                case 5:
                    mostrar(Integer.toString(may(num1, num2)));
                    break;
                case 6:
                    mostrar(Long.toString(pot(num1, num2)));
                    break;
                case 7:
                    salir = salir(salir);
                    break;
                default:
                    System.out.println("Opciín no valida, Reingrese");
            }
        }
    }

    public static void menu() {
        System.out.print("Buenos Dias! Ingrese el Numero de la operación ");
        System.out.println("que desee realizar: ");
        System.out.println("1) Sumar 2 Números.");
        System.out.println("2) restar 2 Números.");
        System.out.println("3) Multiplicar 2 Números.");
        System.out.println("4) Dividir 2 Números. ");
        System.out.println("5) Calcular el mayor de 2 Números. ");
        System.out.println("6) Calcular la potencia entre 2 Números. ");
        System.out.println("7) Salir");
    }

    public static int leer() {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        boolean salir = false;
        do {
            try {
                System.out.println("Ingrese un Número: ");
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

    public static int suma(int num1, int num2) {
        return (num1+num2);
    }

    public static int rest(int num1, int num2) {
        return (num1-num2);
    }

    public static double div(double num1, double num2) {
        return (num1 / num2);
    }

    public static int mult(int num1, int num2) {
        return num1 * num2;
    }

    public static int may(int num1, int num2) {
        return (Math.max(num1,num2));
    }

    public static long pot(int num1, int num2) {
        long poten = num1;

        for (int i = 0; i < num2; i++) {
            poten = poten * num1;
        }

        return (poten);
    }

    public static void mostrar(String n) {
        System.out.println("El resultado es: " + n);

    }

    public static boolean salir(boolean bool) {
        bool = true;
        return (bool);
    }
}
