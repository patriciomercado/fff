/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1909;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.JOptionPane;

/**
 *
 * @author Okumura Rinzler
 */
public class Curso {
    static ArrayList <Alumno> cursoActual = new ArrayList <Alumno>();
    static int cont = 0;
    
        public static void ActualCourse(){ //constructor de la clase ArrObj
 
        int op=0;

        do{
            op = leer("1. Ingresar Alumno\n"
                      +"2. Buscar Alumno\n"
                      +"3. Eliminar Alumno\n"
                      +"4. Numero de Alumnos Cursando Actualmente \n"
                      +"5. Ordenar Alumnos por Apellido \n"   
                      +"6. Mostrar Alumnos \n"                     
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
                        cantidadAlumnos();
                        break;
                    case 5:
                        OrdenarAlumnos();
                        break;
                    case 6:
                        mostrarColleccion();
                        break;
                    case 7:
                        JOptionPane.showMessageDialog(null, "Adios!");
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
 
        String nombre, apellido, birthday, rut;
        int año;        
        
        nombre = JOptionPane.showInputDialog(null, "Ingrese el Nombre del Alumno: ");
        apellido = JOptionPane.showInputDialog(null, "Ingrese el Apellido del alumno: ");
        birthday = JOptionPane.showInputDialog(null, "Ingrese la fecha de nacimiento del alumno(dd-MM-yyyy): ");
        año = leer("Ingrese el Año de ingreso: ");
        rut = JOptionPane.showInputDialog(null, "Ingrese el rut del Alumno: \n Con puntos y Guion");
        
        while(validarRut(rut)!=true){
            System.out.println(validarRut(rut));
            rut = JOptionPane.showInputDialog(null, "RUT Invalido, Ingrese denuevo el rut del Alumno: ");
        }
        
        Alumno temp = new Alumno(nombre, apellido, rut, birthday, año);
        
        if(cursoActual.contains(temp) || buscarAlumno(rut)){
            JOptionPane.showMessageDialog(null, "El Alumno Ya Existe en el curso!!!.\n rut ya Inscrito!");
        } else {
            cursoActual.add(temp);
            cont++;
        }       
    }
    
    public static boolean buscarAlumno(String rut){
        Collator comparador = Collator.getInstance();
        comparador.setStrength(Collator.PRIMARY);
        
        for(int i = 0; i < cont; i++){
            if(comparador.compare(cursoActual.get(i).getRut(), rut) == 0){
                return true;
            }
        }
        return false;
    }
    
    
    public static void ingresarAlumno(String nombre, String apellido, String birthday, int año, String rut){
        Alumno temp = new Alumno(nombre, apellido, rut, birthday, año);
        cursoActual.add(temp);
        cont++;
    }  
        
    public static void cantidadAlumnos(){
        int Alumnos = 0;
        
        Alumnos = cursoActual.size();
        
        if(Alumnos != 0){
            JOptionPane.showMessageDialog(null, "Hay " +Alumnos +" en la Colleción. ");
        } else {
            JOptionPane.showMessageDialog(null, "No hay Vinilos en la Colección.");
        }
    }
    
    
    public static void buscar(){
        Collator comparador = Collator.getInstance();
        comparador.setStrength(Collator.PRIMARY);
        
        boolean verify = false;
        String c; 
        String aux;
            c = (JOptionPane.showInputDialog(null, "Digite el RUT del Alumno a buscar: "));//pidiendo el codigo a eliminar
            
            if(0 <= cont){ //si el codigo a eliminar es menor al contador
                for(int i=0; i<cursoActual.size(); i++){ //Inicio ciclo para realizar la eliminacion
                    if(comparador.compare(cursoActual.get(i).getRut(), c) == 0){ //si el codigo a eliminar coincide con el codigo que hay en la posicion i
                        aux="";
                        aux+="Nombre: "+cursoActual.get(i).getNombre()+"\n"
                          + "Apellido: "+cursoActual.get(i).getApellido()+"\n"
                          + "RUT: "+cursoActual.get(i).getRut()+"\n"
                          + "Matricula: "+cursoActual.get(i).getMatricula()+"\n"
                          + "Año Ingreso: "+Integer.toString(cursoActual.get(i).getAñoIngreso());
                        verify = true;
                        JOptionPane.showMessageDialog(null, aux);
                    }                                            
                } //Fin ciclo para realizar la eliminacion 
                
            }else if(verify == false){
                JOptionPane.showMessageDialog(null, "El Alumno a buscar no existe !!!");
            }   
        
    }
    
    public static void OrdenarAlumnos(){
        Collections.sort(cursoActual, new Comparator<Alumno>() {
        @Override
        public int compare(Alumno book1, Alumno book2)
        {

            return  book1.getApellido().compareTo(book2.getApellido());
        }
    });        
        
     JOptionPane.showMessageDialog(null, "Alumnos ordenados de la A a la Z");
    }
    
    public static void mostrarColleccion(){
        boolean salir = false;
        String aux;
        int num = 1;
        do{
                for(int i = 0; i < cursoActual.size(); i++){
                    if(cursoActual.get(i) != null){
                        aux="Alumno N° " +(num) +"\n";
                        aux+="Nombre: "+cursoActual.get(i).getNombre()+"\n"
                          + "Apellido: "+cursoActual.get(i).getApellido()+"\n"
                          + "RUT: "+(cursoActual.get(i).getRut())+"\n"
                          + "Matricula: "+cursoActual.get(i).getMatricula()+"\n"
                          + "Año Ingreso: "+Integer.toString(cursoActual.get(i).getAñoIngreso());
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
        
            c = (JOptionPane.showInputDialog(null, "Digite el Nombre del Alumno a eliminar: "));//pidiendo el codigo a eliminar
            
            if(0 <= cont){ //si el codigo a eliminar es menor al contador
                for(int i=0; i<cursoActual.size(); i++){ //Inicio ciclo para realizar la eliminacion
                    if(comparador.compare(cursoActual.get(i).getRut(), c) == 0){ //si el codigo a eliminar coincide con el codigo que hay en la posicion i
                        cursoActual.remove(i);
                        verify = true;
                        JOptionPane.showMessageDialog(null, "El Alumno fue Eliminado correctamente");
                    }                                            
                } //Fin ciclo para realizar la eliminacion 
                
            }else if(verify == false){
                JOptionPane.showMessageDialog(null, "El Alumno a eliminar no existe !!!");
            }         
    }
    public static boolean validarRut(String rut) {

    boolean validacion = false;
    try {
        rut = rut.toUpperCase();
        rut = rut.replace(".", "");
        rut = rut.replace("-", "");
        
        if(rut.length() == 9 || rut.length() == 8){
            
            int rutAux = Integer.parseInt(rut.substring(0, rut.length() - 1));
            char dv = rut.charAt(rut.length() - 1);
            if( (Character.isDigit(dv)) || dv == 'K' ){
                validacion = true;
            }
        }
    } catch (java.lang.NumberFormatException e) {
    }
    return validacion;
    }    
}
