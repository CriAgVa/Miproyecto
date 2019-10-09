/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
/**
 *
 * @author chris
 
*/
public class ListenerCyan implements ActionListener{
    private JTextField display;
    
    public ListenerCyan(JTextField display){
        this.display = display;
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        switch(e.getActionCommand()){
            case "0":
                display.setText(display.getText()+0);
                break;
            case "1":
                display.setText(display.getText()+1);
                break;
            case "2":
                display.setText(display.getText()+2);
                break;
            case "3":        
                display.setText(display.getText()+3);
                break;
            case "4":
                display.setText(display.getText()+4);
                break;
            case "5":
                display.setText(display.getText()+5);
                break;
            case "6":
                display.setText(display.getText()+6);
                break;
            case "7":
                display.setText(display.getText()+7);
                break;
            case "8":
                display.setText(display.getText()+8);
                break;
            case "9":
                display.setText(display.getText()+9);
                 break;
                }
    }
}