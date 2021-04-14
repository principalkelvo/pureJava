/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperaturereading2;

import java.util.Scanner;

/**
 *
 * @author KELVO FRAYAY
 */
public class TemperatureReading2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double []temperature;
        temperature= new double [7];
        enterTemps(temperature);//call method
        displayTemps(temperature);
        wasHot(temperature);
    }
    //method to enter temperatures
    static void enterTemps(double[]temperatureIn){
        Scanner keyboard = new Scanner (System.in);
        for (int i=0; i<temperatureIn.length;i++){
        System.out.println("enter max temperature for day "+(i+1));
        temperatureIn[i]= keyboard.nextDouble();
    }
    }
    //method to display temperatures
    static void displayTemps(double[]temperatureIn){
        System.out.println();
        System.out.println("***TEMPERATURES ENTERED***");
        System.out.println();
        for(int i=0;i<temperatureIn.length;i++){
            System.out.println("day "+(i+1)+" = "+temperatureIn[i]+"deg");
            
        }
    }
    
    static void wasHot(double[]temperatureIn){
        System.out.println();
        System.out.println("***TEMPERATURES ENTERED***");
        System.out.println();
        for(int i=0;i<temperatureIn.length;i++){
            if (temperatureIn[i] >= 18){
                System.out.println("day "+(i+1)+" = "
                        +"it was hot");
            }
        }
    }
}
