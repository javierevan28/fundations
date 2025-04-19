/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package input02;
import javax.swing.JOptionPane;

/**
 *
 * @author javierarellano
 */
public class Input02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Texto random y pruebas con distintos íconos
        String mensaje = "¿Cuál es tu snack favorito cuando estudias programación?";
        String titulo = "Pregunta importante";

        // WARNING_MESSAGE (2) - Icono de advertencia (⚠️)
        String snackWarning = JOptionPane.showInputDialog(
            null,
            mensaje,
            titulo + " [WARNING]",
            JOptionPane.WARNING_MESSAGE
        );
        System.out.println("Snack con WARNING_MESSAGE: " + snackWarning);
    }
    
}
