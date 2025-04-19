/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package input03;
import java.util.Scanner;

/**
 *
 * @author javierarellano
 */
public class Input03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce tres números enteros separados por espacio:");

        // Lectura directa de tres enteros
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int suma = num1 + num2 + num3;

        System.out.println("La suma es: " + suma);

        scanner.close(); // Siempre cierra el Scanner
    }
    
}
