/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.foodstorageapp;

/**
 *
 * @author pc
 */
public interface FoodStorageOperations {
       boolean isEmpty();

    boolean isFull();

    /**
     *
     * @return
     */
    FoodItem peek();

    void display();

    void search(String foodName);
}
