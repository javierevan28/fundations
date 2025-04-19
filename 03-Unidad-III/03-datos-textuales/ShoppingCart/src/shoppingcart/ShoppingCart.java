/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shoppingcart;

/**
 *
 * @author javierarellano
 */
public class ShoppingCart {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Parte 1: Declaración e inicialización de variables
        // Nombre del cliente (propietario del carrito)
        String custName = "Alex";
        
        // Descripción del artículo (producto en el carrito)
        String itemDesc = "Shirt";
        
        // Variable para almacenar el mensaje final
        String message;

        // Parte 2: Concatenación para formar un mensaje completo
        // Se combina el nombre del cliente, el artículo y un texto adicional
        message = custName + " wants to purchase a " + itemDesc;

        // Imprime el mensaje en consola
        System.out.println(message);
    
    }
    
}
