/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chickens02;

/**
 *
 * @author javierarellano
 */
public class Chickens02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Huevos recogidos por día
        int mondayEggs = 100;
        int tuesdayEggs = 121;
        int wednesdayEggs = 117;

        // Calcular promedio diario (3 días)
        double dailyAverage = (mondayEggs + tuesdayEggs + wednesdayEggs) / 3.0;

        // Promedio mensual estimado (30 días)
        double monthlyAverage = dailyAverage * 30;

        // Precio por huevo
        double pricePerEgg = 0.18;

        // Beneficio mensual estimado
        double monthlyProfit = monthlyAverage * pricePerEgg;

        // Imprimir resultados
        System.out.println("Daily Average:   " + dailyAverage);
        System.out.println("Monthly Average: " + monthlyAverage);
        System.out.println("Profit:          $" + monthlyProfit);
    }
    
}
