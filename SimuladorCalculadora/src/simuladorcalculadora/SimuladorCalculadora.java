package simuladorcalculadora;

import javax.swing.JOptionPane;

public class SimuladorCalculadora {

    public static void main(String[] args) {
        int opcion = 99;
        double var1,var2;
        while(opcion!=0){
            opcion =  Integer.decode(JOptionPane.showInputDialog(null, "Bienvenido, Favor elija la la operación a realizar.\n 1) Sumar 2 Numeros. \n 2) Restar 2 Numeros. \n 3) Multiplicar 2 Numeros. \n 4) Dividir 2 Numeros. \n 0) Salir."));
            
            switch (opcion) {
            case 1: var1 = Integer.decode(JOptionPane.showInputDialog(null,"Ingrese el primer numero: "));
                    var2 = Integer.decode(JOptionPane.showInputDialog(null,"Ingrese el segundo numero: "));
                   JOptionPane.showMessageDialog(null,"El resultado de la suma entre "+var1+" con "+var2+" es: "+(var1+var2)+"\n");
                     break;
            case 2: var1 = Integer.decode(JOptionPane.showInputDialog(null,"Ingrese el primer numero: "));
                    var2 = Integer.decode(JOptionPane.showInputDialog(null,"Ingrese el segundo numero: "));
                    if (var1>var2){
                       JOptionPane.showMessageDialog(null,"El resultado de la resta entre "+var1+" con "+var2+" es: "+"-"+(var1-var2)+"\n"); 
                    }
                    else{
                       JOptionPane.showMessageDialog(null,"El resultado de la resta entre "+var1+" con "+var2+" es: "+(var1-var2)+"\n");
                    }
                     break;
            case 3: var1 = Integer.decode(JOptionPane.showInputDialog(null,"Ingrese el primer numero: "));
                    var2 = Integer.decode(JOptionPane.showInputDialog(null,"Ingrese el segundo numero: "));
                    JOptionPane.showMessageDialog(null,"El resultado de la multiplicación entre "+var1+" con "+var2+" es: "+(var1*var2)+"\n");
                     break;
            case 4: var1 = Integer.decode(JOptionPane.showInputDialog(null,"Ingrese el primer numero: "));
                    var2 = Integer.decode(JOptionPane.showInputDialog(null,"Ingrese el segundo numero: "));
                    JOptionPane.showMessageDialog(null,"El resultado de la División entre "+var1+" con "+var2+" es: "+(var1/var2)+"\n");
                     break;
            case 0: JOptionPane.showMessageDialog(null,"Adios");
                     break;
            default: JOptionPane.showMessageDialog(null,"Opcion Incorrecta, ingrese denuevo");
                     break;
        }
        }
    }
    
}
