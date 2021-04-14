/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperaturereadings;

import java.util.Scanner;

/**
 *
 * @author KELVO FRAYAY
 */
public class TemperatureReadings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard= new Scanner (System.in);
        //create array
        double[]temperature;
        temperature = new double [7];
        //enter temperatures
        for (int i=0; i<temperature.length;i++){
            System.out.println("enter max temperature for day "+ (i+1));
            temperature [i]= keyboard.nextDouble();
        }
        //display temperatures
        System.out.println();
        System.out.println("***TEMPERATURES ENTERED***");
        System.out.println();
        for(int i=0;i<temperature.length;i++){
            System.out.println("day "+(i+1)+" = "+ temperature[i]+"deg");
        }
    }
    
}
