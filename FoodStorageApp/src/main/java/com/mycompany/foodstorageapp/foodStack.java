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
     public boolean push(foodItem food) {

        if (isFull()) {

            System.out.println("\nStorage is full.");
            System.out.println("Maximum capacity is 8 food items.");

            return false;
        }

        top++;
        stack[top] = food;

        System.out.println("\nFood item added successfully.");

        return true;
    }

    public foodItem pop() {

        if (isEmpty()) {

            System.out.println("\nStorage is empty.");
            System.out.println("There is no food item to remove.");

            return null;
        }

        foodItem removedFood = stack[top];

        stack[top] = null;
        top--;

        return removedFood;
    }

    public foodItem peek() {

        if (isEmpty()) {

            System.out.println("\nStorage is empty.");
            System.out.println("There is no food item at the top.");

            return null;
        }

        return stack[top];
    }

    public void display() {

        if (isEmpty()) {

            System.out.println("\nStorage is empty.");
            return;
        }

        System.out.println("\n========== FOOD STORAGE ==========");

        for (int i = top; i >= 0; i--) {

            System.out.println("\nPosition: " + (i + 1));
            System.out.println("----------------------------------");

            stack[i].displayInfo();
        }

        System.out.println("\n==================================");
    }

    public void search(String foodName) {

        if (isEmpty()) {

            System.out.println("\nStorage is empty.");
            System.out.println("There is nothing to search.");

            return;
        }

        boolean found = false;

        for (int i = top; i >= 0; i--) {

            if (stack[i].getName().equalsIgnoreCase(foodName)) {

                System.out.println("\nFood item found!");
                System.out.println("----------------------------------");

                stack[i].displayInfo();

                System.out.println("----------------------------------");

                found = true;
            }
        }

        if (!found) {

            System.out.println("\nFood item not found.");
        }
    } 
}
