/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author chris
 */
public class ListenerRM implements ActionListener{
    private JTextField display;
    double elemento, resultado, elemento2;
    String signo;

    public ListenerRM() {
    signo="+";
    }
    
    public ListenerRM(JTextField display){
        this.display = display;
    }

    @Override
        public void actionPerformed(ActionEvent e) {
            //elementoVal(display);
            switch(e.getActionCommand()){
                case "C":
                    display.setText("");
                    break;
                case "CE":
                    elemento=0;
                    display.setText("");
                    break;
                case "+/-":
                    if(display.getText().contains("-")==true){
                        signo="+";
                        display.setText(display.getText().substring(1, display.getText().length()));
                    }
                    else{
                        signo="-";
                        display.setText("-"+display.getText());
                    }
                    break;
                case "+":
                    elemento=Double.parseDouble(display.getText());
                    signo="+";
                    display.setText("");
                    break;
                case "-":
                    elemento=Double.parseDouble(display.getText());
                    signo="-";
                    display.setText("");
                    break;
                case "/":
                    elemento=Double.parseDouble(display.getText());
                    signo="/";
                    display.setText("");
                    break;
                case "x":
                    elemento=Double.parseDouble(display.getText());
                    signo="*";
                    display.setText("");
                    break;
                case ".":
                    if(display.getText().contains(".")==true){
                        JOptionPane.showMessageDialog(null, "No puedes agregar dos puntos.");
                    }
                    else{
                        display.setText(display.getText()+".");
                    }
                    break;
                case "=":
                    elementoVal(display);
                    display.setText(resultado+"");
                    break;
                case "?":
                    JOptionPane.showMessageDialog(null, "xx\nCalculadora creada por: \nChristian Iván Aguilar Valdez.");
                    break;
            }
        }
    public void elementoVal(JTextField display){
        switch(signo){
            case "+":
                resultado=elemento+Double.parseDouble(display.getText());
                break;
            case "-":
                resultado=elemento-Double.parseDouble(display.getText());
                break;
            case "/":
                resultado=elemento/Double.parseDouble(display.getText());
                break;
            case "*":
                resultado=elemento*Double.parseDouble(display.getText());
                break;
        }
    }   
}