/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shoppingcart02;

/**
 *
 * @author javierarellano
 */
public class ShoppingCart02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variable que almacena el nombre del cliente
        String customerName = "Alex";

        // Precio del artículo (por unidad)
        double price = 12.00;

        // Porcentaje de impuesto (en forma decimal, 7.9% -> 0.079)
        double tax = 0.079;

        // Cantidad de productos que desea comprar
        int quantity = 2;

        // Cálculo del precio total con impuesto incluido
        // Se suma el impuesto al precio y se multiplica por la cantidad
        double totalPrice = (price + (price * tax)) * quantity;

        // Imprime un mensaje con el nombre y la cantidad de artículos
        System.out.println(customerName + " wants to purchase " + quantity + " Shirts");

        // Imprime el costo total con formato de dos decimales
        System.out.printf("Total cost with tax is: $%.2f\n", totalPrice);
    

    }
    
}
