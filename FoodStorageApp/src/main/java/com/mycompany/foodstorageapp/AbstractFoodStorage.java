/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.foodstorageapp;

/**
 *
 * @author pc
 */
public abstract class AbstractFoodStorage
        implements FoodStorageOperations {

    protected final int capacity;

    public AbstractFoodStorage(int capacity) {
        this.capacity = capacity;
    }
}
