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
public class Comida {
    
    private String nombre;
    private String nacionalidad;
    private String sabor;
    
    public Comida(){
        nombre="Desconocido0";
        nacionalidad="Desconocida";
        sabor="Desconocido";
    }
    
    public Comida(String nombre, String nacionalidad, String sabor){
        this.nombre=nombre;
        this.nacionalidad=nacionalidad;
        this.sabor=sabor;
    }
     
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public String getNacionalidad(){
        return this.nacionalidad;
    }
    
    public void setNacionalidad(String nacionalidad){
        this.nacionalidad=nacionalidad;
    }
    
    public String getSabor(){
        return this.sabor;
    }
    
    public void setSabor(String sabor){
        this.sabor=sabor;
    }
}
