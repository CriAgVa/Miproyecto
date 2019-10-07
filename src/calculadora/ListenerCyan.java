/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import calculadora.JFrameCalculadora;
/**
 *
 * @author chris
 */

public class ListenerCyan extends JFrameCalculadora implements ActionListener {

    ActionListener escuchadorCyan = new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            String str = "";
            
            if(e.getSource() == JFrameCalculadora.btn0)
        }
    };
}