package org.example;

import ui.VentanaCalculadora;

import javax.swing.*;


/**
 * La clase App es la clase de inicio de la aplicacion de la calculadora
 * Se usa para crear una instancia de la clase VentanaCalculadora y comenzar la aplicacion
 */
public class App {
    /**
     * Método principal para ejecutar la aplicación de la calculadora.
     * Crea una instancia de la calculadora y muestra la ventana principal.
     *
     * @param args Los argumentos de la línea de comandos (no se utilizan en esta o).
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("VentanaCalculadora");
        frame.setContentPane(new VentanaCalculadora());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(450,500);
        frame.setResizable(false);
    }
}

