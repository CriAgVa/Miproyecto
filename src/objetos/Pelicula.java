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
public class Pelicula {
    
    private String nombre;
    private String genero;
    private int duracion;
    
    public Pelicula(){
        nombre="Desconocido";
        genero="Desconocido";
        duracion=0;
    }
    
    public Pelicula(String nombre, String genero, int duracion){
        this.nombre=nombre;
        this.genero=genero;
        this.duracion=duracion;
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
    
    public int getDuracion(){
        return this.duracion;
    }
    
    public void setDuracion(int duracion){
        this.duracion=duracion;
    }
}
