/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package casting01;

/**
 *
 * @author javierarellano
 */
public class Casting01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Parte 1: Intento de inicializar un byte con 128
        // byte miByteError = 128; // Error: posible pérdida de precisión
        // la línea anterior porque el valor 128 está fuera del rango de byte (-128 a 127)

        // Parte 2: Declarar short con valor 128 y hacer cast a byte
        short miShort = 128;
        System.out.println("Short convertido a byte: " + (byte)miShort);
        // Esto imprimirá: -128, porque 128 desborda el rango de byte y vuelve al inicio (-128)

        // Parte 3: Inicializar un byte con 127, sumarle 1 e imprimir
        byte miByte = 127;
        miByte += 1; // desborde hacia el rango negativo
        System.out.println("Byte después de sumar 1: " + miByte); // Imprime: -128

        miByte += 1;
        System.out.println("Byte después de sumar 1 nuevamente: " + miByte); // Imprime: -127
    }
    
}
