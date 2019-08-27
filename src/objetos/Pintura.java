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
public class Pintura {
    
    private String autor;
    private String nombre;
    private String tecnica;
    
    public Pintura(){
        autor="Desconocido";
        nombre="Indefinido";
        tecnica="Desconocida";
    }
    
    public Pintura(String autor, String nombre, String tecnica){
        this.autor=autor;
        this.nombre=nombre;
        this.tecnica=tecnica;
    }
    
    public String getAutor(){
        return this.autor;
    }
    
    public void setAutor(String autor){
        this.autor=autor;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public String getTecnica(){
        return this.tecnica;
    }
    
    public void setTecnica(String tecnica){
        this.tecnica=tecnica;
    }
}
