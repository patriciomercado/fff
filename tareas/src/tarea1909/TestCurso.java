/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1909;

/**
 *
 * @author Okumura Rinzler
 */
public class TestCurso {
    public static void main (String args[]){
        Curso course = new Curso();
        course.ingresarAlumno("Juan","Perez Sosa","15-09-1993",2016,"17.896.521-4");
        course.ingresarAlumno("Alberto","De las Mercedes Mercado","23-01-1991",2016,"16.587.412-3");
        course.ingresarAlumno("Camila","Mariano Mayorga","15-08-1994",2016,"18.547.896-4");
        course.ingresarAlumno("Leonardo","Altamirano Cofre","06-04-1996",2016,"18.469.857-8");
        course.ingresarAlumno("Flavio","Cayun Pereso","06-06-1996",2016,"18.963.254-7");
        course.ActualCourse();
    }
}
