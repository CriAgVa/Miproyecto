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
public class Videojuego {
    
    private String nombre;
    private String genero;
    private String plataforma;
    
    public Videojuego (){
        nombre="Desconocido";
        genero="Desconocido";
        plataforma="Desconocido";
    }
    
    public Videojuego (String nombre, String genero, String plataforma){
        this.nombre=nombre;
        this.genero=genero;
        this.plataforma=plataforma;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public String getGenero(){
        return this.genero;
    }
    
    public void setGenero(String genero){
        this.genero=genero;
    }
    
    public String getPlataforma(){
        return this.plataforma;
    }
    
    public void setPlataforma(String plataforma){
        this.plataforma=plataforma;
    }
}
