/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miproyecto;

import poo.Persona;
import objetos.Perro;
import objetos.Celular;
import objetos.Computadora;
import objetos.Pelicula;
import objetos.Album;
import objetos.Libro;
import objetos.Videojuego;
import objetos.Mesa;
import objetos.Pais;
import objetos.Comida;
import objetos.Casa;
import objetos.Escuela;
import objetos.Alumno;
import objetos.Podcast;
import objetos.Zapato;
import objetos.Vehiculo;
import objetos.Dado;
import objetos.Figura;
import objetos.Libreta;
import objetos.Pintura;
import poo.SerVivo;
import poo.Animal;
import poo.Gato;
import poo.Huron;
//import poo.Alumno_;
//import poo.Memoria;
/**
 *
 * @author Cri
 */
public class Miproyecto {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x=6;
        Persona beto = new Persona("Juan Alberto", 18, 1.87, 67.5, "Indefinido");
        System.out.println(beto.getNombre());
        beto.setNombre("Juan Martin");
        System.out.println(beto.getNombre());
        
        Perro can = new Perro("can", "negro", "Chihuahua", 23.5); 
        Celular iphone = new Celular ("Apple", 17999, "IPhone 8s");
        Computadora ideapad330s = new Computadora("Intel core i5", "8gb", "1tb hdd");
        Pelicula movie = new Pelicula("The Hobbit: An unexpected journey", "Fantasia", 169);
        Album alb = new Album("xx", "The xx", 11);
        Libro book = new Libro("The Lord of the Rings", "JRR Tolkien", 1241);
        Videojuego videogame = new Videojuego ("Life is Strange", "Aventura grafica", "Multiplataforma");
        Mesa table = new Mesa ("Madera", 120, 4);
        Pais count = new Pais ("Francia", "Frances", 66990000);
        Comida food = new Comida ("Pizza", "Italiana", "Salado");
        Casa house = new Casa (2, 5, 3);
        Escuela school = new Escuela ("Instituto Educativo de Zacatecas", "Preescolar, primaria, secundaria y preparatoria", "Guadalupe, Zacatecas");
        Alumno student = new Alumno (2154234, "2CM1", "Ingenieria en Sistemas Computacionales");
        Podcast pod = new Podcast ("Dos Nombre Comunes", "Andreas Ostberg y Jose Madero", "Comedia");
        Zapato shoe = new Zapato ("Converse", "Negro", 1400);
        Vehiculo car = new Vehiculo ("Audi A3", 469900, 4);
        Dado dice = new Dado (4, "blanco", "cubica");
        Figura fig = new Figura (3, 5.4, 2.8);
        Libreta note = new Libreta ("Raya profesional", 100, "Scribe");
        Pintura paint = new Pintura ("Vincent Van Gogh", "De sterrennacht", "Oleo sobre lienzo");
    }
}
