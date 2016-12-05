/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GoD;

/**
 *
 * @author patricio mercado y Javier Vargas
 */
public class Dado {
    /**
     * Constructor sin parametros
     */
    public Dado() {
    }
   
    /**
     * Metodo de la clase que genera un Numero Random
     * @return Un entero positivo entre 1 y 6
     */
    public int lanzarDado(){
        int cara = (int) (Math.random()*6+1);
        return cara;
    }
}
