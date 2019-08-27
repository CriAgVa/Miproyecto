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
public class Libro {
    
    private String titulo;
    private String autor;
    private int no_paginas;
    
    public Libro(){
        titulo="Desconocido";
        autor="Anonimo";
        no_paginas=0;
    }
    
    public Libro(String titulo, String autor, int no_paginas){
        this.titulo=titulo;
        this.autor=autor;
        this.no_paginas=no_paginas;
    }
    
    public String getTitulo(){
        return this.titulo;
    }
    
    public void setTitulo(String titulo){
        this.titulo=titulo;
    }
    
    public String getAutor(){
        return this.autor;
    }
    
    public void setAutor(String autor){
        this.autor=autor;
    }
    
    public int getNo_paginas(){
        return this.no_paginas;
    }
    
    public void setNo_paginas(int no_paginas){
        this.no_paginas=no_paginas;
    }
}
