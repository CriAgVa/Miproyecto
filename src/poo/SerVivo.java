/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author chris
 */
public class SerVivo {
    
    private String reino;
    private String estructuraOsea;
    private String respiracion;

    public SerVivo() {
        this.reino = "Desconocido";
        this.estructuraOsea = "Desconocida";
        this.respiracion = "Desconocidoa";
    }

    public SerVivo(String reino, String estructuraOsea, String respiracion) {
        this.reino = reino;
        this.estructuraOsea = estructuraOsea;
        this.respiracion = respiracion;
    }

    
    /**
     * @return the reino
     */
    public String getReino() {
        return reino;
    }

    /**
     * @param reino the reino to set
     */
    public void setReino(String reino) {
        this.reino = reino;
    }

    /**
     * @return the estructuraOsea
     */
    public String getEstructuraOsea() {
        return estructuraOsea;
    }

    /**
     * @param estructuraOsea the estructuraOsea to set
     */
    public void setEstructuraOsea(String estructuraOsea) {
        this.estructuraOsea = estructuraOsea;
    }

    /**
     * @return the respiracion
     */
    public String getRespiracion() {
        return respiracion;
    }

    /**
     * @param respiracion the respiracion to set
     */
    public void setRespiracion(String respiracion) {
        this.respiracion = respiracion;
    }
    
    @Override
    public String toString(){
       String mensaje="El ser vivo es del reino "+reino+", tiene una estructura osea "+estructuraOsea+" y una respiracion "+respiracion;
       return mensaje;
    }
}
