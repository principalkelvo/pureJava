/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testgenericinterfaceversion1;
import java.util.function.Function;
/**
 *
 * @author KELVO FRAYAY
 */
public class TestGenericInterfaceVersion1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Function<Integer,String>t= new Function<Integer,String>(){
            @Override
            public String apply(Integer i){
                return "you entered "+ i;
            }
        };
        System.out.println(t.apply(10));
    }
    
}
