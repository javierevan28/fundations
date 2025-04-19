/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package input01;
import javax.swing.JOptionPane; // Importación necesaria para JOptionPane

/**
 *
 * @author javierarellano
 */
public class Input01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Parte 1: Crear un cuadro de diálogo
        String input = JOptionPane.showInputDialog("Introduce un número:");
        
        // Parte 2: Almacenar como String e imprimir
        System.out.println("Texto ingresado: " + input);
        
        // Analizar el String como int independiente
        int valor = Integer.parseInt(input);
        System.out.println("Valor + 1: " + (valor + 1));
        
        // Todo en una sola línea (solo un ;)
        System.out.println("Valor convertido en una línea: " + (Integer.parseInt(JOptionPane.showInputDialog("Introduce otro número:")) + 1));
    
    }
    
}
