/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;
/**
 * Crear objetos
 *
 * @author Alumno
 */
public class Persona {//las llaves definen el contexto

    private String nombre; //la clase persona tiene un atributo de clase string identificado como nombre
    private int edad;
    private double estatura;
    private double peso;
    private String sexo;

    public Persona(){
        nombre = "Desconocido";
        edad = 0; 
        estatura = 0;
        peso = 0;
        sexo = "Desconocido";
    }
          
    public Persona(String nombre, int edad, double estatura, double peso, String sexo){
        this.nombre = nombre;
        this.edad = edad; 
        this.estatura = estatura;
        this.peso = peso;
        this.sexo = sexo;
    }        
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void saludar() {
        System.out.println("Hola, mi nombre es "+this.nombre);
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the estatura
     */
    public double getEstatura() {
        return estatura;
    }

    /**
     * @param estatura the estatura to set
     */
    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    /**
     * @return the peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    @Override
    public int hashCode(){
        return nombre.hashCode();
    }
    
    @Override
    public boolean equals(Object obj){
        Persona p1=(Persona)obj;
        
        return p1.getNombre().equals(this.getNombre());
    }
}