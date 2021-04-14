/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testgenericclass;

/**
 *
 * @author KELVO FRAYAY
 */
public class TestGenericClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SimpleGenericClass<Double> example1= new SimpleGenericClass<>();
        SimpleGenericClass<String> example2= new SimpleGenericClass<>();
        SimpleGenericClass<Oblong> example3= new SimpleGenericClass<>();
        
        example1.setValue(10.0);
        example2.setValue("Hello");
        example3.setValue(new Oblong(5,3));
        
        System.out.println(example1.getValue());
        System.out.println(example2.getValue());
        System.out.println(example3.getValue().calculateArea());
    }
    
}
