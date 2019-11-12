/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanasDeDialogo;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author chris
 */
public class ListenerVD implements ActionListener {

    
    public class MyIcon implements Icon{

        @Override
        public void paintIcon(Component c, Graphics g, int x, int y) {
             Image image = new ImageIcon(getClass().getResource("/resources/icon-pencil-png.png")).getImage();
        g.drawImage(image, x, y, c);
        }

        @Override
        public int getIconWidth() {
            return 50;
        }

        @Override
        public int getIconHeight() {
            return 50;
        }
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        switch(e.getActionCommand()){
            case "Show Message Dialog":
                JOptionPane.showMessageDialog(null, "Esta es una ventana del tipo Show Message Dialog.", "Show Message Dialog", JOptionPane.INFORMATION_MESSAGE);
                break;
            case "Show Confirm Dialog":
                JOptionPane.showConfirmDialog(null, "Esta es una ventana del tipo Show Confirm Dialog.", "Show Confirm Dialog", JOptionPane.OK_OPTION);
                break;
            case "Show Option Dialog":
                int seleccion = JOptionPane.showOptionDialog(null, "Este es una ventana del tipo Show Option Dialog", "Show Option Dialog", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Si", "No", "Cancelar"},"Si");
                break;
            case "Show Input Dialog":
                JOptionPane.showInputDialog(null, "Esta es una ventana del tipo Show Input Dialog", "Show Input Dialog", JOptionPane.INFORMATION_MESSAGE);
                break;
            case "Show Error Dialog":
                JOptionPane.showMessageDialog(null, "Esta es una ventana del tipo Show Error Dialog.", "Show Error Dialog", JOptionPane.ERROR_MESSAGE);
                break;
        }
    }
}
