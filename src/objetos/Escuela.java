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
public class Escuela {
    
    private String nombre;
    private String grado;
    private String ubicacion;
    
    public Escuela(){
        nombre="Desconocido";
        grado="Desconocido";
        ubicacion="Desconocida";
    }
    
    public Escuela(String nombre, String grado, String ubicacion){
        this.nombre=nombre;
        this.grado=grado;
        this.ubicacion=ubicacion;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public String getGrado(){
        return this.grado;
    }
    
    public void setGrado(String grado){
        this.grado=grado;
    }
    
    public String getUbicacion(){
        return this.ubicacion;
    }
    
    public void setUbicacion(String ubicacion){
        this.ubicacion=ubicacion;
    }
}
