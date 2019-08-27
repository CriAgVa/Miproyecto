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
public class Dado {
    
    private int no_caras;
    private String color;
    private String forma;
    
    public Dado(){
        no_caras=0;
        color="Indefinido";
        forma="Indefinida";
    }
    
    public Dado(int no_caras, String color, String forma){
        this.no_caras=no_caras;
        this.color=color;
        this.forma=forma;
    }
    
    public int getNo_caras(){
        return this.no_caras;
    }
    
    public void setNo_caras(int no_caras){
        this.no_caras=no_caras;
    }
    
    public String getColor(){
        return this.color;
    }
    
    public void setColor(String color){
        this.color=color;
    }
    
    public String getForma(){
        return this.forma;
    }
    
    public void setForma(String forma){
        this.forma=forma;
    }
}
