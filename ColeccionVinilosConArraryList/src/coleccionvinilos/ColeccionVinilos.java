/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionvinilos;

import java.text.Collator;
import javax.swing.JOptionPane;
import java.util.*;

/**
 * @author yojvn
 */
public class ColeccionVinilos {

        static int cont = 0;
        static ArrayList <Vinilo> colecVinilos = new ArrayList <Vinilo>();
        
    public static void main(String[] args) {
        // TODO code application logic here
        ingresarVin("Iron Maiden","Killers", 1981);
        ingresarVin("Iron Maiden","The Number Of The Beast", 1982);
        ingresarVin("Iron Maiden","PowerSlave", 1984);
        ingresarVin("Iron Maiden","Fear of the Dark", 1992);
        ingresarVin("Iron Maiden","Brave New World", 2000);
        ingresarVin("Iron Maiden","Dance of Death", 2003);
        ingresarVin("Iron Maiden","The Final Frontier", 2010);
        ingresarVin("Deep Purple","Machine Head", 1972);
        ingresarVin("AC-DC","High Voltage", 1976);
        ingresarVin("AC-DC","Highway to Hell", 1979);
        ingresarVin("AC-DC","Back in Black", 1980);
        ingresarVin("AC-DC","Who Made Who", 1986);
        ingresarVin("AC-DC","High Voltage", 1976);
        ingresarVin("AC-DC","The Razor Edge", 1990);
        ingresarVin("Metallica","Kill em All", 1983);
        ingresarVin("Metallica","Ride The Lightning", 1984);
        ingresarVin("Metallica","And Justice For All", 1988);
        ingresarVin("Metallica","The Black Album", 1991);
        ColeccionVinilos();  
    }        
        
        
        public static void ColeccionVinilos(){ //constructor de la clase ArrObj
 
        int op=0;

        do{
            op = leer("1. Ingresar \n"
                      +"2. Buscar \n"
                      +"3. Eliminar \n"
                      +"4. Cantidad de Vinilos en Colección \n"
                      +"5. Cantidad de Espacio en la Colleción \n"   
                      +"6. Mostrar Discos \n"                     
                      +"7. Salir");
                
                switch(op){
                    case 1:
                        ingresar();
                        break;
                    case 2:
                        buscar();
                        break;
                    case 3:
                        eliminar();
                        break;
                    case 4: 
                        cantidadVinilos();
                        break;
                    case 5:
                        cantidadDisponible();
                        break;
                    case 6:
                        mostrarColleccion();
                        break;
                    case 7:
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "No es una opción valida!!!");                  
                }
            
 
        }while(op!=7);
    }
        
    public static int leer(String aux) {
        int num = 0;
        boolean salir = false;
        do {
            try {
                num = Integer.parseInt(JOptionPane.showInputDialog(null, aux));
                salir = false;
            } catch (NumberFormatException exc) {
                JOptionPane.showMessageDialog(null, "Debe introducir solo numeros. \n Intente nuevamente");
                salir = true;
            }
        } while (salir);
        return num;
    }
 
    public static void ingresar(){        
 
        String artista, album;
        int año;        
 
        artista = JOptionPane.showInputDialog(null, "Ingrese el Nombre del Artista: ");
        album = JOptionPane.showInputDialog(null, "Ingrese el Nombre del Album: ");
        año = leer("Ingrese el Año del Disco: ");
        
        Vinilo temp = new Vinilo();
 
        temp.setArtista(artista); 
        temp.setAlbum(album); 
        temp.setAño(año); 

        if(colecVinilos.contains(temp)){
            JOptionPane.showMessageDialog(null, "El Vinilo Ya Existe en la Colección. \n Ingrese algun otro Vinilo");
        } else {
            colecVinilos.add(temp);
            cont++;
        }       
    }
    
    public static boolean buscarVin(String art, String alb, int year){
        Collator comparador = Collator.getInstance();
        comparador.setStrength(Collator.PRIMARY);
        
        Vinilo temp = new Vinilo();
 
        temp.setArtista(art); 
        temp.setAlbum(alb); 
        temp.setAño(year);
        
        for(int i = 0; i < cont; i++){
            if(comparador.compare(colecVinilos.get(i).getAlbum(), alb) == 0){
                
                return true;
            }
        }
        return false;
    }
    
    
    public static void ingresarVin(String artista, String album, int año){
        Vinilo temp = new Vinilo();
        
        temp.setArtista(artista); 
        temp.setAlbum(album); 
        temp.setAño(año); 
        colecVinilos.add(temp);
        
        cont++;
    }  
        
    public static void cantidadVinilos(){
        int vinilos = 0;
        
        vinilos = colecVinilos.size();
        
        if(vinilos != 0){
            JOptionPane.showMessageDialog(null, "Hay " +vinilos +" en la Colleción. ");
        } else {
            JOptionPane.showMessageDialog(null, "No hay Vinilos en la Colección.");
        }
    }
    
    
    public static void buscar(){
        Collator comparador = Collator.getInstance();
        comparador.setStrength(Collator.PRIMARY);
        
        String aux;
        aux = JOptionPane.showInputDialog(null, "Ingrese Nombre del Album a buscar: ");
        if(aux!=null && !aux.equals("")){
            if(cont != 0){
                for(int i = 0; i < colecVinilos.size(); i++){
                    if((colecVinilos.get(i).getAlbum()).equals(aux)){
                        aux="";
                        aux+="Artista: "+colecVinilos.get(i).getArtista()+"\n"
                          + "Album: "+colecVinilos.get(i).getAlbum()+"\n"
                          + "Año: "+colecVinilos.get(i).getAño()+"\n";
                    }
                    else{
                        aux="No se ha encontrado el Album :("; 
                    }
                }
                JOptionPane.showMessageDialog(null, aux);
            } else{
                JOptionPane.showMessageDialog(null, "El Album no existe !!!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No ingreso nada!!!");
        }
        
    }
    
    public static void cantidadDisponible(){
        int vinilos = 0;
        for(int i = 0; i < colecVinilos.size() ; i++){
            if(colecVinilos.get(i) == null){
                vinilos++;
            }  
        }
            JOptionPane.showMessageDialog(null, "Hay " +vinilos +" espacios vacios en la Colleción. ");
        
    }
    
    public static void mostrarColleccion(){
        boolean salir = false;
        String aux;
        int num = 1;
        do{
                for(int i = 0; i < colecVinilos.size(); i++){
                    if(colecVinilos.get(i) != null){
                        aux="Vinilo N° " +(num) +"\n";
                        aux+="Artista: "+colecVinilos.get(i).getArtista()+"\n"
                          + "Album: "+colecVinilos.get(i).getAlbum()+"\n"
                          + "Año: "+colecVinilos.get(i).getAño()+"\n";
                        JOptionPane.showMessageDialog(null, aux);
                        num++;
                    }
                }              
        }while (salir);  
    }
 
    public static void eliminar(){
        Collator comparador = Collator.getInstance();
        comparador.setStrength(Collator.PRIMARY);
        
        boolean verify = false;
        String c; 
        
            c = (JOptionPane.showInputDialog(null, "Digite el Nombre del Album a eliminar: "));//pidiendo el codigo a eliminar
            
            if(0 <= cont){ //si el codigo a eliminar es menor al contador
                for(int i=0; i<cont; i++){ //Inicio ciclo para realizar la eliminacion
                    if(comparador.compare(colecVinilos.get(i).getAlbum(), c) == 0){ //si el codigo a eliminar coincide con el codigo que hay en la posicion i
                        colecVinilos.remove(i);
                        verify = true;
                        cont--;
                        JOptionPane.showMessageDialog(null, "El Vinilo fue Eliminado correctamente");
                    }                                            
                } //Fin ciclo para realizar la eliminacion 
                
            }else if(verify == false){
                JOptionPane.showMessageDialog(null, "El Album a eliminar no existe !!!");
            }         
    }
}
