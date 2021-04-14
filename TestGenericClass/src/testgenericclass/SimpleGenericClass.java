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
public class SimpleGenericClass<T> {//the angle brackets indicate that this is a generic class

    private T value;

    public void setValue(T valueIn) {
        value = valueIn;
    }

    public T getValue() {
        return value;
    }
}