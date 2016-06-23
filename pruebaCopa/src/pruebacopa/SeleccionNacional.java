/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebacopa;

/**
 *
 * @author yojvn
 */
public class SeleccionNacional {
    private String nombreSelecc;
    private int rankingFIFA;
    
    SeleccionNacional(String nom, int rank){
        this.nombreSelecc = nom;
        this.rankingFIFA = rank;
    }
    
    public String getSelec(){
    return this.nombreSelecc;
    }
    
    public int getRank(){
        return this.rankingFIFA;
    }
}
