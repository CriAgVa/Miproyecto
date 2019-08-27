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
public class Zapato {
    
    private String marca;
    private String color;
    private int precio;
    
    public Zapato(){
        marca="Desconocida";
        color="Desconocido";
        precio=0;
    }
    
    public Zapato(String marca, String color, int precio){
        this.marca=marca;
        this.color=color;
        this.precio=precio;
    }
    
    public String getMarca(){
        return this.marca;
    }
    
    public void setMarca(String marca){
        this.marca=marca;
    }
    
    public String getColor(){
        return this.color;
    }
    
    public void setColor(String color){
        this.color=color;
    }
    
    public double getPrecio(){
        return this.precio;
    }
    
    public void setPrecio(int precio){
        this.precio=precio;
    }
}
