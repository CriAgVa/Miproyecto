/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teclado;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

/**
 *
 * @author chris
 */
public class ListenerA implements KeyListener{
    
    private final ArrayList<JButtonT> a = new ArrayList<>();
    
    public void obtenerN(JButtonT x){
        this.a.add(x);
    }
    
    @Override
    public void keyTyped(KeyEvent e) {
       
    }

    @Override
    public void keyPressed(KeyEvent e) {
        char presionado = e.getKeyChar();
        String letra = ""+presionado;
        
        for (int i=0; i<27; i++){
            JButtonT press = a.get(i);
            if(press.getText().equals(letra)){
                press.setBackground(Color.red);
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        char presionado = e.getKeyChar();
        String letra = ""+presionado;
        
        for (int i=0; i<27; i++){
            JButtonT press = a.get(i);
            if(press.getText().equals(letra)){
                press.setBackground(Color.cyan);
            }
        }
    }
}
