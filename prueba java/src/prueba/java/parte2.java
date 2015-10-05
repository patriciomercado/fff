import java.util.Scanner;
public class parte2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);        
        int num1,num2,num3,num4;
        System.out.println("Escriba el numero 1: ");
        num1 = scan.nextInt();
        System.out.println("Escriba el numero 2: ");
        num2 = scan.nextInt();
        System.out.println("Escriba el numero 3: "); 
        num3 = scan.nextInt();
        System.out.println("Escriba el numero 4: ");  
        num4 = scan.nextInt();
        
        if (num1 > num2 && num1 > num3 && num1 > num4)
            if (num2<num3 && num2<num4)
                System.out.println("El mayor es "+num1+" y el menor es "+num2+" el promedio de todos es "+(num1+num2+num3+num4)/4);
            else
                if (num3<num4)
                    System.out.println("El mayor es "+num1+" y el menor es "+num3+" el promedio de todos es "+(num1+num2+num3+num4)/4);
                else
                    System.out.println("El mayor es "+num1+" y el menor es "+num4+" el promedio de todos es "+(num1+num2+num3+num4)/4);
        if (num2>num1 && num2>num3 && num2>num4)
            if(num1<num3 && num1<num4)
            System.out.println("El mayor es "+num2+" y el menor es "+num1+" el promedio de todos es "+(num1+num2+num3+num4)/4);
            else
                if(num3<num1 && num3<num4)
                    System.out.println("El mayor es "+num2+" y el menor es "+num3+" el promedio de todos es "+(num1+num2+num3+num4)/4);
                else
                    System.out.println("El mayor es "+num2+" y el menor es "+num4+" el promedio de todos es "+(num1+num2+num3+num4)/4);
         if (num3>num1 && num3>num2 && num3>num4)
            if(num1<num2 && num1<num4)
            System.out.println("El mayor es "+num3+" y el menor es "+num1+" el promedio de todos es "+(num1+num2+num3+num4)/4);
            else
                if(num2<num1 && num2<num4)
                    System.out.println("El mayor es "+num3+" y el menor es "+num2+" el promedio de todos es "+(num1+num2+num3+num4)/4);
                else
                    System.out.println("El mayor es "+num3+" y el menor es "+num4+" el promedio de todos es "+(num1+num2+num3+num4)/4);
        if (num4>num1 && num4>num2 && num4>num3)
            if(num1<num2 && num1<num3)
            System.out.println("El mayor es "+num4+" y el menor es "+num1+" el promedio de todos es "+(num1+num2+num3+num4)/4);
            else
                if(num2<num1 && num2<num4)
                    System.out.println("El mayor es "+num4+" y el menor es "+num2+" el promedio de todos es "+(num1+num2+num3+num4)/4);
                else
                    System.out.println("El mayor es "+num4+" y el menor es "+num3+" el promedio de todos es "+(num1+num2+num3+num4)/4);
    }
    }
    

