/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javalibspractice;
import javax.swing.JOptionPane;
/**
 *
 * @author javierarellano
 */
public class JavaLibsPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                // Mostrar mensaje de bienvenida en JOptionPane
        JOptionPane.showMessageDialog(null, "Completa la historia");

        // Solicitar entradas del usuario usando JOptionPane
        String heroe = JOptionPane.showInputDialog("1. Nombre de un héroe:");
        String villano = JOptionPane.showInputDialog("2. Nombre de un villano:");
        String lugar = JOptionPane.showInputDialog("3. Un lugar misterioso:");
        String objetoMagico = JOptionPane.showInputDialog("4. Un objeto mágico:");
        String animal = JOptionPane.showInputDialog("5. Un animal fantástico:");
        
        // Convertir entradas numéricas
        int edadHeroe = Integer.parseInt(JOptionPane.showInputDialog("6. Edad del héroe (número entero):"));
        double pesoObjeto = Double.parseDouble(JOptionPane.showInputDialog("7. Peso del objeto mágico en kg (número decimal):"));
        String color = JOptionPane.showInputDialog("8. Un color:");
        int dias = Integer.parseInt(JOptionPane.showInputDialog("9. Cantidad de días (número entero):"));
        double alturaHeroe = Double.parseDouble(JOptionPane.showInputDialog("10. Altura del héroe en metros (número decimal):"));

        // Realizar operaciones matemáticas
        int edadFutura = edadHeroe + 5;
        double pesoTotal = pesoObjeto * 3;
        double imcHeroe = alturaHeroe * alturaHeroe / pesoTotal;

        // Mostrar la historia en la consola
        System.out.println("\n=== LA AVENTURA DE " + heroe.toUpperCase() + " ===");
        System.out.println("\nHace muchos años, en el reino de " + lugar + ",");
        System.out.println("vivía un valiente héroe llamado " + heroe + ", de " + edadHeroe + " años.");
        System.out.println("Un día, el malvado " + villano + " robó el sagrado " + objetoMagico + ",");
        System.out.println("un objeto de " + pesoObjeto + " kg que mantenía la paz en el reino.");
        
        System.out.println("\n" + heroe + ", con su fiel " + animal + " " + color + ",");
        System.out.println("emprendió un viaje de " + dias + " días para recuperarlo.");
        System.out.println("En su camino, encontró tres " + objetoMagico + "s idénticos,");
        System.out.println("que juntos pesaban " + String.format("%.2f", pesoTotal) + " kg.");
        
        System.out.println("\nFinalmente, " + heroe + " se enfrentó a " + villano + ".");
        System.out.println("Con un IMC de " + String.format("%.2f", imcHeroe) + ", demostró ser un oponente formidable.");
        System.out.println("Después de una épica batalla, " + heroe + " recuperó el " + objetoMagico + ".");
        System.out.println("Y así, a la edad de " + edadFutura + " años, " + heroe);
        System.out.println("se convirtió en leyenda, recordado por siempre en " + lugar + ".");
        
        System.out.println("\n¡FIN DE LA HISTORIA!");

    }
    
}
