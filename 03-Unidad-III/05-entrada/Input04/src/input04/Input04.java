/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package input04;
import java.util.Scanner;
/**
 *
 * @author javierarellano
 */
public class Input04 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {

        // Cargar el archivo del mismo paquete
        Scanner sc = new Scanner(Input04.class.getResourceAsStream("input04text.txt"));      
        
        // Avanzar el escáner para llegar a la línea con "BlueBumper"
        sc.nextLine(); // Línea 1
        sc.nextLine(); // Línea 2
        sc.nextLine(); // Línea 3
        String line = sc.nextLine(); // Línea 4 con "BlueBumper"

        // Imprimir la línea para verificar
        System.out.println(line);

        // Crear nuevo escáner para trabajar sobre la línea
        Scanner lineScanner = new Scanner(line);

        // Avanzar hasta encontrar "BlueBumper"
        lineScanner.next(); // Line4
        lineScanner.next(); // 444
        lineScanner.next(); // BlueBumper

        // Leer las coordenadas
        int xPosition = lineScanner.nextInt();
        int yPosition = lineScanner.nextInt();

        // Imprimir resultado
        System.out.println("X: " + xPosition + ", Y: " + yPosition);

        // Cerrar escáneres
        lineScanner.close();
        sc.close();
     
    }
    
}
