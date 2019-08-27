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
public class Mesa {
    
    private String material;
    private double altura;
    private int no_patas;
    
    public Mesa(){
        material="Desconocido";
        altura=0;
        no_patas=0;
    }
    
    public Mesa(String material, double altura, int no_patas){
        this.material=material;
        this.altura=altura;
        this.no_patas=no_patas;
    }
    
    public String getMaterial(){
        return this.material;
    }
    
    public void setMaterial(String material){
        this.material=material;
    }
    
    public double getAltura(){
        return this.altura;
    }
    
    public void setAltura(double altura){
        this.altura=altura;
    }
    
    public int getNo_patas(){
        return this.no_patas;
    }
    
    public void setNo_patas(int no_patas){
        this.no_patas=no_patas;
    }
}
