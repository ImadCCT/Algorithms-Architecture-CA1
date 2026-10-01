/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.foodstorageapp;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author pc
 */
public class FoodItem {
  

    private String name; //stores the name of the food item
    private double weight; //stores the weight in grams
    private LocalDate bestBefore; //stores the best-before date of the food item 
    private LocalDateTime timePlaced; //stores the date and time when the food added to storage 

    
    //constructor to create a new foodItem object
    public FoodItem(String name, double weight, LocalDate bestBefore) {
        this.name = name;
        this.weight = weight;
        this.bestBefore = bestBefore;
        this.timePlaced = LocalDateTime.now();
    }
     public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public LocalDate getBestBefore() {
        return bestBefore;
    }

    public LocalDateTime getTimePlaced() {
        return timePlaced;
    }

    //displays all the information about the food item 
    public void displayInfo() {

        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        System.out.println("Food: " + name);
        System.out.println("Weight: " + weight + " grams");
        System.out.println("Best Before: " + bestBefore.format(dateFormat));
        System.out.println("Time Placed: " + timePlaced.format(timeFormat));
    }
}
