/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.foodstorageapp;

/**
 *
 * @author pc
 */
public class foodStack {
    private FoodItem[] stack;
    private int top;
    private final int capacity;

    public foodStack(int capacity) {

        this.capacity = capacity;
        stack = new FoodItem[capacity];
        top = -1;
    }

    public boolean isEmpty() {

        return top == -1;
    }

    public boolean isFull() {

        return top == capacity - 1;
    } 
}
