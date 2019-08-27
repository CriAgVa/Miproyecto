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
public class Alumno {
    
    private int matricula;
    private String grupo;
    private String carrera;
   
    public Alumno(){
        matricula=0;
        grupo="Desconocido";
        carrera="Desconocida";
    }
    
    public Alumno(int matricula, String grupo, String carrera){
        this.matricula=matricula;
        this.grupo=grupo;
        this.carrera=carrera; 
    }
    
   public String getGrupo(){
        return this.grupo;
    }
    
    public void setGrupo(String grupo){
        this.grupo=grupo;
    }
    
    public String getCarrera(){
        return this.carrera;
    }
    
    public void setCarrera(String carrera){
        this.carrera=carrera;
    }
    
    public int getMatricula(){
        return this.matricula;
    }
    
    public void setMatricula(int matricula){
        this.matricula=matricula;
    }
}
