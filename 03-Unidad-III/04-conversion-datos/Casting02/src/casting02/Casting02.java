/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package casting02;

/**
 *
 * @author javierarellano
 */
public class Casting02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // World population today
        long currentWorldPop = 7_000_000_000L;
        System.out.println("Current World Population: " + currentWorldPop);
        
        // World population in 1950, source: United Nations Population Division
        int africaPop = 221_000_000;
        int asiaPop = 1_402_000_000;
        int europePop = 547_000_000;
        int americasPop = 339_000_000;
        int oceanaPop = 13_000_000;

        // Corrección: sumar todos los valores antes de concatenar
        int total1950Pop = africaPop + asiaPop + europePop + americasPop + oceanaPop;
        System.out.println("World Population in 1950: " + total1950Pop);
        
        // The current population of Asia is an estimated 60% of the world population
        double percentAsia = 0.6;
        
        // Corrección: hacer cast explícito del resultado a long
        long currentAsiaPop = (long)(currentWorldPop * percentAsia);
        System.out.println("Current Asia Population: " + currentAsiaPop);
    }
    
}
