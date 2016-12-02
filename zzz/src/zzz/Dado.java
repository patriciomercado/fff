/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zzz;

/**
 *
 * @author patricio mercado
 */
public class Dado {

    public Dado() {
    }
   
    public int lanzarDado(){
        int cara = (int) (Math.random()*6+1);
        return cara;
    }
}
