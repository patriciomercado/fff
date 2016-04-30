/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionvinilos;

/**
 *
 * @author yojvn
 */
public class Vinilo {
    
    private String Artista;
    private String Album;
    private int Año;
    
    Vinilo(){}
    
    Vinilo (String Art, String Alb, int year){
        this.Artista = Art;
        this.Album = Alb;
        this.Año = year;
    }
    
    public String getArtista(){
        return Artista;
    }
    
    public void setArtista(String art){
        this.Artista = art;
    }
    public String getAlbum(){
        return Album;
    }
    
    public void setAlbum(String alb){
        this.Album = alb;
    }
    public int getAño(){
        return Año;
    }
    
    public void setAño(int year){
        this.Año = year;
    } 
       
}
