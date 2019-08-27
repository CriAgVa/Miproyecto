/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author Alumno
 */
public class Alumno_ extends Persona {
    
    private String nombre;
    private int boleta;
    private boolean regular;
    private boolean promedioGral;
    private String carrera;

    public Alumno_() {
        super.setNombre(nombre);
        //this.nombre = "Desconocido";
        this.boleta = 0;
        this.regular = false;
        this.promedioGral = false;
        this.carrera = "Desconocido";
    }

    public Alumno_(String nombre, int boleta, boolean regular, boolean promedioGral, String carrera) {
        this.nombre = nombre;
        this.boleta = boleta;
        this.regular = regular;
        this.promedioGral = promedioGral;
        this.carrera = carrera;
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
     * @return the boleta
     */
    public int getBoleta() {
        return boleta;
    }

    /**
     * @param boleta the boleta to set
     */
    public void setBoleta(int boleta) {
        this.boleta = boleta;
    }

    /**
     * @return the regular
     */
    public boolean isRegular() {
        return regular;
    }

    /**
     * @param regular the regular to set
     */
    public void setRegular(boolean regular) {
        this.regular = regular;
    }

    /**
     * @return the promedioGral
     */
    public boolean isPromedioGral() {
        return promedioGral;
    }

    /**
     * @param promedioGral the promedioGral to set
     */
    public void setPromedioGral(boolean promedioGral) {
        this.promedioGral = promedioGral;
    }

    /**
     * @return the carrera
     */
    public String getCarrera() {
        return carrera;
    }

    /**
     * @param carrera the carrera to set
     */
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
}
