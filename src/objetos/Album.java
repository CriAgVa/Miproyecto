/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

/**
 *
 * @author Cri
 */
public class Album {
    
    private String nombre;
    private String artista;
    private int no_canciones;
    
    public Album(){
        nombre="Desconocido";
        artista="Desconocido";
        no_canciones=0;
    }
    
    public Album(String nombre, String artista, int no_canciones){
        this.nombre=nombre;
        this.artista=artista;
        this.no_canciones=no_canciones;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public String getArtista(){
        return this.artista;
    }
    
    public void setArtista(String artista){
        this.artista=artista;
    }
    
    public int getNo_canciones(){
        return this.no_canciones;
    }
    
    public void setNo_canciones(int no_canciones){
        this.no_canciones=no_canciones;
    }
}
