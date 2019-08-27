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
public class Libreta {
    
    private String tipo;
    private int no_paginas;
    private String marca;
    
    public Libreta(){
        tipo="Desconocido";
        no_paginas=0;
        marca="Desconocida";
    }
    
    public Libreta(String tipo, int no_paginas, String marca){
        this.tipo=tipo;
        this.no_paginas=no_paginas;
        this.marca=marca;
    }
    
    public String getTipo(){
        return this.tipo;
    }
    
    public void setTipo(String tipo){
        this.tipo=tipo;
    }
    
    public int getNo_paginas(){
        return this.no_paginas;
    }
    
    public void setNo_paginas(int no_paginas){
        this.no_paginas=no_paginas;
    }
    
    public String getMarca(){
        return this.marca;
    }
    
    public void setMarca(String marca){
        this.marca=marca;
    }
}
