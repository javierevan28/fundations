/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parsing01;

/**
 *
 * @author javierarellano
 */
public class Parsing01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Parte 1: Declaración e inicialización de variables tipo String

        // shirtPrice representa un precio como texto que será convertido a entero
        String shirtPrice = "15";

        // taxRate representa la tasa de impuesto como texto que será convertido a double
        String taxRate = "0.05";

        // gibberish contiene texto sin sentido
        String gibberish = "887ds7nds87dsfs";

        // Parte 2: Conversión de tipos y operaciones

        // Convertimos shirtPrice de String a int usando Integer.parseInt
        int price = Integer.parseInt(shirtPrice);

        // Convertimos taxRate de String a double usando Double.parseDouble
        double tax = Double.parseDouble(taxRate);

        // Multiplicamos el precio por el impuesto para obtener el valor del impuesto
        double taxAmount = price * tax;

        // Mostramos el valor del impuesto
        System.out.println("El impuesto calculado es: " + taxAmount);

        // Ahora intentamos convertir taxRate a int para ver el error
        try {
            int wrongTax = Integer.parseInt(taxRate);  // Esto causará una excepción
            System.out.println("Tax rate como entero: " + wrongTax);
        } catch (NumberFormatException e) {
            System.out.println("Error al convertir taxRate a int: " + e.getMessage());
        }

        // Intentamos convertir gibberish a int, lo cual también causará un error
        try {
            int nonsense = Integer.parseInt(gibberish);  // Esto también causará una excepción
            System.out.println("Texto sin sentido como entero: " + nonsense);
        } catch (NumberFormatException e) {
            System.out.println("Error al convertir gibberish a int: " + e.getMessage());
        }
    }
    
}
