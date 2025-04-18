/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chickens01;

/**
 *
 * @author javierarellano
 */
public class Chickens01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // ---------- Escenario 1 ----------
        int eggsPerChicken = 5;
        int chickenCount = 3;

        // Lunes
        int mondayChickens = chickenCount;
        int mondayEggs = mondayChickens * eggsPerChicken;

        // Martes (gana una gallina)
        int tuesdayChickens = mondayChickens + 1;
        int tuesdayEggs = tuesdayChickens * eggsPerChicken;

        // Miércoles (pierde la mitad de las gallinas)
        int wednesdayChickens = tuesdayChickens / 2;
        int wednesdayEggs = wednesdayChickens * eggsPerChicken;

        // Total de huevos
        int totalEggs = mondayEggs + tuesdayEggs + wednesdayEggs;
        System.out.println("Escenario 1 - Total de huevos recolectados: " + totalEggs);

        // ---------- Escenario 2 ----------
        eggsPerChicken = 4;
        chickenCount = 8;

        // Lunes
        mondayChickens = chickenCount;
        mondayEggs = mondayChickens * eggsPerChicken;

        // Martes (gana una gallina)
        tuesdayChickens = mondayChickens + 1;
        tuesdayEggs = tuesdayChickens * eggsPerChicken;

        // Miércoles (pierde la mitad)
        wednesdayChickens = tuesdayChickens / 2;
        wednesdayEggs = wednesdayChickens * eggsPerChicken;

        // Total
        totalEggs = mondayEggs + tuesdayEggs + wednesdayEggs;
        System.out.println("Escenario 2 - Total de huevos recolectados: " + totalEggs);


    }
    
}
