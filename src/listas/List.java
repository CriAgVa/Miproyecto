/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import poo.SerVivo;
import poo.Animal;
import poo.Gato;

/**
 *
 * @author chris
 */
public class List {
    
    public static void main(String args[]){
        ArrayList<String> l1 = new ArrayList<String>();
        l1.add("Cri");
        l1.add("Ola");
        l1.add("x");
        l1.add(":(");
        l1.add(0,"Soy");
        l1.size();
        l1.get(3);
        l1.contains(":)");
        l1.remove(":(");
        
        Iterator<String> it1 = l1.iterator();
        while(it1.hasNext()){
            String elemento = it1.next();
            System.out.println(elemento+" - ");
        }
        
        LinkedList<String> l2 = new LinkedList<String>();
        l2.add("1");
        l2.add("2");
        l2.addFirst("0");
        l2.addLast("4");
        l2.add(2, "3");
        l2.add("5");
        l2.remove("3");
        System.out.println("Linked list: "+ l2);
        
        ArrayList<Object> l3 = new ArrayList<Object>();
        SerVivo sv1 = new SerVivo();
        SerVivo sv2 = new SerVivo("Animalia", "Vertebrado", "Pulmonar");
        Animal an1 = new Animal();
        Animal an2 = new Animal("Canidae", "Mammalia", "Omnivora", "Animalia", "Vertebrado", "Pulmonar");
        Gato ga1 = new Gato();
        Gato ga2 = new Gato("Cat", "Persa", "Negro", "Felidae", "Mammalia", "Carnivora", "Animalia", "Vertebrada", "Pulmonar");
        l3.add(sv1);
        l3.add(sv2);
        l3.add(an1);
        l3.add(an2);
        l3.add(ga1);
        l3.add(ga2);
    
        /*System.out.println(sv1.toString());
        System.out.println(sv2.toString());
        System.out.println(an1.toString());
        System.out.println(an2.toString());
        System.out.println(ga1.toString());*/
        System.out.println(ga2.toString());
        /*Iterator<Object> it2 = l3.iterator();
        while(it2.hasNext()){
            Object elemento = it2.next();
            System.out.println(elemento+" - ");
        }*/
    }
}
