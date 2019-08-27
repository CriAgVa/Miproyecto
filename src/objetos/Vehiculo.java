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
public class Vehiculo {
    
    private String modelo;
    private double precio;
    private int no_puertas;
    
    public Vehiculo(){
        modelo="Desconocida";
        precio=0;
        no_puertas=0;
    }
    
    public Vehiculo(String modelo, double precio, int no_puertas){
        this.modelo=modelo;
        this.precio=precio;
        this.no_puertas=no_puertas;
    }
    
    public String getModelo(){
        return this.modelo;
    }
    
    public void setModelo(String modelo){
        this.modelo=modelo;
    }
    
    public double getPrecio(){
        return this.precio;
    }
    
    public void setPrecio(int precio){
        this.precio=precio;
    }
    
    public int getNo_puertas(){
        return this.no_puertas;
    }
    
    public void setNo_puertas(int no_puertas){
        this.no_puertas=no_puertas;
    }
}
