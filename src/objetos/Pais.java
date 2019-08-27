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
public class Pais {
    
    private String nombre;
    private String idioma;
    private int habitantes;
    
    public Pais(){
        nombre="Desconocido";
        idioma="Indefinido";
        habitantes=0;
    }
    
    public Pais(String nombre, String idioma, int habitantes){
        this.nombre=nombre;
        this.idioma=idioma;
        this.habitantes=habitantes;
    }
    
   public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public String getIdioma(){
        return this.idioma;
    }
    
    public void setIdioma(String idioma){
        this.idioma=idioma;
    }
    
    public int getHabitantes(){
        return this.habitantes;
    }
    
    public void setHabitantes(int habitantes){
        this.habitantes=habitantes;
    }
}
