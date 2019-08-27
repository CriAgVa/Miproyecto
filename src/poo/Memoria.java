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
public class Memoria {
    
    private String capacidad;
    private String marca;
    private String conexion;

    public Memoria() {
        this.capacidad = "Desconocida";
        this.marca = "Desconocida";
        this.conexion = "Desconocida";
    }

    public Memoria(String capacidad, String marca, String C) {
        this.capacidad = capacidad;
        this.marca = marca;
        this.conexion = C;
    }

    /**
     * @return the capacidad
     */
    public String getCapacidad() {
        return capacidad;
    }

    /**
     * @param capacidad the capacidad to set
     */
    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the conexion
     */
    public String getConexion() {
        return conexion;
    }

    /**
     * @param conexion the conexion to set
     */
    public void setConexion(String conexion) {
        this.conexion = conexion;
    }
    
    
}
