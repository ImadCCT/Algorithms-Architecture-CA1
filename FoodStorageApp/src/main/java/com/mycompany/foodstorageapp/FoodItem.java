/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.foodstorageapp;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author pc
 */
public class FoodItem {
  

    private String name;
    private double weight;
    private LocalDate bestBefore;
    private LocalDateTime timePlaced;

    public FoodItem(String name, double weight, LocalDate bestBefore) {
        this.name = name;
        this.weight = weight;
        this.bestBefore = bestBefore;
        this.timePlaced = LocalDateTime.now();
    }
}
