package tallerlab01;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class TallerLab01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ingrese numero ");
        int n = sc.nextInt();
        int [][] matriz = new int[n][n];
        String cadena = ("");
        int producto = 1;
        int producto2 = 1;
        int num0=0,num1=0,num2=0,num3=0,num4=0,num5=0,num6=0,num7=0,num8=0,num9=0,ceros = 0;
        for (int i=0;i<n;i++){
            for (int z=0;z<n;z++){
                matriz [i][z] = (int)Math.floor(Math.random()*(0-10)+10);
                cadena = cadena+(" ")+(Integer.toString(matriz[i][z]));
            }
            cadena = cadena + ("\n");
        }
        for (int i=0;i<n;i++){
            for (int z=0;z<n;z++){
                if (i==z){
                producto = producto * matriz[i][z];
                }
                    
                if(matriz[i][z]==0){
                    ceros = ceros +1;
                }
                switch (matriz[i][z]){
                    case 0: num0=num0+1;
                        break;
                    case 1: num1=num1+1;
                        break;  
                    case 2: num2=num2+1;
                        break;  
                    case 3: num3=num3+1;
                        break;  
                    case 4: num4=num4+1;
                        break;  
                    case 5: num5=num5+1;
                        break;  
                    case 6: num6=num6+1;
                        break;  
                    case 7: num7=num7+1;
                        break;  
                    case 8: num8=num8+1;
                        break;  
                    case 9: num9=num9+1;
                        break;  
                }
                
            } 
        }

        System.out.println("");
        System.out.println(cadena);
        System.out.println("El producto de la diagonal es "+producto);
        if (num0>num1 && num0>num2 && num0>num3 && num0>num4 && num0>num5 && num0>num6 && num0>num7 && num0>num8 && num0>num9){
            System.out.println("El numero que mas se repite es es 0");
        }
        else{
            if (num1>num2 && num1>num3 && num1>num4 && num1>num5 && num1>num6 && num1>num7 && num1>num8 && num1>num9){
            System.out.println("El numero que mas se repite es es 1");
            }
            else{
                if (num2>num3 && num2>num4 && num2>num5 && num2>num6 && num2>num7 && num2>num8 && num2>num9 ){
                System.out.println("El numero que mas se repite es es 2");
                }
                else{
                    if (num3>num4 && num3>num5 && num3>num6 && num3>num7 && num3>num8 && num3>num9){
                    System.out.println("El numero que mas se repite es es 3");
                    }
                    else{
                        if (num4>num5 && num4>num6 && num4>num7 && num4>num8 && num4>num9){
                        System.out.println("El numero que mas se repite es es 4");
                        }
                        else{
                            if (num5>num6 && num5>num7 && num5>num8 && num5>num9){
                            System.out.println("El numero que mas se repite es es 5");
                            }
                            else{
                                if (num6>num7 && num6>num8 && num6>num9){
                                System.out.println("El numero que mas se repite es es 6");
                                }
                                else{
                                    if (num7>num8 && num7>num9){
                                    System.out.println("El numero que mas se repite es es 7");
                                    }
                                    else{
                                        if (num8>num9 && num8>num9){
                                        System.out.println("El numero que mas se repite es es 8");
                                        }
                                        else{
                                            System.out.println("El numero que mas se repite es es 9");
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
}
