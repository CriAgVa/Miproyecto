/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanasDeDialogo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author chris
 */
public class JFrameVD extends JFrame {
    public JFrameVD(){
        inicializarComponentes();
    }
    
    private void inicializarComponentes(){
        JPanel panelVD = new JPanel(new GridLayout(5, 10));
        Dimension dim = new Dimension (30, 30);
        JButtonVD btn1 = new JButtonVD("Show Message Dialog", dim, Color.GREEN);
        panelVD.add(btn1);
        JButtonVD btn2 = new JButtonVD("Show Confirm Dialog", dim, Color.CYAN);
        panelVD.add(btn2);
        JButtonVD btn3 = new JButtonVD("Show Option Dialog", dim, Color.BLUE);
        panelVD.add(btn3);
        JButtonVD btn4 = new JButtonVD("Show Input Dialog", dim, Color.MAGENTA);
        panelVD.add(btn4);
        JButtonVD btn5 = new JButtonVD("Show Error Dialog", dim, Color.PINK);
        panelVD.add(btn5);
        
        setLayout(new BorderLayout());
        add(panelVD);
        
        setResizable(false);
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        ListenerVD listVD = new ListenerVD();
        btn1.addActionListener(listVD);
        btn2.addActionListener(listVD);
        btn3.addActionListener(listVD);
        btn4.addActionListener(listVD);
        btn5.addActionListener(listVD);
    }
}
