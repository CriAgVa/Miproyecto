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
public class Casa {
    
    private int no_pisos;
    private int no_habitaciones;
    private int no_banos;
    
    public Casa(){
        no_pisos=0;
        no_habitaciones=0;
        no_banos=0;
    }
    
    public Casa(int no_pisos, int no_habitaciones, int no_banos){
        this.no_pisos=no_pisos;
        this.no_habitaciones=no_habitaciones;
        this.no_banos=no_banos;
    }
    
    public int getNo_pisos(){
        return this.no_pisos;
    }
    
    public void setNo_pisos(int no_pisos){
        this.no_pisos=no_pisos;
    }
    
    public int getNo_habitaciones(){
        return this.no_habitaciones;
    }
    
    public void setNo_habitaciones(int no_habitaciones){
        this.no_habitaciones=no_habitaciones;
    }
    
    public int getNo_banos(){
        return this.no_banos;
    }
    
    public void setNo_banos(int no_banos){
        this.no_banos=no_banos;
    }
}
