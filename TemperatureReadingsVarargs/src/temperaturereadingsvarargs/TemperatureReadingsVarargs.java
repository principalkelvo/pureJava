/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperaturereadingsvarargs;

/**
 *
 * @author KELVO FRAYAY
 */
public class TemperatureReadingsVarargs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[]temperature={7.5,8.2,7.7,11.3,10.75};//array with 5 readings
        System.out.println("Sending Array");
        displayTemps(temperature);//call method with a single array
        System.out.println();
        System.out.println("sending individual items");        
        displayTemps(7.5,8.2,7.7,11.3,10.75);//call method with 5 individual readings
        displayTemps(7.5,8.2,7.7,11.3,10.75,6.5);//call method with 6 individual readings
        displayTemps(9.9);//call method with one value
        displayTemps();//call method with no values
    }
    
    //method to display temperatures using varargs
    static void displayTemps(double...temperatureIn){
        System.out.println();
        System.out.println("***TEMPERATURES***");
        System.out.println("Number of temperatures: "
                +temperatureIn.length);//count items
        
        //display temperatures
        for(double item:temperatureIn){
            System.out.println(item+" ");
        }
    }
}
