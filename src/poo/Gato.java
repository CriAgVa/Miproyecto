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
public class Gato extends Animal{
    
    private String nombre;
    private String raza;
    private String color;

    public Gato() {
        this.nombre = "Desconocido";
        this.raza = "Desconocido";
        this.color = "Desconocido";
    }

    public Gato(String nombre, String raza, String color, String familia, String clase, String alimentacion, String reino, String estructuraOsea, String respiracion) {
        super(familia, clase, alimentacion, reino, estructuraOsea, respiracion);
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the raza
     */
    public String getRaza() {
        return raza;
    }

    /**
     * @param raza the raza to set
     */
    public void setRaza(String raza) {
        this.raza = raza;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }
    
    @Override
    public String toString(){
       String mensaje=super.toString()+"El gato se llama "+nombre+", es de raza "+raza+" y de color "+color;
       return mensaje;
    }
}
