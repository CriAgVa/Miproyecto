/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseGenerica;

/**
 *
 * @author chris
 * @param <H>
 */
public class ClaseG<H> {
    H obj;
    
    public ClaseG(H o){
        this.obj = o;
    }
    
    public void classType(){
        System.out.println("El objeto G es de tipo: "+obj.getClass().getName());
    }
    
    public static void main(String[] args){
        ClaseG<Integer> intObj = new ClaseG<>(8);
        intObj.classType();
        
        ClaseG<String> strObj = new ClaseG<>("Hola");
        strObj.classType();
    }
}
/*
Definicion: La clase generica es una clase que opera con un parametro, 
el cual puede actuar como cuaquier tipo de dato.
*/