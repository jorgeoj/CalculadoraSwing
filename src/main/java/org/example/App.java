package org.example;

import ui.VentanaCalculadora;



/**
 * La clase App es la clase de inicio de la aplicacion de la calculadora
 * Se usa para crear una instancia de la clase VentanaCalculadora y comenzar la aplicacion
 */
public class App {
    /**
     * El metodo principal de la aplicacion, que se encarga de iniciar la calculadora
     *
     * @param args Los argumentos de la linea de comandos (no se usan en esta aplicacion)
     */
    public static void main(String[] args) {
        // Crea una instancia de la calculadora y la inicia.
        VentanaCalculadora calculadora = new VentanaCalculadora();
    }
}

