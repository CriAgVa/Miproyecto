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
public class Celular {
    
    private String marca;
    private double precio;
    private String modelo;
    
    public Celular(){
        marca="Desconocida";
        precio=0;
        modelo="Desconocido";
    }
    
    public Celular(String marca, double precio, String modelo){
        this.marca=marca;
        this.precio=precio;
        this.modelo=modelo;
    }
    
    public String getMarca(){
        return this.marca;
    }
    
    public void setMarca(String marca){
        this.marca=marca;
    }
    
    public double getPrecio(){
        return this.precio;
    }
    
    public void setPrecio(int precio){
        this.precio=precio;
    }
    
    public String getModelo(){
        return this.modelo;
    }
    
    public void setModelo(String modelo){
        this.modelo=modelo;
    }
}
