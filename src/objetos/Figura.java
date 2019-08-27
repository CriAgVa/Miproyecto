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
public class Figura {
    
    private int no_caras;
    private double alto;
    private double ancho;
    
    public Figura(){
        no_caras=0;
        alto=0;
        ancho=0;
    }
    
    public Figura(int no_caras, double alto, double ancho){
        this.no_caras=no_caras;
        this.alto=alto;
        this.ancho=ancho;
    }
    
    public int getNo_caras(){
        return this.no_caras;
    }
    
    public void setNo_caras(int no_caras){
        this.no_caras=no_caras;
    }
    
    public double getAlto(){
        return this.alto;
    }
    
    public void setAlto(double alto){
        this.alto=alto;
    }
    
    public double getAncho(){
        return this.ancho;
    }
    
    public void setAncho(double ancho){
        this.ancho=ancho;
    }
}
