/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author chris
 */
public class Calculadora {

    private double resultado;
    private double elemento1;
    private double elemento2;

    public Calculadora() {
    }

    public Calculadora(double elemento1, double elemento2) {
        this.elemento1 = elemento1;
        this.elemento2 = elemento2;
    }

    /**
     * @return the resultado
     */
    public double getResultado() {
        return resultado;
    }

    /**
     * @param resultado the resultado to set
     */
    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    /**
     * @return the elemento1
     */
    public double getElemento1() {
        return elemento1;
    }

    /**
     * @param elemento1 the elemento2 to set
     */
    public void setElemento1(double elemento1) {
        if(this.resultado!= 0){
            this.elemento1 = resultado;
        }
        else{
           this.elemento1 = elemento1; 
        }
    }

    /**
     * @return the elemento2
     */
    public double getElemento2() {
        return elemento2;
    }

    /**
     * @param elemento2 the elemento1 to set
     */
    public void setElemento2(double elemento2) {
        this.elemento2 = elemento2;
    }

    public double suma(){
        double sum;
        sum = this.elemento1 + this.elemento2;
        return sum;
    }
    
    public double multiplicacion(){
        double mult;
        mult = this.elemento1 * this.elemento2;
        return mult;
    }
    
    public double division(){
        double div;
        div = this.elemento1 / this.elemento2;
        return div;
    }
    
    public double resta(){
        double res;
        res = this.elemento1 - this.elemento2;
        return res;
    }

    @Override
    public String toString() {
       String mensaje="Para los valores "+elemento1+" y "+elemento2+".\nLa suma es igual a "+suma()+".\nLa resta es igual a "
               +resta()+".\nLa division es igual a "+division()+".\nLa multiplicacion es igual a "+multiplicacion();
       return mensaje;
    }    
}