/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import calculadora.JButtonC;
import calculadora.Calculadora;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author chris
 */
public class JFrameCalculadora extends JFrame{

    public JFrameCalculadora() {
        inicializarCompontentes();
    }

    private void inicializarCompontentes() {
        JPanel panelCentral= new JPanel(new GridLayout(5, 4));
        Dimension dim = new Dimension(30, 30);
        JButtonC btnC = new JButtonC("C", dim, Color.red);
        panelCentral.add(btnC);
        JButtonC btnCE = new JButtonC("CE", dim, Color.red);
        panelCentral.add(btnCE);
        JButtonC btnMM = new JButtonC("+/-", dim, Color.magenta);
        panelCentral.add(btnMM);
        JButtonC btnX = new JButtonC("x", dim, Color.magenta);
        panelCentral.add(btnX);
        JButtonC btn7 = new JButtonC("7", dim, Color.cyan);
        panelCentral.add(btn7);
        JButtonC btn8 = new JButtonC("8", dim, Color.cyan);
        panelCentral.add(btn8);
        JButtonC btn9 = new JButtonC("9", dim, Color.cyan);
        panelCentral.add(btn9);
        JButtonC btnDiv = new JButtonC("/", dim, Color.magenta);
        panelCentral.add(btnDiv);
        JButtonC btn4 = new JButtonC("4", dim, Color.cyan);
        panelCentral.add(btn4);
        JButtonC btn5 = new JButtonC("5", dim, Color.cyan);
        panelCentral.add(btn5);
        JButtonC btn6 = new JButtonC("6", dim, Color.cyan);
        panelCentral.add(btn6);
        JButtonC btnMen = new JButtonC("-", dim, Color.magenta);
        panelCentral.add(btnMen);
        JButtonC btn1 = new JButtonC("1", dim, Color.cyan);
        panelCentral.add(btn1);
        JButtonC btn2 = new JButtonC("2", dim, Color.cyan);
        panelCentral.add(btn2);
        JButtonC btn3 = new JButtonC("3", dim, Color.cyan);
        panelCentral.add(btn3);
        JButtonC btnMas = new JButtonC("+", dim, Color.magenta);
        panelCentral.add(btnMas);
        JButtonC btn0 = new JButtonC("0", dim, Color.cyan);
        panelCentral.add(btn0);
        JButtonC btnDot = new JButtonC(".", dim, Color.magenta);
        panelCentral.add(btnDot);
        JButtonC btnEqs = new JButtonC("=", dim, Color.magenta);
        panelCentral.add(btnEqs);
        JButtonC btnAcerca = new JButtonC("?", dim, Color.darkGray);
        panelCentral.add(btnAcerca);
        
        setLayout(new BorderLayout());
        add(panelCentral, BorderLayout.CENTER);
        
        JTextField display = new JTextField();
        Font auxF = display.getFont();
        Font nueva = new Font(auxF.getName(), auxF.getStyle(), 60);
        display.setFont(nueva);
        display.setBackground(Color.lightGray);
        setSize(340, 500);
        setResizable(false);
        display.setEditable(false);
        add(display, BorderLayout.NORTH);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        ListenerCyan listC = new ListenerCyan(display);
        ListenerRM listRM = new ListenerRM(display);
        btn0.addActionListener(listC);
        btn1.addActionListener(listC);
        btn2.addActionListener(listC);
        btn3.addActionListener(listC);
        btn4.addActionListener(listC);
        btn5.addActionListener(listC);
        btn6.addActionListener(listC);
        btn7.addActionListener(listC);
        btn8.addActionListener(listC);
        btn9.addActionListener(listC);
        btnC.addActionListener(listRM);
        btnCE.addActionListener(listRM);
        btnMM.addActionListener(listRM);
        btnMas.addActionListener(listRM);
        btnMen.addActionListener(listRM);
        btnX.addActionListener(listRM);
        btnDiv.addActionListener(listRM);
        btnDot.addActionListener(listRM);
        btnEqs.addActionListener(listRM);
        btnAcerca.addActionListener(listRM);
    }
}