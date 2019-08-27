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
public class Podcast {
    
    private String nombre;
    private String autor;
    private String genero;
    
    public Podcast(){
        nombre="Desconocido";
        autor="Desconocido";
        genero="Desconocido";
    }
    
    public Podcast(String nombre, String autor, String genero){
        this.nombre=nombre;
        this.autor=autor;
        this.genero=genero;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public String getAutor(){
        return this.autor;
    }
    
    public void setAutor(String autor){
        this.autor=autor;
    }
    
    public String getGenero(){
        return this.genero;
    }
    
    public void setGenero(String genero){
        this.genero=genero;
    }
}
