package ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * La clase VentanaCalculadora representa una calculadora con una interfaz grafica de usuario.
 * Los botones numericos y de operaciones realizan las funciones de una calculadora basica, incluyendo
 * suma, resta, multiplicacion y division.
 * La calculadora tambien es capaz de mostrar resultados tanto como enteros o decimales segun corresponda.
 */

public class VentanaCalculadora extends JFrame{
    private JPanel main;
    private JTextField txtSalida;
    private JButton buttonAC;
    private JButton buttonResta;
    private JButton buttonMultiplicar;
    private JButton buttonDividir;
    private JButton buttonIgual;
    private JButton buttonBorrar;
    private JButton button7;
    private JButton button4;
    private JButton button1;
    private JButton buttonVacio2;
    private JButton buttonSuma;
    private JButton button8;
    private JButton button5;
    private JButton button2;
    private JButton button0;
    private JButton buttonVacio1;
    private JButton button9;
    private JButton button6;
    private JButton button3;
    private JButton buttonComa;

    //Variables para las operaciones
    double op1, op2, resultado;
    //Variable para obtener el tipo de operacion
    String operacion;

    public VentanaCalculadora() {

        //Action Listener boton AC
        buttonAC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonBorrar.setEnabled(true);
                txtSalida.setText("");
            }
        });
        //Action listener boton 9
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonBorrar.setEnabled(true);
                txtSalida.setText(txtSalida.getText()+ button9.getText());
            }
        });
        //Action listener boton 8
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonBorrar.setEnabled(true);
                txtSalida.setText(txtSalida.getText()+ button8.getText());
            }
        });
        //Action Listener boton 7
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonBorrar.setEnabled(true);
                txtSalida.setText(txtSalida.getText()+ button7.getText());
            }
        });
        //Action Listener boton 6
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonBorrar.setEnabled(true);
                txtSalida.setText(txtSalida.getText()+ button6.getText());
            }
        });
        //Action Listener boton 5
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonBorrar.setEnabled(true);
                txtSalida.setText(txtSalida.getText()+ button5.getText());
            }
        });
        //Action Listener boton 4
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonBorrar.setEnabled(true);
                txtSalida.setText(txtSalida.getText()+ button4.getText());
            }
        });
        //Action Listener boton 3
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonBorrar.setEnabled(true);
                txtSalida.setText(txtSalida.getText()+ button3.getText());
            }
        });
        //Action Listener boton 2
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonBorrar.setEnabled(true);
                txtSalida.setText(txtSalida.getText()+ button2.getText());
            }
        });
        //Action Listener boton 1
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonBorrar.setEnabled(true);
                txtSalida.setText(txtSalida.getText()+ button1.getText());
            }
        });
        //Action Listener boton 0
        button0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonBorrar.setEnabled(true);
                txtSalida.setText(txtSalida.getText()+ button0.getText());
            }
        });
        //Action listener boton . (coma)
        buttonComa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Controlar que el numero no tenga ya una coma
                if (!txtSalida.getText().contains(".")){
                    txtSalida.setText(txtSalida.getText() + buttonComa.getText());
                }
            }
        });
        //Action listener boton sumar
        buttonSuma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                op1 = Double.parseDouble(txtSalida.getText());
                operacion = "+";
                txtSalida.setText("");
            }
        });
        //Action listener boton restar
        buttonResta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                op1 = Double.parseDouble(txtSalida.getText());
                operacion = "-";
                txtSalida.setText("");
            }
        });
        //Action listener boton multiplicar
        buttonMultiplicar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                op1 = Double.parseDouble(txtSalida.getText());
                operacion = "*";
                txtSalida.setText("");
            }
        });
        //Action listener boton dividir

        buttonDividir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                op1 = Double.parseDouble(txtSalida.getText());
                operacion = "/";
                txtSalida.setText("");
            }
        });
        //Action listener boton borrar
        buttonBorrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String retroceso = null;
                //Controlar que borre solo si hay algo
                if (txtSalida.getText().length()>0){
                    StringBuilder sb = new StringBuilder(txtSalida.getText());
                    //Borrar el ultimo elemento del texto
                    sb.deleteCharAt(txtSalida.getText().length() - 1);
                    retroceso = String.valueOf(sb);
                    txtSalida.setText(retroceso);
                }
            }
        });
        //Action listener boton igual
        buttonIgual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                op2 = Double.parseDouble(txtSalida.getText());
                buttonBorrar.setEnabled(false);


                switch (operacion){
                    case "+":
                        resultado = op1 + op2;
                        break;
                    case "-":
                        resultado = op1 - op2;
                        break;
                    case "*":
                        resultado = op1 * op2;
                        break;
                    case "/":
                        resultado = op1 / op2;
                        break;
                }

                txtSalida.setText(String.valueOf(resultado));

                //Para que el resultado salga entero o double
                if(resultado % 1 == 0){
                    txtSalida.setText(String.valueOf((int) resultado));
                }else{
                    txtSalida.setText(String.valueOf(resultado));
                }
            }
        });
    }

    /**
     * Método principal para ejecutar la aplicación de la calculadora.
     * Crea una instancia de la calculadora y muestra la ventana principal.
     *
     * @param args Los argumentos de la línea de comandos (no se utilizan en esta aplicación).
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("VentanaCalculadora");
        frame.setContentPane(new VentanaCalculadora().main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(400,500);
        frame.setResizable(false);
    }
}
