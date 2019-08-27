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
public class Perro {
    
    private String nombre;
    private String color;
    private String raza;
    private double peso;
    
    public Perro() {
        nombre="Desconocido";
        color="Desconocido";
        raza="Desconocida";
        peso=0;
    }
    
    public Perro(String nombre, String color, String raza, double peso) {
        this.nombre=nombre;
        this.color=color;
        this.raza=raza;
        this.peso=peso;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public String getColor(){
        return this.color;
    }
    
    public void setColor(String color){
        this.color=color;
    }
    
    public String getRaza(){
        return this.raza;
    }
    
    public void setRaza(String raza){
        this.raza=raza;
    }
    
    public double getPeso(){
        return this.peso;
    }
    
    public void setPeso(double peso){
        this.peso=peso;
    }
}
