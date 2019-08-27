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
public class Computadora {
    
    private String procesador;
    private String ram;
    private String disco_duro;
    
    public Computadora(){
        procesador="Desconocido";
        ram="Desconocida";
        disco_duro="Desconocido";
    }
    
    public Computadora(String procesador, String ram, String disco_duro){
        this.procesador=procesador;
        this.ram=ram;
        this.disco_duro=disco_duro;
    }
    
    public String getProcesador(){
        return this.procesador;
    }
    
    public void setProcesador(String procesador){
        this.procesador=procesador;
    }
    
    public String getRam(){
        return this.ram;
    }
    
    public void setRam(String ram){
        this.ram=ram;
    }
    
    public String getDisco_duro(){
        return this.disco_duro;
    }
    
    public void setDisco_duro(String disco_duro){
        this.disco_duro=disco_duro;
    }
}
