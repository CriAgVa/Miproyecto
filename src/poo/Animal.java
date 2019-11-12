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
public class Animal extends SerVivo{
    
    private String familia;
    private String clase;
    private String alimentacion;

    public Animal() {
        this.familia = "Desconocido";
        this.clase = "Desconocido";
        this.alimentacion = "Desconocido";
    }

    public Animal(String familia, String clase, String alimentacion, String reino, String estructuraOsea, String respiracion) {
        super(reino, estructuraOsea, respiracion);
        this.familia = familia;
        this.clase = clase;
        this.alimentacion = alimentacion;
    }
    /**
     * @return the familia
     */
    public String getFamilia() {
        return familia;
    }

    /**
     * @param familia the familia to set
     */
    public void setFamilia(String familia) {
        this.familia = familia;
    }

    /**
     * @return the clase
     */
    public String getClase() {
        return clase;
    }

    /**
     * @param clase the clase to set
     */
    public void setClase(String clase) {
        this.clase = clase;
    }

    /**
     * @return the nombre
     */
    public String getAlimentacion() {
        return alimentacion;
    }

    /**
     * @param alimentacion the nombre to set
     */
    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }
    
    @Override
    public String toString(){
       String mensaje=super.toString()+"El animal es de la familia "+familia+", de la clase "+clase+" y tiene una alimentaciion "+alimentacion;
       return mensaje;
    }
}