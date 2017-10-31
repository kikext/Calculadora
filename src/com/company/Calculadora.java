package com.company;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Calculadora {



    public static void main(String[] args) {
	// write your code here
        JFrame  frame =new JFrame("calculadora"); //CREAS EL FRAME EN GNERAL
        JPanel panelGeneral = (JPanel)frame.getContentPane(); // CREAS EL PANEL GENERAL


        JTextField display = new JTextField();    //creamos el textfield

        panelGeneral.add(display); //se añade el TextField al panelGeneral


        JPanel panelBotones = new JPanel(); //crea panel que contiene los nums
        panelBotones.setLayout(new GridLayout(4,4)); //se determina el layout y sus columnas pq es GRID

        JButton boton7 = new JButton("7"); //--- se crean los num dentro del panel--
        JButton boton8 = new JButton("8");
        JButton boton9 = new JButton("9");
        JButton botonPlus = new JButton("+");
        JButton boton4 = new JButton("4");
        JButton boton5 = new JButton("5");
        JButton boton6 = new JButton("6");
        JButton botonMin = new JButton("-");
        JButton boton1 = new JButton("1");
        JButton boton2 = new JButton("2");
        JButton boton3 = new JButton("3");
        JButton botonMult = new JButton("X");
        JButton boton0 = new JButton("0");
        JButton botonDel = new JButton("C");
        JButton botonEq = new JButton("=");
        JButton botonDiv = new JButton("/");//-------------


        panelBotones.add(boton7); // se añaden botones al panel de botones
        panelBotones.add(boton8);
        panelBotones.add(boton9);
        panelBotones.add(botonPlus);
        panelBotones.add(boton4);
        panelBotones.add(boton5);
        panelBotones.add(boton6);
        panelBotones.add(botonMin);
        panelBotones.add(boton1);
        panelBotones.add(boton2);
        panelBotones.add(boton3);
        panelBotones.add(botonMult);
        panelBotones.add(boton0);
        panelBotones.add(botonDel);
        panelBotones.add(botonEq);
        panelBotones.add(botonDiv); //----------------------

        panelGeneral.add(panelBotones, BorderLayout.SOUTH);//se añade el panel BOTONES al GENERAL

    frame.setSize(220,165); //se determina el tamaño
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //decimos que el proceso se cierre cuando pulsamos X
    frame.setVisible(true); // si no se pone el frame hace la prank de la invisibilidad

    }
}
